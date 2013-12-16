/**
 */
package com.github.kanafghan.welipse.webdsl.impl;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.github.kanafghan.welipse.webdsl.Group;
import com.github.kanafghan.welipse.webdsl.List;
import com.github.kanafghan.welipse.webdsl.Page;
import com.github.kanafghan.welipse.webdsl.PageElement;
import com.github.kanafghan.welipse.webdsl.Parameter;
import com.github.kanafghan.welipse.webdsl.VariableDeclaration;
import com.github.kanafghan.welipse.webdsl.VariableExp;
import com.github.kanafghan.welipse.webdsl.VariableInitialization;
import com.github.kanafghan.welipse.webdsl.WebDSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Exp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.kanafghan.welipse.webdsl.impl.VariableExpImpl#getVar <em>Var</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.webdsl.impl.VariableExpImpl#getDeclaration <em>Declaration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableExpImpl extends ExpressionImpl implements VariableExp {
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
	 * The cached value of the '{@link #getDeclaration() <em>Declaration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclaration()
	 * @generated
	 * @ordered
	 */
	protected VariableDeclaration declaration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableExpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebDSLPackage.Literals.VARIABLE_EXP;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebDSLPackage.VARIABLE_EXP__VAR, oldVar, var));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDeclaration getDeclaration() {
		if (declaration != null && declaration.eIsProxy()) {
			InternalEObject oldDeclaration = (InternalEObject)declaration;
			declaration = (VariableDeclaration)eResolveProxy(oldDeclaration);
			if (declaration != oldDeclaration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebDSLPackage.VARIABLE_EXP__DECLARATION, oldDeclaration, declaration));
			}
		}
		return declaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDeclaration basicGetDeclaration() {
		return declaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeclaration(VariableDeclaration newDeclaration) {
		VariableDeclaration oldDeclaration = declaration;
		declaration = newDeclaration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebDSLPackage.VARIABLE_EXP__DECLARATION, oldDeclaration, declaration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebDSLPackage.VARIABLE_EXP__VAR:
				return getVar();
			case WebDSLPackage.VARIABLE_EXP__DECLARATION:
				if (resolve) return getDeclaration();
				return basicGetDeclaration();
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
			case WebDSLPackage.VARIABLE_EXP__VAR:
				setVar((String)newValue);
				return;
			case WebDSLPackage.VARIABLE_EXP__DECLARATION:
				setDeclaration((VariableDeclaration)newValue);
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
			case WebDSLPackage.VARIABLE_EXP__VAR:
				setVar(VAR_EDEFAULT);
				return;
			case WebDSLPackage.VARIABLE_EXP__DECLARATION:
				setDeclaration((VariableDeclaration)null);
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
			case WebDSLPackage.VARIABLE_EXP__VAR:
				return VAR_EDEFAULT == null ? var != null : !VAR_EDEFAULT.equals(var);
			case WebDSLPackage.VARIABLE_EXP__DECLARATION:
				return declaration != null;
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
		result.append(" (var: ");
		result.append(var);
		result.append(')');
		return result.toString();
	}

	/**
	 * @generated NOT
	 */
	@Override
	public EClassifier type() {
		VariableDeclaration decl = getDeclaration();
		if (decl != null) {
			return decl.getType();
		} else {
			throw new Error("The declaration of the variable '"+ getVar() +"' is not set. "
					+ "You must call the initialize() method first.");
		}
	}
	
	/**
	 * @generated NOT
	 */
	@Override
	public void initialize(Page page) {
		// Here we initialize the declaration of the variable
		// This is done by searching in the parameters or
		// variables of the page
		boolean found = false;
		// First we search in the parameters of the page
		EList<Parameter> params = page.getParameters();
		for (Parameter param : params) {
			if (param.getVar().equals(getVar())) {
				setDeclaration(param);
				found = true;
				break;
			}
		}
		
		// If we could not found it among the parameters
		// of the page we search in the variables of the page
		if (!found) {			
			EList<VariableInitialization> vars = page.getVariables();
			for (VariableInitialization var : vars) {
				if (var.getVar().equals(getVar())) {
					setDeclaration(var);
					found = true;
					break;
				}
			}
		}
		
		//TODO this is a fix to the context problem
		if (!found) {
			for (List list : getLists(page)) {
				VariableDeclaration variable = list.getIteratorVariable();
				if (variable != null && variable.getVar().equals(getVar())) {
					setDeclaration(variable);
					found = true;
					break;
				}
			}
		}
		
		// If we still have not found it, then it is not declared
		if (!found) {
			throw new Error("Variable '"+ getVar() +"' is not declared.");
		}
	}

	private java.util.List<List> getLists(Page page) {
		ArrayList<List> result = new ArrayList<List>();
		
		for (PageElement element : page.getElements()) {
			if (element instanceof List) {
				result.add((List) element);
			}
			result.addAll(getLists(element));
		}
		
		return result;
	}

	private Collection<? extends List> getLists(PageElement element) {
		ArrayList<List> result = new ArrayList<List>();
		if (element instanceof List) {
			for (PageElement elem : ((List) element).getElements()) {
				if (elem instanceof List) {
					result.add((List) elem);
				}
				result.addAll(getLists(elem));
			}
		} else if (element instanceof Group) {
			for (PageElement elem : ((Group) element).getElements()) {
				if (elem instanceof List) {
					result.add((List) elem);
				}
				result.addAll(getLists(elem));
			}
		}
		return result;
	}

} //VariableExpImpl
