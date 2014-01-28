/**
 */
package com.github.kanafghan.welipse.webdsl.impl;

import com.github.kanafghan.welipse.webdsl.Reset;
import com.github.kanafghan.welipse.webdsl.WebDSLPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ResetImpl extends StandardActionImpl implements Reset {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebDSLPackage.Literals.RESET;
	}

	/**
	 * @generated NOT
	 */
	@Override
	public String getValue() {
		if (super.getValue() == null || super.getValue().length() == 0) {
			return "Reset";
		} else {			
			return super.getValue();
		}
	}

} //ResetImpl
