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
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ExternalLinkName2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ExternalLinkName3EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ExternalLinkNameEditPart;
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
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.TextExpression2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.TextExpression3EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.TextExpression4EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.TextExpressionEditPart;
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
		case GroupName3EditPart.VISUAL_ID:
			return getGroupName_5043Parser();
		case InternalLinkName3EditPart.VISUAL_ID:
			return getInternalLinkName_5041Parser();
		case ExternalLinkName3EditPart.VISUAL_ID:
			return getExternalLinkName_5042Parser();
		case GroupNameEditPart.VISUAL_ID:
			return getGroupName_5025Parser();
		case InternalLinkNameEditPart.VISUAL_ID:
			return getInternalLinkName_5027Parser();
		case ExternalLinkNameEditPart.VISUAL_ID:
			return getExternalLinkName_5028Parser();
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
