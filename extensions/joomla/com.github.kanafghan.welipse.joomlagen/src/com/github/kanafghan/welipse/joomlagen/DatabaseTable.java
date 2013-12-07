/**
 */
package com.github.kanafghan.welipse.joomlagen;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Database Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.DatabaseTable#getName <em>Name</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.DatabaseTable#getGenClass <em>Gen Class</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.DatabaseTable#getColumns <em>Columns</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.DatabaseTable#getForeignKeys <em>Foreign Keys</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenPackage#getDatabaseTable()
 * @model
 * @generated
 */
public interface DatabaseTable extends EObject {
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
	 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenPackage#getDatabaseTable_Name()
	 * @model transient="true" volatile="true" derived="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.joomlagen.DatabaseTable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Gen Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Class</em>' reference.
	 * @see #setGenClass(GenClass)
	 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenPackage#getDatabaseTable_GenClass()
	 * @model
	 * @generated
	 */
	GenClass getGenClass();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.joomlagen.DatabaseTable#getGenClass <em>Gen Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Class</em>' reference.
	 * @see #getGenClass()
	 * @generated
	 */
	void setGenClass(GenClass value);

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' reference list.
	 * The list contents are of type {@link com.github.kanafghan.welipse.joomlagen.GenAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' reference list.
	 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenPackage#getDatabaseTable_Columns()
	 * @model
	 * @generated
	 */
	EList<GenAttribute> getColumns();

	/**
	 * Returns the value of the '<em><b>Foreign Keys</b></em>' reference list.
	 * The list contents are of type {@link com.github.kanafghan.welipse.joomlagen.GenReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Foreign Keys</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign Keys</em>' reference list.
	 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenPackage#getDatabaseTable_ForeignKeys()
	 * @model
	 * @generated
	 */
	EList<GenReference> getForeignKeys();

} // DatabaseTable
