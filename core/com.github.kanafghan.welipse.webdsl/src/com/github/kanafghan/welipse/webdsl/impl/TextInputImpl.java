/**
 */
package com.github.kanafghan.welipse.webdsl.impl;

import com.github.kanafghan.welipse.webdsl.TextInput;
import com.github.kanafghan.welipse.webdsl.WebDSLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.kanafghan.welipse.webdsl.impl.TextInputImpl#isIsPassword <em>Is Password</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.webdsl.impl.TextInputImpl#isIsTextArea <em>Is Text Area</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TextInputImpl extends InputImpl implements TextInput {
	/**
	 * The default value of the '{@link #isIsPassword() <em>Is Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPassword()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PASSWORD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsPassword() <em>Is Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPassword()
	 * @generated
	 * @ordered
	 */
	protected boolean isPassword = IS_PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsTextArea() <em>Is Text Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsTextArea()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_TEXT_AREA_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsTextArea() <em>Is Text Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsTextArea()
	 * @generated
	 * @ordered
	 */
	protected boolean isTextArea = IS_TEXT_AREA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextInputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebDSLPackage.Literals.TEXT_INPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsPassword() {
		return isPassword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPassword(boolean newIsPassword) {
		boolean oldIsPassword = isPassword;
		isPassword = newIsPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebDSLPackage.TEXT_INPUT__IS_PASSWORD, oldIsPassword, isPassword));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsTextArea() {
		return isTextArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsTextArea(boolean newIsTextArea) {
		boolean oldIsTextArea = isTextArea;
		isTextArea = newIsTextArea;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebDSLPackage.TEXT_INPUT__IS_TEXT_AREA, oldIsTextArea, isTextArea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebDSLPackage.TEXT_INPUT__IS_PASSWORD:
				return isIsPassword();
			case WebDSLPackage.TEXT_INPUT__IS_TEXT_AREA:
				return isIsTextArea();
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
			case WebDSLPackage.TEXT_INPUT__IS_PASSWORD:
				setIsPassword((Boolean)newValue);
				return;
			case WebDSLPackage.TEXT_INPUT__IS_TEXT_AREA:
				setIsTextArea((Boolean)newValue);
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
			case WebDSLPackage.TEXT_INPUT__IS_PASSWORD:
				setIsPassword(IS_PASSWORD_EDEFAULT);
				return;
			case WebDSLPackage.TEXT_INPUT__IS_TEXT_AREA:
				setIsTextArea(IS_TEXT_AREA_EDEFAULT);
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
			case WebDSLPackage.TEXT_INPUT__IS_PASSWORD:
				return isPassword != IS_PASSWORD_EDEFAULT;
			case WebDSLPackage.TEXT_INPUT__IS_TEXT_AREA:
				return isTextArea != IS_TEXT_AREA_EDEFAULT;
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
		result.append(" (isPassword: ");
		result.append(isPassword);
		result.append(", isTextArea: ");
		result.append(isTextArea);
		result.append(')');
		return result.toString();
	}

} //TextInputImpl
