/**
 */
package com.github.kanafghan.welipse.joomlagen;

import org.eclipse.emf.ecore.EParameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.GenParameter#getGenOperation <em>Gen Operation</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.GenParameter#getEcoreParameter <em>Ecore Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenPackage#getGenParameter()
 * @model
 * @generated
 */
public interface GenParameter extends GenTypedElement {
	/**
	 * Returns the value of the '<em><b>Gen Operation</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.github.kanafghan.welipse.joomlagen.GenOperation#getGenParameters <em>Gen Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Operation</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Operation</em>' container reference.
	 * @see #setGenOperation(GenOperation)
	 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenPackage#getGenParameter_GenOperation()
	 * @see com.github.kanafghan.welipse.joomlagen.GenOperation#getGenParameters
	 * @model opposite="genParameters" required="true" transient="false"
	 * @generated
	 */
	GenOperation getGenOperation();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.joomlagen.GenParameter#getGenOperation <em>Gen Operation</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Operation</em>' container reference.
	 * @see #getGenOperation()
	 * @generated
	 */
	void setGenOperation(GenOperation value);

	/**
	 * Returns the value of the '<em><b>Ecore Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ecore Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ecore Parameter</em>' reference.
	 * @see #setEcoreParameter(EParameter)
	 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenPackage#getGenParameter_EcoreParameter()
	 * @model required="true"
	 * @generated
	 */
	EParameter getEcoreParameter();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.joomlagen.GenParameter#getEcoreParameter <em>Ecore Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ecore Parameter</em>' reference.
	 * @see #getEcoreParameter()
	 * @generated
	 */
	void setEcoreParameter(EParameter value);
	
	void initialize(EParameter eParameter);
	
	boolean reconcile();
	
	boolean reconcile(GenParameter oldGenParameterVersion);

} // GenParameter
