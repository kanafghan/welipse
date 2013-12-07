/**
 */
package com.github.kanafghan.welipse.joomlagen;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.GenClassifier#getGenPackage <em>Gen Package</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenPackage#getGenClassifier()
 * @model abstract="true"
 * @generated
 */
public interface GenClassifier extends EObject {
	/**
	 * Returns the value of the '<em><b>Gen Package</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.github.kanafghan.welipse.joomlagen.GenPackage#getGenClassifiers <em>Gen Classifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Package</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Package</em>' reference.
	 * @see #setGenPackage(GenPackage)
	 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenPackage#getGenClassifier_GenPackage()
	 * @see com.github.kanafghan.welipse.joomlagen.GenPackage#getGenClassifiers
	 * @model opposite="genClassifiers" required="true"
	 * @generated
	 */
	GenPackage getGenPackage();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.joomlagen.GenClassifier#getGenPackage <em>Gen Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Package</em>' reference.
	 * @see #getGenPackage()
	 * @generated
	 */
	void setGenPackage(GenPackage value);
	
	EClassifier getEcoreClassifier();

} // GenClassifier
