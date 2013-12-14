package com.github.kanafghan.welipse.webdsl.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import com.github.kanafghan.welipse.webdsl.diagram.edit.commands.ExternalLink3CreateCommand;
import com.github.kanafghan.welipse.webdsl.diagram.edit.commands.Group3CreateCommand;
import com.github.kanafghan.welipse.webdsl.diagram.edit.commands.Image3CreateCommand;
import com.github.kanafghan.welipse.webdsl.diagram.edit.commands.InternalLink3CreateCommand;
import com.github.kanafghan.welipse.webdsl.diagram.edit.commands.List3CreateCommand;
import com.github.kanafghan.welipse.webdsl.diagram.edit.commands.Text3CreateCommand;
import com.github.kanafghan.welipse.webdsl.diagram.providers.WebdslElementTypes;

/**
 * @generated
 */
public class GroupGroupElementsCompartment3ItemSemanticEditPolicy extends
		WebdslBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public GroupGroupElementsCompartment3ItemSemanticEditPolicy() {
		super(WebdslElementTypes.Group_3019);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WebdslElementTypes.Text_3016 == req.getElementType()) {
			return getGEFWrapper(new Text3CreateCommand(req));
		}
		if (WebdslElementTypes.Image_3017 == req.getElementType()) {
			return getGEFWrapper(new Image3CreateCommand(req));
		}
		if (WebdslElementTypes.List_3018 == req.getElementType()) {
			return getGEFWrapper(new List3CreateCommand(req));
		}
		if (WebdslElementTypes.Group_3019 == req.getElementType()) {
			return getGEFWrapper(new Group3CreateCommand(req));
		}
		if (WebdslElementTypes.InternalLink_3020 == req.getElementType()) {
			return getGEFWrapper(new InternalLink3CreateCommand(req));
		}
		if (WebdslElementTypes.ExternalLink_3021 == req.getElementType()) {
			return getGEFWrapper(new ExternalLink3CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
