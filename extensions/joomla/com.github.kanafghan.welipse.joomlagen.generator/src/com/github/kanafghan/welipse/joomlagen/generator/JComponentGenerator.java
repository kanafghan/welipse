package com.github.kanafghan.welipse.joomlagen.generator;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.core.runtime.jobs.Job;

import com.github.kanafghan.welipse.joomlagen.JoomlaGenModel;
import com.github.kanafghan.welipse.joomlagen.generator.context.Context;

public class JComponentGenerator {

	public static void generate(JoomlaGenModel joomlaGenModel) {
		final JoomlaGenModel genModel = joomlaGenModel;
		final Job job = new Job("Generating codes for Joomla! extension.") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				
				// Create/get the project
				IWorkspace workspace = ResourcesPlugin.getWorkspace();
				IProject project = workspace.getRoot().getProject("com_"+ Utils.getExtensionName(genModel).toLowerCase());
				
				try {
					if (!project.exists()) {
						project.create(monitor);
					}
					project.open(monitor);
					
					buildComponentFolderStructure(project, monitor);
					
					// Generate extension Front-End (FE)
					JFEGenerator.generate(new Context(genModel), project);
					
					// Generate extension Back-End (BE)
					JBEGenerator.generate(new Context(genModel), project);
					
					// Generate extension manifest
					ManifestGenerator.generate(new Context(genModel), project);
					
				} catch (CoreException e) {
					return new Status(Status.ERROR, Activator.PLUGIN_ID, 
						"An exception occurred during the code generation! Please check the error view. "
						+ e.getMessage(), e);
				}
				monitor.worked(1);
				return new Status(Status.OK, Activator.PLUGIN_ID, "Code successfully generated!");
			}

			private void buildComponentFolderStructure(IProject project, IProgressMonitor monitor) throws CoreException {
				// Create folder for Front-End (FE)
				IFolder FEFolder = project.getFolder("site");
				if (!FEFolder.exists()) {
					FEFolder.create(true, false, monitor);
					JComponentGenerator.generateBlankPage(FEFolder, monitor);
				}
				
				// Create folder for Front-End views
				IFolder FEViewsFolder = project.getFolder("site/views");
				if (!FEViewsFolder.exists()) {
					FEViewsFolder.create(true, false, monitor);
					JComponentGenerator.generateBlankPage(FEViewsFolder, monitor);
				}
				
				// Create folder for Back-End (BE)
				IFolder BEFolder = project.getFolder("admin");
				if (!BEFolder.exists()) {
					BEFolder.create(true, false, monitor);
					JComponentGenerator.generateBlankPage(BEFolder, monitor);
				}
				
			}
		};
		
		// enqueue the job
		job.setRule(ResourcesPlugin.getWorkspace().getRoot());
		job.setUser(true);
		job.schedule();
	}
	
	public static void generateBlankPage(IFolder folder, IProgressMonitor monitor) throws CoreException {
		IFile index = folder.getFile("index.html");
		if (!index.exists()) {
			String html = "<html><body bgcolor=\"#FFFFFF\"></body></html>";
			InputStream contents = new ByteArrayInputStream(html.getBytes());
			index.create(contents , true, new SubProgressMonitor(monitor, 1));
		}
	}
}
