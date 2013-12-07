package com.github.kanafghan.welipse.joomlagen.generator;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

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
import org.eclipse.emf.common.util.EList;

import com.github.kanafghan.welipse.joomlagen.JoomlaGenModel;
import com.github.kanafghan.welipse.joomlagen.generator.context.Context;
import com.github.kanafghan.welipse.webdsl.Image;
import com.github.kanafghan.welipse.webdsl.Page;
import com.github.kanafghan.welipse.webdsl.PageElement;
import com.github.kanafghan.welipse.webdsl.Website;

public class JComponentGenerator {

	public static void generate(JoomlaGenModel joomlaGenModel) {
		final JoomlaGenModel genModel = joomlaGenModel;
		final Job job = new Job("Generating codes for Joomla! extension.") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				
				// Create/get the project
				IWorkspace workspace = ResourcesPlugin.getWorkspace();
				IProject project = workspace.getRoot().getProject(genModel.getComponentName());
				
				try {
					if (!project.exists()) {
						project.create(new SubProgressMonitor(monitor, 1, SubProgressMonitor.SUPPRESS_SUBTASK_LABEL));
					}
					project.open(new SubProgressMonitor(monitor, 1, SubProgressMonitor.SUPPRESS_SUBTASK_LABEL));
					
					buildComponentFolderStructure(genModel, project, new SubProgressMonitor(monitor, 1, SubProgressMonitor.PREPEND_MAIN_LABEL_TO_SUBTASK));
					
					// Generate extension Front-End (FE)
					JFEGenerator.generate(new Context(genModel), project);
					
					// Generate extension Back-End (BE)
					JBEGenerator.generate(new Context(genModel), project);
					
					// Generate SQL install
					InstallGenerator.generate(new Context(genModel), project);
					
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

			private void buildComponentFolderStructure(JoomlaGenModel genModel, IProject project, IProgressMonitor monitor) throws CoreException {
				// Create folder for Front-End (FE)
				Utils.getFolder(project.getFolder("site"), monitor);
				
				// Create folder for FE models
				Utils.getFolder(project.getFolder("site/models"), monitor);
				// Create folder for FE views
				Utils.getFolder(project.getFolder("site/views"), monitor);
				// Create folder for FE views
				Utils.getFolder(project.getFolder("site/controllers"), monitor);
				
				// Create folders for component Media
				Utils.getFolder(project.getFolder("media"), monitor);
				IFolder imagesFolder = Utils.getFolder(project.getFolder("media/images"), monitor);
				Utils.getFolder(project.getFolder("media/js"), monitor);
				IFolder cssFolder = Utils.getFolder(project.getFolder("media/css"), monitor);
				
				// Get all the Static Images which are not URLs
				getStaticImages(genModel, imagesFolder, monitor);
				// Get all CSS files
				getStyles(genModel, cssFolder, monitor);
				
				// Create folder for Back-End (BE)
				Utils.getFolder(project.getFolder("admin"), monitor);
				
				// Create folder for BE models
				IFolder modelsFodler = Utils.getFolder(project.getFolder("admin/models"), monitor);
				// Create folder for BE views
				Utils.getFolder(project.getFolder("admin/views"), monitor);
				// Create folder for BE controllers
				Utils.getFolder(project.getFolder("admin/controllers"), monitor);
				
				// Create folder for BE forms
				Utils.getFolder(modelsFodler.getFolder("forms"), monitor);
				
				// Create 'tables' folder
				Utils.getFolder(project.getFolder("admin/tables"), monitor);
				
				// Create 'sql' folder
				Utils.getFolder(project.getFolder("admin/sql"), monitor);
				
				// Create 'helpers' folder
				Utils.getFolder(project.getFolder("admin/helpers"), monitor);
			}
			
			private void getStaticImages(JoomlaGenModel genModel, IFolder folder, IProgressMonitor monitor) throws CoreException {
				Website extension = genModel.getWebmodel(); //genModel.getExtension();
				if (extension != null) {
					EList<Page> pages = extension.getPages();
					for (Page page : pages) {
						EList<PageElement> elements = page.getElements();
						for (PageElement element : elements) {
							if (element instanceof Image) {
								Image sImg = (Image) element;
								if (!sImg.isStatic())
									continue;

								String imgName = Utils.getFileName(sImg
										.getSource().toString());

								// Create a copy of the image
								IFile localImg = folder.getFile(imgName);
								if (!localImg.exists()) {
									FileInputStream fileStream;
									try {
										fileStream = new FileInputStream(
												sImg.getSource().toString());
										localImg.create(fileStream, true,
												monitor);
									} catch (FileNotFoundException e) {
										throw new CoreException(new Status(
												Status.ERROR,
												Activator.PLUGIN_ID,
												"Image at location: "
														+ sImg.getSource()
														+ " does not exist."));
									}
								}
							}
						}
					}
				}
			}
			
			private void getStyles(JoomlaGenModel genModel, IFolder folder, IProgressMonitor monitor) throws CoreException {
				String css = genModel.getCustomCSSFiles(); //genModel.getCSS();
				if (css != null && !css.isEmpty()) {
					String[] paths = css.split(";");
					for (String path: paths) {
						String fileName = Utils.getFileName(path);
						IFile localCSS = folder.getFile(fileName);
						if (!localCSS.exists()) {
							FileInputStream fileStream;
							try {
								fileStream = new FileInputStream(path);
								localCSS.create(fileStream, true, monitor);
							} catch (FileNotFoundException e) {
								throw new CoreException(new Status(
										Status.ERROR,
										Activator.PLUGIN_ID,
										"CSS file at location: "
												+ path
												+ " does not exist."));
							}
						}
					}
				}
			}
		};
		
		// enqueue the job
		job.setRule(ResourcesPlugin.getWorkspace().getRoot());
		job.setUser(true);
		job.schedule();
	}
}
