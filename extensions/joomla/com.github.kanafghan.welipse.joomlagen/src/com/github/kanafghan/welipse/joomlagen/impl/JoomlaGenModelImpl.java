/**
 */
package com.github.kanafghan.welipse.joomlagen.impl;

import com.github.kanafghan.welipse.joomlagen.ExtensionType;
import com.github.kanafghan.welipse.joomlagen.JoomlaGenModel;
import com.github.kanafghan.welipse.joomlagen.JoomlaGenPackage;
import com.github.kanafghan.welipse.joomlagen.JoomlaVersion;

import com.github.kanafghan.welipse.webdsl.Website;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.impl.JoomlaGenModelImpl#getExtensionType <em>Extension Type</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.impl.JoomlaGenModelImpl#getJoomlaVersion <em>Joomla Version</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.impl.JoomlaGenModelImpl#getExtensionName <em>Extension Name</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.impl.JoomlaGenModelImpl#getExtension <em>Extension</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.impl.JoomlaGenModelImpl#getDatamodel <em>Datamodel</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JoomlaGenModelImpl extends MinimalEObjectImpl.Container implements JoomlaGenModel {
	/**
	 * The default value of the '{@link #getExtensionType() <em>Extension Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensionType()
	 * @generated
	 * @ordered
	 */
	protected static final ExtensionType EXTENSION_TYPE_EDEFAULT = ExtensionType.COMPONENT;

	/**
	 * The cached value of the '{@link #getExtensionType() <em>Extension Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensionType()
	 * @generated
	 * @ordered
	 */
	protected ExtensionType extensionType = EXTENSION_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getJoomlaVersion() <em>Joomla Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoomlaVersion()
	 * @generated
	 * @ordered
	 */
	protected static final JoomlaVersion JOOMLA_VERSION_EDEFAULT = JoomlaVersion.J25;

	/**
	 * The cached value of the '{@link #getJoomlaVersion() <em>Joomla Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoomlaVersion()
	 * @generated
	 * @ordered
	 */
	protected JoomlaVersion joomlaVersion = JOOMLA_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getExtensionName() <em>Extension Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensionName()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTENSION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtensionName() <em>Extension Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensionName()
	 * @generated
	 * @ordered
	 */
	protected String extensionName = EXTENSION_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExtension() <em>Extension</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtension()
	 * @generated
	 * @ordered
	 */
	protected Website extension;

	/**
	 * The cached value of the '{@link #getDatamodel() <em>Datamodel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatamodel()
	 * @generated
	 * @ordered
	 */
	protected EPackage datamodel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JoomlaGenModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JoomlaGenPackage.Literals.JOOMLA_GEN_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionType getExtensionType() {
		return extensionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtensionType(ExtensionType newExtensionType) {
		ExtensionType oldExtensionType = extensionType;
		extensionType = newExtensionType == null ? EXTENSION_TYPE_EDEFAULT : newExtensionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JoomlaGenPackage.JOOMLA_GEN_MODEL__EXTENSION_TYPE, oldExtensionType, extensionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoomlaVersion getJoomlaVersion() {
		return joomlaVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJoomlaVersion(JoomlaVersion newJoomlaVersion) {
		JoomlaVersion oldJoomlaVersion = joomlaVersion;
		joomlaVersion = newJoomlaVersion == null ? JOOMLA_VERSION_EDEFAULT : newJoomlaVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JoomlaGenPackage.JOOMLA_GEN_MODEL__JOOMLA_VERSION, oldJoomlaVersion, joomlaVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtensionName() {
		return extensionName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtensionName(String newExtensionName) {
		String oldExtensionName = extensionName;
		extensionName = newExtensionName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JoomlaGenPackage.JOOMLA_GEN_MODEL__EXTENSION_NAME, oldExtensionName, extensionName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Website getExtension() {
		if (extension != null && extension.eIsProxy()) {
			InternalEObject oldExtension = (InternalEObject)extension;
			extension = (Website)eResolveProxy(oldExtension);
			if (extension != oldExtension) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JoomlaGenPackage.JOOMLA_GEN_MODEL__EXTENSION, oldExtension, extension));
			}
		}
		return extension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Website basicGetExtension() {
		return extension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtension(Website newExtension) {
		Website oldExtension = extension;
		extension = newExtension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JoomlaGenPackage.JOOMLA_GEN_MODEL__EXTENSION, oldExtension, extension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPackage getDatamodel() {
		if (datamodel != null && datamodel.eIsProxy()) {
			InternalEObject oldDatamodel = (InternalEObject)datamodel;
			datamodel = (EPackage)eResolveProxy(oldDatamodel);
			if (datamodel != oldDatamodel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JoomlaGenPackage.JOOMLA_GEN_MODEL__DATAMODEL, oldDatamodel, datamodel));
			}
		}
		return datamodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPackage basicGetDatamodel() {
		return datamodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatamodel(EPackage newDatamodel) {
		EPackage oldDatamodel = datamodel;
		datamodel = newDatamodel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JoomlaGenPackage.JOOMLA_GEN_MODEL__DATAMODEL, oldDatamodel, datamodel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JoomlaGenPackage.JOOMLA_GEN_MODEL__EXTENSION_TYPE:
				return getExtensionType();
			case JoomlaGenPackage.JOOMLA_GEN_MODEL__JOOMLA_VERSION:
				return getJoomlaVersion();
			case JoomlaGenPackage.JOOMLA_GEN_MODEL__EXTENSION_NAME:
				return getExtensionName();
			case JoomlaGenPackage.JOOMLA_GEN_MODEL__EXTENSION:
				if (resolve) return getExtension();
				return basicGetExtension();
			case JoomlaGenPackage.JOOMLA_GEN_MODEL__DATAMODEL:
				if (resolve) return getDatamodel();
				return basicGetDatamodel();
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
			case JoomlaGenPackage.JOOMLA_GEN_MODEL__EXTENSION_TYPE:
				setExtensionType((ExtensionType)newValue);
				return;
			case JoomlaGenPackage.JOOMLA_GEN_MODEL__JOOMLA_VERSION:
				setJoomlaVersion((JoomlaVersion)newValue);
				return;
			case JoomlaGenPackage.JOOMLA_GEN_MODEL__EXTENSION_NAME:
				setExtensionName((String)newValue);
				return;
			case JoomlaGenPackage.JOOMLA_GEN_MODEL__EXTENSION:
				setExtension((Website)newValue);
				return;
			case JoomlaGenPackage.JOOMLA_GEN_MODEL__DATAMODEL:
				setDatamodel((EPackage)newValue);
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
			case JoomlaGenPackage.JOOMLA_GEN_MODEL__EXTENSION_TYPE:
				setExtensionType(EXTENSION_TYPE_EDEFAULT);
				return;
			case JoomlaGenPackage.JOOMLA_GEN_MODEL__JOOMLA_VERSION:
				setJoomlaVersion(JOOMLA_VERSION_EDEFAULT);
				return;
			case JoomlaGenPackage.JOOMLA_GEN_MODEL__EXTENSION_NAME:
				setExtensionName(EXTENSION_NAME_EDEFAULT);
				return;
			case JoomlaGenPackage.JOOMLA_GEN_MODEL__EXTENSION:
				setExtension((Website)null);
				return;
			case JoomlaGenPackage.JOOMLA_GEN_MODEL__DATAMODEL:
				setDatamodel((EPackage)null);
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
			case JoomlaGenPackage.JOOMLA_GEN_MODEL__EXTENSION_TYPE:
				return extensionType != EXTENSION_TYPE_EDEFAULT;
			case JoomlaGenPackage.JOOMLA_GEN_MODEL__JOOMLA_VERSION:
				return joomlaVersion != JOOMLA_VERSION_EDEFAULT;
			case JoomlaGenPackage.JOOMLA_GEN_MODEL__EXTENSION_NAME:
				return EXTENSION_NAME_EDEFAULT == null ? extensionName != null : !EXTENSION_NAME_EDEFAULT.equals(extensionName);
			case JoomlaGenPackage.JOOMLA_GEN_MODEL__EXTENSION:
				return extension != null;
			case JoomlaGenPackage.JOOMLA_GEN_MODEL__DATAMODEL:
				return datamodel != null;
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
		result.append(" (extensionType: ");
		result.append(extensionType);
		result.append(", joomlaVersion: ");
		result.append(joomlaVersion);
		result.append(", extensionName: ");
		result.append(extensionName);
		result.append(')');
		return result.toString();
	}

} //JoomlaGenModelImpl
