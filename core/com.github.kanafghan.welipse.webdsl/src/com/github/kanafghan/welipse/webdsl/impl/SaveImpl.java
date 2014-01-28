/**
 */
package com.github.kanafghan.welipse.webdsl.impl;

import com.github.kanafghan.welipse.webdsl.ButtonType;
import com.github.kanafghan.welipse.webdsl.Save;
import com.github.kanafghan.welipse.webdsl.WebDSLPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Save</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SaveImpl extends StandardActionImpl implements Save {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SaveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebDSLPackage.Literals.SAVE;
	}

	/**
	 * @generated NOT
	 */
	@Override
	public String getValue() {
		if (super.getValue() == null || super.getValue().length() == 0) {
			return "Save";
		} else {			
			return super.getValue();
		}
	}

	@Override
	public ButtonType getType() {
		return ButtonType.SUBMIT;
	}

} //SaveImpl
