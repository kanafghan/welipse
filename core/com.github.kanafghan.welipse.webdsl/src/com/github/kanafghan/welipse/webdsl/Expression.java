/**
 */
package com.github.kanafghan.welipse.webdsl;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see com.github.kanafghan.welipse.webdsl.WebDSLPackage#getExpression()
 * @model abstract="true"
 * @generated
 */
public interface Expression extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc --> 
	 * @model
	 * @generated
	 */
	EClassifier type();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void initialize(Page page);

} // Expression
