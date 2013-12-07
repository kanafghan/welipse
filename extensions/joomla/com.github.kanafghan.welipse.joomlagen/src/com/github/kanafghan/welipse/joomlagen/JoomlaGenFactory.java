/**
 */
package com.github.kanafghan.welipse.joomlagen;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenPackage
 * @generated
 */
public interface JoomlaGenFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JoomlaGenFactory eINSTANCE = com.github.kanafghan.welipse.joomlagen.impl.JoomlaGenFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	JoomlaGenModel createJoomlaGenModel();

	/**
	 * Returns a new object of class '<em>Gen Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Package</em>'.
	 * @generated
	 */
	GenPackage createGenPackage();

	/**
	 * Returns a new object of class '<em>Gen Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Class</em>'.
	 * @generated
	 */
	GenClass createGenClass();

	/**
	 * Returns a new object of class '<em>Gen Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Attribute</em>'.
	 * @generated
	 */
	GenAttribute createGenAttribute();

	/**
	 * Returns a new object of class '<em>Gen Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Reference</em>'.
	 * @generated
	 */
	GenReference createGenReference();

	/**
	 * Returns a new object of class '<em>Database Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Database Table</em>'.
	 * @generated
	 */
	DatabaseTable createDatabaseTable();

	/**
	 * Returns a new object of class '<em>Gen Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Operation</em>'.
	 * @generated
	 */
	GenOperation createGenOperation();

	/**
	 * Returns a new object of class '<em>Gen Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Parameter</em>'.
	 * @generated
	 */
	GenParameter createGenParameter();

	/**
	 * Returns a new object of class '<em>Gen Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Data Type</em>'.
	 * @generated
	 */
	GenDataType createGenDataType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	JoomlaGenPackage getJoomlaGenPackage();

} //JoomlaGenFactory
