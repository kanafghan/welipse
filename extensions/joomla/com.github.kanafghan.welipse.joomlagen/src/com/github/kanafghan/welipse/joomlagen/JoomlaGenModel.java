/**
 */
package com.github.kanafghan.welipse.joomlagen;

import com.github.kanafghan.welipse.webdsl.Website;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.JoomlaGenModel#getExtensionType <em>Extension Type</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.JoomlaGenModel#getJoomlaVersion <em>Joomla Version</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.JoomlaGenModel#getExtensionName <em>Extension Name</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.JoomlaGenModel#getExtension <em>Extension</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.JoomlaGenModel#getDatamodel <em>Datamodel</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenPackage#getJoomlaGenModel()
 * @model
 * @generated
 */
public interface JoomlaGenModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Extension Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.github.kanafghan.welipse.joomlagen.ExtensionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension Type</em>' attribute.
	 * @see com.github.kanafghan.welipse.joomlagen.ExtensionType
	 * @see #setExtensionType(ExtensionType)
	 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenPackage#getJoomlaGenModel_ExtensionType()
	 * @model required="true"
	 * @generated
	 */
	ExtensionType getExtensionType();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.joomlagen.JoomlaGenModel#getExtensionType <em>Extension Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension Type</em>' attribute.
	 * @see com.github.kanafghan.welipse.joomlagen.ExtensionType
	 * @see #getExtensionType()
	 * @generated
	 */
	void setExtensionType(ExtensionType value);

	/**
	 * Returns the value of the '<em><b>Joomla Version</b></em>' attribute.
	 * The literals are from the enumeration {@link com.github.kanafghan.welipse.joomlagen.JoomlaVersion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Joomla Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Joomla Version</em>' attribute.
	 * @see com.github.kanafghan.welipse.joomlagen.JoomlaVersion
	 * @see #setJoomlaVersion(JoomlaVersion)
	 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenPackage#getJoomlaGenModel_JoomlaVersion()
	 * @model required="true"
	 * @generated
	 */
	JoomlaVersion getJoomlaVersion();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.joomlagen.JoomlaGenModel#getJoomlaVersion <em>Joomla Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Joomla Version</em>' attribute.
	 * @see com.github.kanafghan.welipse.joomlagen.JoomlaVersion
	 * @see #getJoomlaVersion()
	 * @generated
	 */
	void setJoomlaVersion(JoomlaVersion value);

	/**
	 * Returns the value of the '<em><b>Extension Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension Name</em>' attribute.
	 * @see #setExtensionName(String)
	 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenPackage#getJoomlaGenModel_ExtensionName()
	 * @model required="true"
	 * @generated
	 */
	String getExtensionName();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.joomlagen.JoomlaGenModel#getExtensionName <em>Extension Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension Name</em>' attribute.
	 * @see #getExtensionName()
	 * @generated
	 */
	void setExtensionName(String value);

	/**
	 * Returns the value of the '<em><b>Extension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension</em>' reference.
	 * @see #setExtension(Website)
	 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenPackage#getJoomlaGenModel_Extension()
	 * @model required="true"
	 * @generated
	 */
	Website getExtension();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.joomlagen.JoomlaGenModel#getExtension <em>Extension</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension</em>' reference.
	 * @see #getExtension()
	 * @generated
	 */
	void setExtension(Website value);

	/**
	 * Returns the value of the '<em><b>Datamodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datamodel</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datamodel</em>' reference.
	 * @see #setDatamodel(EPackage)
	 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenPackage#getJoomlaGenModel_Datamodel()
	 * @model
	 * @generated
	 */
	EPackage getDatamodel();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.joomlagen.JoomlaGenModel#getDatamodel <em>Datamodel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datamodel</em>' reference.
	 * @see #getDatamodel()
	 * @generated
	 */
	void setDatamodel(EPackage value);

} // JoomlaGenModel
