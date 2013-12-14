package com.github.kanafghan.welipse.webdsl.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import com.github.kanafghan.welipse.webdsl.diagram.edit.commands.ExternalLink2CreateCommand;
import com.github.kanafghan.welipse.webdsl.diagram.edit.commands.Group2CreateCommand;
import com.github.kanafghan.welipse.webdsl.diagram.edit.commands.Image2CreateCommand;
import com.github.kanafghan.welipse.webdsl.diagram.edit.commands.InternalLink2CreateCommand;
import com.github.kanafghan.welipse.webdsl.diagram.edit.commands.List2CreateCommand;
import com.github.kanafghan.welipse.webdsl.diagram.edit.commands.Text2CreateCommand;
import com.github.kanafghan.welipse.webdsl.diagram.providers.WebdslElementTypes;

/**
 * @generated
 */
public class ListListElementsCompartmentItemSemanticEditPolicy extends
		WebdslBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ListListElementsCompartmentItemSemanticEditPolicy() {
		super(WebdslElementTypes.List_3005);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WebdslElementTypes.Text_3010 == req.getElementType()) {
			return getGEFWrapper(new Text2CreateCommand(req));
		}
		if (WebdslElementTypes.Image_3011 == req.getElementType()) {
			return getGEFWrapper(new Image2CreateCommand(req));
		}
		if (WebdslElementTypes.List_3012 == req.getElementType()) {
			return getGEFWrapper(new List2CreateCommand(req));
		}
		if (WebdslElementTypes.Group_3013 == req.getElementType()) {
			return getGEFWrapper(new Group2CreateCommand(req));
		}
		if (WebdslElementTypes.InternalLink_3014 == req.getElementType()) {
			return getGEFWrapper(new InternalLink2CreateCommand(req));
		}
		if (WebdslElementTypes.ExternalLink_3015 == req.getElementType()) {
			return getGEFWrapper(new ExternalLink2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
