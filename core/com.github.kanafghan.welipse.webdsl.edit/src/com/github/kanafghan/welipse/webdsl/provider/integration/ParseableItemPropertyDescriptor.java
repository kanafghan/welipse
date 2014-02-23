package com.github.kanafghan.welipse.webdsl.provider.integration;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;

import com.github.kanafghan.welipse.webdsl.Image;
import com.github.kanafghan.welipse.webdsl.Input;
import com.github.kanafghan.welipse.webdsl.List;
import com.github.kanafghan.welipse.webdsl.Page;
import com.github.kanafghan.welipse.webdsl.Parameter;
import com.github.kanafghan.welipse.webdsl.Submit;
import com.github.kanafghan.welipse.webdsl.Text;
import com.github.kanafghan.welipse.webdsl.VariableInitialization;
import com.github.kanafghan.welipse.webdsl.WebDSLPackage;
import com.github.kanafghan.welipse.webdsl.expressions.ExpressionVariableKind;
import com.github.kanafghan.welipse.webdsl.expressions.ExpressionsAndVariablesAnalyzer;

public class ParseableItemPropertyDescriptor extends
		ItemPropertyDescriptor {

	public ParseableItemPropertyDescriptor(
			AdapterFactory adapterFactory,
			ResourceLocator resourceLocator, 
			String displayName,
			String description, 
			EStructuralFeature feature, 
			boolean isSettable,
			boolean multiLine, 
			boolean sortChoices, 
			Object staticImage,
			String category, 
			String[] filterFlags) {
		super(adapterFactory, 
			resourceLocator, 
			displayName, 
			description, 
			feature,
			isSettable, 
			multiLine, 
			sortChoices, 
			staticImage, 
			category, 
			filterFlags);
	}

	@Override
	public void setPropertyValue(Object object, Object value) {
		super.setPropertyValue(object, value);
		
		if (value instanceof String) {
			String text = (String) value;		
			if (!text.isEmpty()) {
				EObject element = (EObject) object;
				EditingDomain editingDomain = getEditingDomain(element);
				
				if (feature.equals(WebDSLPackage.Literals.PRESENTATION_ELEMENT__EXPRESSION)) {
					if (object instanceof Text) {
						ExpressionsAndVariablesAnalyzer analyzer = new ExpressionsAndVariablesAnalyzer(
								editingDomain, element, text, ExpressionVariableKind.TEXT_CONTENT);
						analyzer.analyze();
					} else if (object instanceof Image) {
						ExpressionsAndVariablesAnalyzer analyzer = new ExpressionsAndVariablesAnalyzer(
								editingDomain, element, text, ExpressionVariableKind.IMAGE_SOURCE);
						analyzer.analyze();
					} else if (object instanceof List) {
						ExpressionsAndVariablesAnalyzer analyzer = new ExpressionsAndVariablesAnalyzer(
								editingDomain, element, text, ExpressionVariableKind.LIST_COLLECTION);
						analyzer.analyze();
					}
				} else if (feature.equals(WebDSLPackage.Literals.LIST__VARIABLE)) {
					ExpressionsAndVariablesAnalyzer analyzer = new ExpressionsAndVariablesAnalyzer(
							editingDomain, element, text, ExpressionVariableKind.LIST_ITERATOR_VARIABLE);
					analyzer.analyze();
				} else if (object instanceof Input) {
					if (feature.equals(WebDSLPackage.Literals.INPUT__LABEL_EXPRESSION)) {
						ExpressionsAndVariablesAnalyzer analyzer = new ExpressionsAndVariablesAnalyzer(
								editingDomain, element, text, ExpressionVariableKind.INPUT_LABEL);
						analyzer.analyze();						
					} else if (feature.equals(WebDSLPackage.Literals.INPUT__VALUE_EXPRESSION)) {
						ExpressionsAndVariablesAnalyzer analyzer = new ExpressionsAndVariablesAnalyzer(
								editingDomain, element, text, ExpressionVariableKind.INPUT_VALUE);
						analyzer.analyze();	
					} else if (feature.equals(WebDSLPackage.Literals.SELECTION_LIST__OPTIONS_EXPRESSION)) {
						ExpressionsAndVariablesAnalyzer analyzer = new ExpressionsAndVariablesAnalyzer(
								editingDomain, element, text, ExpressionVariableKind.SELECTION_LIST_OPTIONS);
						analyzer.analyze();
					}
				} else if (object instanceof Submit) {
					if (feature.equals(WebDSLPackage.Literals.SUBMIT__PERFORMER_EXPRESSION)) {
						ExpressionsAndVariablesAnalyzer analyzer = new ExpressionsAndVariablesAnalyzer(
								editingDomain, element, text, ExpressionVariableKind.SUBMIT_PERFORMER);
						analyzer.analyze();	
					} else if (feature.equals(WebDSLPackage.Literals.SUBMIT__VALIDATOR_EXPRESSION)) {
						ExpressionsAndVariablesAnalyzer analyzer = new ExpressionsAndVariablesAnalyzer(
								editingDomain, element, text, ExpressionVariableKind.SUBMIT_VALIDATOR);
						analyzer.analyze();
					}
				} else if (feature.equals(WebDSLPackage.Literals.ACTUAL_PARAMETER__IDENTIFIER)) {
					ExpressionsAndVariablesAnalyzer analyzer = new ExpressionsAndVariablesAnalyzer(
							editingDomain, element, text, ExpressionVariableKind.ACTUAL_PARAMETER_VALUE);
					analyzer.analyze();
				} else if (feature.equals(WebDSLPackage.Literals.EXTERNAL_LINK__TARGET_EXPRESSION)) {
					ExpressionsAndVariablesAnalyzer analyzer = new ExpressionsAndVariablesAnalyzer(
							editingDomain, element, text, ExpressionVariableKind.EXTERNAL_LINK_TARGET);
					analyzer.analyze();
				} else if (object instanceof Page) {
					String[] texts = text.split(";");
					for (String s : texts) {
						if (!s.trim().isEmpty()) {
							if (feature.equals(WebDSLPackage.Literals.PAGE__PARAMETER)) {								
								ExpressionsAndVariablesAnalyzer analyzer = new ExpressionsAndVariablesAnalyzer(
										editingDomain, element, s.trim(), ExpressionVariableKind.PAGE_PARAMETER);
								analyzer.analyze();
							} else {
								ExpressionsAndVariablesAnalyzer analyzer = new ExpressionsAndVariablesAnalyzer(
										editingDomain, element, s.trim(), ExpressionVariableKind.PAGE_VARIABLE);
								analyzer.analyze();			
							}
						}
					}
				} else if (object instanceof Parameter) {
					ExpressionsAndVariablesAnalyzer analyzer = new ExpressionsAndVariablesAnalyzer(
							editingDomain, element, text, ExpressionVariableKind.PARAMETER);
					analyzer.analyze();
				} else if (object instanceof VariableInitialization) {
					ExpressionsAndVariablesAnalyzer analyzer = new ExpressionsAndVariablesAnalyzer(
							editingDomain, element, text, ExpressionVariableKind.VARIABLE);
					analyzer.analyze();
				}
			}
		}
	}
}