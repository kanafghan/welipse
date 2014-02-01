package com.github.kanafghan.welipse.webdsl.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import com.github.kanafghan.welipse.webdsl.diagram.edit.commands.Button2CreateCommand;
import com.github.kanafghan.welipse.webdsl.diagram.edit.commands.Cancel2CreateCommand;
import com.github.kanafghan.welipse.webdsl.diagram.edit.commands.CustomAction2CreateCommand;
import com.github.kanafghan.welipse.webdsl.diagram.edit.commands.ExternalLinkCreateCommand;
import com.github.kanafghan.welipse.webdsl.diagram.edit.commands.Form2CreateCommand;
import com.github.kanafghan.welipse.webdsl.diagram.edit.commands.GroupCreateCommand;
import com.github.kanafghan.welipse.webdsl.diagram.edit.commands.ImageCreateCommand;
import com.github.kanafghan.welipse.webdsl.diagram.edit.commands.InternalLinkCreateCommand;
import com.github.kanafghan.welipse.webdsl.diagram.edit.commands.ListCreateCommand;
import com.github.kanafghan.welipse.webdsl.diagram.edit.commands.Reset2CreateCommand;
import com.github.kanafghan.welipse.webdsl.diagram.edit.commands.Save2CreateCommand;
import com.github.kanafghan.welipse.webdsl.diagram.edit.commands.SelectionList2CreateCommand;
import com.github.kanafghan.welipse.webdsl.diagram.edit.commands.TextCreateCommand;
import com.github.kanafghan.welipse.webdsl.diagram.edit.commands.TextInput2CreateCommand;
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
		if (WebdslElementTypes.Form_3025 == req.getElementType()) {
			return getGEFWrapper(new Form2CreateCommand(req));
		}
		if (WebdslElementTypes.InternalLink_3007 == req.getElementType()) {
			return getGEFWrapper(new InternalLinkCreateCommand(req));
		}
		if (WebdslElementTypes.ExternalLink_3009 == req.getElementType()) {
			return getGEFWrapper(new ExternalLinkCreateCommand(req));
		}
		if (WebdslElementTypes.TextInput_3027 == req.getElementType()) {
			return getGEFWrapper(new TextInput2CreateCommand(req));
		}
		if (WebdslElementTypes.SelectionList_3029 == req.getElementType()) {
			return getGEFWrapper(new SelectionList2CreateCommand(req));
		}
		if (WebdslElementTypes.Button_3031 == req.getElementType()) {
			return getGEFWrapper(new Button2CreateCommand(req));
		}
		if (WebdslElementTypes.CustomAction_3033 == req.getElementType()) {
			return getGEFWrapper(new CustomAction2CreateCommand(req));
		}
		if (WebdslElementTypes.Save_3035 == req.getElementType()) {
			return getGEFWrapper(new Save2CreateCommand(req));
		}
		if (WebdslElementTypes.Reset_3037 == req.getElementType()) {
			return getGEFWrapper(new Reset2CreateCommand(req));
		}
		if (WebdslElementTypes.Cancel_3039 == req.getElementType()) {
			return getGEFWrapper(new Cancel2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
