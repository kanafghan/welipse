/**
 */
package com.github.kanafghan.welipse.joomlagen;

import com.github.kanafghan.welipse.webdsl.Website;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

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
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.JoomlaGenModel#getWebmodel <em>Webmodel</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.JoomlaGenModel#getCustomCSSFiles <em>Custom CSS Files</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.JoomlaGenModel#getDatamodel <em>Datamodel</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.JoomlaGenModel#isUseBootstrap <em>Use Bootstrap</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.JoomlaGenModel#isMinifiedBootsrap <em>Minified Bootsrap</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.JoomlaGenModel#getExtensionName <em>Extension Name</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.JoomlaGenModel#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.JoomlaGenModel#getAuthor <em>Author</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.JoomlaGenModel#getAuthorEmail <em>Author Email</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.JoomlaGenModel#getAuthorURL <em>Author URL</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.JoomlaGenModel#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.JoomlaGenModel#getLicense <em>License</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.JoomlaGenModel#getVersion <em>Version</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.JoomlaGenModel#getDescription <em>Description</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.JoomlaGenModel#getDatabaseTablePrefix <em>Database Table Prefix</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.JoomlaGenModel#getComponentName <em>Component Name</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.JoomlaGenModel#getDatabaseTables <em>Database Tables</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.JoomlaGenModel#getInitialData <em>Initial Data</em>}</li>
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
	 * Returns the value of the '<em><b>Webmodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Webmodel</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Webmodel</em>' reference.
	 * @see #setWebmodel(Website)
	 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenPackage#getJoomlaGenModel_Webmodel()
	 * @model required="true"
	 * @generated
	 */
	Website getWebmodel();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.joomlagen.JoomlaGenModel#getWebmodel <em>Webmodel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Webmodel</em>' reference.
	 * @see #getWebmodel()
	 * @generated
	 */
	void setWebmodel(Website value);

	/**
	 * Returns the value of the '<em><b>Custom CSS Files</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom CSS Files</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom CSS Files</em>' attribute.
	 * @see #setCustomCSSFiles(String)
	 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenPackage#getJoomlaGenModel_CustomCSSFiles()
	 * @model
	 * @generated
	 */
	String getCustomCSSFiles();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.joomlagen.JoomlaGenModel#getCustomCSSFiles <em>Custom CSS Files</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom CSS Files</em>' attribute.
	 * @see #getCustomCSSFiles()
	 * @generated
	 */
	void setCustomCSSFiles(String value);

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
	 * Returns the value of the '<em><b>Creation Date</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Date</em>' attribute.
	 * @see #setCreationDate(String)
	 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenPackage#getJoomlaGenModel_CreationDate()
	 * @model default=""
	 * @generated
	 */
	String getCreationDate();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.joomlagen.JoomlaGenModel#getCreationDate <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Date</em>' attribute.
	 * @see #getCreationDate()
	 * @generated
	 */
	void setCreationDate(String value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' attribute.
	 * The default value is <code>"Welipse"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' attribute.
	 * @see #setAuthor(String)
	 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenPackage#getJoomlaGenModel_Author()
	 * @model default="Welipse"
	 * @generated
	 */
	String getAuthor();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.joomlagen.JoomlaGenModel#getAuthor <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' attribute.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(String value);

	/**
	 * Returns the value of the '<em><b>Author Email</b></em>' attribute.
	 * The default value is <code>"support@welipse.com"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author Email</em>' attribute.
	 * @see #setAuthorEmail(String)
	 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenPackage#getJoomlaGenModel_AuthorEmail()
	 * @model default="support@welipse.com"
	 * @generated
	 */
	String getAuthorEmail();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.joomlagen.JoomlaGenModel#getAuthorEmail <em>Author Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author Email</em>' attribute.
	 * @see #getAuthorEmail()
	 * @generated
	 */
	void setAuthorEmail(String value);

	/**
	 * Returns the value of the '<em><b>Author URL</b></em>' attribute.
	 * The default value is <code>"http://www.welipse.com"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author URL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author URL</em>' attribute.
	 * @see #setAuthorURL(String)
	 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenPackage#getJoomlaGenModel_AuthorURL()
	 * @model default="http://www.welipse.com"
	 * @generated
	 */
	String getAuthorURL();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.joomlagen.JoomlaGenModel#getAuthorURL <em>Author URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author URL</em>' attribute.
	 * @see #getAuthorURL()
	 * @generated
	 */
	void setAuthorURL(String value);

	/**
	 * Returns the value of the '<em><b>Copyright</b></em>' attribute.
	 * The default value is <code>"Copyright Welipse, All rights are reserved."</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Copyright</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Copyright</em>' attribute.
	 * @see #setCopyright(String)
	 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenPackage#getJoomlaGenModel_Copyright()
	 * @model default="Copyright Welipse, All rights are reserved."
	 * @generated
	 */
	String getCopyright();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.joomlagen.JoomlaGenModel#getCopyright <em>Copyright</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copyright</em>' attribute.
	 * @see #getCopyright()
	 * @generated
	 */
	void setCopyright(String value);

	/**
	 * Returns the value of the '<em><b>License</b></em>' attribute.
	 * The default value is <code>"see license.txt"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>License</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>License</em>' attribute.
	 * @see #setLicense(String)
	 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenPackage#getJoomlaGenModel_License()
	 * @model default="see license.txt"
	 * @generated
	 */
	String getLicense();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.joomlagen.JoomlaGenModel#getLicense <em>License</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>License</em>' attribute.
	 * @see #getLicense()
	 * @generated
	 */
	void setLicense(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * The default value is <code>"0.0.1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenPackage#getJoomlaGenModel_Version()
	 * @model default="0.0.1"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.joomlagen.JoomlaGenModel#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * The default value is <code>"Automatically generated Joomla! extension by Welipse."</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenPackage#getJoomlaGenModel_Description()
	 * @model default="Automatically generated Joomla! extension by Welipse."
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.joomlagen.JoomlaGenModel#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Database Table Prefix</b></em>' attribute.
	 * The default value is <code>"#__"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database Table Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database Table Prefix</em>' attribute.
	 * @see #setDatabaseTablePrefix(String)
	 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenPackage#getJoomlaGenModel_DatabaseTablePrefix()
	 * @model default="#__"
	 * @generated
	 */
	String getDatabaseTablePrefix();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.joomlagen.JoomlaGenModel#getDatabaseTablePrefix <em>Database Table Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database Table Prefix</em>' attribute.
	 * @see #getDatabaseTablePrefix()
	 * @generated
	 */
	void setDatabaseTablePrefix(String value);

	/**
	 * Returns the value of the '<em><b>Component Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Name</em>' attribute.
	 * @see #setComponentName(String)
	 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenPackage#getJoomlaGenModel_ComponentName()
	 * @model transient="true" volatile="true" derived="true"
	 * @generated
	 */
	String getComponentName();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.joomlagen.JoomlaGenModel#getComponentName <em>Component Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Name</em>' attribute.
	 * @see #getComponentName()
	 * @generated
	 */
	void setComponentName(String value);

	/**
	 * Returns the value of the '<em><b>Database Tables</b></em>' containment reference list.
	 * The list contents are of type {@link com.github.kanafghan.welipse.joomlagen.DatabaseTable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database Tables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database Tables</em>' containment reference list.
	 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenPackage#getJoomlaGenModel_DatabaseTables()
	 * @model containment="true"
	 * @generated
	 */
	EList<DatabaseTable> getDatabaseTables();

	/**
	 * Returns the value of the '<em><b>Initial Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Data</em>' attribute.
	 * @see #setInitialData(String)
	 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenPackage#getJoomlaGenModel_InitialData()
	 * @model
	 * @generated
	 */
	String getInitialData();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.joomlagen.JoomlaGenModel#getInitialData <em>Initial Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Data</em>' attribute.
	 * @see #getInitialData()
	 * @generated
	 */
	void setInitialData(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String getAssociationTableName(GenClass cls1, GenClass cls2);

	/**
	 * Returns the value of the '<em><b>Datamodel</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link com.github.kanafghan.welipse.joomlagen.GenPackage#getGenModel <em>Gen Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datamodel</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datamodel</em>' containment reference.
	 * @see #setDatamodel(GenPackage)
	 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenPackage#getJoomlaGenModel_Datamodel()
	 * @see com.github.kanafghan.welipse.joomlagen.GenPackage#getGenModel
	 * @model opposite="genModel" containment="true" required="true"
	 * @generated
	 */
	GenPackage getDatamodel();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.joomlagen.JoomlaGenModel#getDatamodel <em>Datamodel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datamodel</em>' containment reference.
	 * @see #getDatamodel()
	 * @generated
	 */
	void setDatamodel(GenPackage value);

	/**
	 * Returns the value of the '<em><b>Use Bootstrap</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Bootstrap</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Bootstrap</em>' attribute.
	 * @see #setUseBootstrap(boolean)
	 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenPackage#getJoomlaGenModel_UseBootstrap()
	 * @model default="true"
	 * @generated
	 */
	boolean isUseBootstrap();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.joomlagen.JoomlaGenModel#isUseBootstrap <em>Use Bootstrap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Bootstrap</em>' attribute.
	 * @see #isUseBootstrap()
	 * @generated
	 */
	void setUseBootstrap(boolean value);

	/**
	 * Returns the value of the '<em><b>Minified Bootsrap</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minified Bootsrap</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minified Bootsrap</em>' attribute.
	 * @see #setMinifiedBootsrap(boolean)
	 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenPackage#getJoomlaGenModel_MinifiedBootsrap()
	 * @model default="false"
	 * @generated
	 */
	boolean isMinifiedBootsrap();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.joomlagen.JoomlaGenModel#isMinifiedBootsrap <em>Minified Bootsrap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minified Bootsrap</em>' attribute.
	 * @see #isMinifiedBootsrap()
	 * @generated
	 */
	void setMinifiedBootsrap(boolean value);

} // JoomlaGenModel
