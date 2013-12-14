/**
 */
package com.github.kanafghan.welipse.webdsl.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import com.github.kanafghan.welipse.webdsl.Page;
import com.github.kanafghan.welipse.webdsl.VariableDeclaration;
import com.github.kanafghan.welipse.webdsl.WebDSLPackage;
import com.github.kanafghan.welipse.webdsl.etc.ExpressionUtils;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.kanafghan.welipse.webdsl.impl.VariableDeclarationImpl#getVar <em>Var</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.webdsl.impl.VariableDeclarationImpl#getType <em>Type</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.webdsl.impl.VariableDeclarationImpl#getClassifier <em>Classifier</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.webdsl.impl.VariableDeclarationImpl#getDeclaration <em>Declaration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class VariableDeclarationImpl extends MinimalEObjectImpl.Container implements VariableDeclaration {
	/**
	 * The default value of the '{@link #getVar() <em>Var</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVar()
	 * @generated
	 * @ordered
	 */
	protected static final String VAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVar() <em>Var</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVar()
	 * @generated
	 * @ordered
	 */
	protected String var = VAR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EClassifier type;

	/**
	 * The default value of the '{@link #getClassifier() <em>Classifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifier()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASSIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassifier() <em>Classifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifier()
	 * @generated
	 * @ordered
	 */
	protected String classifier = CLASSIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeclaration() <em>Declaration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclaration()
	 * @generated
	 * @ordered
	 */
	protected static final String DECLARATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeclaration() <em>Declaration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclaration()
	 * @generated
	 * @ordered
	 */
	protected String declaration = DECLARATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebDSLPackage.Literals.VARIABLE_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVar() {
		return var;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVar(String newVar) {
		String oldVar = var;
		var = newVar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebDSLPackage.VARIABLE_DECLARATION__VAR, oldVar, var));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClassifier getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (EClassifier)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebDSLPackage.VARIABLE_DECLARATION__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClassifier basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(EClassifier newType) {
		EClassifier oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebDSLPackage.VARIABLE_DECLARATION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClassifier() {
		return classifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassifier(String newClassifier) {
		String oldClassifier = classifier;
		classifier = newClassifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebDSLPackage.VARIABLE_DECLARATION__CLASSIFIER, oldClassifier, classifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDeclaration() {
		return declaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeclaration(String newDeclaration) {
		String oldDeclaration = declaration;
		declaration = newDeclaration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebDSLPackage.VARIABLE_DECLARATION__DECLARATION, oldDeclaration, declaration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void initialize(Page page) {
		// We set the type of the variable using the given page
		// if the type is not an ECore primitive type
		if (!ExpressionUtils.isPrimitiveType(getClassifier())) {
			boolean found = false;
			Resource resource = page.eResource();
			if (resource != null) {
				ResourceSet rSet = resource.getResourceSet();
				for (Resource r : rSet.getResources()) {
					if (!r.getURI().equals(resource.getURI())) {
						if (r.isLoaded()) {
							TreeIterator<EObject> iterator = r.getAllContents();
							while (iterator.hasNext()) {
								EObject obj = iterator.next();
								if (obj instanceof EClassifier) {
									EClassifier cls = (EClassifier) obj;
									if (cls.getName().equals(getClassifier())) {
										setType(cls);
										found = true;
										break;
									}
								}
							}
						}
					}
					if (found) {
						break;
					}
				}
			}	
			if (!found) {
				throw new Error("Could not find '"+ getClassifier() +"' type in variable declaration '"
						+ getVar() +":"+ getClassifier() +"'.");
			}
		} else {
			EClassifier dataType = ExpressionUtils.getDataType(getClassifier());
			if (dataType != null) {				
				setType(dataType);
			} else {
				throw new Error("The primitive datatype '"+ getClassifier() +"' could not be created in "
						+"variable declaration '"+ getVar() +":"+ getClassifier() +"'.");
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebDSLPackage.VARIABLE_DECLARATION__VAR:
				return getVar();
			case WebDSLPackage.VARIABLE_DECLARATION__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case WebDSLPackage.VARIABLE_DECLARATION__CLASSIFIER:
				return getClassifier();
			case WebDSLPackage.VARIABLE_DECLARATION__DECLARATION:
				return getDeclaration();
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
			case WebDSLPackage.VARIABLE_DECLARATION__VAR:
				setVar((String)newValue);
				return;
			case WebDSLPackage.VARIABLE_DECLARATION__TYPE:
				setType((EClassifier)newValue);
				return;
			case WebDSLPackage.VARIABLE_DECLARATION__CLASSIFIER:
				setClassifier((String)newValue);
				return;
			case WebDSLPackage.VARIABLE_DECLARATION__DECLARATION:
				setDeclaration((String)newValue);
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
			case WebDSLPackage.VARIABLE_DECLARATION__VAR:
				setVar(VAR_EDEFAULT);
				return;
			case WebDSLPackage.VARIABLE_DECLARATION__TYPE:
				setType((EClassifier)null);
				return;
			case WebDSLPackage.VARIABLE_DECLARATION__CLASSIFIER:
				setClassifier(CLASSIFIER_EDEFAULT);
				return;
			case WebDSLPackage.VARIABLE_DECLARATION__DECLARATION:
				setDeclaration(DECLARATION_EDEFAULT);
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
			case WebDSLPackage.VARIABLE_DECLARATION__VAR:
				return VAR_EDEFAULT == null ? var != null : !VAR_EDEFAULT.equals(var);
			case WebDSLPackage.VARIABLE_DECLARATION__TYPE:
				return type != null;
			case WebDSLPackage.VARIABLE_DECLARATION__CLASSIFIER:
				return CLASSIFIER_EDEFAULT == null ? classifier != null : !CLASSIFIER_EDEFAULT.equals(classifier);
			case WebDSLPackage.VARIABLE_DECLARATION__DECLARATION:
				return DECLARATION_EDEFAULT == null ? declaration != null : !DECLARATION_EDEFAULT.equals(declaration);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case WebDSLPackage.VARIABLE_DECLARATION___INITIALIZE__PAGE:
				initialize((Page)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (var: ");
		result.append(var);
		result.append(", classifier: ");
		result.append(classifier);
		result.append(", declaration: ");
		result.append(declaration);
		result.append(')');
		return result.toString();
	}

} //VariableDeclarationImpl
