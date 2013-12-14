package com.github.kanafghan.welipse.webdsl.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import com.github.kanafghan.welipse.webdsl.diagram.edit.commands.Image4CreateCommand;
import com.github.kanafghan.welipse.webdsl.diagram.edit.commands.Text4CreateCommand;
import com.github.kanafghan.welipse.webdsl.diagram.providers.WebdslElementTypes;

/**
 * @generated
 */
public class ExternalLinkExternalLinkSourceCompartment2ItemSemanticEditPolicy
		extends WebdslBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ExternalLinkExternalLinkSourceCompartment2ItemSemanticEditPolicy() {
		super(WebdslElementTypes.ExternalLink_3021);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WebdslElementTypes.Text_3022 == req.getElementType()) {
			return getGEFWrapper(new Text4CreateCommand(req));
		}
		if (WebdslElementTypes.Image_3023 == req.getElementType()) {
			return getGEFWrapper(new Image4CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
