/**
 */
package com.github.kanafghan.welipse.joomlagen;

import org.eclipse.emf.ecore.EAttribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.GenAttribute#getFormFieldType <em>Form Field Type</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.GenAttribute#getDatabaseColumnType <em>Database Column Type</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.GenAttribute#getEcoreAttribute <em>Ecore Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenPackage#getGenAttribute()
 * @model
 * @generated
 */
public interface GenAttribute extends GenFeature {
	/**
	 * Returns the value of the '<em><b>Form Field Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.github.kanafghan.welipse.joomlagen.FormFieldType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Form Field Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Form Field Type</em>' attribute.
	 * @see com.github.kanafghan.welipse.joomlagen.FormFieldType
	 * @see #setFormFieldType(FormFieldType)
	 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenPackage#getGenAttribute_FormFieldType()
	 * @model
	 * @generated
	 */
	FormFieldType getFormFieldType();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.joomlagen.GenAttribute#getFormFieldType <em>Form Field Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Form Field Type</em>' attribute.
	 * @see com.github.kanafghan.welipse.joomlagen.FormFieldType
	 * @see #getFormFieldType()
	 * @generated
	 */
	void setFormFieldType(FormFieldType value);

	/**
	 * Returns the value of the '<em><b>Database Column Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.github.kanafghan.welipse.joomlagen.DatabaseColumnType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database Column Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database Column Type</em>' attribute.
	 * @see com.github.kanafghan.welipse.joomlagen.DatabaseColumnType
	 * @see #setDatabaseColumnType(DatabaseColumnType)
	 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenPackage#getGenAttribute_DatabaseColumnType()
	 * @model
	 * @generated
	 */
	DatabaseColumnType getDatabaseColumnType();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.joomlagen.GenAttribute#getDatabaseColumnType <em>Database Column Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database Column Type</em>' attribute.
	 * @see com.github.kanafghan.welipse.joomlagen.DatabaseColumnType
	 * @see #getDatabaseColumnType()
	 * @generated
	 */
	void setDatabaseColumnType(DatabaseColumnType value);

	/**
	 * Returns the value of the '<em><b>Ecore Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ecore Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ecore Attribute</em>' reference.
	 * @see #setEcoreAttribute(EAttribute)
	 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenPackage#getGenAttribute_EcoreAttribute()
	 * @model required="true"
	 * @generated
	 */
	EAttribute getEcoreAttribute();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.joomlagen.GenAttribute#getEcoreAttribute <em>Ecore Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ecore Attribute</em>' reference.
	 * @see #getEcoreAttribute()
	 * @generated
	 */
	void setEcoreAttribute(EAttribute value);
	
	void initialize(EAttribute eAttribute);

} // GenAttribute
