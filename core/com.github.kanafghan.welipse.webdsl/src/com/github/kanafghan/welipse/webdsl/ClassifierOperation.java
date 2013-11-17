/**
 */
package com.github.kanafghan.welipse.webdsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EOperation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classifier Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.kanafghan.welipse.webdsl.ClassifierOperation#getOperation <em>Operation</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.webdsl.ClassifierOperation#getArguments <em>Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.kanafghan.welipse.webdsl.WebDSLPackage#getClassifierOperation()
 * @model
 * @generated
 */
public interface ClassifierOperation extends PropertyOperation {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' reference.
	 * @see #setOperation(EOperation)
	 * @see com.github.kanafghan.welipse.webdsl.WebDSLPackage#getClassifierOperation_Operation()
	 * @model
	 * @generated
	 */
	EOperation getOperation();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.webdsl.ClassifierOperation#getOperation <em>Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(EOperation value);

	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link com.github.kanafghan.welipse.webdsl.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arguments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see com.github.kanafghan.welipse.webdsl.WebDSLPackage#getClassifierOperation_Arguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getArguments();

} // ClassifierOperation
