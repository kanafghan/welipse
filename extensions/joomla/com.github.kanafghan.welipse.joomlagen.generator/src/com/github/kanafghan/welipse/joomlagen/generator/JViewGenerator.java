package com.github.kanafghan.welipse.joomlagen.generator;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.acceleo.engine.service.AbstractAcceleoGenerator;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.BasicMonitor;

import com.github.kanafghan.welipse.joomlagen.generator.Utils.ModelType;
import com.github.kanafghan.welipse.joomlagen.generator.acceleo.GenEditTemplate;
import com.github.kanafghan.welipse.joomlagen.generator.acceleo.GenEditView;
import com.github.kanafghan.welipse.joomlagen.generator.acceleo.GenListTemplate;
import com.github.kanafghan.welipse.joomlagen.generator.acceleo.GenListView;
import com.github.kanafghan.welipse.joomlagen.generator.acceleo.Page2HTML;
import com.github.kanafghan.welipse.joomlagen.generator.acceleo.Page2View;
import com.github.kanafghan.welipse.joomlagen.generator.context.ViewContext;

public class JViewGenerator {
	
	public static void generate(ViewContext context, IFolder folder) {
		String name = Utils.getPageName(context.getPage());
		if (context.isBackEndView()) {
			name = context.getModel().getItemMVCName();
			if (context.getModelType() == ModelType.ModelList) {
				name = context.getModel().getListMVCName(); //name += Utils.MODEL_LIST_NAME_SUFFIX;
			}
		}
		name = name.toLowerCase();
		
		// Generate HTML view
		generateView(context, folder, name);
		
		// Generate default layout
		generateTemplate(context, folder, name);
	}

	private static void generateTemplate(ViewContext context, IFolder folder, String viewName) {
		final ViewContext viewContext = context;
		final File targetFolder = new File(folder.getFolder(viewName +"/tmpl").getLocationURI());
		final List<Object> arguments = new ArrayList<Object>(1);
		arguments.add(viewContext.getContext().getGenModel());
		
		final Job job = new Job("Generating Template.") {//"Generating codes for default layout within view: "+ viewName) {
			@Override
			protected IStatus run(IProgressMonitor monitor) {				
				AbstractAcceleoGenerator generator = null;
				
				try {
					if (viewContext.getModelType() == ModelType.ModelList) {
						generator = new GenListTemplate(viewContext.getModel(), targetFolder, arguments);
					} else if (viewContext.getModelType() == ModelType.ModelAdmin) {
						generator = new GenEditTemplate(viewContext.getModel(), targetFolder, arguments);
					} else if (viewContext.getPage() != null) {
						generator = new Page2HTML(viewContext.getPage(), targetFolder, arguments);
					}
					
					generator.doGenerate(BasicMonitor.toMonitor(monitor));
				} catch (IOException e) {
					return new Status(Status.ERROR, Activator.PLUGIN_ID, 
					"An exception occurred during the code generation! Please check the error view. "
					+ e.getMessage(), e);					
				}	
				
				monitor.worked(1);
				return new Status(Status.OK, Activator.PLUGIN_ID, "Code successfully generated!");
			}
		};
		
		// enqueue the job
		job.setRule(ResourcesPlugin.getWorkspace().getRoot());
		job.setUser(true);
		job.schedule();
	}

	private static void generateView(ViewContext context, IFolder folder, String viewName) {
//		Bundle bundle = Activator.getDefault().getBundle();
//		final String uri = bundle.getEntry("templates/view.phpjet").toString();
//				
//		final ViewContext viewContext = context;
//		final IFolder viewFolder = folder.getFolder(viewName);
		
		final ViewContext viewContext = context;
		final File targetFolder = new File(folder.getFolder(viewName).getLocationURI());
		final List<Object> arguments = new ArrayList<Object>(1);
		arguments.add(viewContext.getContext().getGenModel());
		
		final Job job = new Job("Generating View.") {//"Generating codes for view: "+ viewName) {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
//				try {
//					// Create the view folder if not exists
//					if (!viewFolder.exists()) {
//						viewFolder.create(true, false, monitor);
//					}
//					
//					// Create/get the view file
//					IFile viewFile = viewFolder.getFile("view.html.php");
//					
//					JETEmitter emitter = new JETEmitter(uri, getClass().getClassLoader());
//					// the plugins that we have imported from in the templates
//					emitter.addVariable("WELIPSE_WEBDSL", "com.github.kanafghan.welipse.webdsl");
//					emitter.addVariable("WELIPSE_JOOMLAGEN", "com.github.kanafghan.welipse.joomlagen");
//					emitter.addVariable("EMF_COMMON", "org.eclipse.emf.common");
//					emitter.addVariable("EMF_ECORE", "org.eclipse.emf.ecore");
//					
//					String result = emitter.generate(monitor, new Object[] {viewContext});
//					
//					InputStream newContents = new ByteArrayInputStream(result.getBytes());
//					if (viewFile.exists()) {
//						viewFile.setContents(newContents, true, true, new SubProgressMonitor(monitor, 1));
//					} else {
//						viewFile.create(newContents, true, new SubProgressMonitor(monitor, 1));
//					}
//				} catch (JETException e) {
//					return new Status(Status.ERROR, Activator.PLUGIN_ID, 
//							"An exception occurred during the code generation! Please check the error view. "
//							+ e.getMessage(), e);
//				} catch (CoreException e) {
//					return new Status(Status.ERROR, Activator.PLUGIN_ID, 
//							"An exception occurred during the code generation! Please check the error view. "
//							+ e.getMessage(), e);
//				}

				AbstractAcceleoGenerator generator = null;
				
				try {
					if (viewContext.getModelType() == ModelType.ModelList) {
						generator = new GenListView(viewContext.getModel(), targetFolder, arguments);
					} else if (viewContext.getModelType() == ModelType.ModelAdmin) {
						generator = new GenEditView(viewContext.getModel(), targetFolder, arguments);
					} else if (viewContext.getPage() != null) {
						generator = new Page2View(viewContext.getPage(), targetFolder, arguments);
					}
					
					generator.doGenerate(BasicMonitor.toMonitor(monitor));
				} catch (IOException e) {
					return new Status(Status.ERROR, Activator.PLUGIN_ID, 
					"An exception occurred during the code generation! Please check the error view. "
					+ e.getMessage(), e);					
				}	
				
				monitor.worked(1);
				return new Status(Status.OK, Activator.PLUGIN_ID, "Code successfully generated!");
			}
		};
		
		// enqueue the job
		job.setRule(ResourcesPlugin.getWorkspace().getRoot());
		job.setUser(true);
		job.schedule();
	}
}
