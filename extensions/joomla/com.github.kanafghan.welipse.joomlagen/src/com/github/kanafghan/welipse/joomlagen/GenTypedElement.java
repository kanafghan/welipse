/**
 */
package com.github.kanafghan.welipse.joomlagen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Typed Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.GenTypedElement#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenPackage#getGenTypedElement()
 * @model abstract="true"
 * @generated
 */
public interface GenTypedElement extends GenBase {

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(GenClassifier)
	 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenPackage#getGenTypedElement_Type()
	 * @model
	 * @generated
	 */
	GenClassifier getType();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.joomlagen.GenTypedElement#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(GenClassifier value);
	
	boolean isListType();
	
	boolean isMapType();
	
} // GenTypedElement
