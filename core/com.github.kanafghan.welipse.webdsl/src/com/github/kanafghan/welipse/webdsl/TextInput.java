/**
 */
package com.github.kanafghan.welipse.webdsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.kanafghan.welipse.webdsl.TextInput#isIsPassword <em>Is Password</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.webdsl.TextInput#isIsTextArea <em>Is Text Area</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.kanafghan.welipse.webdsl.WebDSLPackage#getTextInput()
 * @model
 * @generated
 */
public interface TextInput extends Input {
	/**
	 * Returns the value of the '<em><b>Is Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Password</em>' attribute.
	 * @see #setIsPassword(boolean)
	 * @see com.github.kanafghan.welipse.webdsl.WebDSLPackage#getTextInput_IsPassword()
	 * @model
	 * @generated
	 */
	boolean isIsPassword();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.webdsl.TextInput#isIsPassword <em>Is Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Password</em>' attribute.
	 * @see #isIsPassword()
	 * @generated
	 */
	void setIsPassword(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Text Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Text Area</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Text Area</em>' attribute.
	 * @see #setIsTextArea(boolean)
	 * @see com.github.kanafghan.welipse.webdsl.WebDSLPackage#getTextInput_IsTextArea()
	 * @model
	 * @generated
	 */
	boolean isIsTextArea();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.webdsl.TextInput#isIsTextArea <em>Is Text Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Text Area</em>' attribute.
	 * @see #isIsTextArea()
	 * @generated
	 */
	void setIsTextArea(boolean value);

} // TextInput
