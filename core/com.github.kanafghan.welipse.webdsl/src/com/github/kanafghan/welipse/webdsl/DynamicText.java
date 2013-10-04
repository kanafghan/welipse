/**
 */
package com.github.kanafghan.welipse.webdsl;

import org.eclipse.emf.ecore.ETypedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dynamic Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.kanafghan.welipse.webdsl.DynamicText#getContent <em>Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.kanafghan.welipse.webdsl.WebDSLPackage#getDynamicText()
 * @model
 * @generated
 */
public interface DynamicText extends Text {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' reference.
	 * @see #setContent(ETypedElement)
	 * @see com.github.kanafghan.welipse.webdsl.WebDSLPackage#getDynamicText_Content()
	 * @model required="true"
	 * @generated
	 */
	ETypedElement getContent();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.webdsl.DynamicText#getContent <em>Content</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(ETypedElement value);

} // DynamicText
