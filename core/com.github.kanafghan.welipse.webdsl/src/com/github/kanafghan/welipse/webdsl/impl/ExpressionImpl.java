/**
 */
package com.github.kanafghan.welipse.webdsl.impl;

import com.github.kanafghan.welipse.webdsl.Expression;
import com.github.kanafghan.welipse.webdsl.Page;
import com.github.kanafghan.welipse.webdsl.WebDSLPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class ExpressionImpl extends MinimalEObjectImpl.Container implements Expression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebDSLPackage.Literals.EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc --> 
	 * @generated NOT
	 */
	public EClassifier type() {
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void initialize(Page page) {
		// nothing to initialize
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case WebDSLPackage.EXPRESSION___TYPE:
				return type();
			case WebDSLPackage.EXPRESSION___INITIALIZE__PAGE:
				initialize((Page)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ExpressionImpl
