/**
 */
package com.github.kanafghan.welipse.webdsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.github.kanafghan.welipse.webdsl.ArithmeticOperation;
import com.github.kanafghan.welipse.webdsl.ArithmeticOperator;
import com.github.kanafghan.welipse.webdsl.Expression;
import com.github.kanafghan.welipse.webdsl.Page;
import com.github.kanafghan.welipse.webdsl.WebDSLPackage;
import com.github.kanafghan.welipse.webdsl.etc.ExpressionUtils;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arithmetic Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.kanafghan.welipse.webdsl.impl.ArithmeticOperationImpl#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArithmeticOperationImpl extends BasicOperationImpl implements ArithmeticOperation {
	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final ArithmeticOperator OPERATOR_EDEFAULT = ArithmeticOperator.NEGATION;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected ArithmeticOperator operator = OPERATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArithmeticOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebDSLPackage.Literals.ARITHMETIC_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArithmeticOperator getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(ArithmeticOperator newOperator) {
		ArithmeticOperator oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebDSLPackage.ARITHMETIC_OPERATION__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebDSLPackage.ARITHMETIC_OPERATION__OPERATOR:
				return getOperator();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WebDSLPackage.ARITHMETIC_OPERATION__OPERATOR:
				setOperator((ArithmeticOperator)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case WebDSLPackage.ARITHMETIC_OPERATION__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case WebDSLPackage.ARITHMETIC_OPERATION__OPERATOR:
				return operator != OPERATOR_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (operator: ");
		result.append(operator);
		result.append(')');
		return result.toString();
	}

	/**
	 * @generated NOT
	 */
	@Override
	public EClassifier type() {
		EClassifier type = null;
		if (getOperands().size() == 2) {
			Expression operand1 = getOperands().get(0);
			Expression operand2 = getOperands().get(1);
			if (operand1  != null && operand2 != null) {
				type = operand1.type();
				EClassifier otherType = operand2.type();
				if (type != null && otherType != null) {
					if (type.getName().equals(otherType.getName())) {
						if (ExpressionUtils.isNumerical(type)) {							
							return type;
						} else {
							throw new Error("The operands of the arithmetic operation '"
									+ ExpressionUtils.getOperatorSymbol(getOperator())
									+"' have not numerical type: the type is "+ type.getName());
						}
					} else {
						throw new Error("The operands of the arithmetic operation '"
								+ ExpressionUtils.getOperatorSymbol(getOperator())
								+"' have different types: the type of the first operand is "
								+ type.getName() +" while the type of the second operand is "
								+ otherType.getName());
					}
				}
			} else {
				throw new Error("One of the operands in arithmetic operation '"
						+ ExpressionUtils.getOperatorSymbol(getOperator())
						+"' is null. Operand 1 = "+ operand1 +", Operand 2 = "+ operand2);
			}
		} else if (getOperands().size() == 1) {
			if (getOperator() == ArithmeticOperator.NEGATION) {
				type = getOperands().get(0).type();
				if (!ExpressionUtils.isNumerical(type)) {
					throw new Error("The operand of the arithmetic-negation operation does not have numerical type.");
				}
			} else {
				throw new Error("The arithmetic operation '"
						+ ExpressionUtils.getOperatorSymbol(getOperator())
						+"' does not have 2 operands, but got 1.");
			}
		} else {
			throw new Error("The arithmetic operation '"
					+ ExpressionUtils.getOperatorSymbol(getOperator()) 
					+"' does not have 1 or 2 operands, but got "+ getOperands().size());
		}
		return type;
	}

	/**
	 * @generated NOT
	 */
	@Override
	public void initialize(Page page) {
		for (Expression operand : getOperands()) {
			operand.initialize(page);
		}
	}

} //ArithmeticOperationImpl
