package com.github.kanafghan.welipse.joomlagen.generator;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.EList;

import com.github.kanafghan.welipse.joomlagen.GenClass;
import com.github.kanafghan.welipse.joomlagen.GenPackage;
import com.github.kanafghan.welipse.joomlagen.JoomlaGenModel;
import com.github.kanafghan.welipse.joomlagen.generator.Utils.ControllerType;
import com.github.kanafghan.welipse.joomlagen.generator.context.Context;
import com.github.kanafghan.welipse.joomlagen.generator.context.ControllerContext;

public class FEControllersGenerator {

	public static void generate(Context context, IFolder folder) throws CoreException {
		JoomlaGenModel genModel = context.getGenModel();
		if (genModel != null) {
			GenPackage dataModel = genModel.getDatamodel();
			if (dataModel != null) {
				EList<GenClass> controllers = dataModel.getGenClasses();
				for (GenClass controller : controllers) {
					if (controller.isGenerateContentManager()) {
						ControllerContext controllerContext = new ControllerContext(
								context, 
								ControllerType.FEController, 
								controller.getEcoreClass().getName());
						controllerContext.setModel(controller);
						JControllerGenerator.generate(controllerContext, folder);
					}
				}
			}		
		}
	}
}
