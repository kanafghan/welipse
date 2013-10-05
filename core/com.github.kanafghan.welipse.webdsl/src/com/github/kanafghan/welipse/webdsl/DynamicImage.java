/**
 */
package com.github.kanafghan.welipse.webdsl;

import org.eclipse.emf.ecore.ETypedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dynamic Image</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.kanafghan.welipse.webdsl.DynamicImage#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.kanafghan.welipse.webdsl.WebDSLPackage#getDynamicImage()
 * @model
 * @generated
 */
public interface DynamicImage extends Image {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(ETypedElement)
	 * @see com.github.kanafghan.welipse.webdsl.WebDSLPackage#getDynamicImage_Source()
	 * @model required="true"
	 * @generated
	 */
	ETypedElement getSource();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.webdsl.DynamicImage#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ETypedElement value);

} // DynamicImage
