/**
 */
package com.github.kanafghan.welipse.joomlagen.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.github.kanafghan.welipse.joomlagen.GenClassifier;
import com.github.kanafghan.welipse.joomlagen.GenTypedElement;
import com.github.kanafghan.welipse.joomlagen.JoomlaGenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Typed Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.impl.GenTypedElementImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class GenTypedElementImpl extends GenBaseImpl implements GenTypedElement {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected GenClassifier type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenTypedElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JoomlaGenPackage.Literals.GEN_TYPED_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenClassifier getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (GenClassifier)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JoomlaGenPackage.GEN_TYPED_ELEMENT__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenClassifier basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(GenClassifier newType) {
		GenClassifier oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JoomlaGenPackage.GEN_TYPED_ELEMENT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JoomlaGenPackage.GEN_TYPED_ELEMENT__TYPE:
				if (resolve) return getType();
				return basicGetType();
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
			case JoomlaGenPackage.GEN_TYPED_ELEMENT__TYPE:
				setType((GenClassifier)newValue);
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
			case JoomlaGenPackage.GEN_TYPED_ELEMENT__TYPE:
				setType((GenClassifier)null);
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
			case JoomlaGenPackage.GEN_TYPED_ELEMENT__TYPE:
				return type != null;
		}
		return super.eIsSet(featureID);
	}
	
	public abstract ETypedElement getEcoreTypedElement();
	
	public boolean isListType() {
		ETypedElement eTypedElement = getEcoreTypedElement();
		return eTypedElement.isMany()
				|| isFeatureMapType()
				|| eTypedElement.getUpperBound() == ETypedElement.UNSPECIFIED_MULTIPLICITY
				&& eTypedElement instanceof EStructuralFeature;
//				&& XMLTypePackage.eNS_URI.equals(getExtendedMetaData()
//						.getNamespace((EStructuralFeature) eTypedElement));
	}
	
	public boolean isFeatureMapType() {
		EClassifier type = getEcoreTypedElement().getEType();
		return type != null
				&& isFeatureMapEntry(getEcoreTypedElement().getEType()
						.getInstanceClassName());
	}
	
	protected static boolean isFeatureMapEntry(String name) {
		return "org.eclipse.emf.ecore.util.FeatureMap.Entry".equals(name)
				|| "org.eclipse.emf.ecore.util.FeatureMap$Entry".equals(name);
	}

	@Override
	public boolean isMapType() {
		return isListType(); //TODO this is not complete!
	}

} //GenTypedElementImpl
