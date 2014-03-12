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
		ControllerContext ctx = new ControllerContext(context, null);
		ctx.setBackEndController(false);
		ctx.setMain(true);
		JControllerGenerator.generate(ctx, feFolder);
		
		// Generate views
		FEViewsGenerator.generate(context, feFolder);
		
		// Generate models
		FEModelsGenerator.generate(context, feFolder.getFolder("models"));
		
		// Generate models
		FEControllersGenerator.generate(context, feFolder.getFolder("controllers"));
				
		// Generate helpers
		FEHelpersGenerator.generate(context, feFolder.getFolder("helpers"));
		
		// Generate framework
		WelipseFrameworkGenerator.generate(context, feFolder.getFolder("welipse"));
	}

}
