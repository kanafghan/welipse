package com.github.kanafghan.welipse.webdsl.diagram.providers;

import com.github.kanafghan.welipse.webdsl.diagram.part.WebdslDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = WebdslDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			WebdslDiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}
}
