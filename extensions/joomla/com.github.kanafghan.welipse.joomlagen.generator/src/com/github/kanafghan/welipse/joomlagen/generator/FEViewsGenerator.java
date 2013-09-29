package com.github.kanafghan.welipse.joomlagen.generator;

import org.eclipse.core.resources.IFolder;
import org.eclipse.emf.common.util.EList;

import com.github.kanafghan.welipse.joomlagen.generator.context.Context;
import com.github.kanafghan.welipse.joomlagen.generator.context.ViewContext;
import com.github.kanafghan.welipse.webdsl.Page;

public class FEViewsGenerator {

	public static void generate(Context context, IFolder folder) {
		EList<Page> pages = context.getGenModel().getExtension().getPages();
		for (Page page: pages) {
			JViewGenerator.generate(new ViewContext(context, page), folder);
		}
	}
}
