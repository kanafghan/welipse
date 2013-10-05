/**
 */
package com.github.kanafghan.welipse.webdsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.kanafghan.welipse.webdsl.Image#isIsURL <em>Is URL</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.kanafghan.welipse.webdsl.WebDSLPackage#getImage()
 * @model abstract="true"
 * @generated
 */
public interface Image extends PresentationElement {

	/**
	 * Returns the value of the '<em><b>Is URL</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is URL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is URL</em>' attribute.
	 * @see #setIsURL(boolean)
	 * @see com.github.kanafghan.welipse.webdsl.WebDSLPackage#getImage_IsURL()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsURL();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.webdsl.Image#isIsURL <em>Is URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is URL</em>' attribute.
	 * @see #isIsURL()
	 * @generated
	 */
	void setIsURL(boolean value);
} // Image
