/**
 */
package com.github.kanafghan.welipse.joomlagen.impl;

import com.github.kanafghan.welipse.joomlagen.GenClass;
import com.github.kanafghan.welipse.joomlagen.GenFeature;
import com.github.kanafghan.welipse.joomlagen.JoomlaGenPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.impl.GenFeatureImpl#getGenClass <em>Gen Class</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.impl.GenFeatureImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.impl.GenFeatureImpl#getFormFieldLabel <em>Form Field Label</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.impl.GenFeatureImpl#getFormFieldDescription <em>Form Field Description</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.impl.GenFeatureImpl#isNullable <em>Nullable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class GenFeatureImpl extends GenTypedElementImpl implements GenFeature {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getFormFieldLabel() <em>Form Field Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormFieldLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String FORM_FIELD_LABEL_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getFormFieldLabel() <em>Form Field Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormFieldLabel()
	 * @generated
	 * @ordered
	 */
	protected String formFieldLabel = FORM_FIELD_LABEL_EDEFAULT;
	/**
	 * The default value of the '{@link #getFormFieldDescription() <em>Form Field Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormFieldDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String FORM_FIELD_DESCRIPTION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getFormFieldDescription() <em>Form Field Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormFieldDescription()
	 * @generated
	 * @ordered
	 */
	protected String formFieldDescription = FORM_FIELD_DESCRIPTION_EDEFAULT;
	/**
	 * The default value of the '{@link #isNullable() <em>Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNullable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NULLABLE_EDEFAULT = true;
	/**
	 * The cached value of the '{@link #isNullable() <em>Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNullable()
	 * @generated
	 * @ordered
	 */
	protected boolean nullable = NULLABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JoomlaGenPackage.Literals.GEN_FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenClass getGenClass() {
		if (eContainerFeatureID() != JoomlaGenPackage.GEN_FEATURE__GEN_CLASS) return null;
		return (GenClass)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenClass(GenClass newGenClass, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGenClass, JoomlaGenPackage.GEN_FEATURE__GEN_CLASS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenClass(GenClass newGenClass) {
		if (newGenClass != eInternalContainer() || (eContainerFeatureID() != JoomlaGenPackage.GEN_FEATURE__GEN_CLASS && newGenClass != null)) {
			if (EcoreUtil.isAncestor(this, newGenClass))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGenClass != null)
				msgs = ((InternalEObject)newGenClass).eInverseAdd(this, JoomlaGenPackage.GEN_CLASS__GEN_FEATURES, GenClass.class, msgs);
			msgs = basicSetGenClass(newGenClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JoomlaGenPackage.GEN_FEATURE__GEN_CLASS, newGenClass, newGenClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getName() {
		// Is overridden by GenAttribute and GenReference
		return "";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setName(String newName) {
		// Not Relevant
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFormFieldLabel() {
		return formFieldLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormFieldLabel(String newFormFieldLabel) {
		String oldFormFieldLabel = formFieldLabel;
		formFieldLabel = newFormFieldLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JoomlaGenPackage.GEN_FEATURE__FORM_FIELD_LABEL, oldFormFieldLabel, formFieldLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFormFieldDescription() {
		return formFieldDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormFieldDescription(String newFormFieldDescription) {
		String oldFormFieldDescription = formFieldDescription;
		formFieldDescription = newFormFieldDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JoomlaGenPackage.GEN_FEATURE__FORM_FIELD_DESCRIPTION, oldFormFieldDescription, formFieldDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNullable() {
		return nullable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNullable(boolean newNullable) {
		boolean oldNullable = nullable;
		nullable = newNullable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JoomlaGenPackage.GEN_FEATURE__NULLABLE, oldNullable, nullable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JoomlaGenPackage.GEN_FEATURE__GEN_CLASS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGenClass((GenClass)otherEnd, msgs);
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
			case JoomlaGenPackage.GEN_FEATURE__GEN_CLASS:
				return basicSetGenClass(null, msgs);
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
			case JoomlaGenPackage.GEN_FEATURE__GEN_CLASS:
				return eInternalContainer().eInverseRemove(this, JoomlaGenPackage.GEN_CLASS__GEN_FEATURES, GenClass.class, msgs);
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
			case JoomlaGenPackage.GEN_FEATURE__GEN_CLASS:
				return getGenClass();
			case JoomlaGenPackage.GEN_FEATURE__NAME:
				return getName();
			case JoomlaGenPackage.GEN_FEATURE__FORM_FIELD_LABEL:
				return getFormFieldLabel();
			case JoomlaGenPackage.GEN_FEATURE__FORM_FIELD_DESCRIPTION:
				return getFormFieldDescription();
			case JoomlaGenPackage.GEN_FEATURE__NULLABLE:
				return isNullable();
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
			case JoomlaGenPackage.GEN_FEATURE__GEN_CLASS:
				setGenClass((GenClass)newValue);
				return;
			case JoomlaGenPackage.GEN_FEATURE__NAME:
				setName((String)newValue);
				return;
			case JoomlaGenPackage.GEN_FEATURE__FORM_FIELD_LABEL:
				setFormFieldLabel((String)newValue);
				return;
			case JoomlaGenPackage.GEN_FEATURE__FORM_FIELD_DESCRIPTION:
				setFormFieldDescription((String)newValue);
				return;
			case JoomlaGenPackage.GEN_FEATURE__NULLABLE:
				setNullable((Boolean)newValue);
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
			case JoomlaGenPackage.GEN_FEATURE__GEN_CLASS:
				setGenClass((GenClass)null);
				return;
			case JoomlaGenPackage.GEN_FEATURE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case JoomlaGenPackage.GEN_FEATURE__FORM_FIELD_LABEL:
				setFormFieldLabel(FORM_FIELD_LABEL_EDEFAULT);
				return;
			case JoomlaGenPackage.GEN_FEATURE__FORM_FIELD_DESCRIPTION:
				setFormFieldDescription(FORM_FIELD_DESCRIPTION_EDEFAULT);
				return;
			case JoomlaGenPackage.GEN_FEATURE__NULLABLE:
				setNullable(NULLABLE_EDEFAULT);
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
			case JoomlaGenPackage.GEN_FEATURE__GEN_CLASS:
				return getGenClass() != null;
			case JoomlaGenPackage.GEN_FEATURE__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case JoomlaGenPackage.GEN_FEATURE__FORM_FIELD_LABEL:
				return FORM_FIELD_LABEL_EDEFAULT == null ? formFieldLabel != null : !FORM_FIELD_LABEL_EDEFAULT.equals(formFieldLabel);
			case JoomlaGenPackage.GEN_FEATURE__FORM_FIELD_DESCRIPTION:
				return FORM_FIELD_DESCRIPTION_EDEFAULT == null ? formFieldDescription != null : !FORM_FIELD_DESCRIPTION_EDEFAULT.equals(formFieldDescription);
			case JoomlaGenPackage.GEN_FEATURE__NULLABLE:
				return nullable != NULLABLE_EDEFAULT;
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
		result.append(" (formFieldLabel: ");
		result.append(formFieldLabel);
		result.append(", formFieldDescription: ");
		result.append(formFieldDescription);
		result.append(", nullable: ");
		result.append(nullable);
		result.append(')');
		return result.toString();
	}

	@Override
	public abstract EStructuralFeature getEcoreFeature();

} //GenFeatureImpl
