/**
 */
package com.github.kanafghan.welipse.webdsl.impl;

import com.github.kanafghan.welipse.webdsl.ComparisonOperation;
import com.github.kanafghan.welipse.webdsl.ComparisonOperator;
import com.github.kanafghan.welipse.webdsl.Expression;
import com.github.kanafghan.welipse.webdsl.Page;
import com.github.kanafghan.welipse.webdsl.WebDSLPackage;
import com.github.kanafghan.welipse.webdsl.etc.ExpressionUtils;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comparison Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.kanafghan.welipse.webdsl.impl.ComparisonOperationImpl#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComparisonOperationImpl extends BasicOperationImpl implements ComparisonOperation {
	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final ComparisonOperator OPERATOR_EDEFAULT = ComparisonOperator.EQUAL;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected ComparisonOperator operator = OPERATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComparisonOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebDSLPackage.Literals.COMPARISON_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparisonOperator getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(ComparisonOperator newOperator) {
		ComparisonOperator oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebDSLPackage.COMPARISON_OPERATION__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebDSLPackage.COMPARISON_OPERATION__OPERATOR:
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
			case WebDSLPackage.COMPARISON_OPERATION__OPERATOR:
				setOperator((ComparisonOperator)newValue);
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
			case WebDSLPackage.COMPARISON_OPERATION__OPERATOR:
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
			case WebDSLPackage.COMPARISON_OPERATION__OPERATOR:
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
							throw new Error("The operands of the comparison operation '"
									+ ExpressionUtils.getOperatorSymbol(getOperator())
									+"' have not comparison type: the type is "+ type.getName());
						}
					} else {
						throw new Error("The operands of the comparison operation '"
								+ ExpressionUtils.getOperatorSymbol(getOperator())
								+"' have different types: the type of the first operand is "
								+ type.getName() +" while the type of the second operand is "
								+ otherType.getName());
					}
				}
			} else {
				throw new Error("One of the operands in comparison operation '"
						+ ExpressionUtils.getOperatorSymbol(getOperator())
						+"' is null. Operand 1 = "+ operand1 +", Operand 2 = "+ operand2);
			}
		} else {
			throw new Error("The comparison operation '"
					+ ExpressionUtils.getOperatorSymbol(getOperator()) 
					+"' does not have 2 operands, but "+ getOperands().size());
		}
		return type;		
	}

	/**
	 * @generated NOT
	 */
	@Override
	public void initialize(Page page) {
		for (Expression operands : getOperands()) {
			operands.initialize(page);
		}
	}

} //ComparisonOperationImpl
