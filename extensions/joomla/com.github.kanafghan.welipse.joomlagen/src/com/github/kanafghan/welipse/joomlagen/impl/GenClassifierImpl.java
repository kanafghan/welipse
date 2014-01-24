/**
 */
package com.github.kanafghan.welipse.joomlagen.impl;

import com.github.kanafghan.welipse.joomlagen.GenClassifier;
import com.github.kanafghan.welipse.joomlagen.GenPackage;
import com.github.kanafghan.welipse.joomlagen.JoomlaGenPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Classifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.impl.GenClassifierImpl#getGenPackage <em>Gen Package</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class GenClassifierImpl extends GenBaseImpl implements GenClassifier {
	/**
	 * The cached value of the '{@link #getGenPackage() <em>Gen Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenPackage()
	 * @generated
	 * @ordered
	 */
	protected GenPackage genPackage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenClassifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JoomlaGenPackage.Literals.GEN_CLASSIFIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenPackage getGenPackage() {
		if (genPackage != null && genPackage.eIsProxy()) {
			InternalEObject oldGenPackage = (InternalEObject)genPackage;
			genPackage = (GenPackage)eResolveProxy(oldGenPackage);
			if (genPackage != oldGenPackage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JoomlaGenPackage.GEN_CLASSIFIER__GEN_PACKAGE, oldGenPackage, genPackage));
			}
		}
		return genPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenPackage basicGetGenPackage() {
		return genPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenPackage(GenPackage newGenPackage, NotificationChain msgs) {
		GenPackage oldGenPackage = genPackage;
		genPackage = newGenPackage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JoomlaGenPackage.GEN_CLASSIFIER__GEN_PACKAGE, oldGenPackage, newGenPackage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenPackage(GenPackage newGenPackage) {
		if (newGenPackage != genPackage) {
			NotificationChain msgs = null;
			if (genPackage != null)
				msgs = ((InternalEObject)genPackage).eInverseRemove(this, JoomlaGenPackage.GEN_PACKAGE__GEN_CLASSIFIERS, GenPackage.class, msgs);
			if (newGenPackage != null)
				msgs = ((InternalEObject)newGenPackage).eInverseAdd(this, JoomlaGenPackage.GEN_PACKAGE__GEN_CLASSIFIERS, GenPackage.class, msgs);
			msgs = basicSetGenPackage(newGenPackage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JoomlaGenPackage.GEN_CLASSIFIER__GEN_PACKAGE, newGenPackage, newGenPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JoomlaGenPackage.GEN_CLASSIFIER__GEN_PACKAGE:
				if (genPackage != null)
					msgs = ((InternalEObject)genPackage).eInverseRemove(this, JoomlaGenPackage.GEN_PACKAGE__GEN_CLASSIFIERS, GenPackage.class, msgs);
				return basicSetGenPackage((GenPackage)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JoomlaGenPackage.GEN_CLASSIFIER__GEN_PACKAGE:
				return basicSetGenPackage(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JoomlaGenPackage.GEN_CLASSIFIER__GEN_PACKAGE:
				if (resolve) return getGenPackage();
				return basicGetGenPackage();
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
			case JoomlaGenPackage.GEN_CLASSIFIER__GEN_PACKAGE:
				setGenPackage((GenPackage)newValue);
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
			case JoomlaGenPackage.GEN_CLASSIFIER__GEN_PACKAGE:
				setGenPackage((GenPackage)null);
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
			case JoomlaGenPackage.GEN_CLASSIFIER__GEN_PACKAGE:
				return genPackage != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public abstract EClassifier getEcoreClassifier();

} //GenClassifierImpl
