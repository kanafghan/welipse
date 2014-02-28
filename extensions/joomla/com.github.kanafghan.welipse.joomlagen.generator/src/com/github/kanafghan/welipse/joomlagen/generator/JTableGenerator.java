package com.github.kanafghan.welipse.joomlagen.generator;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.BasicMonitor;

import com.github.kanafghan.welipse.joomlagen.generator.acceleo.GenFETable;
import com.github.kanafghan.welipse.joomlagen.generator.context.TableContext;

public class JTableGenerator {
	
	public static void generate(TableContext context, IFolder folder) {
		final TableContext tableContext = context;
		final File targetFolder = new File(folder.getLocationURI());
		final List<Object> arguments = new ArrayList<Object>(1);
		arguments.add(tableContext.getContext().getGenModel());
		
		final Job job = new Job("Generating Table.") {//"Generating codes for table: "+ fileName) {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				GenFETable generator = new GenFETable();
				try {
					generator.initialize(tableContext.getTable(), targetFolder, arguments);
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
