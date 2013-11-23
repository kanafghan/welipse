/**
 */
package com.github.kanafghan.welipse.webdsl.impl;

import com.github.kanafghan.welipse.webdsl.ConstantExp;
import com.github.kanafghan.welipse.webdsl.Expression;
import com.github.kanafghan.welipse.webdsl.Image;
import com.github.kanafghan.welipse.webdsl.WebDSLPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.kanafghan.welipse.webdsl.impl.ImageImpl#isReferenced <em>Referenced</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.webdsl.impl.ImageImpl#getSource <em>Source</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.webdsl.impl.ImageImpl#isStatic <em>Static</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImageImpl extends PresentationElementImpl implements Image {
	/**
	 * The default value of the '{@link #isReferenced() <em>Referenced</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReferenced()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REFERENCED_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isReferenced() <em>Referenced</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReferenced()
	 * @generated
	 * @ordered
	 */
	protected boolean referenced = REFERENCED_EDEFAULT;
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Expression source;
	/**
	 * The default value of the '{@link #isStatic() <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStatic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STATIC_EDEFAULT = false;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebDSLPackage.Literals.IMAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReferenced() {
		return referenced;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenced(boolean newReferenced) {
		boolean oldReferenced = referenced;
		referenced = newReferenced;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebDSLPackage.IMAGE__REFERENCED, oldReferenced, referenced));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(Expression newSource, NotificationChain msgs) {
		Expression oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebDSLPackage.IMAGE__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Expression newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebDSLPackage.IMAGE__SOURCE, null, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebDSLPackage.IMAGE__SOURCE, null, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebDSLPackage.IMAGE__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isStatic() {
		if (getSource() instanceof ConstantExp) {
			return true;
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebDSLPackage.IMAGE__SOURCE:
				return basicSetSource(null, msgs);
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
			case WebDSLPackage.IMAGE__REFERENCED:
				return isReferenced();
			case WebDSLPackage.IMAGE__SOURCE:
				return getSource();
			case WebDSLPackage.IMAGE__STATIC:
				return isStatic();
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
			case WebDSLPackage.IMAGE__REFERENCED:
				setReferenced((Boolean)newValue);
				return;
			case WebDSLPackage.IMAGE__SOURCE:
				setSource((Expression)newValue);
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
			case WebDSLPackage.IMAGE__REFERENCED:
				setReferenced(REFERENCED_EDEFAULT);
				return;
			case WebDSLPackage.IMAGE__SOURCE:
				setSource((Expression)null);
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
			case WebDSLPackage.IMAGE__REFERENCED:
				return referenced != REFERENCED_EDEFAULT;
			case WebDSLPackage.IMAGE__SOURCE:
				return source != null;
			case WebDSLPackage.IMAGE__STATIC:
				return isStatic() != STATIC_EDEFAULT;
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
		result.append(" (referenced: ");
		result.append(referenced);
		result.append(')');
		return result.toString();
	}

} //ImageImpl
