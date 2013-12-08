/**
 */
package com.github.kanafghan.welipse.joomlagen.impl;

import com.github.kanafghan.welipse.joomlagen.DatabaseColumnType;
import com.github.kanafghan.welipse.joomlagen.DatabaseTable;
import com.github.kanafghan.welipse.joomlagen.ExtensionType;
import com.github.kanafghan.welipse.joomlagen.ForeignKeyGeneration;
import com.github.kanafghan.welipse.joomlagen.FormFieldType;
import com.github.kanafghan.welipse.joomlagen.GenAttribute;
import com.github.kanafghan.welipse.joomlagen.GenClass;
import com.github.kanafghan.welipse.joomlagen.GenClassifier;
import com.github.kanafghan.welipse.joomlagen.GenDataType;
import com.github.kanafghan.welipse.joomlagen.GenFeature;
import com.github.kanafghan.welipse.joomlagen.GenOperation;
import com.github.kanafghan.welipse.joomlagen.GenPackage;
import com.github.kanafghan.welipse.joomlagen.GenParameter;
import com.github.kanafghan.welipse.joomlagen.GenReference;
import com.github.kanafghan.welipse.joomlagen.GenTypedElement;
import com.github.kanafghan.welipse.joomlagen.JoomlaGenFactory;
import com.github.kanafghan.welipse.joomlagen.JoomlaGenModel;
import com.github.kanafghan.welipse.joomlagen.JoomlaGenPackage;
import com.github.kanafghan.welipse.joomlagen.JoomlaVersion;

import com.github.kanafghan.welipse.webdsl.WebDSLPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
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
	private EClass genPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genClassifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genTypedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genDataTypeEClass = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum formFieldTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum databaseColumnTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum foreignKeyGenerationEEnum = null;

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
	public EReference getJoomlaGenModel_Webmodel() {
		return (EReference)joomlaGenModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoomlaGenModel_CustomCSSFiles() {
		return (EAttribute)joomlaGenModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoomlaGenModel_ExtensionName() {
		return (EAttribute)joomlaGenModelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoomlaGenModel_CreationDate() {
		return (EAttribute)joomlaGenModelEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoomlaGenModel_Author() {
		return (EAttribute)joomlaGenModelEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoomlaGenModel_AuthorEmail() {
		return (EAttribute)joomlaGenModelEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoomlaGenModel_AuthorURL() {
		return (EAttribute)joomlaGenModelEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoomlaGenModel_Copyright() {
		return (EAttribute)joomlaGenModelEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoomlaGenModel_License() {
		return (EAttribute)joomlaGenModelEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoomlaGenModel_Version() {
		return (EAttribute)joomlaGenModelEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoomlaGenModel_Description() {
		return (EAttribute)joomlaGenModelEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoomlaGenModel_DatabaseTablePrefix() {
		return (EAttribute)joomlaGenModelEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoomlaGenModel_ComponentName() {
		return (EAttribute)joomlaGenModelEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoomlaGenModel_DatabaseTables() {
		return (EReference)joomlaGenModelEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoomlaGenModel_InitialData() {
		return (EAttribute)joomlaGenModelEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getJoomlaGenModel__GetAssociationTableName__GenClass_GenClass() {
		return joomlaGenModelEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenPackage() {
		return genPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenPackage_EcorePackage() {
		return (EReference)genPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenPackage_GenClassifiers() {
		return (EReference)genPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenPackage_GenModel() {
		return (EReference)genPackageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenPackage_GenClasses() {
		return (EReference)genPackageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenPackage_GenDataTypes() {
		return (EReference)genPackageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenClassifier() {
		return genClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenClassifier_GenPackage() {
		return (EReference)genClassifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenClass() {
		return genClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenClass_EcoreClass() {
		return (EReference)genClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenClass_GenFeatures() {
		return (EReference)genClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenClass_GenerateContentManager() {
		return (EAttribute)genClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenClass_ItemMVCName() {
		return (EAttribute)genClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenClass_ListMVCName() {
		return (EAttribute)genClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenClass_DatabaseTableName() {
		return (EAttribute)genClassEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenClass_GenOperations() {
		return (EReference)genClassEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenTypedElement() {
		return genTypedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenTypedElement_Type() {
		return (EReference)genTypedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenFeature() {
		return genFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenFeature_GenClass() {
		return (EReference)genFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenFeature_Name() {
		return (EAttribute)genFeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenFeature_FormFieldLabel() {
		return (EAttribute)genFeatureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenFeature_FormFieldDescription() {
		return (EAttribute)genFeatureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenFeature_Nullable() {
		return (EAttribute)genFeatureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenAttribute() {
		return genAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenAttribute_FormFieldType() {
		return (EAttribute)genAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenAttribute_DatabaseColumnType() {
		return (EAttribute)genAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenAttribute_EcoreAttribute() {
		return (EReference)genAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenReference() {
		return genReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenReference_EcoreReference() {
		return (EReference)genReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenReference_Opposite() {
		return (EReference)genReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenReference_DatabaseColumnGeneration() {
		return (EAttribute)genReferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenReference_ManyToMany() {
		return (EAttribute)genReferenceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenReference_Many() {
		return (EAttribute)genReferenceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenReference_OneToMany() {
		return (EAttribute)genReferenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatabaseTable() {
		return databaseTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabaseTable_Name() {
		return (EAttribute)databaseTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatabaseTable_GenClass() {
		return (EReference)databaseTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatabaseTable_Columns() {
		return (EReference)databaseTableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatabaseTable_ForeignKeys() {
		return (EReference)databaseTableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenOperation() {
		return genOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenOperation_GenParameters() {
		return (EReference)genOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenOperation_GenClass() {
		return (EReference)genOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenOperation_EcoreOperation() {
		return (EReference)genOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenParameter() {
		return genParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenParameter_GenOperation() {
		return (EReference)genParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenParameter_EcoreParameter() {
		return (EReference)genParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenDataType() {
		return genDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenDataType_EcoreDataType() {
		return (EReference)genDataTypeEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getJoomlaGenModel_UseBootstrap() {
		return (EAttribute)joomlaGenModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoomlaGenModel_MinifiedBootsrap() {
		return (EAttribute)joomlaGenModelEClass.getEStructuralFeatures().get(6);
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
	public EEnum getFormFieldType() {
		return formFieldTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDatabaseColumnType() {
		return databaseColumnTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getForeignKeyGeneration() {
		return foreignKeyGenerationEEnum;
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
		createEReference(joomlaGenModelEClass, JOOMLA_GEN_MODEL__WEBMODEL);
		createEAttribute(joomlaGenModelEClass, JOOMLA_GEN_MODEL__CUSTOM_CSS_FILES);
		createEReference(joomlaGenModelEClass, JOOMLA_GEN_MODEL__DATAMODEL);
		createEAttribute(joomlaGenModelEClass, JOOMLA_GEN_MODEL__USE_BOOTSTRAP);
		createEAttribute(joomlaGenModelEClass, JOOMLA_GEN_MODEL__MINIFIED_BOOTSRAP);
		createEAttribute(joomlaGenModelEClass, JOOMLA_GEN_MODEL__EXTENSION_NAME);
		createEAttribute(joomlaGenModelEClass, JOOMLA_GEN_MODEL__CREATION_DATE);
		createEAttribute(joomlaGenModelEClass, JOOMLA_GEN_MODEL__AUTHOR);
		createEAttribute(joomlaGenModelEClass, JOOMLA_GEN_MODEL__AUTHOR_EMAIL);
		createEAttribute(joomlaGenModelEClass, JOOMLA_GEN_MODEL__AUTHOR_URL);
		createEAttribute(joomlaGenModelEClass, JOOMLA_GEN_MODEL__COPYRIGHT);
		createEAttribute(joomlaGenModelEClass, JOOMLA_GEN_MODEL__LICENSE);
		createEAttribute(joomlaGenModelEClass, JOOMLA_GEN_MODEL__VERSION);
		createEAttribute(joomlaGenModelEClass, JOOMLA_GEN_MODEL__DESCRIPTION);
		createEAttribute(joomlaGenModelEClass, JOOMLA_GEN_MODEL__DATABASE_TABLE_PREFIX);
		createEAttribute(joomlaGenModelEClass, JOOMLA_GEN_MODEL__COMPONENT_NAME);
		createEReference(joomlaGenModelEClass, JOOMLA_GEN_MODEL__DATABASE_TABLES);
		createEAttribute(joomlaGenModelEClass, JOOMLA_GEN_MODEL__INITIAL_DATA);
		createEOperation(joomlaGenModelEClass, JOOMLA_GEN_MODEL___GET_ASSOCIATION_TABLE_NAME__GENCLASS_GENCLASS);

		genPackageEClass = createEClass(GEN_PACKAGE);
		createEReference(genPackageEClass, GEN_PACKAGE__ECORE_PACKAGE);
		createEReference(genPackageEClass, GEN_PACKAGE__GEN_CLASSIFIERS);
		createEReference(genPackageEClass, GEN_PACKAGE__GEN_MODEL);
		createEReference(genPackageEClass, GEN_PACKAGE__GEN_CLASSES);
		createEReference(genPackageEClass, GEN_PACKAGE__GEN_DATA_TYPES);

		genClassifierEClass = createEClass(GEN_CLASSIFIER);
		createEReference(genClassifierEClass, GEN_CLASSIFIER__GEN_PACKAGE);

		genClassEClass = createEClass(GEN_CLASS);
		createEReference(genClassEClass, GEN_CLASS__ECORE_CLASS);
		createEReference(genClassEClass, GEN_CLASS__GEN_FEATURES);
		createEAttribute(genClassEClass, GEN_CLASS__GENERATE_CONTENT_MANAGER);
		createEAttribute(genClassEClass, GEN_CLASS__ITEM_MVC_NAME);
		createEAttribute(genClassEClass, GEN_CLASS__LIST_MVC_NAME);
		createEAttribute(genClassEClass, GEN_CLASS__DATABASE_TABLE_NAME);
		createEReference(genClassEClass, GEN_CLASS__GEN_OPERATIONS);

		genTypedElementEClass = createEClass(GEN_TYPED_ELEMENT);
		createEReference(genTypedElementEClass, GEN_TYPED_ELEMENT__TYPE);

		genFeatureEClass = createEClass(GEN_FEATURE);
		createEReference(genFeatureEClass, GEN_FEATURE__GEN_CLASS);
		createEAttribute(genFeatureEClass, GEN_FEATURE__NAME);
		createEAttribute(genFeatureEClass, GEN_FEATURE__FORM_FIELD_LABEL);
		createEAttribute(genFeatureEClass, GEN_FEATURE__FORM_FIELD_DESCRIPTION);
		createEAttribute(genFeatureEClass, GEN_FEATURE__NULLABLE);

		genAttributeEClass = createEClass(GEN_ATTRIBUTE);
		createEAttribute(genAttributeEClass, GEN_ATTRIBUTE__FORM_FIELD_TYPE);
		createEAttribute(genAttributeEClass, GEN_ATTRIBUTE__DATABASE_COLUMN_TYPE);
		createEReference(genAttributeEClass, GEN_ATTRIBUTE__ECORE_ATTRIBUTE);

		genReferenceEClass = createEClass(GEN_REFERENCE);
		createEReference(genReferenceEClass, GEN_REFERENCE__ECORE_REFERENCE);
		createEReference(genReferenceEClass, GEN_REFERENCE__OPPOSITE);
		createEAttribute(genReferenceEClass, GEN_REFERENCE__DATABASE_COLUMN_GENERATION);
		createEAttribute(genReferenceEClass, GEN_REFERENCE__ONE_TO_MANY);
		createEAttribute(genReferenceEClass, GEN_REFERENCE__MANY_TO_MANY);
		createEAttribute(genReferenceEClass, GEN_REFERENCE__MANY);

		databaseTableEClass = createEClass(DATABASE_TABLE);
		createEAttribute(databaseTableEClass, DATABASE_TABLE__NAME);
		createEReference(databaseTableEClass, DATABASE_TABLE__GEN_CLASS);
		createEReference(databaseTableEClass, DATABASE_TABLE__COLUMNS);
		createEReference(databaseTableEClass, DATABASE_TABLE__FOREIGN_KEYS);

		genOperationEClass = createEClass(GEN_OPERATION);
		createEReference(genOperationEClass, GEN_OPERATION__GEN_PARAMETERS);
		createEReference(genOperationEClass, GEN_OPERATION__GEN_CLASS);
		createEReference(genOperationEClass, GEN_OPERATION__ECORE_OPERATION);

		genParameterEClass = createEClass(GEN_PARAMETER);
		createEReference(genParameterEClass, GEN_PARAMETER__GEN_OPERATION);
		createEReference(genParameterEClass, GEN_PARAMETER__ECORE_PARAMETER);

		genDataTypeEClass = createEClass(GEN_DATA_TYPE);
		createEReference(genDataTypeEClass, GEN_DATA_TYPE__ECORE_DATA_TYPE);

		// Create enums
		extensionTypeEEnum = createEEnum(EXTENSION_TYPE);
		joomlaVersionEEnum = createEEnum(JOOMLA_VERSION);
		formFieldTypeEEnum = createEEnum(FORM_FIELD_TYPE);
		databaseColumnTypeEEnum = createEEnum(DATABASE_COLUMN_TYPE);
		foreignKeyGenerationEEnum = createEEnum(FOREIGN_KEY_GENERATION);
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
		genClassEClass.getESuperTypes().add(this.getGenClassifier());
		genFeatureEClass.getESuperTypes().add(this.getGenTypedElement());
		genAttributeEClass.getESuperTypes().add(this.getGenFeature());
		genReferenceEClass.getESuperTypes().add(this.getGenFeature());
		genOperationEClass.getESuperTypes().add(this.getGenTypedElement());
		genParameterEClass.getESuperTypes().add(this.getGenTypedElement());
		genDataTypeEClass.getESuperTypes().add(this.getGenClassifier());

		// Initialize classes, features, and operations; add parameters
		initEClass(joomlaGenModelEClass, JoomlaGenModel.class, "JoomlaGenModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJoomlaGenModel_ExtensionType(), this.getExtensionType(), "extensionType", null, 1, 1, JoomlaGenModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJoomlaGenModel_JoomlaVersion(), this.getJoomlaVersion(), "joomlaVersion", null, 1, 1, JoomlaGenModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJoomlaGenModel_Webmodel(), theWebDSLPackage.getWebsite(), null, "webmodel", null, 1, 1, JoomlaGenModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJoomlaGenModel_CustomCSSFiles(), ecorePackage.getEString(), "customCSSFiles", null, 0, 1, JoomlaGenModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJoomlaGenModel_Datamodel(), this.getGenPackage(), this.getGenPackage_GenModel(), "datamodel", null, 1, 1, JoomlaGenModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJoomlaGenModel_UseBootstrap(), ecorePackage.getEBoolean(), "useBootstrap", "true", 0, 1, JoomlaGenModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJoomlaGenModel_MinifiedBootsrap(), ecorePackage.getEBoolean(), "minifiedBootsrap", "false", 0, 1, JoomlaGenModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJoomlaGenModel_ExtensionName(), ecorePackage.getEString(), "extensionName", null, 1, 1, JoomlaGenModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJoomlaGenModel_CreationDate(), ecorePackage.getEString(), "creationDate", "", 0, 1, JoomlaGenModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJoomlaGenModel_Author(), ecorePackage.getEString(), "author", "Welipse", 0, 1, JoomlaGenModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJoomlaGenModel_AuthorEmail(), ecorePackage.getEString(), "authorEmail", "support@welipse.com", 0, 1, JoomlaGenModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJoomlaGenModel_AuthorURL(), ecorePackage.getEString(), "authorURL", "http://www.welipse.com", 0, 1, JoomlaGenModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJoomlaGenModel_Copyright(), ecorePackage.getEString(), "copyright", "Copyright Welipse, All rights are reserved.", 0, 1, JoomlaGenModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJoomlaGenModel_License(), ecorePackage.getEString(), "license", "see license.txt", 0, 1, JoomlaGenModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJoomlaGenModel_Version(), ecorePackage.getEString(), "version", "0.0.1", 0, 1, JoomlaGenModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJoomlaGenModel_Description(), ecorePackage.getEString(), "description", "Automatically generated Joomla! extension by Welipse.", 0, 1, JoomlaGenModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJoomlaGenModel_DatabaseTablePrefix(), ecorePackage.getEString(), "databaseTablePrefix", "#__", 0, 1, JoomlaGenModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJoomlaGenModel_ComponentName(), ecorePackage.getEString(), "componentName", null, 0, 1, JoomlaGenModel.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getJoomlaGenModel_DatabaseTables(), this.getDatabaseTable(), null, "databaseTables", null, 0, -1, JoomlaGenModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJoomlaGenModel_InitialData(), ecorePackage.getEString(), "initialData", null, 0, 1, JoomlaGenModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getJoomlaGenModel__GetAssociationTableName__GenClass_GenClass(), ecorePackage.getEString(), "getAssociationTableName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGenClass(), "cls1", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGenClass(), "cls2", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(genPackageEClass, GenPackage.class, "GenPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenPackage_EcorePackage(), theEcorePackage.getEPackage(), null, "ecorePackage", null, 1, 1, GenPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenPackage_GenClassifiers(), this.getGenClassifier(), this.getGenClassifier_GenPackage(), "genClassifiers", null, 0, -1, GenPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenPackage_GenModel(), this.getJoomlaGenModel(), this.getJoomlaGenModel_Datamodel(), "genModel", null, 0, 1, GenPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenPackage_GenClasses(), this.getGenClass(), null, "genClasses", null, 0, -1, GenPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenPackage_GenDataTypes(), this.getGenDataType(), null, "genDataTypes", null, 0, -1, GenPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genClassifierEClass, GenClassifier.class, "GenClassifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenClassifier_GenPackage(), this.getGenPackage(), this.getGenPackage_GenClassifiers(), "genPackage", null, 1, 1, GenClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genClassEClass, GenClass.class, "GenClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenClass_EcoreClass(), theEcorePackage.getEClass(), null, "ecoreClass", null, 1, 1, GenClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenClass_GenFeatures(), this.getGenFeature(), this.getGenFeature_GenClass(), "genFeatures", null, 0, -1, GenClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenClass_GenerateContentManager(), ecorePackage.getEBoolean(), "generateContentManager", "true", 0, 1, GenClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenClass_ItemMVCName(), ecorePackage.getEString(), "itemMVCName", null, 0, 1, GenClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenClass_ListMVCName(), ecorePackage.getEString(), "listMVCName", null, 0, 1, GenClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenClass_DatabaseTableName(), ecorePackage.getEString(), "databaseTableName", null, 0, 1, GenClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenClass_GenOperations(), this.getGenOperation(), this.getGenOperation_GenClass(), "genOperations", null, 0, -1, GenClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genTypedElementEClass, GenTypedElement.class, "GenTypedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenTypedElement_Type(), this.getGenClassifier(), null, "type", null, 0, 1, GenTypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genFeatureEClass, GenFeature.class, "GenFeature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenFeature_GenClass(), this.getGenClass(), this.getGenClass_GenFeatures(), "genClass", null, 1, 1, GenFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenFeature_Name(), ecorePackage.getEString(), "name", null, 0, 1, GenFeature.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenFeature_FormFieldLabel(), ecorePackage.getEString(), "formFieldLabel", null, 0, 1, GenFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenFeature_FormFieldDescription(), ecorePackage.getEString(), "formFieldDescription", null, 0, 1, GenFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenFeature_Nullable(), ecorePackage.getEBoolean(), "nullable", "true", 0, 1, GenFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genAttributeEClass, GenAttribute.class, "GenAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGenAttribute_FormFieldType(), this.getFormFieldType(), "formFieldType", null, 0, 1, GenAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenAttribute_DatabaseColumnType(), this.getDatabaseColumnType(), "databaseColumnType", null, 0, 1, GenAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenAttribute_EcoreAttribute(), theEcorePackage.getEAttribute(), null, "ecoreAttribute", null, 1, 1, GenAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genReferenceEClass, GenReference.class, "GenReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenReference_EcoreReference(), theEcorePackage.getEReference(), null, "ecoreReference", null, 1, 1, GenReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenReference_Opposite(), this.getGenReference(), null, "opposite", null, 0, 1, GenReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenReference_DatabaseColumnGeneration(), this.getForeignKeyGeneration(), "databaseColumnGeneration", "GenerateInOther", 0, 1, GenReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenReference_OneToMany(), ecorePackage.getEBoolean(), "oneToMany", null, 0, 1, GenReference.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenReference_ManyToMany(), ecorePackage.getEBoolean(), "manyToMany", null, 0, 1, GenReference.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenReference_Many(), ecorePackage.getEBoolean(), "many", null, 0, 1, GenReference.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(databaseTableEClass, DatabaseTable.class, "DatabaseTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatabaseTable_Name(), ecorePackage.getEString(), "name", null, 0, 1, DatabaseTable.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDatabaseTable_GenClass(), this.getGenClass(), null, "genClass", null, 0, 1, DatabaseTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatabaseTable_Columns(), this.getGenAttribute(), null, "columns", null, 0, -1, DatabaseTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatabaseTable_ForeignKeys(), this.getGenReference(), null, "foreignKeys", null, 0, -1, DatabaseTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genOperationEClass, GenOperation.class, "GenOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenOperation_GenParameters(), this.getGenParameter(), this.getGenParameter_GenOperation(), "genParameters", null, 0, -1, GenOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenOperation_GenClass(), this.getGenClass(), this.getGenClass_GenOperations(), "genClass", null, 1, 1, GenOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenOperation_EcoreOperation(), theEcorePackage.getEOperation(), null, "ecoreOperation", null, 1, 1, GenOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genParameterEClass, GenParameter.class, "GenParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenParameter_GenOperation(), this.getGenOperation(), this.getGenOperation_GenParameters(), "genOperation", null, 1, 1, GenParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenParameter_EcoreParameter(), theEcorePackage.getEParameter(), null, "ecoreParameter", null, 1, 1, GenParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genDataTypeEClass, GenDataType.class, "GenDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenDataType_EcoreDataType(), theEcorePackage.getEDataType(), null, "ecoreDataType", null, 1, 1, GenDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(extensionTypeEEnum, ExtensionType.class, "ExtensionType");
		addEEnumLiteral(extensionTypeEEnum, ExtensionType.COMPONENT);

		initEEnum(joomlaVersionEEnum, JoomlaVersion.class, "JoomlaVersion");
		addEEnumLiteral(joomlaVersionEEnum, JoomlaVersion.J25);

		initEEnum(formFieldTypeEEnum, FormFieldType.class, "FormFieldType");
		addEEnumLiteral(formFieldTypeEEnum, FormFieldType.TEXT);
		addEEnumLiteral(formFieldTypeEEnum, FormFieldType.TEXTAREA);
		addEEnumLiteral(formFieldTypeEEnum, FormFieldType.FILE);
		addEEnumLiteral(formFieldTypeEEnum, FormFieldType.PASSWORD);
		addEEnumLiteral(formFieldTypeEEnum, FormFieldType.HIDDEN);
		addEEnumLiteral(formFieldTypeEEnum, FormFieldType.RADIO);
		addEEnumLiteral(formFieldTypeEEnum, FormFieldType.LIST);

		initEEnum(databaseColumnTypeEEnum, DatabaseColumnType.class, "DatabaseColumnType");
		addEEnumLiteral(databaseColumnTypeEEnum, DatabaseColumnType.INT);
		addEEnumLiteral(databaseColumnTypeEEnum, DatabaseColumnType.FLOAT);
		addEEnumLiteral(databaseColumnTypeEEnum, DatabaseColumnType.DOUBLE);
		addEEnumLiteral(databaseColumnTypeEEnum, DatabaseColumnType.VARCHAR);
		addEEnumLiteral(databaseColumnTypeEEnum, DatabaseColumnType.TEXT);
		addEEnumLiteral(databaseColumnTypeEEnum, DatabaseColumnType.DATE);
		addEEnumLiteral(databaseColumnTypeEEnum, DatabaseColumnType.TIMESTAMP);

		initEEnum(foreignKeyGenerationEEnum, ForeignKeyGeneration.class, "ForeignKeyGeneration");
		addEEnumLiteral(foreignKeyGenerationEEnum, ForeignKeyGeneration.GENERATE_IN_OTHER);
		addEEnumLiteral(foreignKeyGenerationEEnum, ForeignKeyGeneration.GENERATE_IN_THIS);

		// Create resource
		createResource(eNS_URI);
	}

} //JoomlaGenPackageImpl
