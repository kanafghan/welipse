/**
 */
package com.github.kanafghan.welipse.joomlagen;

import org.eclipse.emf.ecore.EDataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.GenDataType#getEcoreDataType <em>Ecore Data Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenPackage#getGenDataType()
 * @model
 * @generated
 */
public interface GenDataType extends GenClassifier {
	/**
	 * Returns the value of the '<em><b>Ecore Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ecore Data Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ecore Data Type</em>' reference.
	 * @see #setEcoreDataType(EDataType)
	 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenPackage#getGenDataType_EcoreDataType()
	 * @model required="true"
	 * @generated
	 */
	EDataType getEcoreDataType();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.joomlagen.GenDataType#getEcoreDataType <em>Ecore Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ecore Data Type</em>' reference.
	 * @see #getEcoreDataType()
	 * @generated
	 */
	void setEcoreDataType(EDataType value);
	
	boolean reconcile();
	
	boolean reconcile(GenDataType oldGenDataTypeVersion);

} // GenDataType
