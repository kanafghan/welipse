/**
 */
package com.github.kanafghan.welipse.joomlagen;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.GenClass#getEcoreClass <em>Ecore Class</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.GenClass#getGenFeatures <em>Gen Features</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.GenClass#isGenerateContentManager <em>Generate Content Manager</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.GenClass#getItemMVCName <em>Item MVC Name</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.GenClass#getListMVCName <em>List MVC Name</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.GenClass#getDatabaseTableName <em>Database Table Name</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.GenClass#getGenOperations <em>Gen Operations</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenPackage#getGenClass()
 * @model
 * @generated
 */
public interface GenClass extends GenClassifier {
	/**
	 * Returns the value of the '<em><b>Ecore Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ecore Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ecore Class</em>' reference.
	 * @see #setEcoreClass(EClass)
	 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenPackage#getGenClass_EcoreClass()
	 * @model required="true"
	 * @generated
	 */
	EClass getEcoreClass();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.joomlagen.GenClass#getEcoreClass <em>Ecore Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ecore Class</em>' reference.
	 * @see #getEcoreClass()
	 * @generated
	 */
	void setEcoreClass(EClass value);

	/**
	 * Returns the value of the '<em><b>Gen Features</b></em>' containment reference list.
	 * The list contents are of type {@link com.github.kanafghan.welipse.joomlagen.GenFeature}.
	 * It is bidirectional and its opposite is '{@link com.github.kanafghan.welipse.joomlagen.GenFeature#getGenClass <em>Gen Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Features</em>' containment reference list.
	 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenPackage#getGenClass_GenFeatures()
	 * @see com.github.kanafghan.welipse.joomlagen.GenFeature#getGenClass
	 * @model opposite="genClass" containment="true"
	 * @generated
	 */
	EList<GenFeature> getGenFeatures();

	/**
	 * Returns the value of the '<em><b>Generate Content Manager</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generate Content Manager</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generate Content Manager</em>' attribute.
	 * @see #setGenerateContentManager(boolean)
	 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenPackage#getGenClass_GenerateContentManager()
	 * @model default="true"
	 * @generated
	 */
	boolean isGenerateContentManager();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.joomlagen.GenClass#isGenerateContentManager <em>Generate Content Manager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generate Content Manager</em>' attribute.
	 * @see #isGenerateContentManager()
	 * @generated
	 */
	void setGenerateContentManager(boolean value);

	/**
	 * Returns the value of the '<em><b>Item MVC Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item MVC Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item MVC Name</em>' attribute.
	 * @see #setItemMVCName(String)
	 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenPackage#getGenClass_ItemMVCName()
	 * @model
	 * @generated
	 */
	String getItemMVCName();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.joomlagen.GenClass#getItemMVCName <em>Item MVC Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item MVC Name</em>' attribute.
	 * @see #getItemMVCName()
	 * @generated
	 */
	void setItemMVCName(String value);

	/**
	 * Returns the value of the '<em><b>List MVC Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List MVC Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List MVC Name</em>' attribute.
	 * @see #setListMVCName(String)
	 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenPackage#getGenClass_ListMVCName()
	 * @model
	 * @generated
	 */
	String getListMVCName();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.joomlagen.GenClass#getListMVCName <em>List MVC Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List MVC Name</em>' attribute.
	 * @see #getListMVCName()
	 * @generated
	 */
	void setListMVCName(String value);

	/**
	 * Returns the value of the '<em><b>Database Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database Table Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database Table Name</em>' attribute.
	 * @see #setDatabaseTableName(String)
	 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenPackage#getGenClass_DatabaseTableName()
	 * @model
	 * @generated
	 */
	String getDatabaseTableName();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.joomlagen.GenClass#getDatabaseTableName <em>Database Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database Table Name</em>' attribute.
	 * @see #getDatabaseTableName()
	 * @generated
	 */
	void setDatabaseTableName(String value);

	/**
	 * Returns the value of the '<em><b>Gen Operations</b></em>' containment reference list.
	 * The list contents are of type {@link com.github.kanafghan.welipse.joomlagen.GenOperation}.
	 * It is bidirectional and its opposite is '{@link com.github.kanafghan.welipse.joomlagen.GenOperation#getGenClass <em>Gen Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Operations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Operations</em>' containment reference list.
	 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenPackage#getGenClass_GenOperations()
	 * @see com.github.kanafghan.welipse.joomlagen.GenOperation#getGenClass
	 * @model opposite="genClass" containment="true"
	 * @generated
	 */
	EList<GenOperation> getGenOperations();
	
	void initialize(EClass eClass);
	
	boolean reconcile();
	
	boolean reconcile(GenClass oldGenClassVersion);

} // GenClass
