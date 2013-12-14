package com.github.kanafghan.welipse.webdsl.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import com.github.kanafghan.welipse.webdsl.diagram.edit.commands.ActualParameterCreateCommand;
import com.github.kanafghan.welipse.webdsl.diagram.providers.WebdslElementTypes;

/**
 * @generated
 */
public class InternalLinkInternalLinkActualParametersCompartment3ItemSemanticEditPolicy
		extends WebdslBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public InternalLinkInternalLinkActualParametersCompartment3ItemSemanticEditPolicy() {
		super(WebdslElementTypes.InternalLink_3007);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WebdslElementTypes.ActualParameter_3008 == req.getElementType()) {
			return getGEFWrapper(new ActualParameterCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
