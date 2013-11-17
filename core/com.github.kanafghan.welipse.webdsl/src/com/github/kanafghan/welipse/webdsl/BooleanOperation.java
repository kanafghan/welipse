/**
 */
package com.github.kanafghan.welipse.webdsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.kanafghan.welipse.webdsl.BooleanOperation#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.kanafghan.welipse.webdsl.WebDSLPackage#getBooleanOperation()
 * @model
 * @generated
 */
public interface BooleanOperation extends BasicOperation {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link com.github.kanafghan.welipse.webdsl.BooleanOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see com.github.kanafghan.welipse.webdsl.BooleanOperator
	 * @see #setOperator(BooleanOperator)
	 * @see com.github.kanafghan.welipse.webdsl.WebDSLPackage#getBooleanOperation_Operator()
	 * @model
	 * @generated
	 */
	BooleanOperator getOperator();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.webdsl.BooleanOperation#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see com.github.kanafghan.welipse.webdsl.BooleanOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(BooleanOperator value);

} // BooleanOperation
