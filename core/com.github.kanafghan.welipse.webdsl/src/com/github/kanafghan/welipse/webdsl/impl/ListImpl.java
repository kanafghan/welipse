/**
 */
package com.github.kanafghan.welipse.webdsl.impl;

import com.github.kanafghan.welipse.webdsl.Expression;
import com.github.kanafghan.welipse.webdsl.List;
import com.github.kanafghan.welipse.webdsl.PageElement;
import com.github.kanafghan.welipse.webdsl.VariableDeclaration;
import com.github.kanafghan.welipse.webdsl.WebDSLPackage;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
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
 *   <li>{@link com.github.kanafghan.welipse.webdsl.impl.ListImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.webdsl.impl.ListImpl#getCollection <em>Collection</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.webdsl.impl.ListImpl#getIteratorVariable <em>Iterator Variable</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.webdsl.impl.ListImpl#getVariable <em>Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ListImpl extends PresentationElementImpl implements List {
	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<PageElement> elements;

	/**
	 * The cached value of the '{@link #getCollection() <em>Collection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollection()
	 * @generated
	 * @ordered
	 */
	protected Expression collection;

	/**
	 * The cached value of the '{@link #getIteratorVariable() <em>Iterator Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIteratorVariable()
	 * @generated
	 * @ordered
	 */
	protected VariableDeclaration iteratorVariable;

	/**
	 * The default value of the '{@link #getVariable() <em>Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected static final String VARIABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected String variable = VARIABLE_EDEFAULT;

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
	public EList<PageElement> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<PageElement>(PageElement.class, this, WebDSLPackage.LIST__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getCollection() {
		return collection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCollection(Expression newCollection, NotificationChain msgs) {
		Expression oldCollection = collection;
		collection = newCollection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebDSLPackage.LIST__COLLECTION, oldCollection, newCollection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollection(Expression newCollection) {
		if (newCollection != collection) {
			NotificationChain msgs = null;
			if (collection != null)
				msgs = ((InternalEObject)collection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebDSLPackage.LIST__COLLECTION, null, msgs);
			if (newCollection != null)
				msgs = ((InternalEObject)newCollection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebDSLPackage.LIST__COLLECTION, null, msgs);
			msgs = basicSetCollection(newCollection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebDSLPackage.LIST__COLLECTION, newCollection, newCollection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDeclaration getIteratorVariable() {
		return iteratorVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIteratorVariable(VariableDeclaration newIteratorVariable, NotificationChain msgs) {
		VariableDeclaration oldIteratorVariable = iteratorVariable;
		iteratorVariable = newIteratorVariable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebDSLPackage.LIST__ITERATOR_VARIABLE, oldIteratorVariable, newIteratorVariable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIteratorVariable(VariableDeclaration newIteratorVariable) {
		if (newIteratorVariable != iteratorVariable) {
			NotificationChain msgs = null;
			if (iteratorVariable != null)
				msgs = ((InternalEObject)iteratorVariable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebDSLPackage.LIST__ITERATOR_VARIABLE, null, msgs);
			if (newIteratorVariable != null)
				msgs = ((InternalEObject)newIteratorVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebDSLPackage.LIST__ITERATOR_VARIABLE, null, msgs);
			msgs = basicSetIteratorVariable(newIteratorVariable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebDSLPackage.LIST__ITERATOR_VARIABLE, newIteratorVariable, newIteratorVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVariable() {
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariable(String newVariable) {
		String oldVariable = variable;
		variable = newVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebDSLPackage.LIST__VARIABLE, oldVariable, variable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebDSLPackage.LIST__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
			case WebDSLPackage.LIST__COLLECTION:
				return basicSetCollection(null, msgs);
			case WebDSLPackage.LIST__ITERATOR_VARIABLE:
				return basicSetIteratorVariable(null, msgs);
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
			case WebDSLPackage.LIST__ELEMENTS:
				return getElements();
			case WebDSLPackage.LIST__COLLECTION:
				return getCollection();
			case WebDSLPackage.LIST__ITERATOR_VARIABLE:
				return getIteratorVariable();
			case WebDSLPackage.LIST__VARIABLE:
				return getVariable();
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
			case WebDSLPackage.LIST__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends PageElement>)newValue);
				return;
			case WebDSLPackage.LIST__COLLECTION:
				setCollection((Expression)newValue);
				return;
			case WebDSLPackage.LIST__ITERATOR_VARIABLE:
				setIteratorVariable((VariableDeclaration)newValue);
				return;
			case WebDSLPackage.LIST__VARIABLE:
				setVariable((String)newValue);
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
			case WebDSLPackage.LIST__ELEMENTS:
				getElements().clear();
				return;
			case WebDSLPackage.LIST__COLLECTION:
				setCollection((Expression)null);
				return;
			case WebDSLPackage.LIST__ITERATOR_VARIABLE:
				setIteratorVariable((VariableDeclaration)null);
				return;
			case WebDSLPackage.LIST__VARIABLE:
				setVariable(VARIABLE_EDEFAULT);
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
			case WebDSLPackage.LIST__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case WebDSLPackage.LIST__COLLECTION:
				return collection != null;
			case WebDSLPackage.LIST__ITERATOR_VARIABLE:
				return iteratorVariable != null;
			case WebDSLPackage.LIST__VARIABLE:
				return VARIABLE_EDEFAULT == null ? variable != null : !VARIABLE_EDEFAULT.equals(variable);
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
		result.append(" (variable: ");
		result.append(variable);
		result.append(')');
		return result.toString();
	}

} //ListImpl
