package com.github.kanafghan.welipse.webdsl.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import com.github.kanafghan.welipse.webdsl.diagram.part.WebdslVisualIDRegistry;

/**
 * @generated
 */
public class WebdslEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (WebdslVisualIDRegistry.getVisualID(view)) {

			case WebsiteEditPart.VISUAL_ID:
				return new WebsiteEditPart(view);

			case PageEditPart.VISUAL_ID:
				return new PageEditPart(view);

			case PageNameEditPart.VISUAL_ID:
				return new PageNameEditPart(view);

			case ParameterEditPart.VISUAL_ID:
				return new ParameterEditPart(view);

			case ParameterDeclarationEditPart.VISUAL_ID:
				return new ParameterDeclarationEditPart(view);

			case VariableInitializationEditPart.VISUAL_ID:
				return new VariableInitializationEditPart(view);

			case VariableInitializationDeclarationEditPart.VISUAL_ID:
				return new VariableInitializationDeclarationEditPart(view);

			case TextEditPart.VISUAL_ID:
				return new TextEditPart(view);

			case TextExpressionEditPart.VISUAL_ID:
				return new TextExpressionEditPart(view);

			case ImageEditPart.VISUAL_ID:
				return new ImageEditPart(view);

			case ImageExpressionEditPart.VISUAL_ID:
				return new ImageExpressionEditPart(view);

			case ListEditPart.VISUAL_ID:
				return new ListEditPart(view);

			case ListExpressionEditPart.VISUAL_ID:
				return new ListExpressionEditPart(view);

			case ListExpression2EditPart.VISUAL_ID:
				return new ListExpression2EditPart(view);

			case Text2EditPart.VISUAL_ID:
				return new Text2EditPart(view);

			case TextExpression2EditPart.VISUAL_ID:
				return new TextExpression2EditPart(view);

			case Image2EditPart.VISUAL_ID:
				return new Image2EditPart(view);

			case ImageExpression2EditPart.VISUAL_ID:
				return new ImageExpression2EditPart(view);

			case List2EditPart.VISUAL_ID:
				return new List2EditPart(view);

			case ListVariableEditPart.VISUAL_ID:
				return new ListVariableEditPart(view);

			case ListExpression3EditPart.VISUAL_ID:
				return new ListExpression3EditPart(view);

			case Group2EditPart.VISUAL_ID:
				return new Group2EditPart(view);

			case GroupName2EditPart.VISUAL_ID:
				return new GroupName2EditPart(view);

			case Text3EditPart.VISUAL_ID:
				return new Text3EditPart(view);

			case TextExpression3EditPart.VISUAL_ID:
				return new TextExpression3EditPart(view);

			case Image3EditPart.VISUAL_ID:
				return new Image3EditPart(view);

			case ImageExpression3EditPart.VISUAL_ID:
				return new ImageExpression3EditPart(view);

			case List3EditPart.VISUAL_ID:
				return new List3EditPart(view);

			case ListVariable2EditPart.VISUAL_ID:
				return new ListVariable2EditPart(view);

			case ListExpression4EditPart.VISUAL_ID:
				return new ListExpression4EditPart(view);

			case InternalLink2EditPart.VISUAL_ID:
				return new InternalLink2EditPart(view);

			case InternalLinkName2EditPart.VISUAL_ID:
				return new InternalLinkName2EditPart(view);

			case ActualParameterEditPart.VISUAL_ID:
				return new ActualParameterEditPart(view);

			case ActualParameterIdentifierEditPart.VISUAL_ID:
				return new ActualParameterIdentifierEditPart(view);

			case Text4EditPart.VISUAL_ID:
				return new Text4EditPart(view);

			case TextExpression4EditPart.VISUAL_ID:
				return new TextExpression4EditPart(view);

			case Image4EditPart.VISUAL_ID:
				return new Image4EditPart(view);

			case ImageExpression4EditPart.VISUAL_ID:
				return new ImageExpression4EditPart(view);

			case ExternalLink2EditPart.VISUAL_ID:
				return new ExternalLink2EditPart(view);

			case ExternalLinkName2EditPart.VISUAL_ID:
				return new ExternalLinkName2EditPart(view);

			case Group3EditPart.VISUAL_ID:
				return new Group3EditPart(view);

			case GroupName3EditPart.VISUAL_ID:
				return new GroupName3EditPart(view);

			case InternalLink3EditPart.VISUAL_ID:
				return new InternalLink3EditPart(view);

			case InternalLinkName3EditPart.VISUAL_ID:
				return new InternalLinkName3EditPart(view);

			case ExternalLink3EditPart.VISUAL_ID:
				return new ExternalLink3EditPart(view);

			case ExternalLinkName3EditPart.VISUAL_ID:
				return new ExternalLinkName3EditPart(view);

			case GroupEditPart.VISUAL_ID:
				return new GroupEditPart(view);

			case GroupNameEditPart.VISUAL_ID:
				return new GroupNameEditPart(view);

			case InternalLinkEditPart.VISUAL_ID:
				return new InternalLinkEditPart(view);

			case InternalLinkNameEditPart.VISUAL_ID:
				return new InternalLinkNameEditPart(view);

			case ExternalLinkEditPart.VISUAL_ID:
				return new ExternalLinkEditPart(view);

			case ExternalLinkNameEditPart.VISUAL_ID:
				return new ExternalLinkNameEditPart(view);

			case PagePageParametersCompartmentEditPart.VISUAL_ID:
				return new PagePageParametersCompartmentEditPart(view);

			case PagePageVariablesCompartmentEditPart.VISUAL_ID:
				return new PagePageVariablesCompartmentEditPart(view);

			case PagePageElementsCompartmentEditPart.VISUAL_ID:
				return new PagePageElementsCompartmentEditPart(view);

			case ListListElementsCompartmentEditPart.VISUAL_ID:
				return new ListListElementsCompartmentEditPart(view);

			case ListListElementsCompartment2EditPart.VISUAL_ID:
				return new ListListElementsCompartment2EditPart(view);

			case GroupGroupElementsCompartmentEditPart.VISUAL_ID:
				return new GroupGroupElementsCompartmentEditPart(view);

			case ListListElementsCompartment3EditPart.VISUAL_ID:
				return new ListListElementsCompartment3EditPart(view);

			case InternalLinkInternalLinkSourceCompartmentEditPart.VISUAL_ID:
				return new InternalLinkInternalLinkSourceCompartmentEditPart(
						view);

			case InternalLinkInternalLinkActualParametersCompartmentEditPart.VISUAL_ID:
				return new InternalLinkInternalLinkActualParametersCompartmentEditPart(
						view);

			case ExternalLinkExternalLinkSourceCompartmentEditPart.VISUAL_ID:
				return new ExternalLinkExternalLinkSourceCompartmentEditPart(
						view);

			case GroupGroupElementsCompartment3EditPart.VISUAL_ID:
				return new GroupGroupElementsCompartment3EditPart(view);

			case InternalLinkInternalLinkSourceCompartment2EditPart.VISUAL_ID:
				return new InternalLinkInternalLinkSourceCompartment2EditPart(
						view);

			case InternalLinkInternalLinkActualParametersCompartment2EditPart.VISUAL_ID:
				return new InternalLinkInternalLinkActualParametersCompartment2EditPart(
						view);

			case ExternalLinkExternalLinkSourceCompartment2EditPart.VISUAL_ID:
				return new ExternalLinkExternalLinkSourceCompartment2EditPart(
						view);

			case GroupGroupElementsCompartment2EditPart.VISUAL_ID:
				return new GroupGroupElementsCompartment2EditPart(view);

			case InternalLinkInternalLinkSourceCompartment3EditPart.VISUAL_ID:
				return new InternalLinkInternalLinkSourceCompartment3EditPart(
						view);

			case InternalLinkInternalLinkActualParametersCompartment3EditPart.VISUAL_ID:
				return new InternalLinkInternalLinkActualParametersCompartment3EditPart(
						view);

			case ExternalLinkExternalLinkSourceCompartment3EditPart.VISUAL_ID:
				return new ExternalLinkExternalLinkSourceCompartment3EditPart(
						view);

			case InternalLinkTargetEditPart.VISUAL_ID:
				return new InternalLinkTargetEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
