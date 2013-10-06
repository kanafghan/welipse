package com.github.kanafghan.welipse.joomlagen.generator;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;

import com.github.kanafghan.welipse.joomlagen.JoomlaGenModel;
import com.github.kanafghan.welipse.joomlagen.generator.context.Context;
import com.github.kanafghan.welipse.joomlagen.generator.context.TableContext;

public class TablesGenerator {

	public static void generate(Context context, IFolder folder) throws CoreException {
		IFolder tablesFolder = folder.getFolder("tables");
		if (!tablesFolder.exists()) {
			NullProgressMonitor monitor = new NullProgressMonitor();
			tablesFolder.create(true, false, monitor);
			JComponentGenerator.generateBlankPage(tablesFolder, monitor);
		}
		
		JoomlaGenModel genModel = context.getGenModel();
		if (genModel != null) {
			EPackage dataModel = genModel.getDatamodel();
			if (dataModel != null) {
				EList<EClassifier> tables = dataModel.getEClassifiers();
				for (EClassifier table : tables) {
					if (table instanceof EClass) {
						JTableGenerator.generate(new TableContext(context, (EClass) table), tablesFolder);
					}
				}
			}
		}
	}
}
