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
 *   <li>{@link com.github.kanafghan.welipse.webdsl.Image#isReferenced <em>Referenced</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.webdsl.Image#getSource <em>Source</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.webdsl.Image#isStatic <em>Static</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.kanafghan.welipse.webdsl.WebDSLPackage#getImage()
 * @model
 * @generated
 */
public interface Image extends PresentationElement {
	/**
	 * Returns the value of the '<em><b>Referenced</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced</em>' attribute.
	 * @see #setReferenced(boolean)
	 * @see com.github.kanafghan.welipse.webdsl.WebDSLPackage#getImage_Referenced()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isReferenced();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.webdsl.Image#isReferenced <em>Referenced</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced</em>' attribute.
	 * @see #isReferenced()
	 * @generated
	 */
	void setReferenced(boolean value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(Expression)
	 * @see com.github.kanafghan.welipse.webdsl.WebDSLPackage#getImage_Source()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getSource();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.webdsl.Image#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Expression value);

	/**
	 * Returns the value of the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Static</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static</em>' attribute.
	 * @see com.github.kanafghan.welipse.webdsl.WebDSLPackage#getImage_Static()
	 * @model transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	boolean isStatic();

} // Image
