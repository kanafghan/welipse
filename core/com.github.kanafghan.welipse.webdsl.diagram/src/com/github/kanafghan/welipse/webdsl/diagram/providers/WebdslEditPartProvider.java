package com.github.kanafghan.welipse.webdsl.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.WebdslEditPartFactory;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.WebsiteEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.part.WebdslVisualIDRegistry;

/**
 * @generated
 */
public class WebdslEditPartProvider extends DefaultEditPartProvider {

	/**
	 * @generated
	 */
	public WebdslEditPartProvider() {
		super(new WebdslEditPartFactory(),
				WebdslVisualIDRegistry.TYPED_INSTANCE, WebsiteEditPart.MODEL_ID);
	}

}
