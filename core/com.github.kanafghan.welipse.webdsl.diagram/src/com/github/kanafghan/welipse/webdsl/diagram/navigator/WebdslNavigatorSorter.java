package com.github.kanafghan.welipse.webdsl.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import com.github.kanafghan.welipse.webdsl.diagram.part.WebdslVisualIDRegistry;

/**
 * @generated
 */
public class WebdslNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7020;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof WebdslNavigatorItem) {
			WebdslNavigatorItem item = (WebdslNavigatorItem) element;
			return WebdslVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
