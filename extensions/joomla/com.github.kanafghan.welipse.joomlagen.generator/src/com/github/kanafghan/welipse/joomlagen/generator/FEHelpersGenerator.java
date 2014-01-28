package com.github.kanafghan.welipse.joomlagen.generator;

import org.eclipse.core.resources.IFolder;

import com.github.kanafghan.welipse.joomlagen.generator.context.Context;
import com.github.kanafghan.welipse.joomlagen.generator.context.HelperContext;

public class FEHelpersGenerator {

	public static void generate(Context context, IFolder folder) {
		// Generate Main helper
		HelperContext helperCtx = new HelperContext(context, context.getGenModel().getExtensionName().toLowerCase());
		HelperGenerator.generate(helperCtx, folder);
	}
}
