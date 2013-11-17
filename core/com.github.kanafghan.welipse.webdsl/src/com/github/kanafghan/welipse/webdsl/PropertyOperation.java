/**
 */
package com.github.kanafghan.welipse.webdsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.kanafghan.welipse.webdsl.PropertyOperation#getSource <em>Source</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.webdsl.PropertyOperation#getIdentifier <em>Identifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.kanafghan.welipse.webdsl.WebDSLPackage#getPropertyOperation()
 * @model abstract="true"
 * @generated
 */
public interface PropertyOperation extends OperationExp {
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
	 * @see com.github.kanafghan.welipse.webdsl.WebDSLPackage#getPropertyOperation_Source()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getSource();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.webdsl.PropertyOperation#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Expression value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(String)
	 * @see com.github.kanafghan.welipse.webdsl.WebDSLPackage#getPropertyOperation_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.webdsl.PropertyOperation#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

} // PropertyOperation
