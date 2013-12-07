/**
 */
package com.github.kanafghan.welipse.webdsl.util;

import com.github.kanafghan.welipse.webdsl.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.github.kanafghan.welipse.webdsl.WebDSLPackage
 * @generated
 */
public class WebDSLSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WebDSLPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebDSLSwitch() {
		if (modelPackage == null) {
			modelPackage = WebDSLPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case WebDSLPackage.WEBSITE: {
				Website website = (Website)theEObject;
				T result = caseWebsite(website);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebDSLPackage.PAGE: {
				Page page = (Page)theEObject;
				T result = casePage(page);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebDSLPackage.PAGE_ELEMENT: {
				PageElement pageElement = (PageElement)theEObject;
				T result = casePageElement(pageElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebDSLPackage.PRESENTATION_ELEMENT: {
				PresentationElement presentationElement = (PresentationElement)theEObject;
				T result = casePresentationElement(presentationElement);
				if (result == null) result = casePageElement(presentationElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebDSLPackage.NAVIGATION_ELEMENT: {
				NavigationElement navigationElement = (NavigationElement)theEObject;
				T result = caseNavigationElement(navigationElement);
				if (result == null) result = casePageElement(navigationElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebDSLPackage.LIST: {
				List list = (List)theEObject;
				T result = caseList(list);
				if (result == null) result = casePresentationElement(list);
				if (result == null) result = casePageElement(list);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebDSLPackage.TEXT: {
				Text text = (Text)theEObject;
				T result = caseText(text);
				if (result == null) result = casePresentationElement(text);
				if (result == null) result = casePageElement(text);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebDSLPackage.IMAGE: {
				Image image = (Image)theEObject;
				T result = caseImage(image);
				if (result == null) result = casePresentationElement(image);
				if (result == null) result = casePageElement(image);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebDSLPackage.LINK: {
				Link link = (Link)theEObject;
				T result = caseLink(link);
				if (result == null) result = caseNavigationElement(link);
				if (result == null) result = casePageElement(link);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebDSLPackage.INTERNAL_LINK: {
				InternalLink internalLink = (InternalLink)theEObject;
				T result = caseInternalLink(internalLink);
				if (result == null) result = caseLink(internalLink);
				if (result == null) result = caseNavigationElement(internalLink);
				if (result == null) result = casePageElement(internalLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebDSLPackage.EXTERNAL_LINK: {
				ExternalLink externalLink = (ExternalLink)theEObject;
				T result = caseExternalLink(externalLink);
				if (result == null) result = caseLink(externalLink);
				if (result == null) result = caseNavigationElement(externalLink);
				if (result == null) result = casePageElement(externalLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebDSLPackage.EXPRESSION: {
				Expression expression = (Expression)theEObject;
				T result = caseExpression(expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebDSLPackage.VARIABLE_EXP: {
				VariableExp variableExp = (VariableExp)theEObject;
				T result = caseVariableExp(variableExp);
				if (result == null) result = caseExpression(variableExp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebDSLPackage.OPERATION_EXP: {
				OperationExp operationExp = (OperationExp)theEObject;
				T result = caseOperationExp(operationExp);
				if (result == null) result = caseExpression(operationExp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebDSLPackage.VARIABLE_DECLARATION: {
				VariableDeclaration variableDeclaration = (VariableDeclaration)theEObject;
				T result = caseVariableDeclaration(variableDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebDSLPackage.VARIABLE_INITIALIZATION: {
				VariableInitialization variableInitialization = (VariableInitialization)theEObject;
				T result = caseVariableInitialization(variableInitialization);
				if (result == null) result = caseVariableDeclaration(variableInitialization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebDSLPackage.PROPERTY_OPERATION: {
				PropertyOperation propertyOperation = (PropertyOperation)theEObject;
				T result = casePropertyOperation(propertyOperation);
				if (result == null) result = caseOperationExp(propertyOperation);
				if (result == null) result = caseExpression(propertyOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebDSLPackage.CONSTANT_EXP: {
				ConstantExp constantExp = (ConstantExp)theEObject;
				T result = caseConstantExp(constantExp);
				if (result == null) result = caseExpression(constantExp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebDSLPackage.BASIC_OPERATION: {
				BasicOperation basicOperation = (BasicOperation)theEObject;
				T result = caseBasicOperation(basicOperation);
				if (result == null) result = caseOperationExp(basicOperation);
				if (result == null) result = caseExpression(basicOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebDSLPackage.ARITHMETIC_OPERATION: {
				ArithmeticOperation arithmeticOperation = (ArithmeticOperation)theEObject;
				T result = caseArithmeticOperation(arithmeticOperation);
				if (result == null) result = caseBasicOperation(arithmeticOperation);
				if (result == null) result = caseOperationExp(arithmeticOperation);
				if (result == null) result = caseExpression(arithmeticOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebDSLPackage.STRUCTURAL_EXP: {
				StructuralExp structuralExp = (StructuralExp)theEObject;
				T result = caseStructuralExp(structuralExp);
				if (result == null) result = casePropertyOperation(structuralExp);
				if (result == null) result = caseOperationExp(structuralExp);
				if (result == null) result = caseExpression(structuralExp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebDSLPackage.CLASSIFIER_OPERATION: {
				ClassifierOperation classifierOperation = (ClassifierOperation)theEObject;
				T result = caseClassifierOperation(classifierOperation);
				if (result == null) result = casePropertyOperation(classifierOperation);
				if (result == null) result = caseOperationExp(classifierOperation);
				if (result == null) result = caseExpression(classifierOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebDSLPackage.INTEGER_CONSTANT: {
				IntegerConstant integerConstant = (IntegerConstant)theEObject;
				T result = caseIntegerConstant(integerConstant);
				if (result == null) result = caseConstantExp(integerConstant);
				if (result == null) result = caseExpression(integerConstant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebDSLPackage.STRING_CONSTANT: {
				StringConstant stringConstant = (StringConstant)theEObject;
				T result = caseStringConstant(stringConstant);
				if (result == null) result = caseConstantExp(stringConstant);
				if (result == null) result = caseExpression(stringConstant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebDSLPackage.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				T result = caseParameter(parameter);
				if (result == null) result = caseVariableDeclaration(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebDSLPackage.STRING_OPERATION: {
				StringOperation stringOperation = (StringOperation)theEObject;
				T result = caseStringOperation(stringOperation);
				if (result == null) result = caseBasicOperation(stringOperation);
				if (result == null) result = caseOperationExp(stringOperation);
				if (result == null) result = caseExpression(stringOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebDSLPackage.BOOLEAN_CONSTANT: {
				BooleanConstant booleanConstant = (BooleanConstant)theEObject;
				T result = caseBooleanConstant(booleanConstant);
				if (result == null) result = caseConstantExp(booleanConstant);
				if (result == null) result = caseExpression(booleanConstant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebDSLPackage.BOOLEAN_OPERATION: {
				BooleanOperation booleanOperation = (BooleanOperation)theEObject;
				T result = caseBooleanOperation(booleanOperation);
				if (result == null) result = caseBasicOperation(booleanOperation);
				if (result == null) result = caseOperationExp(booleanOperation);
				if (result == null) result = caseExpression(booleanOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebDSLPackage.COMPARISON_OPERATION: {
				ComparisonOperation comparisonOperation = (ComparisonOperation)theEObject;
				T result = caseComparisonOperation(comparisonOperation);
				if (result == null) result = caseBasicOperation(comparisonOperation);
				if (result == null) result = caseOperationExp(comparisonOperation);
				if (result == null) result = caseExpression(comparisonOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebDSLPackage.REAL_CONSTANT: {
				RealConstant realConstant = (RealConstant)theEObject;
				T result = caseRealConstant(realConstant);
				if (result == null) result = caseConstantExp(realConstant);
				if (result == null) result = caseExpression(realConstant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebDSLPackage.ACTUAL_PARAMETER: {
				ActualParameter actualParameter = (ActualParameter)theEObject;
				T result = caseActualParameter(actualParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Website</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Website</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWebsite(Website object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Page</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePage(Page object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Page Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Page Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePageElement(PageElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Presentation Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Presentation Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePresentationElement(PresentationElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Navigation Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Navigation Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNavigationElement(NavigationElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseList(List object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseText(Text object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImage(Image object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLink(Link object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Internal Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Internal Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalLink(InternalLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalLink(ExternalLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableExp(VariableExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationExp(OperationExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableDeclaration(VariableDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Initialization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Initialization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableInitialization(VariableInitialization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyOperation(PropertyOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constant Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constant Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstantExp(ConstantExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasicOperation(BasicOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arithmetic Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arithmetic Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArithmeticOperation(ArithmeticOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structural Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structural Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuralExp(StructuralExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classifier Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classifier Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassifierOperation(ClassifierOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerConstant(IntegerConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringConstant(StringConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringOperation(StringOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanConstant(BooleanConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanOperation(BooleanOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comparison Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comparison Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComparisonOperation(ComparisonOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Real Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Real Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRealConstant(RealConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actual Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actual Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActualParameter(ActualParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //WebDSLSwitch
