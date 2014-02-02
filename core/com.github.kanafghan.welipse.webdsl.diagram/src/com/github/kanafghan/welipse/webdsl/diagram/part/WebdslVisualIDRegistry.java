package com.github.kanafghan.welipse.webdsl.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import com.github.kanafghan.welipse.webdsl.Button;
import com.github.kanafghan.welipse.webdsl.Cancel;
import com.github.kanafghan.welipse.webdsl.CustomAction;
import com.github.kanafghan.welipse.webdsl.Form;
import com.github.kanafghan.welipse.webdsl.Group;
import com.github.kanafghan.welipse.webdsl.Reset;
import com.github.kanafghan.welipse.webdsl.Save;
import com.github.kanafghan.welipse.webdsl.WebDSLPackage;
import com.github.kanafghan.welipse.webdsl.Website;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.*;
import com.github.kanafghan.welipse.webdsl.diagram.expressions.WebdslOCLFactory;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class WebdslVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "com.github.kanafghan.welipse.webdsl.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (WebsiteEditPart.MODEL_ID.equals(view.getType())) {
				return WebsiteEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return com.github.kanafghan.welipse.webdsl.diagram.part.WebdslVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				WebdslDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (WebDSLPackage.eINSTANCE.getWebsite().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((Website) domainElement)) {
			return WebsiteEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = com.github.kanafghan.welipse.webdsl.diagram.part.WebdslVisualIDRegistry
				.getModelID(containerView);
		if (!WebsiteEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (WebsiteEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = com.github.kanafghan.welipse.webdsl.diagram.part.WebdslVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = WebsiteEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case WebsiteEditPart.VISUAL_ID:
			if (WebDSLPackage.eINSTANCE.getPage().isSuperTypeOf(
					domainElement.eClass())) {
				return PageEditPart.VISUAL_ID;
			}
			break;
		case PagePageParametersCompartmentEditPart.VISUAL_ID:
			if (WebDSLPackage.eINSTANCE.getParameter().isSuperTypeOf(
					domainElement.eClass())) {
				return ParameterEditPart.VISUAL_ID;
			}
			break;
		case PagePageVariablesCompartmentEditPart.VISUAL_ID:
			if (WebDSLPackage.eINSTANCE.getVariableInitialization()
					.isSuperTypeOf(domainElement.eClass())) {
				return VariableInitializationEditPart.VISUAL_ID;
			}
			break;
		case PagePageElementsCompartmentEditPart.VISUAL_ID:
			if (WebDSLPackage.eINSTANCE.getText().isSuperTypeOf(
					domainElement.eClass())) {
				return TextEditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getImage().isSuperTypeOf(
					domainElement.eClass())) {
				return ImageEditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getList().isSuperTypeOf(
					domainElement.eClass())) {
				return ListEditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getGroup().isSuperTypeOf(
					domainElement.eClass())
					&& isGroup_3006((Group) domainElement)) {
				return GroupEditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getForm().isSuperTypeOf(
					domainElement.eClass())
					&& isForm_3025((Form) domainElement)) {
				return Form2EditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getInternalLink().isSuperTypeOf(
					domainElement.eClass())) {
				return InternalLinkEditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getExternalLink().isSuperTypeOf(
					domainElement.eClass())) {
				return ExternalLinkEditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getTextInput().isSuperTypeOf(
					domainElement.eClass())) {
				return TextInput2EditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getSelectionList().isSuperTypeOf(
					domainElement.eClass())) {
				return SelectionList2EditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getButton().isSuperTypeOf(
					domainElement.eClass())
					&& isButton_3031((Button) domainElement)) {
				return Button2EditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getCustomAction().isSuperTypeOf(
					domainElement.eClass())
					&& isCustomAction_3033((CustomAction) domainElement)) {
				return CustomAction2EditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getSave().isSuperTypeOf(
					domainElement.eClass())
					&& isSave_3035((Save) domainElement)) {
				return Save2EditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getReset().isSuperTypeOf(
					domainElement.eClass())
					&& isReset_3037((Reset) domainElement)) {
				return Reset2EditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getCancel().isSuperTypeOf(
					domainElement.eClass())
					&& isCancel_3039((Cancel) domainElement)) {
				return Cancel2EditPart.VISUAL_ID;
			}
			break;
		case ListListElementsCompartmentEditPart.VISUAL_ID:
			if (WebDSLPackage.eINSTANCE.getText().isSuperTypeOf(
					domainElement.eClass())) {
				return Text2EditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getImage().isSuperTypeOf(
					domainElement.eClass())) {
				return Image2EditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getList().isSuperTypeOf(
					domainElement.eClass())) {
				return List2EditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getGroup().isSuperTypeOf(
					domainElement.eClass())
					&& isGroup_3013((Group) domainElement)) {
				return Group2EditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getInternalLink().isSuperTypeOf(
					domainElement.eClass())) {
				return InternalLink2EditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getExternalLink().isSuperTypeOf(
					domainElement.eClass())) {
				return ExternalLink2EditPart.VISUAL_ID;
			}
			break;
		case ListListElementsCompartment2EditPart.VISUAL_ID:
			if (WebDSLPackage.eINSTANCE.getText().isSuperTypeOf(
					domainElement.eClass())) {
				return Text2EditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getImage().isSuperTypeOf(
					domainElement.eClass())) {
				return Image2EditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getList().isSuperTypeOf(
					domainElement.eClass())) {
				return List2EditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getGroup().isSuperTypeOf(
					domainElement.eClass())
					&& isGroup_3013((Group) domainElement)) {
				return Group2EditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getInternalLink().isSuperTypeOf(
					domainElement.eClass())) {
				return InternalLink2EditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getExternalLink().isSuperTypeOf(
					domainElement.eClass())) {
				return ExternalLink2EditPart.VISUAL_ID;
			}
			break;
		case GroupGroupElementsCompartmentEditPart.VISUAL_ID:
			if (WebDSLPackage.eINSTANCE.getText().isSuperTypeOf(
					domainElement.eClass())) {
				return Text3EditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getImage().isSuperTypeOf(
					domainElement.eClass())) {
				return Image3EditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getList().isSuperTypeOf(
					domainElement.eClass())) {
				return List3EditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getGroup().isSuperTypeOf(
					domainElement.eClass())
					&& isGroup_3019((Group) domainElement)) {
				return Group3EditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getForm().isSuperTypeOf(
					domainElement.eClass())
					&& isForm_3024((Form) domainElement)) {
				return FormEditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getInternalLink().isSuperTypeOf(
					domainElement.eClass())) {
				return InternalLink3EditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getExternalLink().isSuperTypeOf(
					domainElement.eClass())) {
				return ExternalLink3EditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getTextInput().isSuperTypeOf(
					domainElement.eClass())) {
				return TextInputEditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getSelectionList().isSuperTypeOf(
					domainElement.eClass())) {
				return SelectionListEditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getButton().isSuperTypeOf(
					domainElement.eClass())
					&& isButton_3030((Button) domainElement)) {
				return ButtonEditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getCustomAction().isSuperTypeOf(
					domainElement.eClass())
					&& isCustomAction_3032((CustomAction) domainElement)) {
				return CustomActionEditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getSave().isSuperTypeOf(
					domainElement.eClass())
					&& isSave_3034((Save) domainElement)) {
				return SaveEditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getReset().isSuperTypeOf(
					domainElement.eClass())
					&& isReset_3036((Reset) domainElement)) {
				return ResetEditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getCancel().isSuperTypeOf(
					domainElement.eClass())
					&& isCancel_3038((Cancel) domainElement)) {
				return CancelEditPart.VISUAL_ID;
			}
			break;
		case ListListElementsCompartment3EditPart.VISUAL_ID:
			if (WebDSLPackage.eINSTANCE.getText().isSuperTypeOf(
					domainElement.eClass())) {
				return Text2EditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getImage().isSuperTypeOf(
					domainElement.eClass())) {
				return Image2EditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getList().isSuperTypeOf(
					domainElement.eClass())) {
				return List2EditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getGroup().isSuperTypeOf(
					domainElement.eClass())
					&& isGroup_3013((Group) domainElement)) {
				return Group2EditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getInternalLink().isSuperTypeOf(
					domainElement.eClass())) {
				return InternalLink2EditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getExternalLink().isSuperTypeOf(
					domainElement.eClass())) {
				return ExternalLink2EditPart.VISUAL_ID;
			}
			break;
		case InternalLinkInternalLinkSourceCompartmentEditPart.VISUAL_ID:
			if (WebDSLPackage.eINSTANCE.getText().isSuperTypeOf(
					domainElement.eClass())) {
				return Text4EditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getImage().isSuperTypeOf(
					domainElement.eClass())) {
				return Image4EditPart.VISUAL_ID;
			}
			break;
		case InternalLinkInternalLinkActualParametersCompartmentEditPart.VISUAL_ID:
			if (WebDSLPackage.eINSTANCE.getActualParameter().isSuperTypeOf(
					domainElement.eClass())) {
				return ActualParameterEditPart.VISUAL_ID;
			}
			break;
		case ExternalLinkExternalLinkSourceCompartmentEditPart.VISUAL_ID:
			if (WebDSLPackage.eINSTANCE.getText().isSuperTypeOf(
					domainElement.eClass())) {
				return Text4EditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getImage().isSuperTypeOf(
					domainElement.eClass())) {
				return Image4EditPart.VISUAL_ID;
			}
			break;
		case GroupGroupElementsCompartment3EditPart.VISUAL_ID:
			if (WebDSLPackage.eINSTANCE.getText().isSuperTypeOf(
					domainElement.eClass())) {
				return Text3EditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getImage().isSuperTypeOf(
					domainElement.eClass())) {
				return Image3EditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getList().isSuperTypeOf(
					domainElement.eClass())) {
				return List3EditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getGroup().isSuperTypeOf(
					domainElement.eClass())
					&& isGroup_3019((Group) domainElement)) {
				return Group3EditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getForm().isSuperTypeOf(
					domainElement.eClass())
					&& isForm_3024((Form) domainElement)) {
				return FormEditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getInternalLink().isSuperTypeOf(
					domainElement.eClass())) {
				return InternalLink3EditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getExternalLink().isSuperTypeOf(
					domainElement.eClass())) {
				return ExternalLink3EditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getTextInput().isSuperTypeOf(
					domainElement.eClass())) {
				return TextInputEditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getSelectionList().isSuperTypeOf(
					domainElement.eClass())) {
				return SelectionListEditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getButton().isSuperTypeOf(
					domainElement.eClass())
					&& isButton_3030((Button) domainElement)) {
				return ButtonEditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getCustomAction().isSuperTypeOf(
					domainElement.eClass())
					&& isCustomAction_3032((CustomAction) domainElement)) {
				return CustomActionEditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getSave().isSuperTypeOf(
					domainElement.eClass())
					&& isSave_3034((Save) domainElement)) {
				return SaveEditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getReset().isSuperTypeOf(
					domainElement.eClass())
					&& isReset_3036((Reset) domainElement)) {
				return ResetEditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getCancel().isSuperTypeOf(
					domainElement.eClass())
					&& isCancel_3038((Cancel) domainElement)) {
				return CancelEditPart.VISUAL_ID;
			}
			break;
		case FormFormElementsCompartmentEditPart.VISUAL_ID:
			if (WebDSLPackage.eINSTANCE.getText().isSuperTypeOf(
					domainElement.eClass())) {
				return Text3EditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getImage().isSuperTypeOf(
					domainElement.eClass())) {
				return Image3EditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getList().isSuperTypeOf(
					domainElement.eClass())) {
				return List3EditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getGroup().isSuperTypeOf(
					domainElement.eClass())
					&& isGroup_3019((Group) domainElement)) {
				return Group3EditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getForm().isSuperTypeOf(
					domainElement.eClass())
					&& isForm_3024((Form) domainElement)) {
				return FormEditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getInternalLink().isSuperTypeOf(
					domainElement.eClass())) {
				return InternalLink3EditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getExternalLink().isSuperTypeOf(
					domainElement.eClass())) {
				return ExternalLink3EditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getTextInput().isSuperTypeOf(
					domainElement.eClass())) {
				return TextInputEditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getSelectionList().isSuperTypeOf(
					domainElement.eClass())) {
				return SelectionListEditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getButton().isSuperTypeOf(
					domainElement.eClass())
					&& isButton_3030((Button) domainElement)) {
				return ButtonEditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getCustomAction().isSuperTypeOf(
					domainElement.eClass())
					&& isCustomAction_3032((CustomAction) domainElement)) {
				return CustomActionEditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getSave().isSuperTypeOf(
					domainElement.eClass())
					&& isSave_3034((Save) domainElement)) {
				return SaveEditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getReset().isSuperTypeOf(
					domainElement.eClass())
					&& isReset_3036((Reset) domainElement)) {
				return ResetEditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getCancel().isSuperTypeOf(
					domainElement.eClass())
					&& isCancel_3038((Cancel) domainElement)) {
				return CancelEditPart.VISUAL_ID;
			}
			break;
		case InternalLinkInternalLinkSourceCompartment2EditPart.VISUAL_ID:
			if (WebDSLPackage.eINSTANCE.getText().isSuperTypeOf(
					domainElement.eClass())) {
				return Text4EditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getImage().isSuperTypeOf(
					domainElement.eClass())) {
				return Image4EditPart.VISUAL_ID;
			}
			break;
		case InternalLinkInternalLinkActualParametersCompartment2EditPart.VISUAL_ID:
			if (WebDSLPackage.eINSTANCE.getActualParameter().isSuperTypeOf(
					domainElement.eClass())) {
				return ActualParameterEditPart.VISUAL_ID;
			}
			break;
		case ExternalLinkExternalLinkSourceCompartment2EditPart.VISUAL_ID:
			if (WebDSLPackage.eINSTANCE.getText().isSuperTypeOf(
					domainElement.eClass())) {
				return Text4EditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getImage().isSuperTypeOf(
					domainElement.eClass())) {
				return Image4EditPart.VISUAL_ID;
			}
			break;
		case GroupGroupElementsCompartment2EditPart.VISUAL_ID:
			if (WebDSLPackage.eINSTANCE.getText().isSuperTypeOf(
					domainElement.eClass())) {
				return Text3EditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getImage().isSuperTypeOf(
					domainElement.eClass())) {
				return Image3EditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getList().isSuperTypeOf(
					domainElement.eClass())) {
				return List3EditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getGroup().isSuperTypeOf(
					domainElement.eClass())
					&& isGroup_3019((Group) domainElement)) {
				return Group3EditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getForm().isSuperTypeOf(
					domainElement.eClass())
					&& isForm_3024((Form) domainElement)) {
				return FormEditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getInternalLink().isSuperTypeOf(
					domainElement.eClass())) {
				return InternalLink3EditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getExternalLink().isSuperTypeOf(
					domainElement.eClass())) {
				return ExternalLink3EditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getTextInput().isSuperTypeOf(
					domainElement.eClass())) {
				return TextInputEditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getSelectionList().isSuperTypeOf(
					domainElement.eClass())) {
				return SelectionListEditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getButton().isSuperTypeOf(
					domainElement.eClass())
					&& isButton_3030((Button) domainElement)) {
				return ButtonEditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getCustomAction().isSuperTypeOf(
					domainElement.eClass())
					&& isCustomAction_3032((CustomAction) domainElement)) {
				return CustomActionEditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getSave().isSuperTypeOf(
					domainElement.eClass())
					&& isSave_3034((Save) domainElement)) {
				return SaveEditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getReset().isSuperTypeOf(
					domainElement.eClass())
					&& isReset_3036((Reset) domainElement)) {
				return ResetEditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getCancel().isSuperTypeOf(
					domainElement.eClass())
					&& isCancel_3038((Cancel) domainElement)) {
				return CancelEditPart.VISUAL_ID;
			}
			break;
		case FormFormElementsCompartment2EditPart.VISUAL_ID:
			if (WebDSLPackage.eINSTANCE.getText().isSuperTypeOf(
					domainElement.eClass())) {
				return Text3EditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getImage().isSuperTypeOf(
					domainElement.eClass())) {
				return Image3EditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getList().isSuperTypeOf(
					domainElement.eClass())) {
				return List3EditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getGroup().isSuperTypeOf(
					domainElement.eClass())
					&& isGroup_3019((Group) domainElement)) {
				return Group3EditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getForm().isSuperTypeOf(
					domainElement.eClass())
					&& isForm_3024((Form) domainElement)) {
				return FormEditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getInternalLink().isSuperTypeOf(
					domainElement.eClass())) {
				return InternalLink3EditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getExternalLink().isSuperTypeOf(
					domainElement.eClass())) {
				return ExternalLink3EditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getTextInput().isSuperTypeOf(
					domainElement.eClass())) {
				return TextInputEditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getSelectionList().isSuperTypeOf(
					domainElement.eClass())) {
				return SelectionListEditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getButton().isSuperTypeOf(
					domainElement.eClass())
					&& isButton_3030((Button) domainElement)) {
				return ButtonEditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getCustomAction().isSuperTypeOf(
					domainElement.eClass())
					&& isCustomAction_3032((CustomAction) domainElement)) {
				return CustomActionEditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getSave().isSuperTypeOf(
					domainElement.eClass())
					&& isSave_3034((Save) domainElement)) {
				return SaveEditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getReset().isSuperTypeOf(
					domainElement.eClass())
					&& isReset_3036((Reset) domainElement)) {
				return ResetEditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getCancel().isSuperTypeOf(
					domainElement.eClass())
					&& isCancel_3038((Cancel) domainElement)) {
				return CancelEditPart.VISUAL_ID;
			}
			break;
		case InternalLinkInternalLinkSourceCompartment3EditPart.VISUAL_ID:
			if (WebDSLPackage.eINSTANCE.getText().isSuperTypeOf(
					domainElement.eClass())) {
				return Text4EditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getImage().isSuperTypeOf(
					domainElement.eClass())) {
				return Image4EditPart.VISUAL_ID;
			}
			break;
		case InternalLinkInternalLinkActualParametersCompartment3EditPart.VISUAL_ID:
			if (WebDSLPackage.eINSTANCE.getActualParameter().isSuperTypeOf(
					domainElement.eClass())) {
				return ActualParameterEditPart.VISUAL_ID;
			}
			break;
		case ExternalLinkExternalLinkSourceCompartment3EditPart.VISUAL_ID:
			if (WebDSLPackage.eINSTANCE.getText().isSuperTypeOf(
					domainElement.eClass())) {
				return Text4EditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getImage().isSuperTypeOf(
					domainElement.eClass())) {
				return Image4EditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = com.github.kanafghan.welipse.webdsl.diagram.part.WebdslVisualIDRegistry
				.getModelID(containerView);
		if (!WebsiteEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (WebsiteEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = com.github.kanafghan.welipse.webdsl.diagram.part.WebdslVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = WebsiteEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case WebsiteEditPart.VISUAL_ID:
			if (PageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PageEditPart.VISUAL_ID:
			if (PageNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PagePageParametersCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PagePageVariablesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PagePageElementsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ParameterEditPart.VISUAL_ID:
			if (ParameterDeclarationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case VariableInitializationEditPart.VISUAL_ID:
			if (VariableInitializationDeclarationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TextEditPart.VISUAL_ID:
			if (TextExpressionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ImageEditPart.VISUAL_ID:
			if (ImageExpressionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ListEditPart.VISUAL_ID:
			if (ListExpressionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ListExpression2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ListListElementsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Text2EditPart.VISUAL_ID:
			if (TextExpression2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Image2EditPart.VISUAL_ID:
			if (ImageExpression2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case List2EditPart.VISUAL_ID:
			if (ListVariableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ListExpression3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ListListElementsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Group2EditPart.VISUAL_ID:
			if (GroupName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupGroupElementsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Text3EditPart.VISUAL_ID:
			if (TextExpression3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Image3EditPart.VISUAL_ID:
			if (ImageExpression3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case List3EditPart.VISUAL_ID:
			if (ListVariable2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ListExpression4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ListListElementsCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InternalLink2EditPart.VISUAL_ID:
			if (InternalLinkName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InternalLinkInternalLinkSourceCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InternalLinkInternalLinkActualParametersCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActualParameterEditPart.VISUAL_ID:
			if (ActualParameterIdentifierEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Text4EditPart.VISUAL_ID:
			if (TextExpression4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Image4EditPart.VISUAL_ID:
			if (ImageExpression4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ExternalLink2EditPart.VISUAL_ID:
			if (ExternalLinkName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExternalLinkExternalLinkSourceCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Group3EditPart.VISUAL_ID:
			if (GroupName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupGroupElementsCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FormEditPart.VISUAL_ID:
			if (FormNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FormFormElementsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InternalLink3EditPart.VISUAL_ID:
			if (InternalLinkName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InternalLinkInternalLinkSourceCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InternalLinkInternalLinkActualParametersCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ExternalLink3EditPart.VISUAL_ID:
			if (ExternalLinkName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExternalLinkExternalLinkSourceCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TextInputEditPart.VISUAL_ID:
			if (TextInputLabelExpressionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TextInputValueExpressionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SelectionListEditPart.VISUAL_ID:
			if (SelectionListLabelExpressionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SelectionListValueExpressionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SelectionListOptionsExpressionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ButtonEditPart.VISUAL_ID:
			if (ButtonValueEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CustomActionEditPart.VISUAL_ID:
			if (CustomActionValueEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CustomActionPerformerExpressionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CustomActionValidatorExpressionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SaveEditPart.VISUAL_ID:
			if (SaveValueEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SavePerformerExpressionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SaveValidatorExpressionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ResetEditPart.VISUAL_ID:
			if (ResetValueEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ResetPerformerExpressionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ResetValidatorExpressionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CancelEditPart.VISUAL_ID:
			if (CancelValueEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CancelPerformerExpressionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CancelValidatorExpressionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GroupEditPart.VISUAL_ID:
			if (GroupNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupGroupElementsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Form2EditPart.VISUAL_ID:
			if (FormName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FormFormElementsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InternalLinkEditPart.VISUAL_ID:
			if (InternalLinkNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InternalLinkInternalLinkSourceCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InternalLinkInternalLinkActualParametersCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ExternalLinkEditPart.VISUAL_ID:
			if (ExternalLinkNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExternalLinkExternalLinkSourceCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TextInput2EditPart.VISUAL_ID:
			if (TextInputLabelExpression2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TextInputValueExpression2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SelectionList2EditPart.VISUAL_ID:
			if (SelectionListLabelExpression2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SelectionListValueExpression2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SelectionListOptionsExpression2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Button2EditPart.VISUAL_ID:
			if (ButtonValue2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CustomAction2EditPart.VISUAL_ID:
			if (CustomActionValue2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CustomActionPerformerExpression2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CustomActionValidatorExpression2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Save2EditPart.VISUAL_ID:
			if (SaveValue2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SavePerformerExpression2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SaveValidatorExpression2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Reset2EditPart.VISUAL_ID:
			if (ResetValue2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ResetPerformerExpression2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ResetValidatorExpression2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Cancel2EditPart.VISUAL_ID:
			if (CancelValue2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CancelPerformerExpression2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CancelValidatorExpression2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PagePageParametersCompartmentEditPart.VISUAL_ID:
			if (ParameterEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PagePageVariablesCompartmentEditPart.VISUAL_ID:
			if (VariableInitializationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PagePageElementsCompartmentEditPart.VISUAL_ID:
			if (TextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ImageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ListEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Form2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InternalLinkEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExternalLinkEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TextInput2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SelectionList2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Button2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CustomAction2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Save2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Reset2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Cancel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ListListElementsCompartmentEditPart.VISUAL_ID:
			if (Text2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Image2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (List2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Group2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InternalLink2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExternalLink2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ListListElementsCompartment2EditPart.VISUAL_ID:
			if (Text2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Image2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (List2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Group2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InternalLink2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExternalLink2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GroupGroupElementsCompartmentEditPart.VISUAL_ID:
			if (Text3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Image3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (List3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Group3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FormEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InternalLink3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExternalLink3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TextInputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SelectionListEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ButtonEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CustomActionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SaveEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ResetEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CancelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ListListElementsCompartment3EditPart.VISUAL_ID:
			if (Text2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Image2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (List2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Group2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InternalLink2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExternalLink2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InternalLinkInternalLinkSourceCompartmentEditPart.VISUAL_ID:
			if (Text4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Image4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InternalLinkInternalLinkActualParametersCompartmentEditPart.VISUAL_ID:
			if (ActualParameterEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ExternalLinkExternalLinkSourceCompartmentEditPart.VISUAL_ID:
			if (Text4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Image4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GroupGroupElementsCompartment3EditPart.VISUAL_ID:
			if (Text3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Image3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (List3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Group3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FormEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InternalLink3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExternalLink3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TextInputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SelectionListEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ButtonEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CustomActionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SaveEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ResetEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CancelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FormFormElementsCompartmentEditPart.VISUAL_ID:
			if (Text3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Image3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (List3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Group3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FormEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InternalLink3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExternalLink3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TextInputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SelectionListEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ButtonEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CustomActionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SaveEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ResetEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CancelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InternalLinkInternalLinkSourceCompartment2EditPart.VISUAL_ID:
			if (Text4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Image4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InternalLinkInternalLinkActualParametersCompartment2EditPart.VISUAL_ID:
			if (ActualParameterEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ExternalLinkExternalLinkSourceCompartment2EditPart.VISUAL_ID:
			if (Text4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Image4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GroupGroupElementsCompartment2EditPart.VISUAL_ID:
			if (Text3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Image3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (List3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Group3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FormEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InternalLink3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExternalLink3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TextInputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SelectionListEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ButtonEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CustomActionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SaveEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ResetEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CancelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FormFormElementsCompartment2EditPart.VISUAL_ID:
			if (Text3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Image3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (List3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Group3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FormEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InternalLink3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExternalLink3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TextInputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SelectionListEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ButtonEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CustomActionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SaveEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ResetEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CancelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InternalLinkInternalLinkSourceCompartment3EditPart.VISUAL_ID:
			if (Text4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Image4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InternalLinkInternalLinkActualParametersCompartment3EditPart.VISUAL_ID:
			if (ActualParameterEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ExternalLinkExternalLinkSourceCompartment3EditPart.VISUAL_ID:
			if (Text4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Image4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(Website element) {
		return true;
	}

	/**
	 * @generated
	 */
	private static boolean isGroup_3013(Group domainElement) {
		Object result = WebdslOCLFactory.getExpression(0,
				WebDSLPackage.eINSTANCE.getGroup(), null).evaluate(
				domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isGroup_3019(Group domainElement) {
		Object result = WebdslOCLFactory.getExpression(0,
				WebDSLPackage.eINSTANCE.getGroup(), null).evaluate(
				domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isForm_3024(Form domainElement) {
		Object result = WebdslOCLFactory.getExpression(1,
				WebDSLPackage.eINSTANCE.getForm(), null)
				.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isButton_3030(Button domainElement) {
		Object result = WebdslOCLFactory.getExpression(2,
				WebDSLPackage.eINSTANCE.getButton(), null).evaluate(
				domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isCustomAction_3032(CustomAction domainElement) {
		Object result = WebdslOCLFactory.getExpression(3,
				WebDSLPackage.eINSTANCE.getCustomAction(), null).evaluate(
				domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isSave_3034(Save domainElement) {
		Object result = WebdslOCLFactory.getExpression(4,
				WebDSLPackage.eINSTANCE.getSave(), null)
				.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isReset_3036(Reset domainElement) {
		Object result = WebdslOCLFactory.getExpression(5,
				WebDSLPackage.eINSTANCE.getReset(), null).evaluate(
				domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isCancel_3038(Cancel domainElement) {
		Object result = WebdslOCLFactory.getExpression(6,
				WebDSLPackage.eINSTANCE.getCancel(), null).evaluate(
				domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isGroup_3006(Group domainElement) {
		Object result = WebdslOCLFactory.getExpression(0,
				WebDSLPackage.eINSTANCE.getGroup(), null).evaluate(
				domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isForm_3025(Form domainElement) {
		Object result = WebdslOCLFactory.getExpression(1,
				WebDSLPackage.eINSTANCE.getForm(), null)
				.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isButton_3031(Button domainElement) {
		Object result = WebdslOCLFactory.getExpression(2,
				WebDSLPackage.eINSTANCE.getButton(), null).evaluate(
				domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isCustomAction_3033(CustomAction domainElement) {
		Object result = WebdslOCLFactory.getExpression(3,
				WebDSLPackage.eINSTANCE.getCustomAction(), null).evaluate(
				domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isSave_3035(Save domainElement) {
		Object result = WebdslOCLFactory.getExpression(4,
				WebDSLPackage.eINSTANCE.getSave(), null)
				.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isReset_3037(Reset domainElement) {
		Object result = WebdslOCLFactory.getExpression(5,
				WebDSLPackage.eINSTANCE.getReset(), null).evaluate(
				domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isCancel_3039(Cancel domainElement) {
		Object result = WebdslOCLFactory.getExpression(6,
				WebDSLPackage.eINSTANCE.getCancel(), null).evaluate(
				domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case PagePageParametersCompartmentEditPart.VISUAL_ID:
		case PagePageVariablesCompartmentEditPart.VISUAL_ID:
		case PagePageElementsCompartmentEditPart.VISUAL_ID:
		case ListListElementsCompartmentEditPart.VISUAL_ID:
		case ListListElementsCompartment2EditPart.VISUAL_ID:
		case GroupGroupElementsCompartmentEditPart.VISUAL_ID:
		case ListListElementsCompartment3EditPart.VISUAL_ID:
		case InternalLinkInternalLinkSourceCompartmentEditPart.VISUAL_ID:
		case InternalLinkInternalLinkActualParametersCompartmentEditPart.VISUAL_ID:
		case ExternalLinkExternalLinkSourceCompartmentEditPart.VISUAL_ID:
		case GroupGroupElementsCompartment3EditPart.VISUAL_ID:
		case FormFormElementsCompartmentEditPart.VISUAL_ID:
		case InternalLinkInternalLinkSourceCompartment2EditPart.VISUAL_ID:
		case InternalLinkInternalLinkActualParametersCompartment2EditPart.VISUAL_ID:
		case ExternalLinkExternalLinkSourceCompartment2EditPart.VISUAL_ID:
		case GroupGroupElementsCompartment2EditPart.VISUAL_ID:
		case FormFormElementsCompartment2EditPart.VISUAL_ID:
		case InternalLinkInternalLinkSourceCompartment3EditPart.VISUAL_ID:
		case InternalLinkInternalLinkActualParametersCompartment3EditPart.VISUAL_ID:
		case ExternalLinkExternalLinkSourceCompartment3EditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case WebsiteEditPart.VISUAL_ID:
			return false;
		case ParameterEditPart.VISUAL_ID:
		case VariableInitializationEditPart.VISUAL_ID:
		case TextEditPart.VISUAL_ID:
		case ImageEditPart.VISUAL_ID:
		case ActualParameterEditPart.VISUAL_ID:
		case Text2EditPart.VISUAL_ID:
		case Image2EditPart.VISUAL_ID:
		case Text3EditPart.VISUAL_ID:
		case Image3EditPart.VISUAL_ID:
		case Text4EditPart.VISUAL_ID:
		case Image4EditPart.VISUAL_ID:
		case TextInputEditPart.VISUAL_ID:
		case TextInput2EditPart.VISUAL_ID:
		case SelectionListEditPart.VISUAL_ID:
		case SelectionList2EditPart.VISUAL_ID:
		case ButtonEditPart.VISUAL_ID:
		case Button2EditPart.VISUAL_ID:
		case CustomActionEditPart.VISUAL_ID:
		case CustomAction2EditPart.VISUAL_ID:
		case SaveEditPart.VISUAL_ID:
		case Save2EditPart.VISUAL_ID:
		case ResetEditPart.VISUAL_ID:
		case Reset2EditPart.VISUAL_ID:
		case CancelEditPart.VISUAL_ID:
		case Cancel2EditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		@Override
		public int getVisualID(View view) {
			return com.github.kanafghan.welipse.webdsl.diagram.part.WebdslVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return com.github.kanafghan.welipse.webdsl.diagram.part.WebdslVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return com.github.kanafghan.welipse.webdsl.diagram.part.WebdslVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return com.github.kanafghan.welipse.webdsl.diagram.part.WebdslVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return com.github.kanafghan.welipse.webdsl.diagram.part.WebdslVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return com.github.kanafghan.welipse.webdsl.diagram.part.WebdslVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
