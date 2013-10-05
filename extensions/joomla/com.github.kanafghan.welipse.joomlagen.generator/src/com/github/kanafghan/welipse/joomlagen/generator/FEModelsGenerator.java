package com.github.kanafghan.welipse.joomlagen.generator;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;

import com.github.kanafghan.welipse.joomlagen.generator.context.Context;
import com.github.kanafghan.welipse.joomlagen.generator.context.ModelContext;

public class FEModelsGenerator {

	public static void generate(Context context, IFolder folder) throws CoreException {
		IFolder modelsFolder = folder.getFolder("models");
		if (!modelsFolder.exists()) {
			modelsFolder.create(true, false, new NullProgressMonitor());
		}
		
		EList<EClassifier> models = context.getGenModel().getDatamodel().getEClassifiers();
		for (EClassifier model : models) {
			if (model instanceof EClass) {
				JModelGenerator.generate(new ModelContext(context, (EClass) model), modelsFolder);
			}
		}
	}
}
