package com.github.kanafghan.welipse.joomlagen.generator;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.EList;

import com.github.kanafghan.welipse.joomlagen.generator.context.Context;
import com.github.kanafghan.welipse.joomlagen.generator.context.ViewContext;
import com.github.kanafghan.welipse.webdsl.Page;
import com.github.kanafghan.welipse.webdsl.Website;

public class FEViewsGenerator {

	public static void generate(Context context, IFolder folder) throws CoreException {
		IFolder feViewsFolder = folder.getFolder("views");
		if (!feViewsFolder.exists()) {
			feViewsFolder.create(true, false, new NullProgressMonitor());
		}
		
		Website extension = context.getGenModel().getWebmodel();
		if (extension != null) {			
			EList<Page> pages = extension.getPages();
			for (Page page: pages) {
				JViewGenerator.generate(new ViewContext(context, null, page), feViewsFolder);
			}
		}
	}
}
