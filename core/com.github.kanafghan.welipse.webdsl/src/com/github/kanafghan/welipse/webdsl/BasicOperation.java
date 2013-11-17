/**
 */
package com.github.kanafghan.welipse.webdsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.kanafghan.welipse.webdsl.BasicOperation#getOperands <em>Operands</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.kanafghan.welipse.webdsl.WebDSLPackage#getBasicOperation()
 * @model abstract="true"
 * @generated
 */
public interface BasicOperation extends OperationExp {
	/**
	 * Returns the value of the '<em><b>Operands</b></em>' containment reference list.
	 * The list contents are of type {@link com.github.kanafghan.welipse.webdsl.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operands</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operands</em>' containment reference list.
	 * @see com.github.kanafghan.welipse.webdsl.WebDSLPackage#getBasicOperation_Operands()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Expression> getOperands();

} // BasicOperation
