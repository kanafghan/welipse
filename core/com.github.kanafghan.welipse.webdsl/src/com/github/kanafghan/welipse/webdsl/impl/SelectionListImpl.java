/**
 */
package com.github.kanafghan.welipse.webdsl.impl;

import com.github.kanafghan.welipse.webdsl.Expression;
import com.github.kanafghan.welipse.webdsl.SelectionList;
import com.github.kanafghan.welipse.webdsl.SelectionListRendering;
import com.github.kanafghan.welipse.webdsl.WebDSLPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Selection List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.kanafghan.welipse.webdsl.impl.SelectionListImpl#getRendering <em>Rendering</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.webdsl.impl.SelectionListImpl#isIsMultiple <em>Is Multiple</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.webdsl.impl.SelectionListImpl#getOptions <em>Options</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.webdsl.impl.SelectionListImpl#getOptionsExpression <em>Options Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SelectionListImpl extends InputImpl implements SelectionList {
	/**
	 * The default value of the '{@link #getRendering() <em>Rendering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRendering()
	 * @generated
	 * @ordered
	 */
	protected static final SelectionListRendering RENDERING_EDEFAULT = SelectionListRendering.DROP_DOWN;

	/**
	 * The cached value of the '{@link #getRendering() <em>Rendering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRendering()
	 * @generated
	 * @ordered
	 */
	protected SelectionListRendering rendering = RENDERING_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsMultiple() <em>Is Multiple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMultiple()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_MULTIPLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsMultiple() <em>Is Multiple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMultiple()
	 * @generated
	 * @ordered
	 */
	protected boolean isMultiple = IS_MULTIPLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOptions() <em>Options</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptions()
	 * @generated
	 * @ordered
	 */
	protected Expression options;

	/**
	 * The default value of the '{@link #getOptionsExpression() <em>Options Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionsExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String OPTIONS_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOptionsExpression() <em>Options Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionsExpression()
	 * @generated
	 * @ordered
	 */
	protected String optionsExpression = OPTIONS_EXPRESSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectionListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebDSLPackage.Literals.SELECTION_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectionListRendering getRendering() {
		return rendering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRendering(SelectionListRendering newRendering) {
		SelectionListRendering oldRendering = rendering;
		rendering = newRendering == null ? RENDERING_EDEFAULT : newRendering;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebDSLPackage.SELECTION_LIST__RENDERING, oldRendering, rendering));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsMultiple() {
		return isMultiple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMultiple(boolean newIsMultiple) {
		boolean oldIsMultiple = isMultiple;
		isMultiple = newIsMultiple;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebDSLPackage.SELECTION_LIST__IS_MULTIPLE, oldIsMultiple, isMultiple));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getOptions() {
		return options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOptions(Expression newOptions, NotificationChain msgs) {
		Expression oldOptions = options;
		options = newOptions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebDSLPackage.SELECTION_LIST__OPTIONS, oldOptions, newOptions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptions(Expression newOptions) {
		if (newOptions != options) {
			NotificationChain msgs = null;
			if (options != null)
				msgs = ((InternalEObject)options).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebDSLPackage.SELECTION_LIST__OPTIONS, null, msgs);
			if (newOptions != null)
				msgs = ((InternalEObject)newOptions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebDSLPackage.SELECTION_LIST__OPTIONS, null, msgs);
			msgs = basicSetOptions(newOptions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebDSLPackage.SELECTION_LIST__OPTIONS, newOptions, newOptions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOptionsExpression() {
		return optionsExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptionsExpression(String newOptionsExpression) {
		String oldOptionsExpression = optionsExpression;
		optionsExpression = newOptionsExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebDSLPackage.SELECTION_LIST__OPTIONS_EXPRESSION, oldOptionsExpression, optionsExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebDSLPackage.SELECTION_LIST__OPTIONS:
				return basicSetOptions(null, msgs);
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
			case WebDSLPackage.SELECTION_LIST__RENDERING:
				return getRendering();
			case WebDSLPackage.SELECTION_LIST__IS_MULTIPLE:
				return isIsMultiple();
			case WebDSLPackage.SELECTION_LIST__OPTIONS:
				return getOptions();
			case WebDSLPackage.SELECTION_LIST__OPTIONS_EXPRESSION:
				return getOptionsExpression();
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
			case WebDSLPackage.SELECTION_LIST__RENDERING:
				setRendering((SelectionListRendering)newValue);
				return;
			case WebDSLPackage.SELECTION_LIST__IS_MULTIPLE:
				setIsMultiple((Boolean)newValue);
				return;
			case WebDSLPackage.SELECTION_LIST__OPTIONS:
				setOptions((Expression)newValue);
				return;
			case WebDSLPackage.SELECTION_LIST__OPTIONS_EXPRESSION:
				setOptionsExpression((String)newValue);
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
			case WebDSLPackage.SELECTION_LIST__RENDERING:
				setRendering(RENDERING_EDEFAULT);
				return;
			case WebDSLPackage.SELECTION_LIST__IS_MULTIPLE:
				setIsMultiple(IS_MULTIPLE_EDEFAULT);
				return;
			case WebDSLPackage.SELECTION_LIST__OPTIONS:
				setOptions((Expression)null);
				return;
			case WebDSLPackage.SELECTION_LIST__OPTIONS_EXPRESSION:
				setOptionsExpression(OPTIONS_EXPRESSION_EDEFAULT);
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
			case WebDSLPackage.SELECTION_LIST__RENDERING:
				return rendering != RENDERING_EDEFAULT;
			case WebDSLPackage.SELECTION_LIST__IS_MULTIPLE:
				return isMultiple != IS_MULTIPLE_EDEFAULT;
			case WebDSLPackage.SELECTION_LIST__OPTIONS:
				return options != null;
			case WebDSLPackage.SELECTION_LIST__OPTIONS_EXPRESSION:
				return OPTIONS_EXPRESSION_EDEFAULT == null ? optionsExpression != null : !OPTIONS_EXPRESSION_EDEFAULT.equals(optionsExpression);
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
		result.append(" (rendering: ");
		result.append(rendering);
		result.append(", isMultiple: ");
		result.append(isMultiple);
		result.append(", optionsExpression: ");
		result.append(optionsExpression);
		result.append(')');
		return result.toString();
	}

} //SelectionListImpl
