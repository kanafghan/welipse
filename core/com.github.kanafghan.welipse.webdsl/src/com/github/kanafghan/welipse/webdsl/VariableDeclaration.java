/**
 */
package com.github.kanafghan.welipse.webdsl;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.kanafghan.welipse.webdsl.VariableDeclaration#getVar <em>Var</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.webdsl.VariableDeclaration#getType <em>Type</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.webdsl.VariableDeclaration#getClassifier <em>Classifier</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.webdsl.VariableDeclaration#getDeclaration <em>Declaration</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.kanafghan.welipse.webdsl.WebDSLPackage#getVariableDeclaration()
 * @model abstract="true"
 * @generated
 */
public interface VariableDeclaration extends EObject {
	/**
	 * Returns the value of the '<em><b>Var</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Var</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var</em>' attribute.
	 * @see #setVar(String)
	 * @see com.github.kanafghan.welipse.webdsl.WebDSLPackage#getVariableDeclaration_Var()
	 * @model required="true"
	 * @generated
	 */
	String getVar();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.webdsl.VariableDeclaration#getVar <em>Var</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var</em>' attribute.
	 * @see #getVar()
	 * @generated
	 */
	void setVar(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(EClassifier)
	 * @see com.github.kanafghan.welipse.webdsl.WebDSLPackage#getVariableDeclaration_Type()
	 * @model
	 * @generated
	 */
	EClassifier getType();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.webdsl.VariableDeclaration#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(EClassifier value);

	/**
	 * Returns the value of the '<em><b>Classifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classifier</em>' attribute.
	 * @see #setClassifier(String)
	 * @see com.github.kanafghan.welipse.webdsl.WebDSLPackage#getVariableDeclaration_Classifier()
	 * @model
	 * @generated
	 */
	String getClassifier();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.webdsl.VariableDeclaration#getClassifier <em>Classifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classifier</em>' attribute.
	 * @see #getClassifier()
	 * @generated
	 */
	void setClassifier(String value);

	/**
	 * Returns the value of the '<em><b>Declaration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declaration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declaration</em>' attribute.
	 * @see #setDeclaration(String)
	 * @see com.github.kanafghan.welipse.webdsl.WebDSLPackage#getVariableDeclaration_Declaration()
	 * @model
	 * @generated
	 */
	String getDeclaration();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.webdsl.VariableDeclaration#getDeclaration <em>Declaration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declaration</em>' attribute.
	 * @see #getDeclaration()
	 * @generated
	 */
	void setDeclaration(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void initialize(Page page);

} // VariableDeclaration
