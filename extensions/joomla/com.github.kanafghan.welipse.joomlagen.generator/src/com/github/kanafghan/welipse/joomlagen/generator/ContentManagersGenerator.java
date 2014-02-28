package com.github.kanafghan.welipse.joomlagen.generator;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.EList;

import com.github.kanafghan.welipse.joomlagen.GenClass;
import com.github.kanafghan.welipse.joomlagen.DatabaseTable;
import com.github.kanafghan.welipse.joomlagen.GenPackage;
import com.github.kanafghan.welipse.joomlagen.JoomlaGenModel;
import com.github.kanafghan.welipse.joomlagen.generator.Utils.ControllerType;
import com.github.kanafghan.welipse.joomlagen.generator.Utils.ModelType;
import com.github.kanafghan.welipse.joomlagen.generator.context.Context;
import com.github.kanafghan.welipse.joomlagen.generator.context.ControllerContext;
import com.github.kanafghan.welipse.joomlagen.generator.context.FormContext;
import com.github.kanafghan.welipse.joomlagen.generator.context.ModelContext;
import com.github.kanafghan.welipse.joomlagen.generator.context.TableContext;
import com.github.kanafghan.welipse.joomlagen.generator.context.ViewContext;

public class ContentManagersGenerator {

	public static void generate(Context context, IFolder folder) throws CoreException {
		final Context ctx = context;
		final IFolder adminFolder = folder;
		final Job job = new Job("Generating Content Managers.") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				JoomlaGenModel genModel = ctx.getGenModel();
				try {
					if (genModel != null) {
						GenPackage dataModel = genModel.getDatamodel();
						if (dataModel != null) {
							EList<GenClass> classes = dataModel.getGenClasses();
							for (GenClass clazz : classes) {
								if (clazz.isGenerateContentManager()) {
									generateItemManager(ctx, clazz, adminFolder);
									generateListManager(ctx, clazz, adminFolder);
								}
							}
							
							// Generate also database tables
							for (DatabaseTable table : genModel.getDatabaseTables()) {
								generateTable(ctx, adminFolder, table, monitor);
							}
						}
					}
				} catch (CoreException e) {
					return new Status(Status.ERROR, Activator.PLUGIN_ID, 
							"An exception occurred during the generation of Content Managers! Please check the error view. "
									+ e.getMessage(), e);
				}
				
				monitor.worked(1);
				return new Status(Status.OK, Activator.PLUGIN_ID, "Code successfully generated!");
			}
			
			private void generateTable(Context context, IFolder folder, DatabaseTable table, IProgressMonitor monitor) throws CoreException {
				IFolder tablesFolder = Utils.getFolder(Utils.getFolder(folder.getFolder("tables"), monitor), monitor);
				JTableGenerator.generate(new TableContext(context, table), tablesFolder);
			}
			
			private void generateItemManager(Context context, GenClass entity, IFolder folder) {
				// Generate Controller (of type ControllerForm) in the 'controllers' folder
				ControllerContext controllerCtx = new ControllerContext(context, 
						ControllerType.ControllerForm, 
						entity.getItemMVCName().toLowerCase());
				controllerCtx.setModel(entity);
				JControllerGenerator.generate(controllerCtx, folder.getFolder("controllers"));
				
				// Generate Model (of type ModelAdmin) in the 'models' folder
				ModelContext modelCtx = new ModelContext(context, entity, ModelType.ModelAdmin);
				modelCtx.setBackEndModel(true);
				JModelGenerator.generate(modelCtx, folder.getFolder("models"));
				
				// Generate Form for the Item in the 'models/forms' folder
				FormContext formCtx = new FormContext(context, entity);
				FormGenerator.generate(formCtx, folder.getFolder("models/forms"));
				
				// Generate View with edit.php template
				ViewContext viewCtx = new ViewContext(context, null, entity);
				viewCtx.setModelType(ModelType.ModelAdmin);
				viewCtx.setIsBackEndView(true);
				JViewGenerator.generate(viewCtx, folder.getFolder("views"));
			}
			
			private void generateListManager(Context context, GenClass entity, IFolder folder) {
				// Generate Controller (of type JControllerAdmin) in the 'controllers' folder
				String name = entity.getListMVCName();
				ControllerContext controllerCtx = new ControllerContext(context, ControllerType.ControllerAdmin, name.toLowerCase());
				controllerCtx.setBackEndController(true);
				controllerCtx.setModel(entity);
				JControllerGenerator.generate(controllerCtx, folder.getFolder("controllers"));
				
				// Generate Model (of type ModelList) in the 'models' folder
				ModelContext modelCtx = new ModelContext(context, entity, ModelType.ModelList);
				modelCtx.setBackEndModel(true);
				JModelGenerator.generate(modelCtx, folder.getFolder("models"));
				
				// Generate View with default.php template
				ViewContext viewCtx = new ViewContext(context, null, entity);
				viewCtx.setModelType(ModelType.ModelList);
				viewCtx.setIsBackEndView(true);
				JViewGenerator.generate(viewCtx, folder.getFolder("views"));
			}
		};
		
		// enqueue the job
		job.setRule(ResourcesPlugin.getWorkspace().getRoot());
		job.setUser(true);
		job.schedule();		
		
	}
}
