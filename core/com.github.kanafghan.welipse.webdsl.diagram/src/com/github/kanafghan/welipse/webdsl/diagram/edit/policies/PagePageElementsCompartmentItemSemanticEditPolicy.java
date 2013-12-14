package com.github.kanafghan.welipse.webdsl.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import com.github.kanafghan.welipse.webdsl.diagram.edit.commands.ExternalLinkCreateCommand;
import com.github.kanafghan.welipse.webdsl.diagram.edit.commands.GroupCreateCommand;
import com.github.kanafghan.welipse.webdsl.diagram.edit.commands.ImageCreateCommand;
import com.github.kanafghan.welipse.webdsl.diagram.edit.commands.InternalLinkCreateCommand;
import com.github.kanafghan.welipse.webdsl.diagram.edit.commands.ListCreateCommand;
import com.github.kanafghan.welipse.webdsl.diagram.edit.commands.TextCreateCommand;
import com.github.kanafghan.welipse.webdsl.diagram.providers.WebdslElementTypes;

/**
 * @generated
 */
public class PagePageElementsCompartmentItemSemanticEditPolicy extends
		WebdslBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public PagePageElementsCompartmentItemSemanticEditPolicy() {
		super(WebdslElementTypes.Page_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WebdslElementTypes.Text_3003 == req.getElementType()) {
			return getGEFWrapper(new TextCreateCommand(req));
		}
		if (WebdslElementTypes.Image_3004 == req.getElementType()) {
			return getGEFWrapper(new ImageCreateCommand(req));
		}
		if (WebdslElementTypes.List_3005 == req.getElementType()) {
			return getGEFWrapper(new ListCreateCommand(req));
		}
		if (WebdslElementTypes.Group_3006 == req.getElementType()) {
			return getGEFWrapper(new GroupCreateCommand(req));
		}
		if (WebdslElementTypes.InternalLink_3007 == req.getElementType()) {
			return getGEFWrapper(new InternalLinkCreateCommand(req));
		}
		if (WebdslElementTypes.ExternalLink_3009 == req.getElementType()) {
			return getGEFWrapper(new ExternalLinkCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
