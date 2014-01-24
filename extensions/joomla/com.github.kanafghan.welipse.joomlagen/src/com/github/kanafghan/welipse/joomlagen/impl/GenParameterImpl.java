/**
 */
package com.github.kanafghan.welipse.joomlagen.impl;

import com.github.kanafghan.welipse.joomlagen.GenOperation;
import com.github.kanafghan.welipse.joomlagen.GenParameter;
import com.github.kanafghan.welipse.joomlagen.JoomlaGenPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.impl.GenParameterImpl#getGenOperation <em>Gen Operation</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.impl.GenParameterImpl#getEcoreParameter <em>Ecore Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenParameterImpl extends GenTypedElementImpl implements GenParameter {
	/**
	 * The cached value of the '{@link #getEcoreParameter() <em>Ecore Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcoreParameter()
	 * @generated
	 * @ordered
	 */
	protected EParameter ecoreParameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JoomlaGenPackage.Literals.GEN_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenOperation getGenOperation() {
		if (eContainerFeatureID() != JoomlaGenPackage.GEN_PARAMETER__GEN_OPERATION) return null;
		return (GenOperation)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenOperation(GenOperation newGenOperation, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGenOperation, JoomlaGenPackage.GEN_PARAMETER__GEN_OPERATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenOperation(GenOperation newGenOperation) {
		if (newGenOperation != eInternalContainer() || (eContainerFeatureID() != JoomlaGenPackage.GEN_PARAMETER__GEN_OPERATION && newGenOperation != null)) {
			if (EcoreUtil.isAncestor(this, newGenOperation))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGenOperation != null)
				msgs = ((InternalEObject)newGenOperation).eInverseAdd(this, JoomlaGenPackage.GEN_OPERATION__GEN_PARAMETERS, GenOperation.class, msgs);
			msgs = basicSetGenOperation(newGenOperation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JoomlaGenPackage.GEN_PARAMETER__GEN_OPERATION, newGenOperation, newGenOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EParameter getEcoreParameter() {
		if (ecoreParameter != null && ecoreParameter.eIsProxy()) {
			InternalEObject oldEcoreParameter = (InternalEObject)ecoreParameter;
			ecoreParameter = (EParameter)eResolveProxy(oldEcoreParameter);
			if (ecoreParameter != oldEcoreParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JoomlaGenPackage.GEN_PARAMETER__ECORE_PARAMETER, oldEcoreParameter, ecoreParameter));
			}
		}
		return ecoreParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EParameter basicGetEcoreParameter() {
		return ecoreParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEcoreParameter(EParameter newEcoreParameter) {
		EParameter oldEcoreParameter = ecoreParameter;
		ecoreParameter = newEcoreParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JoomlaGenPackage.GEN_PARAMETER__ECORE_PARAMETER, oldEcoreParameter, ecoreParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JoomlaGenPackage.GEN_PARAMETER__GEN_OPERATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGenOperation((GenOperation)otherEnd, msgs);
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
			case JoomlaGenPackage.GEN_PARAMETER__GEN_OPERATION:
				return basicSetGenOperation(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case JoomlaGenPackage.GEN_PARAMETER__GEN_OPERATION:
				return eInternalContainer().eInverseRemove(this, JoomlaGenPackage.GEN_OPERATION__GEN_PARAMETERS, GenOperation.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JoomlaGenPackage.GEN_PARAMETER__GEN_OPERATION:
				return getGenOperation();
			case JoomlaGenPackage.GEN_PARAMETER__ECORE_PARAMETER:
				if (resolve) return getEcoreParameter();
				return basicGetEcoreParameter();
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
			case JoomlaGenPackage.GEN_PARAMETER__GEN_OPERATION:
				setGenOperation((GenOperation)newValue);
				return;
			case JoomlaGenPackage.GEN_PARAMETER__ECORE_PARAMETER:
				setEcoreParameter((EParameter)newValue);
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
			case JoomlaGenPackage.GEN_PARAMETER__GEN_OPERATION:
				setGenOperation((GenOperation)null);
				return;
			case JoomlaGenPackage.GEN_PARAMETER__ECORE_PARAMETER:
				setEcoreParameter((EParameter)null);
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
			case JoomlaGenPackage.GEN_PARAMETER__GEN_OPERATION:
				return getGenOperation() != null;
			case JoomlaGenPackage.GEN_PARAMETER__ECORE_PARAMETER:
				return ecoreParameter != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public void initialize(EParameter eParameter) {
		if (getEcoreParameter() != eParameter) {
			setEcoreParameter(eParameter);
		}
	}

	@Override
	public boolean reconcile(GenParameter oldGenParameterVersion) {
		reconcileSettings(oldGenParameterVersion);
		return true;
	}

	protected void reconcileSettings(GenParameter oldGenParameterVersion) {
		setType(oldGenParameterVersion.getType());
	}

	@Override
	public boolean reconcile() {
		EParameter eParameter = getEcoreParameter();
		if (eParameter == null || eParameter.eIsProxy() || eParameter.eResource() == null) {
			return true;
		}
		return false;
	}

	@Override
	public ETypedElement getEcoreTypedElement() {
		return getEcoreParameter();
	}

} //GenParameterImpl
