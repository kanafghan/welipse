/**
 */
package com.github.kanafghan.welipse.webdsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Presentation Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.kanafghan.welipse.webdsl.PresentationElement#getClass_ <em>Class</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.webdsl.PresentationElement#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.kanafghan.welipse.webdsl.WebDSLPackage#getPresentationElement()
 * @model abstract="true"
 * @generated
 */
public interface PresentationElement extends PageElement {
	/**
	 * Returns the value of the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' attribute.
	 * @see #setClass(String)
	 * @see com.github.kanafghan.welipse.webdsl.WebDSLPackage#getPresentationElement_Class()
	 * @model
	 * @generated
	 */
	String getClass_();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.webdsl.PresentationElement#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(String value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' attribute.
	 * @see #setExpression(String)
	 * @see com.github.kanafghan.welipse.webdsl.WebDSLPackage#getPresentationElement_Expression()
	 * @model
	 * @generated
	 */
	String getExpression();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.webdsl.PresentationElement#getExpression <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' attribute.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(String value);

} // PresentationElement
