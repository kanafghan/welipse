package com.github.kanafghan.welipse.webdsl.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import com.github.kanafghan.welipse.webdsl.diagram.edit.commands.VariableInitializationCreateCommand;
import com.github.kanafghan.welipse.webdsl.diagram.providers.WebdslElementTypes;

/**
 * @generated
 */
public class PagePageVariablesCompartmentItemSemanticEditPolicy extends
		WebdslBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public PagePageVariablesCompartmentItemSemanticEditPolicy() {
		super(WebdslElementTypes.Page_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WebdslElementTypes.VariableInitialization_3002 == req
				.getElementType()) {
			return getGEFWrapper(new VariableInitializationCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
