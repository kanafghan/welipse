/**
 */
package com.github.kanafghan.welipse.joomlagen.impl;

import com.github.kanafghan.welipse.joomlagen.DatabaseTable;
import com.github.kanafghan.welipse.joomlagen.GenAttribute;
import com.github.kanafghan.welipse.joomlagen.GenClass;
import com.github.kanafghan.welipse.joomlagen.GenReference;
import com.github.kanafghan.welipse.joomlagen.JoomlaGenPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Database Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.impl.DatabaseTableImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.impl.DatabaseTableImpl#getGenClass <em>Gen Class</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.impl.DatabaseTableImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.impl.DatabaseTableImpl#getForeignKeys <em>Foreign Keys</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DatabaseTableImpl extends MinimalEObjectImpl.Container implements DatabaseTable {
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
	 * The cached value of the '{@link #getGenClass() <em>Gen Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenClass()
	 * @generated
	 * @ordered
	 */
	protected GenClass genClass;

	/**
	 * The cached value of the '{@link #getColumns() <em>Columns</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<GenAttribute> columns;

	/**
	 * The cached value of the '{@link #getForeignKeys() <em>Foreign Keys</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeignKeys()
	 * @generated
	 * @ordered
	 */
	protected EList<GenReference> foreignKeys;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatabaseTableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JoomlaGenPackage.Literals.DATABASE_TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getName() {
		return getGenClass().getDatabaseTableName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setName(String newName) {
		// Not relevant
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenClass getGenClass() {
		if (genClass != null && genClass.eIsProxy()) {
			InternalEObject oldGenClass = (InternalEObject)genClass;
			genClass = (GenClass)eResolveProxy(oldGenClass);
			if (genClass != oldGenClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JoomlaGenPackage.DATABASE_TABLE__GEN_CLASS, oldGenClass, genClass));
			}
		}
		return genClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenClass basicGetGenClass() {
		return genClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenClass(GenClass newGenClass) {
		GenClass oldGenClass = genClass;
		genClass = newGenClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JoomlaGenPackage.DATABASE_TABLE__GEN_CLASS, oldGenClass, genClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenAttribute> getColumns() {
		if (columns == null) {
			columns = new EObjectResolvingEList<GenAttribute>(GenAttribute.class, this, JoomlaGenPackage.DATABASE_TABLE__COLUMNS);
		}
		return columns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenReference> getForeignKeys() {
		if (foreignKeys == null) {
			foreignKeys = new EObjectResolvingEList<GenReference>(GenReference.class, this, JoomlaGenPackage.DATABASE_TABLE__FOREIGN_KEYS);
		}
		return foreignKeys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JoomlaGenPackage.DATABASE_TABLE__NAME:
				return getName();
			case JoomlaGenPackage.DATABASE_TABLE__GEN_CLASS:
				if (resolve) return getGenClass();
				return basicGetGenClass();
			case JoomlaGenPackage.DATABASE_TABLE__COLUMNS:
				return getColumns();
			case JoomlaGenPackage.DATABASE_TABLE__FOREIGN_KEYS:
				return getForeignKeys();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JoomlaGenPackage.DATABASE_TABLE__NAME:
				setName((String)newValue);
				return;
			case JoomlaGenPackage.DATABASE_TABLE__GEN_CLASS:
				setGenClass((GenClass)newValue);
				return;
			case JoomlaGenPackage.DATABASE_TABLE__COLUMNS:
				getColumns().clear();
				getColumns().addAll((Collection<? extends GenAttribute>)newValue);
				return;
			case JoomlaGenPackage.DATABASE_TABLE__FOREIGN_KEYS:
				getForeignKeys().clear();
				getForeignKeys().addAll((Collection<? extends GenReference>)newValue);
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
			case JoomlaGenPackage.DATABASE_TABLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case JoomlaGenPackage.DATABASE_TABLE__GEN_CLASS:
				setGenClass((GenClass)null);
				return;
			case JoomlaGenPackage.DATABASE_TABLE__COLUMNS:
				getColumns().clear();
				return;
			case JoomlaGenPackage.DATABASE_TABLE__FOREIGN_KEYS:
				getForeignKeys().clear();
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
			case JoomlaGenPackage.DATABASE_TABLE__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case JoomlaGenPackage.DATABASE_TABLE__GEN_CLASS:
				return genClass != null;
			case JoomlaGenPackage.DATABASE_TABLE__COLUMNS:
				return columns != null && !columns.isEmpty();
			case JoomlaGenPackage.DATABASE_TABLE__FOREIGN_KEYS:
				return foreignKeys != null && !foreignKeys.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DatabaseTableImpl
