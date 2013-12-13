/**
 */
package com.github.kanafghan.welipse.joomlagen;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EOperation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.GenOperation#getGenParameters <em>Gen Parameters</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.GenOperation#getGenClass <em>Gen Class</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.GenOperation#getEcoreOperation <em>Ecore Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenPackage#getGenOperation()
 * @model
 * @generated
 */
public interface GenOperation extends GenTypedElement {
	/**
	 * Returns the value of the '<em><b>Gen Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link com.github.kanafghan.welipse.joomlagen.GenParameter}.
	 * It is bidirectional and its opposite is '{@link com.github.kanafghan.welipse.joomlagen.GenParameter#getGenOperation <em>Gen Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Parameters</em>' containment reference list.
	 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenPackage#getGenOperation_GenParameters()
	 * @see com.github.kanafghan.welipse.joomlagen.GenParameter#getGenOperation
	 * @model opposite="genOperation" containment="true"
	 * @generated
	 */
	EList<GenParameter> getGenParameters();

	/**
	 * Returns the value of the '<em><b>Gen Class</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.github.kanafghan.welipse.joomlagen.GenClass#getGenOperations <em>Gen Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Class</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Class</em>' container reference.
	 * @see #setGenClass(GenClass)
	 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenPackage#getGenOperation_GenClass()
	 * @see com.github.kanafghan.welipse.joomlagen.GenClass#getGenOperations
	 * @model opposite="genOperations" required="true" transient="false"
	 * @generated
	 */
	GenClass getGenClass();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.joomlagen.GenOperation#getGenClass <em>Gen Class</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Class</em>' container reference.
	 * @see #getGenClass()
	 * @generated
	 */
	void setGenClass(GenClass value);

	/**
	 * Returns the value of the '<em><b>Ecore Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ecore Operation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ecore Operation</em>' reference.
	 * @see #setEcoreOperation(EOperation)
	 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenPackage#getGenOperation_EcoreOperation()
	 * @model required="true"
	 * @generated
	 */
	EOperation getEcoreOperation();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.joomlagen.GenOperation#getEcoreOperation <em>Ecore Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ecore Operation</em>' reference.
	 * @see #getEcoreOperation()
	 * @generated
	 */
	void setEcoreOperation(EOperation value);
	
	void initialize(EOperation eOperation);
	
	boolean reconcile();
	
	boolean reconcile(GenOperation oldGenOperationVersion);

} // GenOperation
