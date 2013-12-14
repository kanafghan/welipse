package com.github.kanafghan.welipse.webdsl.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import com.github.kanafghan.welipse.webdsl.WebDSLPackage;
import com.github.kanafghan.welipse.webdsl.Website;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ActualParameterEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ActualParameterIdentifierEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ExternalLink2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ExternalLink3EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ExternalLinkEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ExternalLinkExternalLinkSourceCompartment2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ExternalLinkExternalLinkSourceCompartment3EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ExternalLinkExternalLinkSourceCompartmentEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ExternalLinkName2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ExternalLinkName3EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ExternalLinkNameEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.Group2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.Group3EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.GroupEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.GroupGroupElementsCompartment2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.GroupGroupElementsCompartment3EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.GroupGroupElementsCompartmentEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.GroupName2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.GroupName3EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.GroupNameEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.Image2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.Image3EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.Image4EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ImageEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ImageExpression2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ImageExpression3EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ImageExpression4EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ImageExpressionEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.InternalLink2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.InternalLink3EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.InternalLinkEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.InternalLinkInternalLinkActualParametersCompartment2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.InternalLinkInternalLinkActualParametersCompartment3EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.InternalLinkInternalLinkActualParametersCompartmentEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.InternalLinkInternalLinkSourceCompartment2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.InternalLinkInternalLinkSourceCompartment3EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.InternalLinkInternalLinkSourceCompartmentEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.InternalLinkName2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.InternalLinkName3EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.InternalLinkNameEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.List2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.List3EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ListEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ListExpression2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ListExpression3EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ListExpression4EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ListExpressionEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ListListElementsCompartment2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ListListElementsCompartment3EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ListListElementsCompartmentEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ListVariable2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ListVariableEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.PageEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.PageNameEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.PagePageElementsCompartmentEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.PagePageParametersCompartmentEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.PagePageVariablesCompartmentEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ParameterDeclarationEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ParameterEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.Text2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.Text3EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.Text4EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.TextEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.TextExpression2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.TextExpression3EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.TextExpression4EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.TextExpressionEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.VariableInitializationDeclarationEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.VariableInitializationEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.WebsiteEditPart;

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
					domainElement.eClass())) {
				return GroupEditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getInternalLink().isSuperTypeOf(
					domainElement.eClass())) {
				return InternalLinkEditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getExternalLink().isSuperTypeOf(
					domainElement.eClass())) {
				return ExternalLinkEditPart.VISUAL_ID;
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
					domainElement.eClass())) {
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
					domainElement.eClass())) {
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
					domainElement.eClass())) {
				return Group3EditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getInternalLink().isSuperTypeOf(
					domainElement.eClass())) {
				return InternalLink3EditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getExternalLink().isSuperTypeOf(
					domainElement.eClass())) {
				return ExternalLink3EditPart.VISUAL_ID;
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
					domainElement.eClass())) {
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
					domainElement.eClass())) {
				return Group3EditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getInternalLink().isSuperTypeOf(
					domainElement.eClass())) {
				return InternalLink3EditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getExternalLink().isSuperTypeOf(
					domainElement.eClass())) {
				return ExternalLink3EditPart.VISUAL_ID;
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
					domainElement.eClass())) {
				return Group3EditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getInternalLink().isSuperTypeOf(
					domainElement.eClass())) {
				return InternalLink3EditPart.VISUAL_ID;
			}
			if (WebDSLPackage.eINSTANCE.getExternalLink().isSuperTypeOf(
					domainElement.eClass())) {
				return ExternalLink3EditPart.VISUAL_ID;
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
		case GroupEditPart.VISUAL_ID:
			if (GroupNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupGroupElementsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
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
			if (InternalLinkEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExternalLinkEditPart.VISUAL_ID == nodeVisualID) {
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
			if (InternalLink3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExternalLink3EditPart.VISUAL_ID == nodeVisualID) {
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
			if (InternalLink3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExternalLink3EditPart.VISUAL_ID == nodeVisualID) {
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
			if (InternalLink3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExternalLink3EditPart.VISUAL_ID == nodeVisualID) {
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
		case InternalLinkInternalLinkSourceCompartment2EditPart.VISUAL_ID:
		case InternalLinkInternalLinkActualParametersCompartment2EditPart.VISUAL_ID:
		case ExternalLinkExternalLinkSourceCompartment2EditPart.VISUAL_ID:
		case GroupGroupElementsCompartment2EditPart.VISUAL_ID:
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
