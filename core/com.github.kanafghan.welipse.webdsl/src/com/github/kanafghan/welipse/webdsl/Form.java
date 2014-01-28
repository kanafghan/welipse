/**
 */
package com.github.kanafghan.welipse.webdsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.kanafghan.welipse.webdsl.Form#getMethod <em>Method</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.kanafghan.welipse.webdsl.WebDSLPackage#getForm()
 * @model
 * @generated
 */
public interface Form extends Group {
	/**
	 * Returns the value of the '<em><b>Method</b></em>' attribute.
	 * The literals are from the enumeration {@link com.github.kanafghan.welipse.webdsl.FormMethod}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' attribute.
	 * @see com.github.kanafghan.welipse.webdsl.FormMethod
	 * @see #setMethod(FormMethod)
	 * @see com.github.kanafghan.welipse.webdsl.WebDSLPackage#getForm_Method()
	 * @model
	 * @generated
	 */
	FormMethod getMethod();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.webdsl.Form#getMethod <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' attribute.
	 * @see com.github.kanafghan.welipse.webdsl.FormMethod
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(FormMethod value);

} // Form
