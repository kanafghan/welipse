package com.github.kanafghan.welipse.joomlagen.generator;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;

import com.github.kanafghan.welipse.joomlagen.generator.context.Context;

public class JBEGenerator {

	public static void generate(Context context, IProject project) throws CoreException {
		IFolder beFolder = project.getFolder("admin");
		if (!beFolder.exists()) {
			beFolder.create(true, false, new NullProgressMonitor());
		}
		
		// Generate entry script
		BEEntryGenerator.generate(context, beFolder);
		
		// Generate main controller
//		MainControllerGenerator.generate(new ControllerContext(context, ""), feFolder);
		
//		IFolder feViewsFolder = feFolder.getFolder("views");
//		if (!feViewsFolder.exists()) {
//			feViewsFolder.create(true, false, new NullProgressMonitor());
//		}
//		
//		// Generate views
//		FEViewsGenerator.generate(context, feViewsFolder);
	}

}
