/**
 */
package com.github.kanafghan.welipse.webdsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.kanafghan.welipse.webdsl.VariableExp#getVar <em>Var</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.webdsl.VariableExp#getDeclaration <em>Declaration</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.kanafghan.welipse.webdsl.WebDSLPackage#getVariableExp()
 * @model
 * @generated
 */
public interface VariableExp extends Expression {
	/**
	 * Returns the value of the '<em><b>Var</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Var</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var</em>' attribute.
	 * @see #setVar(String)
	 * @see com.github.kanafghan.welipse.webdsl.WebDSLPackage#getVariableExp_Var()
	 * @model required="true"
	 * @generated
	 */
	String getVar();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.webdsl.VariableExp#getVar <em>Var</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var</em>' attribute.
	 * @see #getVar()
	 * @generated
	 */
	void setVar(String value);

	/**
	 * Returns the value of the '<em><b>Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declaration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declaration</em>' reference.
	 * @see #setDeclaration(VariableDeclaration)
	 * @see com.github.kanafghan.welipse.webdsl.WebDSLPackage#getVariableExp_Declaration()
	 * @model
	 * @generated
	 */
	VariableDeclaration getDeclaration();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.webdsl.VariableExp#getDeclaration <em>Declaration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declaration</em>' reference.
	 * @see #getDeclaration()
	 * @generated
	 */
	void setDeclaration(VariableDeclaration value);

} // VariableExp
