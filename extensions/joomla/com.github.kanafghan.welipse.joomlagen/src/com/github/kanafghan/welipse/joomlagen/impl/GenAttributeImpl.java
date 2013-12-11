/**
 */
package com.github.kanafghan.welipse.joomlagen.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.github.kanafghan.welipse.joomlagen.DatabaseColumnType;
import com.github.kanafghan.welipse.joomlagen.FormFieldType;
import com.github.kanafghan.welipse.joomlagen.GenAttribute;
import com.github.kanafghan.welipse.joomlagen.JoomlaGenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.impl.GenAttributeImpl#getFormFieldType <em>Form Field Type</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.impl.GenAttributeImpl#getDatabaseColumnType <em>Database Column Type</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.impl.GenAttributeImpl#getEcoreAttribute <em>Ecore Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenAttributeImpl extends GenFeatureImpl implements GenAttribute {
	/**
	 * The default value of the '{@link #getFormFieldType() <em>Form Field Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormFieldType()
	 * @generated
	 * @ordered
	 */
	protected static final FormFieldType FORM_FIELD_TYPE_EDEFAULT = FormFieldType.TEXT;

	/**
	 * The cached value of the '{@link #getFormFieldType() <em>Form Field Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormFieldType()
	 * @generated
	 * @ordered
	 */
	protected FormFieldType formFieldType = FORM_FIELD_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDatabaseColumnType() <em>Database Column Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseColumnType()
	 * @generated
	 * @ordered
	 */
	protected static final DatabaseColumnType DATABASE_COLUMN_TYPE_EDEFAULT = DatabaseColumnType.INT;

	/**
	 * The cached value of the '{@link #getDatabaseColumnType() <em>Database Column Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseColumnType()
	 * @generated
	 * @ordered
	 */
	protected DatabaseColumnType databaseColumnType = DATABASE_COLUMN_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEcoreAttribute() <em>Ecore Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcoreAttribute()
	 * @generated
	 * @ordered
	 */
	protected EAttribute ecoreAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JoomlaGenPackage.Literals.GEN_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormFieldType getFormFieldType() {
		return formFieldType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormFieldType(FormFieldType newFormFieldType) {
		FormFieldType oldFormFieldType = formFieldType;
		formFieldType = newFormFieldType == null ? FORM_FIELD_TYPE_EDEFAULT : newFormFieldType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JoomlaGenPackage.GEN_ATTRIBUTE__FORM_FIELD_TYPE, oldFormFieldType, formFieldType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseColumnType getDatabaseColumnType() {
		return databaseColumnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabaseColumnType(DatabaseColumnType newDatabaseColumnType) {
		DatabaseColumnType oldDatabaseColumnType = databaseColumnType;
		databaseColumnType = newDatabaseColumnType == null ? DATABASE_COLUMN_TYPE_EDEFAULT : newDatabaseColumnType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JoomlaGenPackage.GEN_ATTRIBUTE__DATABASE_COLUMN_TYPE, oldDatabaseColumnType, databaseColumnType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEcoreAttribute() {
		if (ecoreAttribute != null && ecoreAttribute.eIsProxy()) {
			InternalEObject oldEcoreAttribute = (InternalEObject)ecoreAttribute;
			ecoreAttribute = (EAttribute)eResolveProxy(oldEcoreAttribute);
			if (ecoreAttribute != oldEcoreAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JoomlaGenPackage.GEN_ATTRIBUTE__ECORE_ATTRIBUTE, oldEcoreAttribute, ecoreAttribute));
			}
		}
		return ecoreAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute basicGetEcoreAttribute() {
		return ecoreAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEcoreAttribute(EAttribute newEcoreAttribute) {
		EAttribute oldEcoreAttribute = ecoreAttribute;
		ecoreAttribute = newEcoreAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JoomlaGenPackage.GEN_ATTRIBUTE__ECORE_ATTRIBUTE, oldEcoreAttribute, ecoreAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JoomlaGenPackage.GEN_ATTRIBUTE__FORM_FIELD_TYPE:
				return getFormFieldType();
			case JoomlaGenPackage.GEN_ATTRIBUTE__DATABASE_COLUMN_TYPE:
				return getDatabaseColumnType();
			case JoomlaGenPackage.GEN_ATTRIBUTE__ECORE_ATTRIBUTE:
				if (resolve) return getEcoreAttribute();
				return basicGetEcoreAttribute();
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
			case JoomlaGenPackage.GEN_ATTRIBUTE__FORM_FIELD_TYPE:
				setFormFieldType((FormFieldType)newValue);
				return;
			case JoomlaGenPackage.GEN_ATTRIBUTE__DATABASE_COLUMN_TYPE:
				setDatabaseColumnType((DatabaseColumnType)newValue);
				return;
			case JoomlaGenPackage.GEN_ATTRIBUTE__ECORE_ATTRIBUTE:
				setEcoreAttribute((EAttribute)newValue);
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
			case JoomlaGenPackage.GEN_ATTRIBUTE__FORM_FIELD_TYPE:
				setFormFieldType(FORM_FIELD_TYPE_EDEFAULT);
				return;
			case JoomlaGenPackage.GEN_ATTRIBUTE__DATABASE_COLUMN_TYPE:
				setDatabaseColumnType(DATABASE_COLUMN_TYPE_EDEFAULT);
				return;
			case JoomlaGenPackage.GEN_ATTRIBUTE__ECORE_ATTRIBUTE:
				setEcoreAttribute((EAttribute)null);
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
			case JoomlaGenPackage.GEN_ATTRIBUTE__FORM_FIELD_TYPE:
				return formFieldType != FORM_FIELD_TYPE_EDEFAULT;
			case JoomlaGenPackage.GEN_ATTRIBUTE__DATABASE_COLUMN_TYPE:
				return databaseColumnType != DATABASE_COLUMN_TYPE_EDEFAULT;
			case JoomlaGenPackage.GEN_ATTRIBUTE__ECORE_ATTRIBUTE:
				return ecoreAttribute != null;
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
		result.append(" (formFieldType: ");
		result.append(formFieldType);
		result.append(", databaseColumnType: ");
		result.append(databaseColumnType);
		result.append(')');
		return result.toString();
	}

	/**
	 * @generated NOT
	 */
	@Override
	public String getName() {
		return getEcoreAttribute().getName();
	}

	@Override
	public EStructuralFeature getEcoreFeature() {
		return getEcoreAttribute();
	}

	@Override
	public void initialize(EAttribute eAttribute) {
		if (getEcoreAttribute() != eAttribute) {
			setEcoreAttribute(eAttribute);
			setFormFieldLabel(getName());
			setFormFieldDescription("Specify the value of "+ getName());
			setFormFieldType(computeFormFieldType());
			setDatabaseColumnType(computeDatabaseColumnType());
			setNullable(true);
		}
	}

	private DatabaseColumnType computeDatabaseColumnType() {
		String t = getEcoreAttribute().getEType().eClass().getName();
		if (t.equals("EBoolean") || t.equals("EInt")) {
			return DatabaseColumnType.INT;
		} else if (t.equals("EDouble")) {
			return DatabaseColumnType.DOUBLE;
		} else if (t.equals("EFloat")) {
			return DatabaseColumnType.FLOAT;
		} else if (t.equals("EDate")) {
			return DatabaseColumnType.DATE;
		}

		return DatabaseColumnType.VARCHAR;
	}

	private FormFieldType computeFormFieldType() {
		if (getEcoreAttribute().getEType().eClass().getName().equals("EBoolean")) {
			return FormFieldType.RADIO;
		}
			
		return FormFieldType.TEXT;
	}

} //GenAttributeImpl
