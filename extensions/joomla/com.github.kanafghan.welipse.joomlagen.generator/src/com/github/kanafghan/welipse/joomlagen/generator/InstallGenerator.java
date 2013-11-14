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

import com.github.kanafghan.welipse.joomlagen.generator.context.Context;

public class InstallGenerator {

	public static void generate(Context context, IProject project) {
		final IProject prj = project;
		final Context installContext = context;
		
		final Job job = new Job("Generating installer.") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				File targetFolder = new File(prj.getFolder("admin/sql").getLocationURI());
				List<Object> arguments = new ArrayList<Object>(1);
				
				GenInstallSQL generator = new GenInstallSQL();
				try {
					generator.initialize(installContext.getGenModel(), targetFolder, arguments);
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
