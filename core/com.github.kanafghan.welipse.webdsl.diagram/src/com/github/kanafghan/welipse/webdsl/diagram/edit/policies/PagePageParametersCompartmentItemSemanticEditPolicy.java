package com.github.kanafghan.welipse.webdsl.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import com.github.kanafghan.welipse.webdsl.diagram.edit.commands.ParameterCreateCommand;
import com.github.kanafghan.welipse.webdsl.diagram.providers.WebdslElementTypes;

/**
 * @generated
 */
public class PagePageParametersCompartmentItemSemanticEditPolicy extends
		WebdslBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public PagePageParametersCompartmentItemSemanticEditPolicy() {
		super(WebdslElementTypes.Page_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WebdslElementTypes.Parameter_3001 == req.getElementType()) {
			return getGEFWrapper(new ParameterCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
