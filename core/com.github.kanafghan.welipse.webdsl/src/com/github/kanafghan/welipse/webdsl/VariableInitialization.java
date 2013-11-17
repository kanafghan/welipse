/**
 */
package com.github.kanafghan.welipse.webdsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Initialization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.kanafghan.welipse.webdsl.VariableInitialization#getInitExp <em>Init Exp</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.kanafghan.welipse.webdsl.WebDSLPackage#getVariableInitialization()
 * @model
 * @generated
 */
public interface VariableInitialization extends VariableDeclaration {
	/**
	 * Returns the value of the '<em><b>Init Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init Exp</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Exp</em>' containment reference.
	 * @see #setInitExp(Expression)
	 * @see com.github.kanafghan.welipse.webdsl.WebDSLPackage#getVariableInitialization_InitExp()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getInitExp();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.webdsl.VariableInitialization#getInitExp <em>Init Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init Exp</em>' containment reference.
	 * @see #getInitExp()
	 * @generated
	 */
	void setInitExp(Expression value);

} // VariableInitialization
