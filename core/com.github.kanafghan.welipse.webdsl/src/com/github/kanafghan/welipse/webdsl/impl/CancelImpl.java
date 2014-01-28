/**
 */
package com.github.kanafghan.welipse.webdsl.impl;

import com.github.kanafghan.welipse.webdsl.Cancel;
import com.github.kanafghan.welipse.webdsl.WebDSLPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cancel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CancelImpl extends StandardActionImpl implements Cancel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CancelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebDSLPackage.Literals.CANCEL;
	}

	/**
	 * @generated NOT
	 */
	@Override
	public String getValue() {
		if (super.getValue() == null || super.getValue().length() == 0) {
			return "Cancel";
		} else {			
			return super.getValue();
		}
	}

} //CancelImpl
