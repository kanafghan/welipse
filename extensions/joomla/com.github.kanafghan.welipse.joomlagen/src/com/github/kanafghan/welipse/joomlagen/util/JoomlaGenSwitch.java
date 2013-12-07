/**
 */
package com.github.kanafghan.welipse.joomlagen.util;

import com.github.kanafghan.welipse.joomlagen.*;

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
 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenPackage
 * @generated
 */
public class JoomlaGenSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JoomlaGenPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoomlaGenSwitch() {
		if (modelPackage == null) {
			modelPackage = JoomlaGenPackage.eINSTANCE;
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
			case JoomlaGenPackage.JOOMLA_GEN_MODEL: {
				JoomlaGenModel joomlaGenModel = (JoomlaGenModel)theEObject;
				T result = caseJoomlaGenModel(joomlaGenModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JoomlaGenPackage.GEN_PACKAGE: {
				GenPackage genPackage = (GenPackage)theEObject;
				T result = caseGenPackage(genPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JoomlaGenPackage.GEN_CLASSIFIER: {
				GenClassifier genClassifier = (GenClassifier)theEObject;
				T result = caseGenClassifier(genClassifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JoomlaGenPackage.GEN_CLASS: {
				GenClass genClass = (GenClass)theEObject;
				T result = caseGenClass(genClass);
				if (result == null) result = caseGenClassifier(genClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JoomlaGenPackage.GEN_TYPED_ELEMENT: {
				GenTypedElement genTypedElement = (GenTypedElement)theEObject;
				T result = caseGenTypedElement(genTypedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JoomlaGenPackage.GEN_FEATURE: {
				GenFeature genFeature = (GenFeature)theEObject;
				T result = caseGenFeature(genFeature);
				if (result == null) result = caseGenTypedElement(genFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JoomlaGenPackage.GEN_ATTRIBUTE: {
				GenAttribute genAttribute = (GenAttribute)theEObject;
				T result = caseGenAttribute(genAttribute);
				if (result == null) result = caseGenFeature(genAttribute);
				if (result == null) result = caseGenTypedElement(genAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JoomlaGenPackage.GEN_REFERENCE: {
				GenReference genReference = (GenReference)theEObject;
				T result = caseGenReference(genReference);
				if (result == null) result = caseGenFeature(genReference);
				if (result == null) result = caseGenTypedElement(genReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JoomlaGenPackage.DATABASE_TABLE: {
				DatabaseTable databaseTable = (DatabaseTable)theEObject;
				T result = caseDatabaseTable(databaseTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JoomlaGenPackage.GEN_OPERATION: {
				GenOperation genOperation = (GenOperation)theEObject;
				T result = caseGenOperation(genOperation);
				if (result == null) result = caseGenTypedElement(genOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JoomlaGenPackage.GEN_PARAMETER: {
				GenParameter genParameter = (GenParameter)theEObject;
				T result = caseGenParameter(genParameter);
				if (result == null) result = caseGenTypedElement(genParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JoomlaGenPackage.GEN_DATA_TYPE: {
				GenDataType genDataType = (GenDataType)theEObject;
				T result = caseGenDataType(genDataType);
				if (result == null) result = caseGenClassifier(genDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJoomlaGenModel(JoomlaGenModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenPackage(GenPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenClassifier(GenClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenClass(GenClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Typed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Typed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenTypedElement(GenTypedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenFeature(GenFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenAttribute(GenAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenReference(GenReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Database Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Database Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatabaseTable(DatabaseTable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenOperation(GenOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenParameter(GenParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenDataType(GenDataType object) {
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

} //JoomlaGenSwitch
