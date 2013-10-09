/**
 */
package com.github.kanafghan.welipse.webdsl.impl;

import com.github.kanafghan.welipse.webdsl.List;
import com.github.kanafghan.welipse.webdsl.PageElement;
import com.github.kanafghan.welipse.webdsl.WebDSLPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.kanafghan.welipse.webdsl.impl.ListImpl#getItem <em>Item</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.webdsl.impl.ListImpl#getCollectionProvider <em>Collection Provider</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.webdsl.impl.ListImpl#getType <em>Type</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.webdsl.impl.ListImpl#getContent <em>Content</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ListImpl extends PresentationElementImpl implements List {
	/**
	 * The default value of the '{@link #getItem() <em>Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItem()
	 * @generated
	 * @ordered
	 */
	protected static final String ITEM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getItem() <em>Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItem()
	 * @generated
	 * @ordered
	 */
	protected String item = ITEM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCollectionProvider() <em>Collection Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollectionProvider()
	 * @generated
	 * @ordered
	 */
	protected EOperation collectionProvider;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EClass type;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected EList<PageElement> content;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebDSLPackage.Literals.LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getItem() {
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItem(String newItem) {
		String oldItem = item;
		item = newItem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebDSLPackage.LIST__ITEM, oldItem, item));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCollectionProvider() {
		if (collectionProvider != null && collectionProvider.eIsProxy()) {
			InternalEObject oldCollectionProvider = (InternalEObject)collectionProvider;
			collectionProvider = (EOperation)eResolveProxy(oldCollectionProvider);
			if (collectionProvider != oldCollectionProvider) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebDSLPackage.LIST__COLLECTION_PROVIDER, oldCollectionProvider, collectionProvider));
			}
		}
		return collectionProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation basicGetCollectionProvider() {
		return collectionProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollectionProvider(EOperation newCollectionProvider) {
		EOperation oldCollectionProvider = collectionProvider;
		collectionProvider = newCollectionProvider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebDSLPackage.LIST__COLLECTION_PROVIDER, oldCollectionProvider, collectionProvider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (EClass)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebDSLPackage.LIST__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(EClass newType) {
		EClass oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebDSLPackage.LIST__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PageElement> getContent() {
		if (content == null) {
			content = new EObjectContainmentEList<PageElement>(PageElement.class, this, WebDSLPackage.LIST__CONTENT);
		}
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebDSLPackage.LIST__CONTENT:
				return ((InternalEList<?>)getContent()).basicRemove(otherEnd, msgs);
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
			case WebDSLPackage.LIST__ITEM:
				return getItem();
			case WebDSLPackage.LIST__COLLECTION_PROVIDER:
				if (resolve) return getCollectionProvider();
				return basicGetCollectionProvider();
			case WebDSLPackage.LIST__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case WebDSLPackage.LIST__CONTENT:
				return getContent();
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
			case WebDSLPackage.LIST__ITEM:
				setItem((String)newValue);
				return;
			case WebDSLPackage.LIST__COLLECTION_PROVIDER:
				setCollectionProvider((EOperation)newValue);
				return;
			case WebDSLPackage.LIST__TYPE:
				setType((EClass)newValue);
				return;
			case WebDSLPackage.LIST__CONTENT:
				getContent().clear();
				getContent().addAll((Collection<? extends PageElement>)newValue);
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
			case WebDSLPackage.LIST__ITEM:
				setItem(ITEM_EDEFAULT);
				return;
			case WebDSLPackage.LIST__COLLECTION_PROVIDER:
				setCollectionProvider((EOperation)null);
				return;
			case WebDSLPackage.LIST__TYPE:
				setType((EClass)null);
				return;
			case WebDSLPackage.LIST__CONTENT:
				getContent().clear();
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
			case WebDSLPackage.LIST__ITEM:
				return ITEM_EDEFAULT == null ? item != null : !ITEM_EDEFAULT.equals(item);
			case WebDSLPackage.LIST__COLLECTION_PROVIDER:
				return collectionProvider != null;
			case WebDSLPackage.LIST__TYPE:
				return type != null;
			case WebDSLPackage.LIST__CONTENT:
				return content != null && !content.isEmpty();
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
		result.append(" (item: ");
		result.append(item);
		result.append(')');
		return result.toString();
	}

} //ListImpl
