/**
 */
package com.github.kanafghan.welipse.webdsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arithmetic Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.kanafghan.welipse.webdsl.ArithmeticOperation#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.kanafghan.welipse.webdsl.WebDSLPackage#getArithmeticOperation()
 * @model
 * @generated
 */
public interface ArithmeticOperation extends BasicOperation {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link com.github.kanafghan.welipse.webdsl.ArithmeticOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see com.github.kanafghan.welipse.webdsl.ArithmeticOperator
	 * @see #setOperator(ArithmeticOperator)
	 * @see com.github.kanafghan.welipse.webdsl.WebDSLPackage#getArithmeticOperation_Operator()
	 * @model required="true"
	 * @generated
	 */
	ArithmeticOperator getOperator();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.webdsl.ArithmeticOperation#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see com.github.kanafghan.welipse.webdsl.ArithmeticOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(ArithmeticOperator value);

} // ArithmeticOperation
