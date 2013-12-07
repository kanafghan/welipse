/**
 */
package com.github.kanafghan.welipse.joomlagen;

import org.eclipse.emf.ecore.EStructuralFeature;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.GenFeature#getGenClass <em>Gen Class</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.GenFeature#getName <em>Name</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.GenFeature#getFormFieldLabel <em>Form Field Label</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.GenFeature#getFormFieldDescription <em>Form Field Description</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.GenFeature#isNullable <em>Nullable</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenPackage#getGenFeature()
 * @model abstract="true"
 * @generated
 */
public interface GenFeature extends GenTypedElement {
	/**
	 * Returns the value of the '<em><b>Gen Class</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.github.kanafghan.welipse.joomlagen.GenClass#getGenFeatures <em>Gen Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Class</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Class</em>' container reference.
	 * @see #setGenClass(GenClass)
	 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenPackage#getGenFeature_GenClass()
	 * @see com.github.kanafghan.welipse.joomlagen.GenClass#getGenFeatures
	 * @model opposite="genFeatures" required="true" transient="false"
	 * @generated
	 */
	GenClass getGenClass();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.joomlagen.GenFeature#getGenClass <em>Gen Class</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Class</em>' container reference.
	 * @see #getGenClass()
	 * @generated
	 */
	void setGenClass(GenClass value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenPackage#getGenFeature_Name()
	 * @model transient="true" volatile="true" derived="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.joomlagen.GenFeature#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Form Field Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Form Field Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Form Field Label</em>' attribute.
	 * @see #setFormFieldLabel(String)
	 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenPackage#getGenFeature_FormFieldLabel()
	 * @model
	 * @generated
	 */
	String getFormFieldLabel();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.joomlagen.GenFeature#getFormFieldLabel <em>Form Field Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Form Field Label</em>' attribute.
	 * @see #getFormFieldLabel()
	 * @generated
	 */
	void setFormFieldLabel(String value);

	/**
	 * Returns the value of the '<em><b>Form Field Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Form Field Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Form Field Description</em>' attribute.
	 * @see #setFormFieldDescription(String)
	 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenPackage#getGenFeature_FormFieldDescription()
	 * @model
	 * @generated
	 */
	String getFormFieldDescription();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.joomlagen.GenFeature#getFormFieldDescription <em>Form Field Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Form Field Description</em>' attribute.
	 * @see #getFormFieldDescription()
	 * @generated
	 */
	void setFormFieldDescription(String value);

	/**
	 * Returns the value of the '<em><b>Nullable</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nullable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nullable</em>' attribute.
	 * @see #setNullable(boolean)
	 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenPackage#getGenFeature_Nullable()
	 * @model default="true"
	 * @generated
	 */
	boolean isNullable();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.joomlagen.GenFeature#isNullable <em>Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nullable</em>' attribute.
	 * @see #isNullable()
	 * @generated
	 */
	void setNullable(boolean value);
	
	EStructuralFeature getEcoreFeature();

} // GenFeature
