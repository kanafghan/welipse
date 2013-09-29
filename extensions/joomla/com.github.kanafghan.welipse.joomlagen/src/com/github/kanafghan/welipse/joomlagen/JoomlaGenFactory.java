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
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	JoomlaGenPackage getJoomlaGenPackage();

} //JoomlaGenFactory
