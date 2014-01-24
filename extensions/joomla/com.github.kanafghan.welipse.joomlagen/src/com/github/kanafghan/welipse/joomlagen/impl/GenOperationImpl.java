/**
 */
package com.github.kanafghan.welipse.joomlagen.impl;

import com.github.kanafghan.welipse.joomlagen.GenClass;
import com.github.kanafghan.welipse.joomlagen.GenOperation;
import com.github.kanafghan.welipse.joomlagen.GenParameter;
import com.github.kanafghan.welipse.joomlagen.JoomlaGenPackage;
import com.github.kanafghan.welipse.joomlagen.JoomlaGenFactory;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.impl.GenOperationImpl#getGenParameters <em>Gen Parameters</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.impl.GenOperationImpl#getGenClass <em>Gen Class</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.impl.GenOperationImpl#getEcoreOperation <em>Ecore Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenOperationImpl extends GenTypedElementImpl implements GenOperation {
	/**
	 * The cached value of the '{@link #getGenParameters() <em>Gen Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<GenParameter> genParameters;

	/**
	 * The cached value of the '{@link #getEcoreOperation() <em>Ecore Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcoreOperation()
	 * @generated
	 * @ordered
	 */
	protected EOperation ecoreOperation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JoomlaGenPackage.Literals.GEN_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenParameter> getGenParameters() {
		if (genParameters == null) {
			genParameters = new EObjectContainmentWithInverseEList<GenParameter>(GenParameter.class, this, JoomlaGenPackage.GEN_OPERATION__GEN_PARAMETERS, JoomlaGenPackage.GEN_PARAMETER__GEN_OPERATION);
		}
		return genParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenClass getGenClass() {
		if (eContainerFeatureID() != JoomlaGenPackage.GEN_OPERATION__GEN_CLASS) return null;
		return (GenClass)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenClass(GenClass newGenClass, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGenClass, JoomlaGenPackage.GEN_OPERATION__GEN_CLASS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenClass(GenClass newGenClass) {
		if (newGenClass != eInternalContainer() || (eContainerFeatureID() != JoomlaGenPackage.GEN_OPERATION__GEN_CLASS && newGenClass != null)) {
			if (EcoreUtil.isAncestor(this, newGenClass))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGenClass != null)
				msgs = ((InternalEObject)newGenClass).eInverseAdd(this, JoomlaGenPackage.GEN_CLASS__GEN_OPERATIONS, GenClass.class, msgs);
			msgs = basicSetGenClass(newGenClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JoomlaGenPackage.GEN_OPERATION__GEN_CLASS, newGenClass, newGenClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEcoreOperation() {
		if (ecoreOperation != null && ecoreOperation.eIsProxy()) {
			InternalEObject oldEcoreOperation = (InternalEObject)ecoreOperation;
			ecoreOperation = (EOperation)eResolveProxy(oldEcoreOperation);
			if (ecoreOperation != oldEcoreOperation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JoomlaGenPackage.GEN_OPERATION__ECORE_OPERATION, oldEcoreOperation, ecoreOperation));
			}
		}
		return ecoreOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation basicGetEcoreOperation() {
		return ecoreOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEcoreOperation(EOperation newEcoreOperation) {
		EOperation oldEcoreOperation = ecoreOperation;
		ecoreOperation = newEcoreOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JoomlaGenPackage.GEN_OPERATION__ECORE_OPERATION, oldEcoreOperation, ecoreOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JoomlaGenPackage.GEN_OPERATION__GEN_PARAMETERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGenParameters()).basicAdd(otherEnd, msgs);
			case JoomlaGenPackage.GEN_OPERATION__GEN_CLASS:
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
			case JoomlaGenPackage.GEN_OPERATION__GEN_PARAMETERS:
				return ((InternalEList<?>)getGenParameters()).basicRemove(otherEnd, msgs);
			case JoomlaGenPackage.GEN_OPERATION__GEN_CLASS:
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
			case JoomlaGenPackage.GEN_OPERATION__GEN_CLASS:
				return eInternalContainer().eInverseRemove(this, JoomlaGenPackage.GEN_CLASS__GEN_OPERATIONS, GenClass.class, msgs);
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
			case JoomlaGenPackage.GEN_OPERATION__GEN_PARAMETERS:
				return getGenParameters();
			case JoomlaGenPackage.GEN_OPERATION__GEN_CLASS:
				return getGenClass();
			case JoomlaGenPackage.GEN_OPERATION__ECORE_OPERATION:
				if (resolve) return getEcoreOperation();
				return basicGetEcoreOperation();
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
			case JoomlaGenPackage.GEN_OPERATION__GEN_PARAMETERS:
				getGenParameters().clear();
				getGenParameters().addAll((Collection<? extends GenParameter>)newValue);
				return;
			case JoomlaGenPackage.GEN_OPERATION__GEN_CLASS:
				setGenClass((GenClass)newValue);
				return;
			case JoomlaGenPackage.GEN_OPERATION__ECORE_OPERATION:
				setEcoreOperation((EOperation)newValue);
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
			case JoomlaGenPackage.GEN_OPERATION__GEN_PARAMETERS:
				getGenParameters().clear();
				return;
			case JoomlaGenPackage.GEN_OPERATION__GEN_CLASS:
				setGenClass((GenClass)null);
				return;
			case JoomlaGenPackage.GEN_OPERATION__ECORE_OPERATION:
				setEcoreOperation((EOperation)null);
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
			case JoomlaGenPackage.GEN_OPERATION__GEN_PARAMETERS:
				return genParameters != null && !genParameters.isEmpty();
			case JoomlaGenPackage.GEN_OPERATION__GEN_CLASS:
				return getGenClass() != null;
			case JoomlaGenPackage.GEN_OPERATION__ECORE_OPERATION:
				return ecoreOperation != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public void initialize(EOperation eOperation) {
		if (getEcoreOperation() != eOperation) {
			setEcoreOperation(eOperation);
		}
		
		List<EParameter> parameters = eOperation.getEParameters();
		LOOP: for (int i = 0; i < parameters.size(); ++i) {
			EParameter parameter = parameters.get(i);

			for (int j = 0; j < getGenParameters().size(); ++j) {
				GenParameter genParameter = getGenParameters().get(j);
				if (genParameter.getEcoreParameter() == parameter) {
					genParameter.initialize(parameter);
					if (i != j) {
						getGenParameters().move(i, j);
					}

					continue LOOP;
				}
			}

			GenParameter genParameter = JoomlaGenFactory.eINSTANCE.createGenParameter();
			getGenParameters().add(i, genParameter);
			genParameter.setGenOperation(this);
			genParameter.initialize(parameter);
		}
	}

	@Override
	public boolean reconcile(GenOperation oldGenOperationVersion) {
		if (getEcoreOperation().getName().equals(oldGenOperationVersion.getEcoreOperation().getName())
				&& getGenParameters().size() == oldGenOperationVersion.getGenParameters().size()) {
			
			//TODO we also need to check that old parameters have the same type as
			// the corresponding parameter
			
			for (int i=0; i < getGenParameters().size(); i++) {
				GenParameter genParameter = getGenParameters().get(i);
				GenParameter oldGenParameterVersion = oldGenOperationVersion.getGenParameters().get(i);
				genParameter.reconcile(oldGenParameterVersion);
			}
			return true;
		}
		return false;
	}

	@Override
	public boolean reconcile() {
		EOperation eOperation = getEcoreOperation();
		if (eOperation == null || eOperation.eIsProxy() || eOperation.eResource() == null) {
			return false;
		} else {
			for (Iterator<GenParameter> i = getGenParameters().iterator(); i.hasNext(); ) {
				GenParameter genParameter = i.next();
				if (!genParameter.reconcile()) {
					i.remove();
				}
			}
			return true;
		}
	}

	@Override
	public ETypedElement getEcoreTypedElement() {
		return getEcoreOperation();
	}

} //GenOperationImpl
