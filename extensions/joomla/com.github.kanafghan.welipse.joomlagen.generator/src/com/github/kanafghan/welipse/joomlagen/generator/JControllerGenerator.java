package com.github.kanafghan.welipse.joomlagen.generator;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.codegen.jet.JETEmitter;
import org.eclipse.emf.codegen.jet.JETException;
import org.osgi.framework.Bundle;

import com.github.kanafghan.welipse.joomlagen.generator.context.ControllerContext;

public class JControllerGenerator {

	public static void generate(ControllerContext context, IFolder folder) {
		Bundle bundle = Activator.getDefault().getBundle();
		final String uri = bundle.getEntry("templates/controller.phpjet").toString();
		
		String name = context.isMain() ? "controller" : context.getName().toLowerCase();
		
		final String fileName = name +".php";
		final ControllerContext controllerContext = context;
		final IFolder controllerFolder = folder;
		
		final Job job = new Job("Generating code for controller: "+ fileName) {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				try {
					IFile file = controllerFolder.getFile(fileName);
					
					JETEmitter emitter = new JETEmitter(uri, getClass().getClassLoader());
					// the plugins that we have imported from in the templates
					emitter.addVariable("WELIPSE_WEBDSL", "com.github.kanafghan.welipse.webdsl");
					emitter.addVariable("WELIPSE_JOOMLAGEN", "com.github.kanafghan.welipse.joomlagen");
					emitter.addVariable("WELIPSE_JOOMLAGEN_GENERATOR", "com.github.kanafghan.welipse.joomlagen.generator");
					
					String result = emitter.generate(monitor, new Object[] {controllerContext});
					
					InputStream newContents = new ByteArrayInputStream(result.getBytes());
					if (file.exists()) {
						file.setContents(newContents, true, true, new SubProgressMonitor(monitor, 1));
					} else {
						file.create(newContents, true, new SubProgressMonitor(monitor, 1));
					}
				} catch (JETException e) {
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
