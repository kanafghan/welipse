package com.github.kanafghan.welipse.joomlagen.generator;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.BasicMonitor;

import com.github.kanafghan.welipse.joomlagen.generator.acceleo.GenManifest;
import com.github.kanafghan.welipse.joomlagen.generator.context.Context;

public class ManifestGenerator {

	public static void generate(Context context, IProject project) {
		final Context manifestContext = context;
		final IProject prj = project;
		final File targetFolder = new File(project.getLocationURI());
		final List<Object> arguments = new ArrayList<Object>(1);
		
		final Job job = new Job("Generating Manifest.") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				GenManifest generator = new GenManifest();
				try {
					generator.initialize(manifestContext.getGenModel(), targetFolder, arguments);
					generator.doGenerate(BasicMonitor.toMonitor(monitor));
				} catch (IOException e) {
					return new Status(Status.ERROR, Activator.PLUGIN_ID, 
					"An exception occurred during the code generation! Please check the error view. "
					+ e.getMessage(), e);					
				}	
				
				try {
					// Refresh the project in order to reflect the creation of the
					// generated files in the workspace
					prj.refreshLocal(IProject.DEPTH_INFINITE, new SubProgressMonitor(monitor, 1, SubProgressMonitor.SUPPRESS_SUBTASK_LABEL));
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
