/**
 */
package com.github.kanafghan.welipse.webdsl.impl;

import com.github.kanafghan.welipse.webdsl.Action;
import com.github.kanafghan.welipse.webdsl.Expression;
import com.github.kanafghan.welipse.webdsl.Submit;
import com.github.kanafghan.welipse.webdsl.WebDSLPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Submit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.kanafghan.welipse.webdsl.impl.SubmitImpl#getAction <em>Action</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.webdsl.impl.SubmitImpl#getPerformer <em>Performer</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.webdsl.impl.SubmitImpl#getValidator <em>Validator</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.webdsl.impl.SubmitImpl#getPerformerExpression <em>Performer Expression</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.webdsl.impl.SubmitImpl#getValidatorExpression <em>Validator Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class SubmitImpl extends ButtonImpl implements Submit {
	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected Action action;

	/**
	 * The cached value of the '{@link #getPerformer() <em>Performer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformer()
	 * @generated
	 * @ordered
	 */
	protected Expression performer;

	/**
	 * The cached value of the '{@link #getValidator() <em>Validator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidator()
	 * @generated
	 * @ordered
	 */
	protected Expression validator;

	/**
	 * The default value of the '{@link #getPerformerExpression() <em>Performer Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformerExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String PERFORMER_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPerformerExpression() <em>Performer Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformerExpression()
	 * @generated
	 * @ordered
	 */
	protected String performerExpression = PERFORMER_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getValidatorExpression() <em>Validator Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidatorExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATOR_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValidatorExpression() <em>Validator Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidatorExpression()
	 * @generated
	 * @ordered
	 */
	protected String validatorExpression = VALIDATOR_EXPRESSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubmitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebDSLPackage.Literals.SUBMIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAction(Action newAction, NotificationChain msgs) {
		Action oldAction = action;
		action = newAction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebDSLPackage.SUBMIT__ACTION, oldAction, newAction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(Action newAction) {
		if (newAction != action) {
			NotificationChain msgs = null;
			if (action != null)
				msgs = ((InternalEObject)action).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebDSLPackage.SUBMIT__ACTION, null, msgs);
			if (newAction != null)
				msgs = ((InternalEObject)newAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebDSLPackage.SUBMIT__ACTION, null, msgs);
			msgs = basicSetAction(newAction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebDSLPackage.SUBMIT__ACTION, newAction, newAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getPerformer() {
		return performer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerformer(Expression newPerformer, NotificationChain msgs) {
		Expression oldPerformer = performer;
		performer = newPerformer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebDSLPackage.SUBMIT__PERFORMER, oldPerformer, newPerformer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerformer(Expression newPerformer) {
		if (newPerformer != performer) {
			NotificationChain msgs = null;
			if (performer != null)
				msgs = ((InternalEObject)performer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebDSLPackage.SUBMIT__PERFORMER, null, msgs);
			if (newPerformer != null)
				msgs = ((InternalEObject)newPerformer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebDSLPackage.SUBMIT__PERFORMER, null, msgs);
			msgs = basicSetPerformer(newPerformer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebDSLPackage.SUBMIT__PERFORMER, newPerformer, newPerformer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getValidator() {
		return validator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValidator(Expression newValidator, NotificationChain msgs) {
		Expression oldValidator = validator;
		validator = newValidator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebDSLPackage.SUBMIT__VALIDATOR, oldValidator, newValidator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidator(Expression newValidator) {
		if (newValidator != validator) {
			NotificationChain msgs = null;
			if (validator != null)
				msgs = ((InternalEObject)validator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebDSLPackage.SUBMIT__VALIDATOR, null, msgs);
			if (newValidator != null)
				msgs = ((InternalEObject)newValidator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebDSLPackage.SUBMIT__VALIDATOR, null, msgs);
			msgs = basicSetValidator(newValidator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebDSLPackage.SUBMIT__VALIDATOR, newValidator, newValidator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPerformerExpression() {
		return performerExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerformerExpression(String newPerformerExpression) {
		String oldPerformerExpression = performerExpression;
		performerExpression = newPerformerExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebDSLPackage.SUBMIT__PERFORMER_EXPRESSION, oldPerformerExpression, performerExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValidatorExpression() {
		return validatorExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidatorExpression(String newValidatorExpression) {
		String oldValidatorExpression = validatorExpression;
		validatorExpression = newValidatorExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebDSLPackage.SUBMIT__VALIDATOR_EXPRESSION, oldValidatorExpression, validatorExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebDSLPackage.SUBMIT__ACTION:
				return basicSetAction(null, msgs);
			case WebDSLPackage.SUBMIT__PERFORMER:
				return basicSetPerformer(null, msgs);
			case WebDSLPackage.SUBMIT__VALIDATOR:
				return basicSetValidator(null, msgs);
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
			case WebDSLPackage.SUBMIT__ACTION:
				return getAction();
			case WebDSLPackage.SUBMIT__PERFORMER:
				return getPerformer();
			case WebDSLPackage.SUBMIT__VALIDATOR:
				return getValidator();
			case WebDSLPackage.SUBMIT__PERFORMER_EXPRESSION:
				return getPerformerExpression();
			case WebDSLPackage.SUBMIT__VALIDATOR_EXPRESSION:
				return getValidatorExpression();
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
			case WebDSLPackage.SUBMIT__ACTION:
				setAction((Action)newValue);
				return;
			case WebDSLPackage.SUBMIT__PERFORMER:
				setPerformer((Expression)newValue);
				return;
			case WebDSLPackage.SUBMIT__VALIDATOR:
				setValidator((Expression)newValue);
				return;
			case WebDSLPackage.SUBMIT__PERFORMER_EXPRESSION:
				setPerformerExpression((String)newValue);
				return;
			case WebDSLPackage.SUBMIT__VALIDATOR_EXPRESSION:
				setValidatorExpression((String)newValue);
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
			case WebDSLPackage.SUBMIT__ACTION:
				setAction((Action)null);
				return;
			case WebDSLPackage.SUBMIT__PERFORMER:
				setPerformer((Expression)null);
				return;
			case WebDSLPackage.SUBMIT__VALIDATOR:
				setValidator((Expression)null);
				return;
			case WebDSLPackage.SUBMIT__PERFORMER_EXPRESSION:
				setPerformerExpression(PERFORMER_EXPRESSION_EDEFAULT);
				return;
			case WebDSLPackage.SUBMIT__VALIDATOR_EXPRESSION:
				setValidatorExpression(VALIDATOR_EXPRESSION_EDEFAULT);
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
			case WebDSLPackage.SUBMIT__ACTION:
				return action != null;
			case WebDSLPackage.SUBMIT__PERFORMER:
				return performer != null;
			case WebDSLPackage.SUBMIT__VALIDATOR:
				return validator != null;
			case WebDSLPackage.SUBMIT__PERFORMER_EXPRESSION:
				return PERFORMER_EXPRESSION_EDEFAULT == null ? performerExpression != null : !PERFORMER_EXPRESSION_EDEFAULT.equals(performerExpression);
			case WebDSLPackage.SUBMIT__VALIDATOR_EXPRESSION:
				return VALIDATOR_EXPRESSION_EDEFAULT == null ? validatorExpression != null : !VALIDATOR_EXPRESSION_EDEFAULT.equals(validatorExpression);
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
		result.append(" (performerExpression: ");
		result.append(performerExpression);
		result.append(", validatorExpression: ");
		result.append(validatorExpression);
		result.append(')');
		return result.toString();
	}

} //SubmitImpl
