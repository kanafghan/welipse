/**
 */
package com.github.kanafghan.welipse.webdsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actual Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.kanafghan.welipse.webdsl.ActualParameter#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.webdsl.ActualParameter#getFormalParameter <em>Formal Parameter</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.webdsl.ActualParameter#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.kanafghan.welipse.webdsl.WebDSLPackage#getActualParameter()
 * @model
 * @generated
 */
public interface ActualParameter extends EObject {
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
	 * @see com.github.kanafghan.welipse.webdsl.WebDSLPackage#getActualParameter_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.webdsl.ActualParameter#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Formal Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formal Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formal Parameter</em>' reference.
	 * @see #setFormalParameter(Parameter)
	 * @see com.github.kanafghan.welipse.webdsl.WebDSLPackage#getActualParameter_FormalParameter()
	 * @model
	 * @generated
	 */
	Parameter getFormalParameter();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.webdsl.ActualParameter#getFormalParameter <em>Formal Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formal Parameter</em>' reference.
	 * @see #getFormalParameter()
	 * @generated
	 */
	void setFormalParameter(Parameter value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Expression)
	 * @see com.github.kanafghan.welipse.webdsl.WebDSLPackage#getActualParameter_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getValue();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.webdsl.ActualParameter#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Expression value);

} // ActualParameter
