/**
 */
package com.github.kanafghan.welipse.webdsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Submit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.kanafghan.welipse.webdsl.Submit#getAction <em>Action</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.webdsl.Submit#getPerformer <em>Performer</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.webdsl.Submit#getValidator <em>Validator</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.webdsl.Submit#getPerformerExpression <em>Performer Expression</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.webdsl.Submit#getValidatorExpression <em>Validator Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.kanafghan.welipse.webdsl.WebDSLPackage#getSubmit()
 * @model abstract="true"
 * @generated
 */
public interface Submit extends Button {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference.
	 * @see #setAction(Action)
	 * @see com.github.kanafghan.welipse.webdsl.WebDSLPackage#getSubmit_Action()
	 * @model containment="true"
	 * @generated
	 */
	Action getAction();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.webdsl.Submit#getAction <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' containment reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(Action value);

	/**
	 * Returns the value of the '<em><b>Performer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Performer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performer</em>' containment reference.
	 * @see #setPerformer(Expression)
	 * @see com.github.kanafghan.welipse.webdsl.WebDSLPackage#getSubmit_Performer()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getPerformer();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.webdsl.Submit#getPerformer <em>Performer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performer</em>' containment reference.
	 * @see #getPerformer()
	 * @generated
	 */
	void setPerformer(Expression value);

	/**
	 * Returns the value of the '<em><b>Validator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validator</em>' containment reference.
	 * @see #setValidator(Expression)
	 * @see com.github.kanafghan.welipse.webdsl.WebDSLPackage#getSubmit_Validator()
	 * @model containment="true"
	 * @generated
	 */
	Expression getValidator();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.webdsl.Submit#getValidator <em>Validator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validator</em>' containment reference.
	 * @see #getValidator()
	 * @generated
	 */
	void setValidator(Expression value);

	/**
	 * Returns the value of the '<em><b>Performer Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Performer Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performer Expression</em>' attribute.
	 * @see #setPerformerExpression(String)
	 * @see com.github.kanafghan.welipse.webdsl.WebDSLPackage#getSubmit_PerformerExpression()
	 * @model
	 * @generated
	 */
	String getPerformerExpression();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.webdsl.Submit#getPerformerExpression <em>Performer Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performer Expression</em>' attribute.
	 * @see #getPerformerExpression()
	 * @generated
	 */
	void setPerformerExpression(String value);

	/**
	 * Returns the value of the '<em><b>Validator Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validator Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validator Expression</em>' attribute.
	 * @see #setValidatorExpression(String)
	 * @see com.github.kanafghan.welipse.webdsl.WebDSLPackage#getSubmit_ValidatorExpression()
	 * @model
	 * @generated
	 */
	String getValidatorExpression();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.webdsl.Submit#getValidatorExpression <em>Validator Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validator Expression</em>' attribute.
	 * @see #getValidatorExpression()
	 * @generated
	 */
	void setValidatorExpression(String value);

} // Submit
