package com.github.kanafghan.welipse.joomlagen.generator;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.EList;

import com.github.kanafghan.welipse.joomlagen.GenClass;
import com.github.kanafghan.welipse.joomlagen.GenPackage;
import com.github.kanafghan.welipse.joomlagen.JoomlaGenModel;
import com.github.kanafghan.welipse.joomlagen.generator.Utils.ModelType;
import com.github.kanafghan.welipse.joomlagen.generator.context.Context;
import com.github.kanafghan.welipse.joomlagen.generator.context.ModelContext;

public class FEModelsGenerator {

	public static void generate(Context context, IFolder folder) throws CoreException {
		JoomlaGenModel genModel = context.getGenModel();
		if (genModel != null) {
			GenPackage dataModel = genModel.getDatamodel();
			if (dataModel != null) {
				EList<GenClass> models = dataModel.getGenClasses();
				for (GenClass model : models) {
					if (model.isGenerateContentManager()) {						
						JModelGenerator.generate(new ModelContext(context, model, ModelType.Model), folder);
					}
				}
			}		
		}
	}
}
