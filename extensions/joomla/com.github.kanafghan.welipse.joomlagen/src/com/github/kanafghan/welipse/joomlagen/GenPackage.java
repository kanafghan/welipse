/**
 */
package com.github.kanafghan.welipse.joomlagen;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.GenPackage#getEcorePackage <em>Ecore Package</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.GenPackage#getGenClassifiers <em>Gen Classifiers</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.GenPackage#getGenModel <em>Gen Model</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.GenPackage#getGenClasses <em>Gen Classes</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.GenPackage#getGenDataTypes <em>Gen Data Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenPackage#getGenPackage()
 * @model
 * @generated
 */
public interface GenPackage extends EObject {
	/**
	 * Returns the value of the '<em><b>Ecore Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ecore Package</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ecore Package</em>' reference.
	 * @see #setEcorePackage(EPackage)
	 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenPackage#getGenPackage_EcorePackage()
	 * @model required="true"
	 * @generated
	 */
	EPackage getEcorePackage();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.joomlagen.GenPackage#getEcorePackage <em>Ecore Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ecore Package</em>' reference.
	 * @see #getEcorePackage()
	 * @generated
	 */
	void setEcorePackage(EPackage value);

	/**
	 * Returns the value of the '<em><b>Gen Classifiers</b></em>' reference list.
	 * The list contents are of type {@link com.github.kanafghan.welipse.joomlagen.GenClassifier}.
	 * It is bidirectional and its opposite is '{@link com.github.kanafghan.welipse.joomlagen.GenClassifier#getGenPackage <em>Gen Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Classifiers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Classifiers</em>' reference list.
	 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenPackage#getGenPackage_GenClassifiers()
	 * @see com.github.kanafghan.welipse.joomlagen.GenClassifier#getGenPackage
	 * @model opposite="genPackage"
	 * @generated
	 */
	EList<GenClassifier> getGenClassifiers();

	/**
	 * Returns the value of the '<em><b>Gen Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.github.kanafghan.welipse.joomlagen.JoomlaGenModel#getDatamodel <em>Datamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Model</em>' container reference.
	 * @see #setGenModel(JoomlaGenModel)
	 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenPackage#getGenPackage_GenModel()
	 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenModel#getDatamodel
	 * @model opposite="datamodel" transient="false"
	 * @generated
	 */
	JoomlaGenModel getGenModel();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.joomlagen.GenPackage#getGenModel <em>Gen Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Model</em>' container reference.
	 * @see #getGenModel()
	 * @generated
	 */
	void setGenModel(JoomlaGenModel value);

	/**
	 * Returns the value of the '<em><b>Gen Classes</b></em>' containment reference list.
	 * The list contents are of type {@link com.github.kanafghan.welipse.joomlagen.GenClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Classes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Classes</em>' containment reference list.
	 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenPackage#getGenPackage_GenClasses()
	 * @model containment="true"
	 * @generated
	 */
	EList<GenClass> getGenClasses();
	
	/**
	 * Returns the value of the '<em><b>Gen Data Types</b></em>' containment reference list.
	 * The list contents are of type {@link com.github.kanafghan.welipse.joomlagen.GenDataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Data Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Data Types</em>' containment reference list.
	 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenPackage#getGenPackage_GenDataTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<GenDataType> getGenDataTypes();

	void initialize(EPackage ePackage);

	GenClassifier getGenClassifier(EClassifier ecoreClassifier);

	GenReference getGenReference(EReference eReference);
	
	boolean reconcile();
	
	boolean reconcile(GenPackage oldGenPackageVersion);

} // GenPackage
