/**
 */
package com.github.kanafghan.welipse.joomlagen.impl;

import com.github.kanafghan.welipse.joomlagen.ExtensionType;
import com.github.kanafghan.welipse.joomlagen.JoomlaGenFactory;
import com.github.kanafghan.welipse.joomlagen.JoomlaGenModel;
import com.github.kanafghan.welipse.joomlagen.JoomlaGenPackage;
import com.github.kanafghan.welipse.joomlagen.JoomlaVersion;

import com.github.kanafghan.welipse.webdsl.WebDSLPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JoomlaGenPackageImpl extends EPackageImpl implements JoomlaGenPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass joomlaGenModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum extensionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum joomlaVersionEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private JoomlaGenPackageImpl() {
		super(eNS_URI, JoomlaGenFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link JoomlaGenPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static JoomlaGenPackage init() {
		if (isInited) return (JoomlaGenPackage)EPackage.Registry.INSTANCE.getEPackage(JoomlaGenPackage.eNS_URI);

		// Obtain or create and register package
		JoomlaGenPackageImpl theJoomlaGenPackage = (JoomlaGenPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof JoomlaGenPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new JoomlaGenPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		WebDSLPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theJoomlaGenPackage.createPackageContents();

		// Initialize created meta-data
		theJoomlaGenPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theJoomlaGenPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(JoomlaGenPackage.eNS_URI, theJoomlaGenPackage);
		return theJoomlaGenPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJoomlaGenModel() {
		return joomlaGenModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoomlaGenModel_ExtensionType() {
		return (EAttribute)joomlaGenModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoomlaGenModel_JoomlaVersion() {
		return (EAttribute)joomlaGenModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoomlaGenModel_ExtensionName() {
		return (EAttribute)joomlaGenModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoomlaGenModel_Extension() {
		return (EReference)joomlaGenModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoomlaGenModel_Datamodel() {
		return (EReference)joomlaGenModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getExtensionType() {
		return extensionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getJoomlaVersion() {
		return joomlaVersionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoomlaGenFactory getJoomlaGenFactory() {
		return (JoomlaGenFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		joomlaGenModelEClass = createEClass(JOOMLA_GEN_MODEL);
		createEAttribute(joomlaGenModelEClass, JOOMLA_GEN_MODEL__EXTENSION_TYPE);
		createEAttribute(joomlaGenModelEClass, JOOMLA_GEN_MODEL__JOOMLA_VERSION);
		createEAttribute(joomlaGenModelEClass, JOOMLA_GEN_MODEL__EXTENSION_NAME);
		createEReference(joomlaGenModelEClass, JOOMLA_GEN_MODEL__EXTENSION);
		createEReference(joomlaGenModelEClass, JOOMLA_GEN_MODEL__DATAMODEL);

		// Create enums
		extensionTypeEEnum = createEEnum(EXTENSION_TYPE);
		joomlaVersionEEnum = createEEnum(JOOMLA_VERSION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		WebDSLPackage theWebDSLPackage = (WebDSLPackage)EPackage.Registry.INSTANCE.getEPackage(WebDSLPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(joomlaGenModelEClass, JoomlaGenModel.class, "JoomlaGenModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJoomlaGenModel_ExtensionType(), this.getExtensionType(), "extensionType", null, 1, 1, JoomlaGenModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJoomlaGenModel_JoomlaVersion(), this.getJoomlaVersion(), "joomlaVersion", null, 1, 1, JoomlaGenModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJoomlaGenModel_ExtensionName(), ecorePackage.getEString(), "extensionName", null, 1, 1, JoomlaGenModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJoomlaGenModel_Extension(), theWebDSLPackage.getWebsite(), null, "extension", null, 1, 1, JoomlaGenModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJoomlaGenModel_Datamodel(), theEcorePackage.getEPackage(), null, "datamodel", null, 0, 1, JoomlaGenModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(extensionTypeEEnum, ExtensionType.class, "ExtensionType");
		addEEnumLiteral(extensionTypeEEnum, ExtensionType.COMPONENT);

		initEEnum(joomlaVersionEEnum, JoomlaVersion.class, "JoomlaVersion");
		addEEnumLiteral(joomlaVersionEEnum, JoomlaVersion.J25);

		// Create resource
		createResource(eNS_URI);
	}

} //JoomlaGenPackageImpl
