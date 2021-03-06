package com.github.kanafghan.welipse.joomlagen.generator;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.acceleo.engine.service.AbstractAcceleoGenerator;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.BasicMonitor;

import com.github.kanafghan.welipse.joomlagen.generator.Utils.ModelType;
import com.github.kanafghan.welipse.joomlagen.generator.acceleo.GenBEEditTemplate;
import com.github.kanafghan.welipse.joomlagen.generator.acceleo.GenBEEditView;
import com.github.kanafghan.welipse.joomlagen.generator.acceleo.GenBEListTemplate;
import com.github.kanafghan.welipse.joomlagen.generator.acceleo.GenBEListView;
import com.github.kanafghan.welipse.joomlagen.generator.acceleo.Page2HTML;
import com.github.kanafghan.welipse.joomlagen.generator.acceleo.Page2View;
import com.github.kanafghan.welipse.joomlagen.generator.context.ViewContext;

public class JViewGenerator {
	
	public static void generate(ViewContext context, IFolder folder) {
		String name = Utils.getPageName(context.getPage());
		if (context.isBackEndView()) {
			name = context.getGenClass().getItemMVCName();
			if (context.getModelType() == ModelType.ModelList) {
				name = context.getGenClass().getListMVCName();
			}
		}
		name = name.toLowerCase();
		
		// Generate HTML view
		generateView(context, folder, name);
		
		// Generate default layout
		generateTemplate(context, folder, name);
	}

	private static void generateTemplate(ViewContext context, IFolder folder, String viewName) {
		final IFolder tmplFolder = folder.getFolder(viewName +"/tmpl");
		final ViewContext viewContext = context;
		final File targetFolder = new File(tmplFolder.getLocationURI());
		final List<Object> arguments = new ArrayList<Object>(1);
		arguments.add(viewContext.getContext().getGenModel());
		
		final Job job = new Job("Generating Template.") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {				
				AbstractAcceleoGenerator generator = null;
				
				try {
					Utils.getFolder(tmplFolder, monitor);
					
					if (viewContext.getModelType() == ModelType.ModelList) {
						generator = new GenBEListTemplate(viewContext.getGenClass(), targetFolder, arguments);
					} else if (viewContext.getModelType() == ModelType.ModelAdmin) {
						generator = new GenBEEditTemplate(viewContext.getGenClass(), targetFolder, arguments);
					} else if (viewContext.getPage() != null) {
						generator = new Page2HTML(viewContext.getPage(), targetFolder, arguments);
					}
					
					generator.doGenerate(BasicMonitor.toMonitor(monitor));
				} catch (IOException e) {
					return new Status(Status.ERROR, Activator.PLUGIN_ID, 
					"An exception occurred during the code generation! Please check the error view. "
					+ e.getMessage(), e);					
				} catch (CoreException e) {
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
		final IFolder viewFolder = folder.getFolder(viewName);
		final ViewContext viewContext = context;
		final File targetFolder = new File(viewFolder.getLocationURI());
		final List<Object> arguments = new ArrayList<Object>(1);
		arguments.add(viewContext.getContext().getGenModel());
		
		final Job job = new Job("Generating View.") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				AbstractAcceleoGenerator generator = null;
				
				try {
					Utils.getFolder(viewFolder, monitor);
					
					if (viewContext.getModelType() == ModelType.ModelList) {
						generator = new GenBEListView(viewContext.getGenClass(), targetFolder, arguments);
					} else if (viewContext.getModelType() == ModelType.ModelAdmin) {
						generator = new GenBEEditView(viewContext.getGenClass(), targetFolder, arguments);
					} else if (viewContext.getPage() != null) {
						generator = new Page2View(viewContext.getPage(), targetFolder, arguments);
					}
					
					generator.doGenerate(BasicMonitor.toMonitor(monitor));
				} catch (IOException e) {
					return new Status(Status.ERROR, Activator.PLUGIN_ID, 
					"An exception occurred during the code generation! Please check the error view. "
					+ e.getMessage(), e);					
				} catch (CoreException e) {
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
