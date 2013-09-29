package com.github.kanafghan.welipse.joomlagen.generator;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;

import com.github.kanafghan.welipse.joomlagen.generator.context.Context;
import com.github.kanafghan.welipse.joomlagen.generator.context.ControllerContext;

public class JFEGenerator {

	public static void generate(Context context, IProject project) throws CoreException {
		IFolder feFolder = project.getFolder("site");
		if (!feFolder.exists()) {
			feFolder.create(true, false, new NullProgressMonitor());
		}
		
		// Generate entry script
		FEEntryGenerator.generate(context, feFolder);
		
		// Generate main controller
		MainControllerGenerator.generate(new ControllerContext(context, ""), feFolder);
		
		IFolder feViewsFolder = feFolder.getFolder("views");
		if (!feViewsFolder.exists()) {
			feViewsFolder.create(true, false, new NullProgressMonitor());
		}
		
		// Generate views
		FEViewsGenerator.generate(context, feViewsFolder);
	}

}
