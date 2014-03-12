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

import com.github.kanafghan.welipse.joomlagen.generator.Utils.ControllerType;
import com.github.kanafghan.welipse.joomlagen.generator.acceleo.GenBEAdminController;
import com.github.kanafghan.welipse.joomlagen.generator.acceleo.GenBEController;
import com.github.kanafghan.welipse.joomlagen.generator.acceleo.GenBEFormController;
import com.github.kanafghan.welipse.joomlagen.generator.acceleo.GenFEController;
import com.github.kanafghan.welipse.joomlagen.generator.acceleo.GenMainController;
import com.github.kanafghan.welipse.joomlagen.generator.context.ControllerContext;

public class JControllerGenerator {

	public static void generate(ControllerContext context, IFolder folder) {
		final ControllerContext controllerContext = context;
		final File targetFolder = new File(folder.getLocationURI());
		final List<Object> arguments = new ArrayList<Object>(3);
		
		final Job job = new Job("Generating Joomla! Controller.") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				AbstractAcceleoGenerator generator = null;
				try {
					if (controllerContext.isMain()) {
						arguments.add(new Boolean(controllerContext.isBackEndController()));
						generator = new GenMainController(controllerContext.getContext().getGenModel(), targetFolder, arguments);
					} else if (controllerContext.getType() == ControllerType.ControllerForm) {
						arguments.add(controllerContext.getContext().getGenModel());
						generator = new GenBEFormController(controllerContext.getGenClass(), targetFolder, arguments);
					} else if (controllerContext.getType() == ControllerType.ControllerAdmin) {						
						arguments.add(controllerContext.getContext().getGenModel());
						generator = new GenBEAdminController(controllerContext.getGenClass(), targetFolder, arguments);
					} else if (controllerContext.getType() == ControllerType.FEController) {
						arguments.add(controllerContext.getContext().getGenModel());
						generator = new GenFEController(controllerContext.getGenClass(), targetFolder, arguments);
					} else {
						arguments.add(controllerContext.getContext().getGenModel());
						generator = new GenBEController(controllerContext.getGenClass(), targetFolder, arguments);
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
