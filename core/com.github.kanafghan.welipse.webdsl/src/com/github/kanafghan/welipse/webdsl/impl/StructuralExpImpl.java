/**
 */
package com.github.kanafghan.welipse.webdsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.github.kanafghan.welipse.webdsl.Page;
import com.github.kanafghan.welipse.webdsl.StructuralExp;
import com.github.kanafghan.welipse.webdsl.VariableDeclaration;
import com.github.kanafghan.welipse.webdsl.VariableExp;
import com.github.kanafghan.welipse.webdsl.WebDSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structural Exp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.kanafghan.welipse.webdsl.impl.StructuralExpImpl#getFeature <em>Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StructuralExpImpl extends PropertyOperationImpl implements StructuralExp {
	/**
	 * The cached value of the '{@link #getFeature() <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeature()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature feature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructuralExpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebDSLPackage.Literals.STRUCTURAL_EXP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature getFeature() {
		if (feature != null && feature.eIsProxy()) {
			InternalEObject oldFeature = (InternalEObject)feature;
			feature = (EStructuralFeature)eResolveProxy(oldFeature);
			if (feature != oldFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebDSLPackage.STRUCTURAL_EXP__FEATURE, oldFeature, feature));
			}
		}
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature basicGetFeature() {
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeature(EStructuralFeature newFeature) {
		EStructuralFeature oldFeature = feature;
		feature = newFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebDSLPackage.STRUCTURAL_EXP__FEATURE, oldFeature, feature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebDSLPackage.STRUCTURAL_EXP__FEATURE:
				if (resolve) return getFeature();
				return basicGetFeature();
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
			case WebDSLPackage.STRUCTURAL_EXP__FEATURE:
				setFeature((EStructuralFeature)newValue);
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
			case WebDSLPackage.STRUCTURAL_EXP__FEATURE:
				setFeature((EStructuralFeature)null);
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
			case WebDSLPackage.STRUCTURAL_EXP__FEATURE:
				return feature != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * @generated NOT
	 */
	@Override
	public EClassifier type() {
		if (getFeature() != null) {			
			return getFeature().getEType();
		}
		return null;
	}

	@Override
	public void initialize(Page page) {
		// initialize the source first
		getSource().initialize(page);
		
		if (getSource() instanceof VariableExp) {
			VariableExp var = (VariableExp) getSource();
			VariableDeclaration declaration = var.getDeclaration();
			if (declaration != null) {				
				EClassifier type = declaration.getType();
				if (type != null) {
					if (type instanceof EClass) {
						EClass cls = (EClass) type;
						for (EStructuralFeature feature : cls.getEAllStructuralFeatures()) {
							if (feature.getName().equals(getIdentifier())) {
								setFeature(feature);
								break;
							}
						}
						
						if (getFeature() == null) {
							throw new Error("The type '"+ cls.getName() +"' has no attribute or reference '"
									+ getIdentifier() +"'.");
						}
					} else {
						throw new Error("The type of variable '"+ var.getVar() +"' is not EClass. "
								+ "It was expected to be EClass in order to find '"
								+ getIdentifier() +"'");
					}
				} else {
					throw new Error("The type of variable '"+ var.getVar() +"' is not set.");
				}
			} else {
				throw new Error("The declaration of variable '"+ var.getVar() 
						+"' is not set. It was not possible to determine its type.");
			}
		} else {
			throw new Error("The Source expression of structural expression must be variable expression, "
					+ "but got "+ getSource());
		}
	}

} //StructuralExpImpl
