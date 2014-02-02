package com.github.kanafghan.welipse.webdsl.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import com.github.kanafghan.welipse.webdsl.diagram.edit.commands.ButtonCreateCommand;
import com.github.kanafghan.welipse.webdsl.diagram.edit.commands.CancelCreateCommand;
import com.github.kanafghan.welipse.webdsl.diagram.edit.commands.CustomActionCreateCommand;
import com.github.kanafghan.welipse.webdsl.diagram.edit.commands.ExternalLink3CreateCommand;
import com.github.kanafghan.welipse.webdsl.diagram.edit.commands.FormCreateCommand;
import com.github.kanafghan.welipse.webdsl.diagram.edit.commands.Group3CreateCommand;
import com.github.kanafghan.welipse.webdsl.diagram.edit.commands.Image3CreateCommand;
import com.github.kanafghan.welipse.webdsl.diagram.edit.commands.InternalLink3CreateCommand;
import com.github.kanafghan.welipse.webdsl.diagram.edit.commands.List3CreateCommand;
import com.github.kanafghan.welipse.webdsl.diagram.edit.commands.ResetCreateCommand;
import com.github.kanafghan.welipse.webdsl.diagram.edit.commands.SaveCreateCommand;
import com.github.kanafghan.welipse.webdsl.diagram.edit.commands.SelectionListCreateCommand;
import com.github.kanafghan.welipse.webdsl.diagram.edit.commands.Text3CreateCommand;
import com.github.kanafghan.welipse.webdsl.diagram.edit.commands.TextInputCreateCommand;
import com.github.kanafghan.welipse.webdsl.diagram.providers.WebdslElementTypes;

/**
 * @generated
 */
public class FormFormElementsCompartment2ItemSemanticEditPolicy extends
		WebdslBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public FormFormElementsCompartment2ItemSemanticEditPolicy() {
		super(WebdslElementTypes.Form_3025);
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
		if (WebdslElementTypes.Form_3024 == req.getElementType()) {
			return getGEFWrapper(new FormCreateCommand(req));
		}
		if (WebdslElementTypes.InternalLink_3020 == req.getElementType()) {
			return getGEFWrapper(new InternalLink3CreateCommand(req));
		}
		if (WebdslElementTypes.ExternalLink_3021 == req.getElementType()) {
			return getGEFWrapper(new ExternalLink3CreateCommand(req));
		}
		if (WebdslElementTypes.TextInput_3026 == req.getElementType()) {
			return getGEFWrapper(new TextInputCreateCommand(req));
		}
		if (WebdslElementTypes.SelectionList_3028 == req.getElementType()) {
			return getGEFWrapper(new SelectionListCreateCommand(req));
		}
		if (WebdslElementTypes.Button_3030 == req.getElementType()) {
			return getGEFWrapper(new ButtonCreateCommand(req));
		}
		if (WebdslElementTypes.CustomAction_3032 == req.getElementType()) {
			return getGEFWrapper(new CustomActionCreateCommand(req));
		}
		if (WebdslElementTypes.Save_3034 == req.getElementType()) {
			return getGEFWrapper(new SaveCreateCommand(req));
		}
		if (WebdslElementTypes.Reset_3036 == req.getElementType()) {
			return getGEFWrapper(new ResetCreateCommand(req));
		}
		if (WebdslElementTypes.Cancel_3038 == req.getElementType()) {
			return getGEFWrapper(new CancelCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
