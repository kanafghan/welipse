package com.github.kanafghan.welipse.webdsl.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import com.github.kanafghan.welipse.webdsl.WebDSLPackage;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ActualParameterIdentifierEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ButtonValue2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ButtonValueEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.CancelPerformerExpression2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.CancelPerformerExpressionEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.CancelValidatorExpression2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.CancelValidatorExpressionEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.CancelValue2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.CancelValueEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.CustomActionPerformerExpression2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.CustomActionPerformerExpressionEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.CustomActionValidatorExpression2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.CustomActionValidatorExpressionEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.CustomActionValue2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.CustomActionValueEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ExternalLinkName2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ExternalLinkName3EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ExternalLinkNameEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ExternalLinkTargetExpression2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ExternalLinkTargetExpression3EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ExternalLinkTargetExpressionEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.FormName2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.FormNameEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.GroupName2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.GroupName3EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.GroupNameEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ImageExpression2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ImageExpression3EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ImageExpression4EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ImageExpressionEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.InternalLinkName2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.InternalLinkName3EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.InternalLinkNameEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ListExpression2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ListExpression3EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ListExpression4EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ListExpressionEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ListVariable2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ListVariableEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.PageNameEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ParameterDeclarationEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ResetPerformerExpression2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ResetPerformerExpressionEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ResetValidatorExpression2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ResetValidatorExpressionEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ResetValue2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ResetValueEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.SavePerformerExpression2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.SavePerformerExpressionEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.SaveValidatorExpression2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.SaveValidatorExpressionEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.SaveValue2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.SaveValueEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.SelectionListLabelExpression2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.SelectionListLabelExpressionEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.SelectionListOptionsExpression2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.SelectionListOptionsExpressionEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.SelectionListValueExpression2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.SelectionListValueExpressionEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.TextExpression2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.TextExpression3EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.TextExpression4EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.TextExpressionEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.TextInputLabelExpression2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.TextInputLabelExpressionEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.TextInputValueExpression2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.TextInputValueExpressionEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.VariableInitializationDeclarationEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.parsers.MessageFormatParser;
import com.github.kanafghan.welipse.webdsl.diagram.part.WebdslVisualIDRegistry;

/**
 * @generated
 */
public class WebdslParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser pageName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getPageName_5001Parser() {
		if (pageName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { WebDSLPackage.eINSTANCE
					.getPage_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pageName_5001Parser = parser;
		}
		return pageName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser parameterDeclaration_5002Parser;

	/**
	 * @generated
	 */
	private IParser getParameterDeclaration_5002Parser() {
		if (parameterDeclaration_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { WebDSLPackage.eINSTANCE
					.getVariableDeclaration_Declaration() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parameterDeclaration_5002Parser = parser;
		}
		return parameterDeclaration_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser variableInitializationDeclaration_5003Parser;

	/**
	 * @generated
	 */
	private IParser getVariableInitializationDeclaration_5003Parser() {
		if (variableInitializationDeclaration_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { WebDSLPackage.eINSTANCE
					.getVariableDeclaration_Declaration() };
			MessageFormatParser parser = new MessageFormatParser(features);
			variableInitializationDeclaration_5003Parser = parser;
		}
		return variableInitializationDeclaration_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser textExpression_5004Parser;

	/**
	 * @generated
	 */
	private IParser getTextExpression_5004Parser() {
		if (textExpression_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { WebDSLPackage.eINSTANCE
					.getPresentationElement_Expression() };
			MessageFormatParser parser = new MessageFormatParser(features);
			textExpression_5004Parser = parser;
		}
		return textExpression_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser imageExpression_5023Parser;

	/**
	 * @generated
	 */
	private IParser getImageExpression_5023Parser() {
		if (imageExpression_5023Parser == null) {
			EAttribute[] features = new EAttribute[] { WebDSLPackage.eINSTANCE
					.getPresentationElement_Expression() };
			MessageFormatParser parser = new MessageFormatParser(features);
			imageExpression_5023Parser = parser;
		}
		return imageExpression_5023Parser;
	}

	/**
	 * @generated
	 */
	private IParser listVariable_5024Parser;

	/**
	 * @generated
	 */
	private IParser getListVariable_5024Parser() {
		if (listVariable_5024Parser == null) {
			EAttribute[] features = new EAttribute[] { WebDSLPackage.eINSTANCE
					.getList_Variable() };
			MessageFormatParser parser = new MessageFormatParser(features);
			listVariable_5024Parser = parser;
		}
		return listVariable_5024Parser;
	}

	/**
	 * @generated
	 */
	private IParser listExpression_5030Parser;

	/**
	 * @generated
	 */
	private IParser getListExpression_5030Parser() {
		if (listExpression_5030Parser == null) {
			EAttribute[] features = new EAttribute[] { WebDSLPackage.eINSTANCE
					.getPresentationElement_Expression() };
			MessageFormatParser parser = new MessageFormatParser(features);
			listExpression_5030Parser = parser;
		}
		return listExpression_5030Parser;
	}

	/**
	 * @generated
	 */
	private IParser textExpression_5029Parser;

	/**
	 * @generated
	 */
	private IParser getTextExpression_5029Parser() {
		if (textExpression_5029Parser == null) {
			EAttribute[] features = new EAttribute[] { WebDSLPackage.eINSTANCE
					.getPresentationElement_Expression() };
			MessageFormatParser parser = new MessageFormatParser(features);
			textExpression_5029Parser = parser;
		}
		return textExpression_5029Parser;
	}

	/**
	 * @generated
	 */
	private IParser imageExpression_5031Parser;

	/**
	 * @generated
	 */
	private IParser getImageExpression_5031Parser() {
		if (imageExpression_5031Parser == null) {
			EAttribute[] features = new EAttribute[] { WebDSLPackage.eINSTANCE
					.getPresentationElement_Expression() };
			MessageFormatParser parser = new MessageFormatParser(features);
			imageExpression_5031Parser = parser;
		}
		return imageExpression_5031Parser;
	}

	/**
	 * @generated
	 */
	private IParser listVariable_5035Parser;

	/**
	 * @generated
	 */
	private IParser getListVariable_5035Parser() {
		if (listVariable_5035Parser == null) {
			EAttribute[] features = new EAttribute[] { WebDSLPackage.eINSTANCE
					.getList_Variable() };
			MessageFormatParser parser = new MessageFormatParser(features);
			listVariable_5035Parser = parser;
		}
		return listVariable_5035Parser;
	}

	/**
	 * @generated
	 */
	private IParser listExpression_5036Parser;

	/**
	 * @generated
	 */
	private IParser getListExpression_5036Parser() {
		if (listExpression_5036Parser == null) {
			EAttribute[] features = new EAttribute[] { WebDSLPackage.eINSTANCE
					.getPresentationElement_Expression() };
			MessageFormatParser parser = new MessageFormatParser(features);
			listExpression_5036Parser = parser;
		}
		return listExpression_5036Parser;
	}

	/**
	 * @generated
	 */
	private IParser groupName_5032Parser;

	/**
	 * @generated
	 */
	private IParser getGroupName_5032Parser() {
		if (groupName_5032Parser == null) {
			EAttribute[] features = new EAttribute[] { WebDSLPackage.eINSTANCE
					.getPageElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			groupName_5032Parser = parser;
		}
		return groupName_5032Parser;
	}

	/**
	 * @generated
	 */
	private IParser textExpression_5037Parser;

	/**
	 * @generated
	 */
	private IParser getTextExpression_5037Parser() {
		if (textExpression_5037Parser == null) {
			EAttribute[] features = new EAttribute[] { WebDSLPackage.eINSTANCE
					.getPresentationElement_Expression() };
			MessageFormatParser parser = new MessageFormatParser(features);
			textExpression_5037Parser = parser;
		}
		return textExpression_5037Parser;
	}

	/**
	 * @generated
	 */
	private IParser imageExpression_5038Parser;

	/**
	 * @generated
	 */
	private IParser getImageExpression_5038Parser() {
		if (imageExpression_5038Parser == null) {
			EAttribute[] features = new EAttribute[] { WebDSLPackage.eINSTANCE
					.getPresentationElement_Expression() };
			MessageFormatParser parser = new MessageFormatParser(features);
			imageExpression_5038Parser = parser;
		}
		return imageExpression_5038Parser;
	}

	/**
	 * @generated
	 */
	private IParser listVariable_5039Parser;

	/**
	 * @generated
	 */
	private IParser getListVariable_5039Parser() {
		if (listVariable_5039Parser == null) {
			EAttribute[] features = new EAttribute[] { WebDSLPackage.eINSTANCE
					.getList_Variable() };
			MessageFormatParser parser = new MessageFormatParser(features);
			listVariable_5039Parser = parser;
		}
		return listVariable_5039Parser;
	}

	/**
	 * @generated
	 */
	private IParser listExpression_5040Parser;

	/**
	 * @generated
	 */
	private IParser getListExpression_5040Parser() {
		if (listExpression_5040Parser == null) {
			EAttribute[] features = new EAttribute[] { WebDSLPackage.eINSTANCE
					.getPresentationElement_Expression() };
			MessageFormatParser parser = new MessageFormatParser(features);
			listExpression_5040Parser = parser;
		}
		return listExpression_5040Parser;
	}

	/**
	 * @generated
	 */
	private IParser internalLinkName_5033Parser;

	/**
	 * @generated
	 */
	private IParser getInternalLinkName_5033Parser() {
		if (internalLinkName_5033Parser == null) {
			EAttribute[] features = new EAttribute[] { WebDSLPackage.eINSTANCE
					.getPageElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			internalLinkName_5033Parser = parser;
		}
		return internalLinkName_5033Parser;
	}

	/**
	 * @generated
	 */
	private IParser actualParameterIdentifier_5026Parser;

	/**
	 * @generated
	 */
	private IParser getActualParameterIdentifier_5026Parser() {
		if (actualParameterIdentifier_5026Parser == null) {
			EAttribute[] features = new EAttribute[] { WebDSLPackage.eINSTANCE
					.getActualParameter_Identifier() };
			MessageFormatParser parser = new MessageFormatParser(features);
			actualParameterIdentifier_5026Parser = parser;
		}
		return actualParameterIdentifier_5026Parser;
	}

	/**
	 * @generated
	 */
	private IParser textExpression_5044Parser;

	/**
	 * @generated
	 */
	private IParser getTextExpression_5044Parser() {
		if (textExpression_5044Parser == null) {
			EAttribute[] features = new EAttribute[] { WebDSLPackage.eINSTANCE
					.getPresentationElement_Expression() };
			MessageFormatParser parser = new MessageFormatParser(features);
			textExpression_5044Parser = parser;
		}
		return textExpression_5044Parser;
	}

	/**
	 * @generated
	 */
	private IParser imageExpression_5045Parser;

	/**
	 * @generated
	 */
	private IParser getImageExpression_5045Parser() {
		if (imageExpression_5045Parser == null) {
			EAttribute[] features = new EAttribute[] { WebDSLPackage.eINSTANCE
					.getPresentationElement_Expression() };
			MessageFormatParser parser = new MessageFormatParser(features);
			imageExpression_5045Parser = parser;
		}
		return imageExpression_5045Parser;
	}

	/**
	 * @generated
	 */
	private IParser externalLinkName_5034Parser;

	/**
	 * @generated
	 */
	private IParser getExternalLinkName_5034Parser() {
		if (externalLinkName_5034Parser == null) {
			EAttribute[] features = new EAttribute[] { WebDSLPackage.eINSTANCE
					.getPageElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			externalLinkName_5034Parser = parser;
		}
		return externalLinkName_5034Parser;
	}

	/**
	 * @generated
	 */
	private IParser externalLinkTargetExpression_5084Parser;

	/**
	 * @generated
	 */
	private IParser getExternalLinkTargetExpression_5084Parser() {
		if (externalLinkTargetExpression_5084Parser == null) {
			EAttribute[] features = new EAttribute[] { WebDSLPackage.eINSTANCE
					.getExternalLink_TargetExpression() };
			MessageFormatParser parser = new MessageFormatParser(features);
			externalLinkTargetExpression_5084Parser = parser;
		}
		return externalLinkTargetExpression_5084Parser;
	}

	/**
	 * @generated
	 */
	private IParser groupName_5043Parser;

	/**
	 * @generated
	 */
	private IParser getGroupName_5043Parser() {
		if (groupName_5043Parser == null) {
			EAttribute[] features = new EAttribute[] { WebDSLPackage.eINSTANCE
					.getPageElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			groupName_5043Parser = parser;
		}
		return groupName_5043Parser;
	}

	/**
	 * @generated
	 */
	private IParser formName_5046Parser;

	/**
	 * @generated
	 */
	private IParser getFormName_5046Parser() {
		if (formName_5046Parser == null) {
			EAttribute[] features = new EAttribute[] { WebDSLPackage.eINSTANCE
					.getPageElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			formName_5046Parser = parser;
		}
		return formName_5046Parser;
	}

	/**
	 * @generated
	 */
	private IParser internalLinkName_5041Parser;

	/**
	 * @generated
	 */
	private IParser getInternalLinkName_5041Parser() {
		if (internalLinkName_5041Parser == null) {
			EAttribute[] features = new EAttribute[] { WebDSLPackage.eINSTANCE
					.getPageElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			internalLinkName_5041Parser = parser;
		}
		return internalLinkName_5041Parser;
	}

	/**
	 * @generated
	 */
	private IParser externalLinkName_5042Parser;

	/**
	 * @generated
	 */
	private IParser getExternalLinkName_5042Parser() {
		if (externalLinkName_5042Parser == null) {
			EAttribute[] features = new EAttribute[] { WebDSLPackage.eINSTANCE
					.getPageElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			externalLinkName_5042Parser = parser;
		}
		return externalLinkName_5042Parser;
	}

	/**
	 * @generated
	 */
	private IParser externalLinkTargetExpression_5085Parser;

	/**
	 * @generated
	 */
	private IParser getExternalLinkTargetExpression_5085Parser() {
		if (externalLinkTargetExpression_5085Parser == null) {
			EAttribute[] features = new EAttribute[] { WebDSLPackage.eINSTANCE
					.getExternalLink_TargetExpression() };
			MessageFormatParser parser = new MessageFormatParser(features);
			externalLinkTargetExpression_5085Parser = parser;
		}
		return externalLinkTargetExpression_5085Parser;
	}

	/**
	 * @generated
	 */
	private IParser textInputLabelExpression_5048Parser;

	/**
	 * @generated
	 */
	private IParser getTextInputLabelExpression_5048Parser() {
		if (textInputLabelExpression_5048Parser == null) {
			EAttribute[] features = new EAttribute[] { WebDSLPackage.eINSTANCE
					.getInput_LabelExpression() };
			MessageFormatParser parser = new MessageFormatParser(features);
			textInputLabelExpression_5048Parser = parser;
		}
		return textInputLabelExpression_5048Parser;
	}

	/**
	 * @generated
	 */
	private IParser textInputValueExpression_5049Parser;

	/**
	 * @generated
	 */
	private IParser getTextInputValueExpression_5049Parser() {
		if (textInputValueExpression_5049Parser == null) {
			EAttribute[] features = new EAttribute[] { WebDSLPackage.eINSTANCE
					.getInput_ValueExpression() };
			MessageFormatParser parser = new MessageFormatParser(features);
			textInputValueExpression_5049Parser = parser;
		}
		return textInputValueExpression_5049Parser;
	}

	/**
	 * @generated
	 */
	private IParser selectionListLabelExpression_5052Parser;

	/**
	 * @generated
	 */
	private IParser getSelectionListLabelExpression_5052Parser() {
		if (selectionListLabelExpression_5052Parser == null) {
			EAttribute[] features = new EAttribute[] { WebDSLPackage.eINSTANCE
					.getInput_LabelExpression() };
			MessageFormatParser parser = new MessageFormatParser(features);
			selectionListLabelExpression_5052Parser = parser;
		}
		return selectionListLabelExpression_5052Parser;
	}

	/**
	 * @generated
	 */
	private IParser selectionListValueExpression_5053Parser;

	/**
	 * @generated
	 */
	private IParser getSelectionListValueExpression_5053Parser() {
		if (selectionListValueExpression_5053Parser == null) {
			EAttribute[] features = new EAttribute[] { WebDSLPackage.eINSTANCE
					.getInput_ValueExpression() };
			MessageFormatParser parser = new MessageFormatParser(features);
			selectionListValueExpression_5053Parser = parser;
		}
		return selectionListValueExpression_5053Parser;
	}

	/**
	 * @generated
	 */
	private IParser selectionListOptionsExpression_5054Parser;

	/**
	 * @generated
	 */
	private IParser getSelectionListOptionsExpression_5054Parser() {
		if (selectionListOptionsExpression_5054Parser == null) {
			EAttribute[] features = new EAttribute[] { WebDSLPackage.eINSTANCE
					.getSelectionList_OptionsExpression() };
			MessageFormatParser parser = new MessageFormatParser(features);
			selectionListOptionsExpression_5054Parser = parser;
		}
		return selectionListOptionsExpression_5054Parser;
	}

	/**
	 * @generated
	 */
	private IParser buttonValue_5058Parser;

	/**
	 * @generated
	 */
	private IParser getButtonValue_5058Parser() {
		if (buttonValue_5058Parser == null) {
			EAttribute[] features = new EAttribute[] { WebDSLPackage.eINSTANCE
					.getButton_Value() };
			MessageFormatParser parser = new MessageFormatParser(features);
			buttonValue_5058Parser = parser;
		}
		return buttonValue_5058Parser;
	}

	/**
	 * @generated
	 */
	private IParser customActionValue_5060Parser;

	/**
	 * @generated
	 */
	private IParser getCustomActionValue_5060Parser() {
		if (customActionValue_5060Parser == null) {
			EAttribute[] features = new EAttribute[] { WebDSLPackage.eINSTANCE
					.getButton_Value() };
			MessageFormatParser parser = new MessageFormatParser(features);
			customActionValue_5060Parser = parser;
		}
		return customActionValue_5060Parser;
	}

	/**
	 * @generated
	 */
	private IParser customActionPerformerExpression_5061Parser;

	/**
	 * @generated
	 */
	private IParser getCustomActionPerformerExpression_5061Parser() {
		if (customActionPerformerExpression_5061Parser == null) {
			EAttribute[] features = new EAttribute[] { WebDSLPackage.eINSTANCE
					.getSubmit_PerformerExpression() };
			MessageFormatParser parser = new MessageFormatParser(features);
			customActionPerformerExpression_5061Parser = parser;
		}
		return customActionPerformerExpression_5061Parser;
	}

	/**
	 * @generated
	 */
	private IParser customActionValidatorExpression_5062Parser;

	/**
	 * @generated
	 */
	private IParser getCustomActionValidatorExpression_5062Parser() {
		if (customActionValidatorExpression_5062Parser == null) {
			EAttribute[] features = new EAttribute[] { WebDSLPackage.eINSTANCE
					.getSubmit_ValidatorExpression() };
			MessageFormatParser parser = new MessageFormatParser(features);
			customActionValidatorExpression_5062Parser = parser;
		}
		return customActionValidatorExpression_5062Parser;
	}

	/**
	 * @generated
	 */
	private IParser saveValue_5066Parser;

	/**
	 * @generated
	 */
	private IParser getSaveValue_5066Parser() {
		if (saveValue_5066Parser == null) {
			EAttribute[] features = new EAttribute[] { WebDSLPackage.eINSTANCE
					.getButton_Value() };
			MessageFormatParser parser = new MessageFormatParser(features);
			saveValue_5066Parser = parser;
		}
		return saveValue_5066Parser;
	}

	/**
	 * @generated
	 */
	private IParser savePerformerExpression_5067Parser;

	/**
	 * @generated
	 */
	private IParser getSavePerformerExpression_5067Parser() {
		if (savePerformerExpression_5067Parser == null) {
			EAttribute[] features = new EAttribute[] { WebDSLPackage.eINSTANCE
					.getSubmit_PerformerExpression() };
			MessageFormatParser parser = new MessageFormatParser(features);
			savePerformerExpression_5067Parser = parser;
		}
		return savePerformerExpression_5067Parser;
	}

	/**
	 * @generated
	 */
	private IParser saveValidatorExpression_5068Parser;

	/**
	 * @generated
	 */
	private IParser getSaveValidatorExpression_5068Parser() {
		if (saveValidatorExpression_5068Parser == null) {
			EAttribute[] features = new EAttribute[] { WebDSLPackage.eINSTANCE
					.getSubmit_ValidatorExpression() };
			MessageFormatParser parser = new MessageFormatParser(features);
			saveValidatorExpression_5068Parser = parser;
		}
		return saveValidatorExpression_5068Parser;
	}

	/**
	 * @generated
	 */
	private IParser resetValue_5072Parser;

	/**
	 * @generated
	 */
	private IParser getResetValue_5072Parser() {
		if (resetValue_5072Parser == null) {
			EAttribute[] features = new EAttribute[] { WebDSLPackage.eINSTANCE
					.getButton_Value() };
			MessageFormatParser parser = new MessageFormatParser(features);
			resetValue_5072Parser = parser;
		}
		return resetValue_5072Parser;
	}

	/**
	 * @generated
	 */
	private IParser resetPerformerExpression_5073Parser;

	/**
	 * @generated
	 */
	private IParser getResetPerformerExpression_5073Parser() {
		if (resetPerformerExpression_5073Parser == null) {
			EAttribute[] features = new EAttribute[] { WebDSLPackage.eINSTANCE
					.getSubmit_PerformerExpression() };
			MessageFormatParser parser = new MessageFormatParser(features);
			resetPerformerExpression_5073Parser = parser;
		}
		return resetPerformerExpression_5073Parser;
	}

	/**
	 * @generated
	 */
	private IParser resetValidatorExpression_5074Parser;

	/**
	 * @generated
	 */
	private IParser getResetValidatorExpression_5074Parser() {
		if (resetValidatorExpression_5074Parser == null) {
			EAttribute[] features = new EAttribute[] { WebDSLPackage.eINSTANCE
					.getSubmit_ValidatorExpression() };
			MessageFormatParser parser = new MessageFormatParser(features);
			resetValidatorExpression_5074Parser = parser;
		}
		return resetValidatorExpression_5074Parser;
	}

	/**
	 * @generated
	 */
	private IParser cancelValue_5078Parser;

	/**
	 * @generated
	 */
	private IParser getCancelValue_5078Parser() {
		if (cancelValue_5078Parser == null) {
			EAttribute[] features = new EAttribute[] { WebDSLPackage.eINSTANCE
					.getButton_Value() };
			MessageFormatParser parser = new MessageFormatParser(features);
			cancelValue_5078Parser = parser;
		}
		return cancelValue_5078Parser;
	}

	/**
	 * @generated
	 */
	private IParser cancelPerformerExpression_5079Parser;

	/**
	 * @generated
	 */
	private IParser getCancelPerformerExpression_5079Parser() {
		if (cancelPerformerExpression_5079Parser == null) {
			EAttribute[] features = new EAttribute[] { WebDSLPackage.eINSTANCE
					.getSubmit_PerformerExpression() };
			MessageFormatParser parser = new MessageFormatParser(features);
			cancelPerformerExpression_5079Parser = parser;
		}
		return cancelPerformerExpression_5079Parser;
	}

	/**
	 * @generated
	 */
	private IParser cancelValidatorExpression_5080Parser;

	/**
	 * @generated
	 */
	private IParser getCancelValidatorExpression_5080Parser() {
		if (cancelValidatorExpression_5080Parser == null) {
			EAttribute[] features = new EAttribute[] { WebDSLPackage.eINSTANCE
					.getSubmit_ValidatorExpression() };
			MessageFormatParser parser = new MessageFormatParser(features);
			cancelValidatorExpression_5080Parser = parser;
		}
		return cancelValidatorExpression_5080Parser;
	}

	/**
	 * @generated
	 */
	private IParser groupName_5025Parser;

	/**
	 * @generated
	 */
	private IParser getGroupName_5025Parser() {
		if (groupName_5025Parser == null) {
			EAttribute[] features = new EAttribute[] { WebDSLPackage.eINSTANCE
					.getPageElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			groupName_5025Parser = parser;
		}
		return groupName_5025Parser;
	}

	/**
	 * @generated
	 */
	private IParser formName_5047Parser;

	/**
	 * @generated
	 */
	private IParser getFormName_5047Parser() {
		if (formName_5047Parser == null) {
			EAttribute[] features = new EAttribute[] { WebDSLPackage.eINSTANCE
					.getPageElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			formName_5047Parser = parser;
		}
		return formName_5047Parser;
	}

	/**
	 * @generated
	 */
	private IParser internalLinkName_5027Parser;

	/**
	 * @generated
	 */
	private IParser getInternalLinkName_5027Parser() {
		if (internalLinkName_5027Parser == null) {
			EAttribute[] features = new EAttribute[] { WebDSLPackage.eINSTANCE
					.getPageElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			internalLinkName_5027Parser = parser;
		}
		return internalLinkName_5027Parser;
	}

	/**
	 * @generated
	 */
	private IParser externalLinkName_5028Parser;

	/**
	 * @generated
	 */
	private IParser getExternalLinkName_5028Parser() {
		if (externalLinkName_5028Parser == null) {
			EAttribute[] features = new EAttribute[] { WebDSLPackage.eINSTANCE
					.getPageElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			externalLinkName_5028Parser = parser;
		}
		return externalLinkName_5028Parser;
	}

	/**
	 * @generated
	 */
	private IParser externalLinkTargetExpression_5086Parser;

	/**
	 * @generated
	 */
	private IParser getExternalLinkTargetExpression_5086Parser() {
		if (externalLinkTargetExpression_5086Parser == null) {
			EAttribute[] features = new EAttribute[] { WebDSLPackage.eINSTANCE
					.getExternalLink_TargetExpression() };
			MessageFormatParser parser = new MessageFormatParser(features);
			externalLinkTargetExpression_5086Parser = parser;
		}
		return externalLinkTargetExpression_5086Parser;
	}

	/**
	 * @generated
	 */
	private IParser textInputLabelExpression_5050Parser;

	/**
	 * @generated
	 */
	private IParser getTextInputLabelExpression_5050Parser() {
		if (textInputLabelExpression_5050Parser == null) {
			EAttribute[] features = new EAttribute[] { WebDSLPackage.eINSTANCE
					.getInput_LabelExpression() };
			MessageFormatParser parser = new MessageFormatParser(features);
			textInputLabelExpression_5050Parser = parser;
		}
		return textInputLabelExpression_5050Parser;
	}

	/**
	 * @generated
	 */
	private IParser textInputValueExpression_5051Parser;

	/**
	 * @generated
	 */
	private IParser getTextInputValueExpression_5051Parser() {
		if (textInputValueExpression_5051Parser == null) {
			EAttribute[] features = new EAttribute[] { WebDSLPackage.eINSTANCE
					.getInput_ValueExpression() };
			MessageFormatParser parser = new MessageFormatParser(features);
			textInputValueExpression_5051Parser = parser;
		}
		return textInputValueExpression_5051Parser;
	}

	/**
	 * @generated
	 */
	private IParser selectionListLabelExpression_5055Parser;

	/**
	 * @generated
	 */
	private IParser getSelectionListLabelExpression_5055Parser() {
		if (selectionListLabelExpression_5055Parser == null) {
			EAttribute[] features = new EAttribute[] { WebDSLPackage.eINSTANCE
					.getInput_LabelExpression() };
			MessageFormatParser parser = new MessageFormatParser(features);
			selectionListLabelExpression_5055Parser = parser;
		}
		return selectionListLabelExpression_5055Parser;
	}

	/**
	 * @generated
	 */
	private IParser selectionListValueExpression_5056Parser;

	/**
	 * @generated
	 */
	private IParser getSelectionListValueExpression_5056Parser() {
		if (selectionListValueExpression_5056Parser == null) {
			EAttribute[] features = new EAttribute[] { WebDSLPackage.eINSTANCE
					.getInput_ValueExpression() };
			MessageFormatParser parser = new MessageFormatParser(features);
			selectionListValueExpression_5056Parser = parser;
		}
		return selectionListValueExpression_5056Parser;
	}

	/**
	 * @generated
	 */
	private IParser selectionListOptionsExpression_5057Parser;

	/**
	 * @generated
	 */
	private IParser getSelectionListOptionsExpression_5057Parser() {
		if (selectionListOptionsExpression_5057Parser == null) {
			EAttribute[] features = new EAttribute[] { WebDSLPackage.eINSTANCE
					.getSelectionList_OptionsExpression() };
			MessageFormatParser parser = new MessageFormatParser(features);
			selectionListOptionsExpression_5057Parser = parser;
		}
		return selectionListOptionsExpression_5057Parser;
	}

	/**
	 * @generated
	 */
	private IParser buttonValue_5059Parser;

	/**
	 * @generated
	 */
	private IParser getButtonValue_5059Parser() {
		if (buttonValue_5059Parser == null) {
			EAttribute[] features = new EAttribute[] { WebDSLPackage.eINSTANCE
					.getButton_Value() };
			MessageFormatParser parser = new MessageFormatParser(features);
			buttonValue_5059Parser = parser;
		}
		return buttonValue_5059Parser;
	}

	/**
	 * @generated
	 */
	private IParser customActionValue_5063Parser;

	/**
	 * @generated
	 */
	private IParser getCustomActionValue_5063Parser() {
		if (customActionValue_5063Parser == null) {
			EAttribute[] features = new EAttribute[] { WebDSLPackage.eINSTANCE
					.getButton_Value() };
			MessageFormatParser parser = new MessageFormatParser(features);
			customActionValue_5063Parser = parser;
		}
		return customActionValue_5063Parser;
	}

	/**
	 * @generated
	 */
	private IParser customActionPerformerExpression_5064Parser;

	/**
	 * @generated
	 */
	private IParser getCustomActionPerformerExpression_5064Parser() {
		if (customActionPerformerExpression_5064Parser == null) {
			EAttribute[] features = new EAttribute[] { WebDSLPackage.eINSTANCE
					.getSubmit_PerformerExpression() };
			MessageFormatParser parser = new MessageFormatParser(features);
			customActionPerformerExpression_5064Parser = parser;
		}
		return customActionPerformerExpression_5064Parser;
	}

	/**
	 * @generated
	 */
	private IParser customActionValidatorExpression_5065Parser;

	/**
	 * @generated
	 */
	private IParser getCustomActionValidatorExpression_5065Parser() {
		if (customActionValidatorExpression_5065Parser == null) {
			EAttribute[] features = new EAttribute[] { WebDSLPackage.eINSTANCE
					.getSubmit_ValidatorExpression() };
			MessageFormatParser parser = new MessageFormatParser(features);
			customActionValidatorExpression_5065Parser = parser;
		}
		return customActionValidatorExpression_5065Parser;
	}

	/**
	 * @generated
	 */
	private IParser saveValue_5069Parser;

	/**
	 * @generated
	 */
	private IParser getSaveValue_5069Parser() {
		if (saveValue_5069Parser == null) {
			EAttribute[] features = new EAttribute[] { WebDSLPackage.eINSTANCE
					.getButton_Value() };
			MessageFormatParser parser = new MessageFormatParser(features);
			saveValue_5069Parser = parser;
		}
		return saveValue_5069Parser;
	}

	/**
	 * @generated
	 */
	private IParser savePerformerExpression_5070Parser;

	/**
	 * @generated
	 */
	private IParser getSavePerformerExpression_5070Parser() {
		if (savePerformerExpression_5070Parser == null) {
			EAttribute[] features = new EAttribute[] { WebDSLPackage.eINSTANCE
					.getSubmit_PerformerExpression() };
			MessageFormatParser parser = new MessageFormatParser(features);
			savePerformerExpression_5070Parser = parser;
		}
		return savePerformerExpression_5070Parser;
	}

	/**
	 * @generated
	 */
	private IParser saveValidatorExpression_5071Parser;

	/**
	 * @generated
	 */
	private IParser getSaveValidatorExpression_5071Parser() {
		if (saveValidatorExpression_5071Parser == null) {
			EAttribute[] features = new EAttribute[] { WebDSLPackage.eINSTANCE
					.getSubmit_ValidatorExpression() };
			MessageFormatParser parser = new MessageFormatParser(features);
			saveValidatorExpression_5071Parser = parser;
		}
		return saveValidatorExpression_5071Parser;
	}

	/**
	 * @generated
	 */
	private IParser resetValue_5075Parser;

	/**
	 * @generated
	 */
	private IParser getResetValue_5075Parser() {
		if (resetValue_5075Parser == null) {
			EAttribute[] features = new EAttribute[] { WebDSLPackage.eINSTANCE
					.getButton_Value() };
			MessageFormatParser parser = new MessageFormatParser(features);
			resetValue_5075Parser = parser;
		}
		return resetValue_5075Parser;
	}

	/**
	 * @generated
	 */
	private IParser resetPerformerExpression_5076Parser;

	/**
	 * @generated
	 */
	private IParser getResetPerformerExpression_5076Parser() {
		if (resetPerformerExpression_5076Parser == null) {
			EAttribute[] features = new EAttribute[] { WebDSLPackage.eINSTANCE
					.getSubmit_PerformerExpression() };
			MessageFormatParser parser = new MessageFormatParser(features);
			resetPerformerExpression_5076Parser = parser;
		}
		return resetPerformerExpression_5076Parser;
	}

	/**
	 * @generated
	 */
	private IParser resetValidatorExpression_5077Parser;

	/**
	 * @generated
	 */
	private IParser getResetValidatorExpression_5077Parser() {
		if (resetValidatorExpression_5077Parser == null) {
			EAttribute[] features = new EAttribute[] { WebDSLPackage.eINSTANCE
					.getSubmit_ValidatorExpression() };
			MessageFormatParser parser = new MessageFormatParser(features);
			resetValidatorExpression_5077Parser = parser;
		}
		return resetValidatorExpression_5077Parser;
	}

	/**
	 * @generated
	 */
	private IParser cancelValue_5081Parser;

	/**
	 * @generated
	 */
	private IParser getCancelValue_5081Parser() {
		if (cancelValue_5081Parser == null) {
			EAttribute[] features = new EAttribute[] { WebDSLPackage.eINSTANCE
					.getButton_Value() };
			MessageFormatParser parser = new MessageFormatParser(features);
			cancelValue_5081Parser = parser;
		}
		return cancelValue_5081Parser;
	}

	/**
	 * @generated
	 */
	private IParser cancelPerformerExpression_5082Parser;

	/**
	 * @generated
	 */
	private IParser getCancelPerformerExpression_5082Parser() {
		if (cancelPerformerExpression_5082Parser == null) {
			EAttribute[] features = new EAttribute[] { WebDSLPackage.eINSTANCE
					.getSubmit_PerformerExpression() };
			MessageFormatParser parser = new MessageFormatParser(features);
			cancelPerformerExpression_5082Parser = parser;
		}
		return cancelPerformerExpression_5082Parser;
	}

	/**
	 * @generated
	 */
	private IParser cancelValidatorExpression_5083Parser;

	/**
	 * @generated
	 */
	private IParser getCancelValidatorExpression_5083Parser() {
		if (cancelValidatorExpression_5083Parser == null) {
			EAttribute[] features = new EAttribute[] { WebDSLPackage.eINSTANCE
					.getSubmit_ValidatorExpression() };
			MessageFormatParser parser = new MessageFormatParser(features);
			cancelValidatorExpression_5083Parser = parser;
		}
		return cancelValidatorExpression_5083Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case PageNameEditPart.VISUAL_ID:
			return getPageName_5001Parser();
		case ParameterDeclarationEditPart.VISUAL_ID:
			return getParameterDeclaration_5002Parser();
		case VariableInitializationDeclarationEditPart.VISUAL_ID:
			return getVariableInitializationDeclaration_5003Parser();
		case TextExpressionEditPart.VISUAL_ID:
			return getTextExpression_5004Parser();
		case ImageExpressionEditPart.VISUAL_ID:
			return getImageExpression_5023Parser();
		case ListExpressionEditPart.VISUAL_ID:
			return getListVariable_5024Parser();
		case ListExpression2EditPart.VISUAL_ID:
			return getListExpression_5030Parser();
		case TextExpression2EditPart.VISUAL_ID:
			return getTextExpression_5029Parser();
		case ImageExpression2EditPart.VISUAL_ID:
			return getImageExpression_5031Parser();
		case ListVariableEditPart.VISUAL_ID:
			return getListVariable_5035Parser();
		case ListExpression3EditPart.VISUAL_ID:
			return getListExpression_5036Parser();
		case GroupName2EditPart.VISUAL_ID:
			return getGroupName_5032Parser();
		case TextExpression3EditPart.VISUAL_ID:
			return getTextExpression_5037Parser();
		case ImageExpression3EditPart.VISUAL_ID:
			return getImageExpression_5038Parser();
		case ListVariable2EditPart.VISUAL_ID:
			return getListVariable_5039Parser();
		case ListExpression4EditPart.VISUAL_ID:
			return getListExpression_5040Parser();
		case InternalLinkName2EditPart.VISUAL_ID:
			return getInternalLinkName_5033Parser();
		case ActualParameterIdentifierEditPart.VISUAL_ID:
			return getActualParameterIdentifier_5026Parser();
		case TextExpression4EditPart.VISUAL_ID:
			return getTextExpression_5044Parser();
		case ImageExpression4EditPart.VISUAL_ID:
			return getImageExpression_5045Parser();
		case ExternalLinkName2EditPart.VISUAL_ID:
			return getExternalLinkName_5034Parser();
		case ExternalLinkTargetExpressionEditPart.VISUAL_ID:
			return getExternalLinkTargetExpression_5084Parser();
		case GroupName3EditPart.VISUAL_ID:
			return getGroupName_5043Parser();
		case FormNameEditPart.VISUAL_ID:
			return getFormName_5046Parser();
		case InternalLinkName3EditPart.VISUAL_ID:
			return getInternalLinkName_5041Parser();
		case ExternalLinkName3EditPart.VISUAL_ID:
			return getExternalLinkName_5042Parser();
		case ExternalLinkTargetExpression2EditPart.VISUAL_ID:
			return getExternalLinkTargetExpression_5085Parser();
		case TextInputLabelExpressionEditPart.VISUAL_ID:
			return getTextInputLabelExpression_5048Parser();
		case TextInputValueExpressionEditPart.VISUAL_ID:
			return getTextInputValueExpression_5049Parser();
		case SelectionListLabelExpressionEditPart.VISUAL_ID:
			return getSelectionListLabelExpression_5052Parser();
		case SelectionListValueExpressionEditPart.VISUAL_ID:
			return getSelectionListValueExpression_5053Parser();
		case SelectionListOptionsExpressionEditPart.VISUAL_ID:
			return getSelectionListOptionsExpression_5054Parser();
		case ButtonValueEditPart.VISUAL_ID:
			return getButtonValue_5058Parser();
		case CustomActionValueEditPart.VISUAL_ID:
			return getCustomActionValue_5060Parser();
		case CustomActionPerformerExpressionEditPart.VISUAL_ID:
			return getCustomActionPerformerExpression_5061Parser();
		case CustomActionValidatorExpressionEditPart.VISUAL_ID:
			return getCustomActionValidatorExpression_5062Parser();
		case SaveValueEditPart.VISUAL_ID:
			return getSaveValue_5066Parser();
		case SavePerformerExpressionEditPart.VISUAL_ID:
			return getSavePerformerExpression_5067Parser();
		case SaveValidatorExpressionEditPart.VISUAL_ID:
			return getSaveValidatorExpression_5068Parser();
		case ResetValueEditPart.VISUAL_ID:
			return getResetValue_5072Parser();
		case ResetPerformerExpressionEditPart.VISUAL_ID:
			return getResetPerformerExpression_5073Parser();
		case ResetValidatorExpressionEditPart.VISUAL_ID:
			return getResetValidatorExpression_5074Parser();
		case CancelValueEditPart.VISUAL_ID:
			return getCancelValue_5078Parser();
		case CancelPerformerExpressionEditPart.VISUAL_ID:
			return getCancelPerformerExpression_5079Parser();
		case CancelValidatorExpressionEditPart.VISUAL_ID:
			return getCancelValidatorExpression_5080Parser();
		case GroupNameEditPart.VISUAL_ID:
			return getGroupName_5025Parser();
		case FormName2EditPart.VISUAL_ID:
			return getFormName_5047Parser();
		case InternalLinkNameEditPart.VISUAL_ID:
			return getInternalLinkName_5027Parser();
		case ExternalLinkNameEditPart.VISUAL_ID:
			return getExternalLinkName_5028Parser();
		case ExternalLinkTargetExpression3EditPart.VISUAL_ID:
			return getExternalLinkTargetExpression_5086Parser();
		case TextInputLabelExpression2EditPart.VISUAL_ID:
			return getTextInputLabelExpression_5050Parser();
		case TextInputValueExpression2EditPart.VISUAL_ID:
			return getTextInputValueExpression_5051Parser();
		case SelectionListLabelExpression2EditPart.VISUAL_ID:
			return getSelectionListLabelExpression_5055Parser();
		case SelectionListValueExpression2EditPart.VISUAL_ID:
			return getSelectionListValueExpression_5056Parser();
		case SelectionListOptionsExpression2EditPart.VISUAL_ID:
			return getSelectionListOptionsExpression_5057Parser();
		case ButtonValue2EditPart.VISUAL_ID:
			return getButtonValue_5059Parser();
		case CustomActionValue2EditPart.VISUAL_ID:
			return getCustomActionValue_5063Parser();
		case CustomActionPerformerExpression2EditPart.VISUAL_ID:
			return getCustomActionPerformerExpression_5064Parser();
		case CustomActionValidatorExpression2EditPart.VISUAL_ID:
			return getCustomActionValidatorExpression_5065Parser();
		case SaveValue2EditPart.VISUAL_ID:
			return getSaveValue_5069Parser();
		case SavePerformerExpression2EditPart.VISUAL_ID:
			return getSavePerformerExpression_5070Parser();
		case SaveValidatorExpression2EditPart.VISUAL_ID:
			return getSaveValidatorExpression_5071Parser();
		case ResetValue2EditPart.VISUAL_ID:
			return getResetValue_5075Parser();
		case ResetPerformerExpression2EditPart.VISUAL_ID:
			return getResetPerformerExpression_5076Parser();
		case ResetValidatorExpression2EditPart.VISUAL_ID:
			return getResetValidatorExpression_5077Parser();
		case CancelValue2EditPart.VISUAL_ID:
			return getCancelValue_5081Parser();
		case CancelPerformerExpression2EditPart.VISUAL_ID:
			return getCancelPerformerExpression_5082Parser();
		case CancelValidatorExpression2EditPart.VISUAL_ID:
			return getCancelValidatorExpression_5083Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(WebdslVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(WebdslVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (WebdslElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
