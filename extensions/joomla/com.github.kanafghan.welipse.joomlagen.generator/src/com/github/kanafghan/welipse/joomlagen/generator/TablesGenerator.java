package com.github.kanafghan.welipse.joomlagen.generator;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;

import com.github.kanafghan.welipse.joomlagen.generator.context.Context;
import com.github.kanafghan.welipse.joomlagen.generator.context.TableContext;

public class TablesGenerator {

	public static void generate(Context context, IFolder folder) throws CoreException {
		IFolder tablesFolder = folder.getFolder("tables");
		if (!tablesFolder.exists()) {
			tablesFolder.create(true, false, new NullProgressMonitor());
		}
		
		EList<EClassifier> tables = context.getGenModel().getDatamodel().getEClassifiers();
		for (EClassifier table : tables) {
			if (table instanceof EClass) {
				JTableGenerator.generate(new TableContext(context, (EClass) table), tablesFolder);
			}
		}
	}
}
