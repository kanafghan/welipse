package com.github.kanafghan.welipse.joomlagen.generator;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;

import com.github.kanafghan.welipse.joomlagen.generator.context.Context;
import com.github.kanafghan.welipse.joomlagen.generator.context.ControllerContext;
import com.github.kanafghan.welipse.joomlagen.generator.context.HelperContext;

public class JBEGenerator {

	public static void generate(Context context, IProject project) throws CoreException {
		IFolder beFolder = project.getFolder("admin");
		if (!beFolder.exists()) {
			beFolder.create(true, false, new NullProgressMonitor());
		}
		
		// Generate entry script
		BEEntryGenerator.generate(context, beFolder);
		
		// Generate main controller
		ControllerContext ctx = new ControllerContext(context, null);
		ctx.setBackEndController(true);
		ctx.setMain(true);
		JControllerGenerator.generate(ctx, beFolder);
		
		// Generate Main helper
		HelperContext helperCtx = new HelperContext(context, context.getGenModel().getExtensionName().toLowerCase(), true);
		HelperGenerator.generate(helperCtx, beFolder.getFolder("helpers"));
		
		// Generate Content Managers
		ContentManagersGenerator.generate(context, beFolder);
	}
}
