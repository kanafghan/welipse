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

import com.github.kanafghan.welipse.joomlagen.generator.context.ModelContext;

public class JModelGenerator {
	
	public static void generate(ModelContext context, IFolder folder) {
		final ModelContext modelContext = context;
		final File targetFolder = new File(folder.getLocationURI());
		final List<Object> arguments = new ArrayList<Object>(1);		
		
		final Job job = new Job("Generating model.") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				arguments.add(modelContext.getContext().getGenModel());
				AbstractAcceleoGenerator generator = null;
				
				try {
					switch (modelContext.getType()) {
					case ModelAdmin:
						generator = new GenAdminModel(modelContext.getModel(), targetFolder, arguments);
						break;
					case ModelForm:
						generator = new GenFormModel(modelContext.getModel(), targetFolder, arguments);
						break;
					case ModelList:
						generator = new GenListModel(modelContext.getModel(), targetFolder, arguments);
						break;
					case ModelItem:
						generator = new GenItemModel(modelContext.getModel(), targetFolder, arguments);
						break;
					case Model:
					default:
						generator = new GenModel(modelContext.getModel(), targetFolder, arguments);
						break;
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
