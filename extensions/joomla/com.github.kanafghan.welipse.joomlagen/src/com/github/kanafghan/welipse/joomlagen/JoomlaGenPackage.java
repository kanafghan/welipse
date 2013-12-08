/**
 */
package com.github.kanafghan.welipse.joomlagen;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenFactory
 * @model kind="package"
 * @generated
 */
public interface JoomlaGenPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "joomlagen";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://github.com/kanafghan/welipse/joomlagen/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "joomlagen";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JoomlaGenPackage eINSTANCE = com.github.kanafghan.welipse.joomlagen.impl.JoomlaGenPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.github.kanafghan.welipse.joomlagen.impl.JoomlaGenModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.kanafghan.welipse.joomlagen.impl.JoomlaGenModelImpl
	 * @see com.github.kanafghan.welipse.joomlagen.impl.JoomlaGenPackageImpl#getJoomlaGenModel()
	 * @generated
	 */
	int JOOMLA_GEN_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Extension Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOOMLA_GEN_MODEL__EXTENSION_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Joomla Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOOMLA_GEN_MODEL__JOOMLA_VERSION = 1;

	/**
	 * The feature id for the '<em><b>Webmodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOOMLA_GEN_MODEL__WEBMODEL = 2;

	/**
	 * The feature id for the '<em><b>Custom CSS Files</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOOMLA_GEN_MODEL__CUSTOM_CSS_FILES = 3;

	/**
	 * The feature id for the '<em><b>Datamodel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOOMLA_GEN_MODEL__DATAMODEL = 4;

	/**
	 * The feature id for the '<em><b>Use Bootstrap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOOMLA_GEN_MODEL__USE_BOOTSTRAP = 5;

	/**
	 * The feature id for the '<em><b>Minified Bootsrap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOOMLA_GEN_MODEL__MINIFIED_BOOTSRAP = 6;

	/**
	 * The feature id for the '<em><b>Extension Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOOMLA_GEN_MODEL__EXTENSION_NAME = 7;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOOMLA_GEN_MODEL__CREATION_DATE = 8;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOOMLA_GEN_MODEL__AUTHOR = 9;

	/**
	 * The feature id for the '<em><b>Author Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOOMLA_GEN_MODEL__AUTHOR_EMAIL = 10;

	/**
	 * The feature id for the '<em><b>Author URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOOMLA_GEN_MODEL__AUTHOR_URL = 11;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOOMLA_GEN_MODEL__COPYRIGHT = 12;

	/**
	 * The feature id for the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOOMLA_GEN_MODEL__LICENSE = 13;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOOMLA_GEN_MODEL__VERSION = 14;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOOMLA_GEN_MODEL__DESCRIPTION = 15;

	/**
	 * The feature id for the '<em><b>Database Table Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOOMLA_GEN_MODEL__DATABASE_TABLE_PREFIX = 16;

	/**
	 * The feature id for the '<em><b>Component Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOOMLA_GEN_MODEL__COMPONENT_NAME = 17;

	/**
	 * The feature id for the '<em><b>Database Tables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOOMLA_GEN_MODEL__DATABASE_TABLES = 18;

	/**
	 * The feature id for the '<em><b>Initial Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOOMLA_GEN_MODEL__INITIAL_DATA = 19;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOOMLA_GEN_MODEL_FEATURE_COUNT = 20;

	/**
	 * The operation id for the '<em>Get Association Table Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOOMLA_GEN_MODEL___GET_ASSOCIATION_TABLE_NAME__GENCLASS_GENCLASS = 0;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOOMLA_GEN_MODEL_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.github.kanafghan.welipse.joomlagen.impl.GenPackageImpl <em>Gen Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.kanafghan.welipse.joomlagen.impl.GenPackageImpl
	 * @see com.github.kanafghan.welipse.joomlagen.impl.JoomlaGenPackageImpl#getGenPackage()
	 * @generated
	 */
	int GEN_PACKAGE = 1;

	/**
	 * The feature id for the '<em><b>Ecore Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PACKAGE__ECORE_PACKAGE = 0;

	/**
	 * The feature id for the '<em><b>Gen Classifiers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PACKAGE__GEN_CLASSIFIERS = 1;

	/**
	 * The feature id for the '<em><b>Gen Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PACKAGE__GEN_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Gen Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PACKAGE__GEN_CLASSES = 3;

	/**
	 * The feature id for the '<em><b>Gen Data Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PACKAGE__GEN_DATA_TYPES = 4;

	/**
	 * The number of structural features of the '<em>Gen Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PACKAGE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Gen Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PACKAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.github.kanafghan.welipse.joomlagen.impl.GenClassifierImpl <em>Gen Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.kanafghan.welipse.joomlagen.impl.GenClassifierImpl
	 * @see com.github.kanafghan.welipse.joomlagen.impl.JoomlaGenPackageImpl#getGenClassifier()
	 * @generated
	 */
	int GEN_CLASSIFIER = 2;

	/**
	 * The feature id for the '<em><b>Gen Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CLASSIFIER__GEN_PACKAGE = 0;

	/**
	 * The number of structural features of the '<em>Gen Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CLASSIFIER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Gen Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CLASSIFIER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.github.kanafghan.welipse.joomlagen.impl.GenClassImpl <em>Gen Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.kanafghan.welipse.joomlagen.impl.GenClassImpl
	 * @see com.github.kanafghan.welipse.joomlagen.impl.JoomlaGenPackageImpl#getGenClass()
	 * @generated
	 */
	int GEN_CLASS = 3;

	/**
	 * The feature id for the '<em><b>Gen Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CLASS__GEN_PACKAGE = GEN_CLASSIFIER__GEN_PACKAGE;

	/**
	 * The feature id for the '<em><b>Ecore Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CLASS__ECORE_CLASS = GEN_CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gen Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CLASS__GEN_FEATURES = GEN_CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Generate Content Manager</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CLASS__GENERATE_CONTENT_MANAGER = GEN_CLASSIFIER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Item MVC Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CLASS__ITEM_MVC_NAME = GEN_CLASSIFIER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>List MVC Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CLASS__LIST_MVC_NAME = GEN_CLASSIFIER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Database Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CLASS__DATABASE_TABLE_NAME = GEN_CLASSIFIER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Gen Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CLASS__GEN_OPERATIONS = GEN_CLASSIFIER_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Gen Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CLASS_FEATURE_COUNT = GEN_CLASSIFIER_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Gen Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CLASS_OPERATION_COUNT = GEN_CLASSIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.kanafghan.welipse.joomlagen.impl.GenTypedElementImpl <em>Gen Typed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.kanafghan.welipse.joomlagen.impl.GenTypedElementImpl
	 * @see com.github.kanafghan.welipse.joomlagen.impl.JoomlaGenPackageImpl#getGenTypedElement()
	 * @generated
	 */
	int GEN_TYPED_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_TYPED_ELEMENT__TYPE = 0;

	/**
	 * The number of structural features of the '<em>Gen Typed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_TYPED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Gen Typed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_TYPED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.github.kanafghan.welipse.joomlagen.impl.GenFeatureImpl <em>Gen Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.kanafghan.welipse.joomlagen.impl.GenFeatureImpl
	 * @see com.github.kanafghan.welipse.joomlagen.impl.JoomlaGenPackageImpl#getGenFeature()
	 * @generated
	 */
	int GEN_FEATURE = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_FEATURE__TYPE = GEN_TYPED_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Gen Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_FEATURE__GEN_CLASS = GEN_TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_FEATURE__NAME = GEN_TYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Form Field Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_FEATURE__FORM_FIELD_LABEL = GEN_TYPED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Form Field Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_FEATURE__FORM_FIELD_DESCRIPTION = GEN_TYPED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_FEATURE__NULLABLE = GEN_TYPED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Gen Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_FEATURE_FEATURE_COUNT = GEN_TYPED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Gen Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_FEATURE_OPERATION_COUNT = GEN_TYPED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.kanafghan.welipse.joomlagen.impl.GenAttributeImpl <em>Gen Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.kanafghan.welipse.joomlagen.impl.GenAttributeImpl
	 * @see com.github.kanafghan.welipse.joomlagen.impl.JoomlaGenPackageImpl#getGenAttribute()
	 * @generated
	 */
	int GEN_ATTRIBUTE = 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ATTRIBUTE__TYPE = GEN_FEATURE__TYPE;

	/**
	 * The feature id for the '<em><b>Gen Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ATTRIBUTE__GEN_CLASS = GEN_FEATURE__GEN_CLASS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ATTRIBUTE__NAME = GEN_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Form Field Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ATTRIBUTE__FORM_FIELD_LABEL = GEN_FEATURE__FORM_FIELD_LABEL;

	/**
	 * The feature id for the '<em><b>Form Field Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ATTRIBUTE__FORM_FIELD_DESCRIPTION = GEN_FEATURE__FORM_FIELD_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ATTRIBUTE__NULLABLE = GEN_FEATURE__NULLABLE;

	/**
	 * The feature id for the '<em><b>Form Field Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ATTRIBUTE__FORM_FIELD_TYPE = GEN_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Database Column Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ATTRIBUTE__DATABASE_COLUMN_TYPE = GEN_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ecore Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ATTRIBUTE__ECORE_ATTRIBUTE = GEN_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Gen Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ATTRIBUTE_FEATURE_COUNT = GEN_FEATURE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Gen Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ATTRIBUTE_OPERATION_COUNT = GEN_FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.kanafghan.welipse.joomlagen.impl.GenReferenceImpl <em>Gen Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.kanafghan.welipse.joomlagen.impl.GenReferenceImpl
	 * @see com.github.kanafghan.welipse.joomlagen.impl.JoomlaGenPackageImpl#getGenReference()
	 * @generated
	 */
	int GEN_REFERENCE = 7;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_REFERENCE__TYPE = GEN_FEATURE__TYPE;

	/**
	 * The feature id for the '<em><b>Gen Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_REFERENCE__GEN_CLASS = GEN_FEATURE__GEN_CLASS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_REFERENCE__NAME = GEN_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Form Field Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_REFERENCE__FORM_FIELD_LABEL = GEN_FEATURE__FORM_FIELD_LABEL;

	/**
	 * The feature id for the '<em><b>Form Field Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_REFERENCE__FORM_FIELD_DESCRIPTION = GEN_FEATURE__FORM_FIELD_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_REFERENCE__NULLABLE = GEN_FEATURE__NULLABLE;

	/**
	 * The feature id for the '<em><b>Ecore Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_REFERENCE__ECORE_REFERENCE = GEN_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Opposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_REFERENCE__OPPOSITE = GEN_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Database Column Generation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_REFERENCE__DATABASE_COLUMN_GENERATION = GEN_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>One To Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_REFERENCE__ONE_TO_MANY = GEN_FEATURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Many To Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_REFERENCE__MANY_TO_MANY = GEN_FEATURE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_REFERENCE__MANY = GEN_FEATURE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Gen Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_REFERENCE_FEATURE_COUNT = GEN_FEATURE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Gen Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_REFERENCE_OPERATION_COUNT = GEN_FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.kanafghan.welipse.joomlagen.impl.DatabaseTableImpl <em>Database Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.kanafghan.welipse.joomlagen.impl.DatabaseTableImpl
	 * @see com.github.kanafghan.welipse.joomlagen.impl.JoomlaGenPackageImpl#getDatabaseTable()
	 * @generated
	 */
	int DATABASE_TABLE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_TABLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Gen Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_TABLE__GEN_CLASS = 1;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_TABLE__COLUMNS = 2;

	/**
	 * The feature id for the '<em><b>Foreign Keys</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_TABLE__FOREIGN_KEYS = 3;

	/**
	 * The number of structural features of the '<em>Database Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_TABLE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Database Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_TABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.github.kanafghan.welipse.joomlagen.impl.GenOperationImpl <em>Gen Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.kanafghan.welipse.joomlagen.impl.GenOperationImpl
	 * @see com.github.kanafghan.welipse.joomlagen.impl.JoomlaGenPackageImpl#getGenOperation()
	 * @generated
	 */
	int GEN_OPERATION = 9;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_OPERATION__TYPE = GEN_TYPED_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Gen Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_OPERATION__GEN_PARAMETERS = GEN_TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gen Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_OPERATION__GEN_CLASS = GEN_TYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ecore Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_OPERATION__ECORE_OPERATION = GEN_TYPED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Gen Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_OPERATION_FEATURE_COUNT = GEN_TYPED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Gen Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_OPERATION_OPERATION_COUNT = GEN_TYPED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.kanafghan.welipse.joomlagen.impl.GenParameterImpl <em>Gen Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.kanafghan.welipse.joomlagen.impl.GenParameterImpl
	 * @see com.github.kanafghan.welipse.joomlagen.impl.JoomlaGenPackageImpl#getGenParameter()
	 * @generated
	 */
	int GEN_PARAMETER = 10;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PARAMETER__TYPE = GEN_TYPED_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Gen Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PARAMETER__GEN_OPERATION = GEN_TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ecore Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PARAMETER__ECORE_PARAMETER = GEN_TYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Gen Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PARAMETER_FEATURE_COUNT = GEN_TYPED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Gen Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PARAMETER_OPERATION_COUNT = GEN_TYPED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.kanafghan.welipse.joomlagen.impl.GenDataTypeImpl <em>Gen Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.kanafghan.welipse.joomlagen.impl.GenDataTypeImpl
	 * @see com.github.kanafghan.welipse.joomlagen.impl.JoomlaGenPackageImpl#getGenDataType()
	 * @generated
	 */
	int GEN_DATA_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Gen Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DATA_TYPE__GEN_PACKAGE = GEN_CLASSIFIER__GEN_PACKAGE;

	/**
	 * The feature id for the '<em><b>Ecore Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DATA_TYPE__ECORE_DATA_TYPE = GEN_CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gen Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DATA_TYPE_FEATURE_COUNT = GEN_CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Gen Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DATA_TYPE_OPERATION_COUNT = GEN_CLASSIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.kanafghan.welipse.joomlagen.ExtensionType <em>Extension Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.kanafghan.welipse.joomlagen.ExtensionType
	 * @see com.github.kanafghan.welipse.joomlagen.impl.JoomlaGenPackageImpl#getExtensionType()
	 * @generated
	 */
	int EXTENSION_TYPE = 12;

	/**
	 * The meta object id for the '{@link com.github.kanafghan.welipse.joomlagen.JoomlaVersion <em>Joomla Version</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.kanafghan.welipse.joomlagen.JoomlaVersion
	 * @see com.github.kanafghan.welipse.joomlagen.impl.JoomlaGenPackageImpl#getJoomlaVersion()
	 * @generated
	 */
	int JOOMLA_VERSION = 13;


	/**
	 * The meta object id for the '{@link com.github.kanafghan.welipse.joomlagen.FormFieldType <em>Form Field Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.kanafghan.welipse.joomlagen.FormFieldType
	 * @see com.github.kanafghan.welipse.joomlagen.impl.JoomlaGenPackageImpl#getFormFieldType()
	 * @generated
	 */
	int FORM_FIELD_TYPE = 14;

	/**
	 * The meta object id for the '{@link com.github.kanafghan.welipse.joomlagen.DatabaseColumnType <em>Database Column Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.kanafghan.welipse.joomlagen.DatabaseColumnType
	 * @see com.github.kanafghan.welipse.joomlagen.impl.JoomlaGenPackageImpl#getDatabaseColumnType()
	 * @generated
	 */
	int DATABASE_COLUMN_TYPE = 15;

	/**
	 * The meta object id for the '{@link com.github.kanafghan.welipse.joomlagen.ForeignKeyGeneration <em>Foreign Key Generation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.kanafghan.welipse.joomlagen.ForeignKeyGeneration
	 * @see com.github.kanafghan.welipse.joomlagen.impl.JoomlaGenPackageImpl#getForeignKeyGeneration()
	 * @generated
	 */
	int FOREIGN_KEY_GENERATION = 16;


	/**
	 * Returns the meta object for class '{@link com.github.kanafghan.welipse.joomlagen.JoomlaGenModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenModel
	 * @generated
	 */
	EClass getJoomlaGenModel();

	/**
	 * Returns the meta object for the attribute '{@link com.github.kanafghan.welipse.joomlagen.JoomlaGenModel#getExtensionType <em>Extension Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extension Type</em>'.
	 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenModel#getExtensionType()
	 * @see #getJoomlaGenModel()
	 * @generated
	 */
	EAttribute getJoomlaGenModel_ExtensionType();

	/**
	 * Returns the meta object for the attribute '{@link com.github.kanafghan.welipse.joomlagen.JoomlaGenModel#getJoomlaVersion <em>Joomla Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Joomla Version</em>'.
	 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenModel#getJoomlaVersion()
	 * @see #getJoomlaGenModel()
	 * @generated
	 */
	EAttribute getJoomlaGenModel_JoomlaVersion();

	/**
	 * Returns the meta object for the reference '{@link com.github.kanafghan.welipse.joomlagen.JoomlaGenModel#getWebmodel <em>Webmodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Webmodel</em>'.
	 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenModel#getWebmodel()
	 * @see #getJoomlaGenModel()
	 * @generated
	 */
	EReference getJoomlaGenModel_Webmodel();

	/**
	 * Returns the meta object for the attribute '{@link com.github.kanafghan.welipse.joomlagen.JoomlaGenModel#getCustomCSSFiles <em>Custom CSS Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Custom CSS Files</em>'.
	 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenModel#getCustomCSSFiles()
	 * @see #getJoomlaGenModel()
	 * @generated
	 */
	EAttribute getJoomlaGenModel_CustomCSSFiles();

	/**
	 * Returns the meta object for the attribute '{@link com.github.kanafghan.welipse.joomlagen.JoomlaGenModel#getExtensionName <em>Extension Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extension Name</em>'.
	 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenModel#getExtensionName()
	 * @see #getJoomlaGenModel()
	 * @generated
	 */
	EAttribute getJoomlaGenModel_ExtensionName();

	/**
	 * Returns the meta object for the attribute '{@link com.github.kanafghan.welipse.joomlagen.JoomlaGenModel#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenModel#getCreationDate()
	 * @see #getJoomlaGenModel()
	 * @generated
	 */
	EAttribute getJoomlaGenModel_CreationDate();

	/**
	 * Returns the meta object for the attribute '{@link com.github.kanafghan.welipse.joomlagen.JoomlaGenModel#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenModel#getAuthor()
	 * @see #getJoomlaGenModel()
	 * @generated
	 */
	EAttribute getJoomlaGenModel_Author();

	/**
	 * Returns the meta object for the attribute '{@link com.github.kanafghan.welipse.joomlagen.JoomlaGenModel#getAuthorEmail <em>Author Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author Email</em>'.
	 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenModel#getAuthorEmail()
	 * @see #getJoomlaGenModel()
	 * @generated
	 */
	EAttribute getJoomlaGenModel_AuthorEmail();

	/**
	 * Returns the meta object for the attribute '{@link com.github.kanafghan.welipse.joomlagen.JoomlaGenModel#getAuthorURL <em>Author URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author URL</em>'.
	 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenModel#getAuthorURL()
	 * @see #getJoomlaGenModel()
	 * @generated
	 */
	EAttribute getJoomlaGenModel_AuthorURL();

	/**
	 * Returns the meta object for the attribute '{@link com.github.kanafghan.welipse.joomlagen.JoomlaGenModel#getCopyright <em>Copyright</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Copyright</em>'.
	 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenModel#getCopyright()
	 * @see #getJoomlaGenModel()
	 * @generated
	 */
	EAttribute getJoomlaGenModel_Copyright();

	/**
	 * Returns the meta object for the attribute '{@link com.github.kanafghan.welipse.joomlagen.JoomlaGenModel#getLicense <em>License</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>License</em>'.
	 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenModel#getLicense()
	 * @see #getJoomlaGenModel()
	 * @generated
	 */
	EAttribute getJoomlaGenModel_License();

	/**
	 * Returns the meta object for the attribute '{@link com.github.kanafghan.welipse.joomlagen.JoomlaGenModel#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenModel#getVersion()
	 * @see #getJoomlaGenModel()
	 * @generated
	 */
	EAttribute getJoomlaGenModel_Version();

	/**
	 * Returns the meta object for the attribute '{@link com.github.kanafghan.welipse.joomlagen.JoomlaGenModel#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenModel#getDescription()
	 * @see #getJoomlaGenModel()
	 * @generated
	 */
	EAttribute getJoomlaGenModel_Description();

	/**
	 * Returns the meta object for the attribute '{@link com.github.kanafghan.welipse.joomlagen.JoomlaGenModel#getDatabaseTablePrefix <em>Database Table Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Database Table Prefix</em>'.
	 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenModel#getDatabaseTablePrefix()
	 * @see #getJoomlaGenModel()
	 * @generated
	 */
	EAttribute getJoomlaGenModel_DatabaseTablePrefix();

	/**
	 * Returns the meta object for the attribute '{@link com.github.kanafghan.welipse.joomlagen.JoomlaGenModel#getComponentName <em>Component Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Name</em>'.
	 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenModel#getComponentName()
	 * @see #getJoomlaGenModel()
	 * @generated
	 */
	EAttribute getJoomlaGenModel_ComponentName();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.kanafghan.welipse.joomlagen.JoomlaGenModel#getDatabaseTables <em>Database Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Database Tables</em>'.
	 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenModel#getDatabaseTables()
	 * @see #getJoomlaGenModel()
	 * @generated
	 */
	EReference getJoomlaGenModel_DatabaseTables();

	/**
	 * Returns the meta object for the attribute '{@link com.github.kanafghan.welipse.joomlagen.JoomlaGenModel#getInitialData <em>Initial Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Data</em>'.
	 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenModel#getInitialData()
	 * @see #getJoomlaGenModel()
	 * @generated
	 */
	EAttribute getJoomlaGenModel_InitialData();

	/**
	 * Returns the meta object for the '{@link com.github.kanafghan.welipse.joomlagen.JoomlaGenModel#getAssociationTableName(com.github.kanafghan.welipse.joomlagen.GenClass, com.github.kanafghan.welipse.joomlagen.GenClass) <em>Get Association Table Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Association Table Name</em>' operation.
	 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenModel#getAssociationTableName(com.github.kanafghan.welipse.joomlagen.GenClass, com.github.kanafghan.welipse.joomlagen.GenClass)
	 * @generated
	 */
	EOperation getJoomlaGenModel__GetAssociationTableName__GenClass_GenClass();

	/**
	 * Returns the meta object for class '{@link com.github.kanafghan.welipse.joomlagen.GenPackage <em>Gen Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Package</em>'.
	 * @see com.github.kanafghan.welipse.joomlagen.GenPackage
	 * @generated
	 */
	EClass getGenPackage();

	/**
	 * Returns the meta object for the reference '{@link com.github.kanafghan.welipse.joomlagen.GenPackage#getEcorePackage <em>Ecore Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ecore Package</em>'.
	 * @see com.github.kanafghan.welipse.joomlagen.GenPackage#getEcorePackage()
	 * @see #getGenPackage()
	 * @generated
	 */
	EReference getGenPackage_EcorePackage();

	/**
	 * Returns the meta object for the reference list '{@link com.github.kanafghan.welipse.joomlagen.GenPackage#getGenClassifiers <em>Gen Classifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gen Classifiers</em>'.
	 * @see com.github.kanafghan.welipse.joomlagen.GenPackage#getGenClassifiers()
	 * @see #getGenPackage()
	 * @generated
	 */
	EReference getGenPackage_GenClassifiers();

	/**
	 * Returns the meta object for the container reference '{@link com.github.kanafghan.welipse.joomlagen.GenPackage#getGenModel <em>Gen Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Gen Model</em>'.
	 * @see com.github.kanafghan.welipse.joomlagen.GenPackage#getGenModel()
	 * @see #getGenPackage()
	 * @generated
	 */
	EReference getGenPackage_GenModel();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.kanafghan.welipse.joomlagen.GenPackage#getGenClasses <em>Gen Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gen Classes</em>'.
	 * @see com.github.kanafghan.welipse.joomlagen.GenPackage#getGenClasses()
	 * @see #getGenPackage()
	 * @generated
	 */
	EReference getGenPackage_GenClasses();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.kanafghan.welipse.joomlagen.GenPackage#getGenDataTypes <em>Gen Data Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gen Data Types</em>'.
	 * @see com.github.kanafghan.welipse.joomlagen.GenPackage#getGenDataTypes()
	 * @see #getGenPackage()
	 * @generated
	 */
	EReference getGenPackage_GenDataTypes();

	/**
	 * Returns the meta object for class '{@link com.github.kanafghan.welipse.joomlagen.GenClassifier <em>Gen Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Classifier</em>'.
	 * @see com.github.kanafghan.welipse.joomlagen.GenClassifier
	 * @generated
	 */
	EClass getGenClassifier();

	/**
	 * Returns the meta object for the reference '{@link com.github.kanafghan.welipse.joomlagen.GenClassifier#getGenPackage <em>Gen Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gen Package</em>'.
	 * @see com.github.kanafghan.welipse.joomlagen.GenClassifier#getGenPackage()
	 * @see #getGenClassifier()
	 * @generated
	 */
	EReference getGenClassifier_GenPackage();

	/**
	 * Returns the meta object for class '{@link com.github.kanafghan.welipse.joomlagen.GenClass <em>Gen Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Class</em>'.
	 * @see com.github.kanafghan.welipse.joomlagen.GenClass
	 * @generated
	 */
	EClass getGenClass();

	/**
	 * Returns the meta object for the reference '{@link com.github.kanafghan.welipse.joomlagen.GenClass#getEcoreClass <em>Ecore Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ecore Class</em>'.
	 * @see com.github.kanafghan.welipse.joomlagen.GenClass#getEcoreClass()
	 * @see #getGenClass()
	 * @generated
	 */
	EReference getGenClass_EcoreClass();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.kanafghan.welipse.joomlagen.GenClass#getGenFeatures <em>Gen Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gen Features</em>'.
	 * @see com.github.kanafghan.welipse.joomlagen.GenClass#getGenFeatures()
	 * @see #getGenClass()
	 * @generated
	 */
	EReference getGenClass_GenFeatures();

	/**
	 * Returns the meta object for the attribute '{@link com.github.kanafghan.welipse.joomlagen.GenClass#isGenerateContentManager <em>Generate Content Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generate Content Manager</em>'.
	 * @see com.github.kanafghan.welipse.joomlagen.GenClass#isGenerateContentManager()
	 * @see #getGenClass()
	 * @generated
	 */
	EAttribute getGenClass_GenerateContentManager();

	/**
	 * Returns the meta object for the attribute '{@link com.github.kanafghan.welipse.joomlagen.GenClass#getItemMVCName <em>Item MVC Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Item MVC Name</em>'.
	 * @see com.github.kanafghan.welipse.joomlagen.GenClass#getItemMVCName()
	 * @see #getGenClass()
	 * @generated
	 */
	EAttribute getGenClass_ItemMVCName();

	/**
	 * Returns the meta object for the attribute '{@link com.github.kanafghan.welipse.joomlagen.GenClass#getListMVCName <em>List MVC Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>List MVC Name</em>'.
	 * @see com.github.kanafghan.welipse.joomlagen.GenClass#getListMVCName()
	 * @see #getGenClass()
	 * @generated
	 */
	EAttribute getGenClass_ListMVCName();

	/**
	 * Returns the meta object for the attribute '{@link com.github.kanafghan.welipse.joomlagen.GenClass#getDatabaseTableName <em>Database Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Database Table Name</em>'.
	 * @see com.github.kanafghan.welipse.joomlagen.GenClass#getDatabaseTableName()
	 * @see #getGenClass()
	 * @generated
	 */
	EAttribute getGenClass_DatabaseTableName();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.kanafghan.welipse.joomlagen.GenClass#getGenOperations <em>Gen Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gen Operations</em>'.
	 * @see com.github.kanafghan.welipse.joomlagen.GenClass#getGenOperations()
	 * @see #getGenClass()
	 * @generated
	 */
	EReference getGenClass_GenOperations();

	/**
	 * Returns the meta object for class '{@link com.github.kanafghan.welipse.joomlagen.GenTypedElement <em>Gen Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Typed Element</em>'.
	 * @see com.github.kanafghan.welipse.joomlagen.GenTypedElement
	 * @generated
	 */
	EClass getGenTypedElement();

	/**
	 * Returns the meta object for the reference '{@link com.github.kanafghan.welipse.joomlagen.GenTypedElement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see com.github.kanafghan.welipse.joomlagen.GenTypedElement#getType()
	 * @see #getGenTypedElement()
	 * @generated
	 */
	EReference getGenTypedElement_Type();

	/**
	 * Returns the meta object for class '{@link com.github.kanafghan.welipse.joomlagen.GenFeature <em>Gen Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Feature</em>'.
	 * @see com.github.kanafghan.welipse.joomlagen.GenFeature
	 * @generated
	 */
	EClass getGenFeature();

	/**
	 * Returns the meta object for the container reference '{@link com.github.kanafghan.welipse.joomlagen.GenFeature#getGenClass <em>Gen Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Gen Class</em>'.
	 * @see com.github.kanafghan.welipse.joomlagen.GenFeature#getGenClass()
	 * @see #getGenFeature()
	 * @generated
	 */
	EReference getGenFeature_GenClass();

	/**
	 * Returns the meta object for the attribute '{@link com.github.kanafghan.welipse.joomlagen.GenFeature#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.github.kanafghan.welipse.joomlagen.GenFeature#getName()
	 * @see #getGenFeature()
	 * @generated
	 */
	EAttribute getGenFeature_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.github.kanafghan.welipse.joomlagen.GenFeature#getFormFieldLabel <em>Form Field Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Form Field Label</em>'.
	 * @see com.github.kanafghan.welipse.joomlagen.GenFeature#getFormFieldLabel()
	 * @see #getGenFeature()
	 * @generated
	 */
	EAttribute getGenFeature_FormFieldLabel();

	/**
	 * Returns the meta object for the attribute '{@link com.github.kanafghan.welipse.joomlagen.GenFeature#getFormFieldDescription <em>Form Field Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Form Field Description</em>'.
	 * @see com.github.kanafghan.welipse.joomlagen.GenFeature#getFormFieldDescription()
	 * @see #getGenFeature()
	 * @generated
	 */
	EAttribute getGenFeature_FormFieldDescription();

	/**
	 * Returns the meta object for the attribute '{@link com.github.kanafghan.welipse.joomlagen.GenFeature#isNullable <em>Nullable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nullable</em>'.
	 * @see com.github.kanafghan.welipse.joomlagen.GenFeature#isNullable()
	 * @see #getGenFeature()
	 * @generated
	 */
	EAttribute getGenFeature_Nullable();

	/**
	 * Returns the meta object for class '{@link com.github.kanafghan.welipse.joomlagen.GenAttribute <em>Gen Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Attribute</em>'.
	 * @see com.github.kanafghan.welipse.joomlagen.GenAttribute
	 * @generated
	 */
	EClass getGenAttribute();

	/**
	 * Returns the meta object for the attribute '{@link com.github.kanafghan.welipse.joomlagen.GenAttribute#getFormFieldType <em>Form Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Form Field Type</em>'.
	 * @see com.github.kanafghan.welipse.joomlagen.GenAttribute#getFormFieldType()
	 * @see #getGenAttribute()
	 * @generated
	 */
	EAttribute getGenAttribute_FormFieldType();

	/**
	 * Returns the meta object for the attribute '{@link com.github.kanafghan.welipse.joomlagen.GenAttribute#getDatabaseColumnType <em>Database Column Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Database Column Type</em>'.
	 * @see com.github.kanafghan.welipse.joomlagen.GenAttribute#getDatabaseColumnType()
	 * @see #getGenAttribute()
	 * @generated
	 */
	EAttribute getGenAttribute_DatabaseColumnType();

	/**
	 * Returns the meta object for the reference '{@link com.github.kanafghan.welipse.joomlagen.GenAttribute#getEcoreAttribute <em>Ecore Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ecore Attribute</em>'.
	 * @see com.github.kanafghan.welipse.joomlagen.GenAttribute#getEcoreAttribute()
	 * @see #getGenAttribute()
	 * @generated
	 */
	EReference getGenAttribute_EcoreAttribute();

	/**
	 * Returns the meta object for class '{@link com.github.kanafghan.welipse.joomlagen.GenReference <em>Gen Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Reference</em>'.
	 * @see com.github.kanafghan.welipse.joomlagen.GenReference
	 * @generated
	 */
	EClass getGenReference();

	/**
	 * Returns the meta object for the reference '{@link com.github.kanafghan.welipse.joomlagen.GenReference#getEcoreReference <em>Ecore Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ecore Reference</em>'.
	 * @see com.github.kanafghan.welipse.joomlagen.GenReference#getEcoreReference()
	 * @see #getGenReference()
	 * @generated
	 */
	EReference getGenReference_EcoreReference();

	/**
	 * Returns the meta object for the reference '{@link com.github.kanafghan.welipse.joomlagen.GenReference#getOpposite <em>Opposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Opposite</em>'.
	 * @see com.github.kanafghan.welipse.joomlagen.GenReference#getOpposite()
	 * @see #getGenReference()
	 * @generated
	 */
	EReference getGenReference_Opposite();

	/**
	 * Returns the meta object for the attribute '{@link com.github.kanafghan.welipse.joomlagen.GenReference#getDatabaseColumnGeneration <em>Database Column Generation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Database Column Generation</em>'.
	 * @see com.github.kanafghan.welipse.joomlagen.GenReference#getDatabaseColumnGeneration()
	 * @see #getGenReference()
	 * @generated
	 */
	EAttribute getGenReference_DatabaseColumnGeneration();

	/**
	 * Returns the meta object for the attribute '{@link com.github.kanafghan.welipse.joomlagen.GenReference#isManyToMany <em>Many To Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Many To Many</em>'.
	 * @see com.github.kanafghan.welipse.joomlagen.GenReference#isManyToMany()
	 * @see #getGenReference()
	 * @generated
	 */
	EAttribute getGenReference_ManyToMany();

	/**
	 * Returns the meta object for the attribute '{@link com.github.kanafghan.welipse.joomlagen.GenReference#isMany <em>Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Many</em>'.
	 * @see com.github.kanafghan.welipse.joomlagen.GenReference#isMany()
	 * @see #getGenReference()
	 * @generated
	 */
	EAttribute getGenReference_Many();

	/**
	 * Returns the meta object for the attribute '{@link com.github.kanafghan.welipse.joomlagen.GenReference#isOneToMany <em>One To Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>One To Many</em>'.
	 * @see com.github.kanafghan.welipse.joomlagen.GenReference#isOneToMany()
	 * @see #getGenReference()
	 * @generated
	 */
	EAttribute getGenReference_OneToMany();

	/**
	 * Returns the meta object for class '{@link com.github.kanafghan.welipse.joomlagen.DatabaseTable <em>Database Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database Table</em>'.
	 * @see com.github.kanafghan.welipse.joomlagen.DatabaseTable
	 * @generated
	 */
	EClass getDatabaseTable();

	/**
	 * Returns the meta object for the attribute '{@link com.github.kanafghan.welipse.joomlagen.DatabaseTable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.github.kanafghan.welipse.joomlagen.DatabaseTable#getName()
	 * @see #getDatabaseTable()
	 * @generated
	 */
	EAttribute getDatabaseTable_Name();

	/**
	 * Returns the meta object for the reference '{@link com.github.kanafghan.welipse.joomlagen.DatabaseTable#getGenClass <em>Gen Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gen Class</em>'.
	 * @see com.github.kanafghan.welipse.joomlagen.DatabaseTable#getGenClass()
	 * @see #getDatabaseTable()
	 * @generated
	 */
	EReference getDatabaseTable_GenClass();

	/**
	 * Returns the meta object for the reference list '{@link com.github.kanafghan.welipse.joomlagen.DatabaseTable#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Columns</em>'.
	 * @see com.github.kanafghan.welipse.joomlagen.DatabaseTable#getColumns()
	 * @see #getDatabaseTable()
	 * @generated
	 */
	EReference getDatabaseTable_Columns();

	/**
	 * Returns the meta object for the reference list '{@link com.github.kanafghan.welipse.joomlagen.DatabaseTable#getForeignKeys <em>Foreign Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Foreign Keys</em>'.
	 * @see com.github.kanafghan.welipse.joomlagen.DatabaseTable#getForeignKeys()
	 * @see #getDatabaseTable()
	 * @generated
	 */
	EReference getDatabaseTable_ForeignKeys();

	/**
	 * Returns the meta object for class '{@link com.github.kanafghan.welipse.joomlagen.GenOperation <em>Gen Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Operation</em>'.
	 * @see com.github.kanafghan.welipse.joomlagen.GenOperation
	 * @generated
	 */
	EClass getGenOperation();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.kanafghan.welipse.joomlagen.GenOperation#getGenParameters <em>Gen Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gen Parameters</em>'.
	 * @see com.github.kanafghan.welipse.joomlagen.GenOperation#getGenParameters()
	 * @see #getGenOperation()
	 * @generated
	 */
	EReference getGenOperation_GenParameters();

	/**
	 * Returns the meta object for the container reference '{@link com.github.kanafghan.welipse.joomlagen.GenOperation#getGenClass <em>Gen Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Gen Class</em>'.
	 * @see com.github.kanafghan.welipse.joomlagen.GenOperation#getGenClass()
	 * @see #getGenOperation()
	 * @generated
	 */
	EReference getGenOperation_GenClass();

	/**
	 * Returns the meta object for the reference '{@link com.github.kanafghan.welipse.joomlagen.GenOperation#getEcoreOperation <em>Ecore Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ecore Operation</em>'.
	 * @see com.github.kanafghan.welipse.joomlagen.GenOperation#getEcoreOperation()
	 * @see #getGenOperation()
	 * @generated
	 */
	EReference getGenOperation_EcoreOperation();

	/**
	 * Returns the meta object for class '{@link com.github.kanafghan.welipse.joomlagen.GenParameter <em>Gen Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Parameter</em>'.
	 * @see com.github.kanafghan.welipse.joomlagen.GenParameter
	 * @generated
	 */
	EClass getGenParameter();

	/**
	 * Returns the meta object for the container reference '{@link com.github.kanafghan.welipse.joomlagen.GenParameter#getGenOperation <em>Gen Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Gen Operation</em>'.
	 * @see com.github.kanafghan.welipse.joomlagen.GenParameter#getGenOperation()
	 * @see #getGenParameter()
	 * @generated
	 */
	EReference getGenParameter_GenOperation();

	/**
	 * Returns the meta object for the reference '{@link com.github.kanafghan.welipse.joomlagen.GenParameter#getEcoreParameter <em>Ecore Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ecore Parameter</em>'.
	 * @see com.github.kanafghan.welipse.joomlagen.GenParameter#getEcoreParameter()
	 * @see #getGenParameter()
	 * @generated
	 */
	EReference getGenParameter_EcoreParameter();

	/**
	 * Returns the meta object for class '{@link com.github.kanafghan.welipse.joomlagen.GenDataType <em>Gen Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Data Type</em>'.
	 * @see com.github.kanafghan.welipse.joomlagen.GenDataType
	 * @generated
	 */
	EClass getGenDataType();

	/**
	 * Returns the meta object for the reference '{@link com.github.kanafghan.welipse.joomlagen.GenDataType#getEcoreDataType <em>Ecore Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ecore Data Type</em>'.
	 * @see com.github.kanafghan.welipse.joomlagen.GenDataType#getEcoreDataType()
	 * @see #getGenDataType()
	 * @generated
	 */
	EReference getGenDataType_EcoreDataType();

	/**
	 * Returns the meta object for the containment reference '{@link com.github.kanafghan.welipse.joomlagen.JoomlaGenModel#getDatamodel <em>Datamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Datamodel</em>'.
	 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenModel#getDatamodel()
	 * @see #getJoomlaGenModel()
	 * @generated
	 */
	EReference getJoomlaGenModel_Datamodel();

	/**
	 * Returns the meta object for the attribute '{@link com.github.kanafghan.welipse.joomlagen.JoomlaGenModel#isUseBootstrap <em>Use Bootstrap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Bootstrap</em>'.
	 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenModel#isUseBootstrap()
	 * @see #getJoomlaGenModel()
	 * @generated
	 */
	EAttribute getJoomlaGenModel_UseBootstrap();

	/**
	 * Returns the meta object for the attribute '{@link com.github.kanafghan.welipse.joomlagen.JoomlaGenModel#isMinifiedBootsrap <em>Minified Bootsrap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minified Bootsrap</em>'.
	 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenModel#isMinifiedBootsrap()
	 * @see #getJoomlaGenModel()
	 * @generated
	 */
	EAttribute getJoomlaGenModel_MinifiedBootsrap();

	/**
	 * Returns the meta object for enum '{@link com.github.kanafghan.welipse.joomlagen.ExtensionType <em>Extension Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Extension Type</em>'.
	 * @see com.github.kanafghan.welipse.joomlagen.ExtensionType
	 * @generated
	 */
	EEnum getExtensionType();

	/**
	 * Returns the meta object for enum '{@link com.github.kanafghan.welipse.joomlagen.JoomlaVersion <em>Joomla Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Joomla Version</em>'.
	 * @see com.github.kanafghan.welipse.joomlagen.JoomlaVersion
	 * @generated
	 */
	EEnum getJoomlaVersion();

	/**
	 * Returns the meta object for enum '{@link com.github.kanafghan.welipse.joomlagen.FormFieldType <em>Form Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Form Field Type</em>'.
	 * @see com.github.kanafghan.welipse.joomlagen.FormFieldType
	 * @generated
	 */
	EEnum getFormFieldType();

	/**
	 * Returns the meta object for enum '{@link com.github.kanafghan.welipse.joomlagen.DatabaseColumnType <em>Database Column Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Database Column Type</em>'.
	 * @see com.github.kanafghan.welipse.joomlagen.DatabaseColumnType
	 * @generated
	 */
	EEnum getDatabaseColumnType();

	/**
	 * Returns the meta object for enum '{@link com.github.kanafghan.welipse.joomlagen.ForeignKeyGeneration <em>Foreign Key Generation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Foreign Key Generation</em>'.
	 * @see com.github.kanafghan.welipse.joomlagen.ForeignKeyGeneration
	 * @generated
	 */
	EEnum getForeignKeyGeneration();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	JoomlaGenFactory getJoomlaGenFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.github.kanafghan.welipse.joomlagen.impl.JoomlaGenModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.kanafghan.welipse.joomlagen.impl.JoomlaGenModelImpl
		 * @see com.github.kanafghan.welipse.joomlagen.impl.JoomlaGenPackageImpl#getJoomlaGenModel()
		 * @generated
		 */
		EClass JOOMLA_GEN_MODEL = eINSTANCE.getJoomlaGenModel();

		/**
		 * The meta object literal for the '<em><b>Extension Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOOMLA_GEN_MODEL__EXTENSION_TYPE = eINSTANCE.getJoomlaGenModel_ExtensionType();

		/**
		 * The meta object literal for the '<em><b>Joomla Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOOMLA_GEN_MODEL__JOOMLA_VERSION = eINSTANCE.getJoomlaGenModel_JoomlaVersion();

		/**
		 * The meta object literal for the '<em><b>Webmodel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOOMLA_GEN_MODEL__WEBMODEL = eINSTANCE.getJoomlaGenModel_Webmodel();

		/**
		 * The meta object literal for the '<em><b>Custom CSS Files</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOOMLA_GEN_MODEL__CUSTOM_CSS_FILES = eINSTANCE.getJoomlaGenModel_CustomCSSFiles();

		/**
		 * The meta object literal for the '<em><b>Extension Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOOMLA_GEN_MODEL__EXTENSION_NAME = eINSTANCE.getJoomlaGenModel_ExtensionName();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOOMLA_GEN_MODEL__CREATION_DATE = eINSTANCE.getJoomlaGenModel_CreationDate();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOOMLA_GEN_MODEL__AUTHOR = eINSTANCE.getJoomlaGenModel_Author();

		/**
		 * The meta object literal for the '<em><b>Author Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOOMLA_GEN_MODEL__AUTHOR_EMAIL = eINSTANCE.getJoomlaGenModel_AuthorEmail();

		/**
		 * The meta object literal for the '<em><b>Author URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOOMLA_GEN_MODEL__AUTHOR_URL = eINSTANCE.getJoomlaGenModel_AuthorURL();

		/**
		 * The meta object literal for the '<em><b>Copyright</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOOMLA_GEN_MODEL__COPYRIGHT = eINSTANCE.getJoomlaGenModel_Copyright();

		/**
		 * The meta object literal for the '<em><b>License</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOOMLA_GEN_MODEL__LICENSE = eINSTANCE.getJoomlaGenModel_License();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOOMLA_GEN_MODEL__VERSION = eINSTANCE.getJoomlaGenModel_Version();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOOMLA_GEN_MODEL__DESCRIPTION = eINSTANCE.getJoomlaGenModel_Description();

		/**
		 * The meta object literal for the '<em><b>Database Table Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOOMLA_GEN_MODEL__DATABASE_TABLE_PREFIX = eINSTANCE.getJoomlaGenModel_DatabaseTablePrefix();

		/**
		 * The meta object literal for the '<em><b>Component Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOOMLA_GEN_MODEL__COMPONENT_NAME = eINSTANCE.getJoomlaGenModel_ComponentName();

		/**
		 * The meta object literal for the '<em><b>Database Tables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOOMLA_GEN_MODEL__DATABASE_TABLES = eINSTANCE.getJoomlaGenModel_DatabaseTables();

		/**
		 * The meta object literal for the '<em><b>Initial Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOOMLA_GEN_MODEL__INITIAL_DATA = eINSTANCE.getJoomlaGenModel_InitialData();

		/**
		 * The meta object literal for the '<em><b>Get Association Table Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JOOMLA_GEN_MODEL___GET_ASSOCIATION_TABLE_NAME__GENCLASS_GENCLASS = eINSTANCE.getJoomlaGenModel__GetAssociationTableName__GenClass_GenClass();

		/**
		 * The meta object literal for the '{@link com.github.kanafghan.welipse.joomlagen.impl.GenPackageImpl <em>Gen Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.kanafghan.welipse.joomlagen.impl.GenPackageImpl
		 * @see com.github.kanafghan.welipse.joomlagen.impl.JoomlaGenPackageImpl#getGenPackage()
		 * @generated
		 */
		EClass GEN_PACKAGE = eINSTANCE.getGenPackage();

		/**
		 * The meta object literal for the '<em><b>Ecore Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_PACKAGE__ECORE_PACKAGE = eINSTANCE.getGenPackage_EcorePackage();

		/**
		 * The meta object literal for the '<em><b>Gen Classifiers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_PACKAGE__GEN_CLASSIFIERS = eINSTANCE.getGenPackage_GenClassifiers();

		/**
		 * The meta object literal for the '<em><b>Gen Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_PACKAGE__GEN_MODEL = eINSTANCE.getGenPackage_GenModel();

		/**
		 * The meta object literal for the '<em><b>Gen Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_PACKAGE__GEN_CLASSES = eINSTANCE.getGenPackage_GenClasses();

		/**
		 * The meta object literal for the '<em><b>Gen Data Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_PACKAGE__GEN_DATA_TYPES = eINSTANCE.getGenPackage_GenDataTypes();

		/**
		 * The meta object literal for the '{@link com.github.kanafghan.welipse.joomlagen.impl.GenClassifierImpl <em>Gen Classifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.kanafghan.welipse.joomlagen.impl.GenClassifierImpl
		 * @see com.github.kanafghan.welipse.joomlagen.impl.JoomlaGenPackageImpl#getGenClassifier()
		 * @generated
		 */
		EClass GEN_CLASSIFIER = eINSTANCE.getGenClassifier();

		/**
		 * The meta object literal for the '<em><b>Gen Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_CLASSIFIER__GEN_PACKAGE = eINSTANCE.getGenClassifier_GenPackage();

		/**
		 * The meta object literal for the '{@link com.github.kanafghan.welipse.joomlagen.impl.GenClassImpl <em>Gen Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.kanafghan.welipse.joomlagen.impl.GenClassImpl
		 * @see com.github.kanafghan.welipse.joomlagen.impl.JoomlaGenPackageImpl#getGenClass()
		 * @generated
		 */
		EClass GEN_CLASS = eINSTANCE.getGenClass();

		/**
		 * The meta object literal for the '<em><b>Ecore Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_CLASS__ECORE_CLASS = eINSTANCE.getGenClass_EcoreClass();

		/**
		 * The meta object literal for the '<em><b>Gen Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_CLASS__GEN_FEATURES = eINSTANCE.getGenClass_GenFeatures();

		/**
		 * The meta object literal for the '<em><b>Generate Content Manager</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_CLASS__GENERATE_CONTENT_MANAGER = eINSTANCE.getGenClass_GenerateContentManager();

		/**
		 * The meta object literal for the '<em><b>Item MVC Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_CLASS__ITEM_MVC_NAME = eINSTANCE.getGenClass_ItemMVCName();

		/**
		 * The meta object literal for the '<em><b>List MVC Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_CLASS__LIST_MVC_NAME = eINSTANCE.getGenClass_ListMVCName();

		/**
		 * The meta object literal for the '<em><b>Database Table Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_CLASS__DATABASE_TABLE_NAME = eINSTANCE.getGenClass_DatabaseTableName();

		/**
		 * The meta object literal for the '<em><b>Gen Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_CLASS__GEN_OPERATIONS = eINSTANCE.getGenClass_GenOperations();

		/**
		 * The meta object literal for the '{@link com.github.kanafghan.welipse.joomlagen.impl.GenTypedElementImpl <em>Gen Typed Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.kanafghan.welipse.joomlagen.impl.GenTypedElementImpl
		 * @see com.github.kanafghan.welipse.joomlagen.impl.JoomlaGenPackageImpl#getGenTypedElement()
		 * @generated
		 */
		EClass GEN_TYPED_ELEMENT = eINSTANCE.getGenTypedElement();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_TYPED_ELEMENT__TYPE = eINSTANCE.getGenTypedElement_Type();

		/**
		 * The meta object literal for the '{@link com.github.kanafghan.welipse.joomlagen.impl.GenFeatureImpl <em>Gen Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.kanafghan.welipse.joomlagen.impl.GenFeatureImpl
		 * @see com.github.kanafghan.welipse.joomlagen.impl.JoomlaGenPackageImpl#getGenFeature()
		 * @generated
		 */
		EClass GEN_FEATURE = eINSTANCE.getGenFeature();

		/**
		 * The meta object literal for the '<em><b>Gen Class</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_FEATURE__GEN_CLASS = eINSTANCE.getGenFeature_GenClass();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_FEATURE__NAME = eINSTANCE.getGenFeature_Name();

		/**
		 * The meta object literal for the '<em><b>Form Field Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_FEATURE__FORM_FIELD_LABEL = eINSTANCE.getGenFeature_FormFieldLabel();

		/**
		 * The meta object literal for the '<em><b>Form Field Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_FEATURE__FORM_FIELD_DESCRIPTION = eINSTANCE.getGenFeature_FormFieldDescription();

		/**
		 * The meta object literal for the '<em><b>Nullable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_FEATURE__NULLABLE = eINSTANCE.getGenFeature_Nullable();

		/**
		 * The meta object literal for the '{@link com.github.kanafghan.welipse.joomlagen.impl.GenAttributeImpl <em>Gen Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.kanafghan.welipse.joomlagen.impl.GenAttributeImpl
		 * @see com.github.kanafghan.welipse.joomlagen.impl.JoomlaGenPackageImpl#getGenAttribute()
		 * @generated
		 */
		EClass GEN_ATTRIBUTE = eINSTANCE.getGenAttribute();

		/**
		 * The meta object literal for the '<em><b>Form Field Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_ATTRIBUTE__FORM_FIELD_TYPE = eINSTANCE.getGenAttribute_FormFieldType();

		/**
		 * The meta object literal for the '<em><b>Database Column Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_ATTRIBUTE__DATABASE_COLUMN_TYPE = eINSTANCE.getGenAttribute_DatabaseColumnType();

		/**
		 * The meta object literal for the '<em><b>Ecore Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_ATTRIBUTE__ECORE_ATTRIBUTE = eINSTANCE.getGenAttribute_EcoreAttribute();

		/**
		 * The meta object literal for the '{@link com.github.kanafghan.welipse.joomlagen.impl.GenReferenceImpl <em>Gen Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.kanafghan.welipse.joomlagen.impl.GenReferenceImpl
		 * @see com.github.kanafghan.welipse.joomlagen.impl.JoomlaGenPackageImpl#getGenReference()
		 * @generated
		 */
		EClass GEN_REFERENCE = eINSTANCE.getGenReference();

		/**
		 * The meta object literal for the '<em><b>Ecore Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_REFERENCE__ECORE_REFERENCE = eINSTANCE.getGenReference_EcoreReference();

		/**
		 * The meta object literal for the '<em><b>Opposite</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_REFERENCE__OPPOSITE = eINSTANCE.getGenReference_Opposite();

		/**
		 * The meta object literal for the '<em><b>Database Column Generation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_REFERENCE__DATABASE_COLUMN_GENERATION = eINSTANCE.getGenReference_DatabaseColumnGeneration();

		/**
		 * The meta object literal for the '<em><b>Many To Many</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_REFERENCE__MANY_TO_MANY = eINSTANCE.getGenReference_ManyToMany();

		/**
		 * The meta object literal for the '<em><b>Many</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_REFERENCE__MANY = eINSTANCE.getGenReference_Many();

		/**
		 * The meta object literal for the '<em><b>One To Many</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_REFERENCE__ONE_TO_MANY = eINSTANCE.getGenReference_OneToMany();

		/**
		 * The meta object literal for the '{@link com.github.kanafghan.welipse.joomlagen.impl.DatabaseTableImpl <em>Database Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.kanafghan.welipse.joomlagen.impl.DatabaseTableImpl
		 * @see com.github.kanafghan.welipse.joomlagen.impl.JoomlaGenPackageImpl#getDatabaseTable()
		 * @generated
		 */
		EClass DATABASE_TABLE = eINSTANCE.getDatabaseTable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE_TABLE__NAME = eINSTANCE.getDatabaseTable_Name();

		/**
		 * The meta object literal for the '<em><b>Gen Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE_TABLE__GEN_CLASS = eINSTANCE.getDatabaseTable_GenClass();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE_TABLE__COLUMNS = eINSTANCE.getDatabaseTable_Columns();

		/**
		 * The meta object literal for the '<em><b>Foreign Keys</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE_TABLE__FOREIGN_KEYS = eINSTANCE.getDatabaseTable_ForeignKeys();

		/**
		 * The meta object literal for the '{@link com.github.kanafghan.welipse.joomlagen.impl.GenOperationImpl <em>Gen Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.kanafghan.welipse.joomlagen.impl.GenOperationImpl
		 * @see com.github.kanafghan.welipse.joomlagen.impl.JoomlaGenPackageImpl#getGenOperation()
		 * @generated
		 */
		EClass GEN_OPERATION = eINSTANCE.getGenOperation();

		/**
		 * The meta object literal for the '<em><b>Gen Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_OPERATION__GEN_PARAMETERS = eINSTANCE.getGenOperation_GenParameters();

		/**
		 * The meta object literal for the '<em><b>Gen Class</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_OPERATION__GEN_CLASS = eINSTANCE.getGenOperation_GenClass();

		/**
		 * The meta object literal for the '<em><b>Ecore Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_OPERATION__ECORE_OPERATION = eINSTANCE.getGenOperation_EcoreOperation();

		/**
		 * The meta object literal for the '{@link com.github.kanafghan.welipse.joomlagen.impl.GenParameterImpl <em>Gen Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.kanafghan.welipse.joomlagen.impl.GenParameterImpl
		 * @see com.github.kanafghan.welipse.joomlagen.impl.JoomlaGenPackageImpl#getGenParameter()
		 * @generated
		 */
		EClass GEN_PARAMETER = eINSTANCE.getGenParameter();

		/**
		 * The meta object literal for the '<em><b>Gen Operation</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_PARAMETER__GEN_OPERATION = eINSTANCE.getGenParameter_GenOperation();

		/**
		 * The meta object literal for the '<em><b>Ecore Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_PARAMETER__ECORE_PARAMETER = eINSTANCE.getGenParameter_EcoreParameter();

		/**
		 * The meta object literal for the '{@link com.github.kanafghan.welipse.joomlagen.impl.GenDataTypeImpl <em>Gen Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.kanafghan.welipse.joomlagen.impl.GenDataTypeImpl
		 * @see com.github.kanafghan.welipse.joomlagen.impl.JoomlaGenPackageImpl#getGenDataType()
		 * @generated
		 */
		EClass GEN_DATA_TYPE = eINSTANCE.getGenDataType();

		/**
		 * The meta object literal for the '<em><b>Ecore Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_DATA_TYPE__ECORE_DATA_TYPE = eINSTANCE.getGenDataType_EcoreDataType();

		/**
		 * The meta object literal for the '<em><b>Datamodel</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOOMLA_GEN_MODEL__DATAMODEL = eINSTANCE.getJoomlaGenModel_Datamodel();

		/**
		 * The meta object literal for the '<em><b>Use Bootstrap</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOOMLA_GEN_MODEL__USE_BOOTSTRAP = eINSTANCE.getJoomlaGenModel_UseBootstrap();

		/**
		 * The meta object literal for the '<em><b>Minified Bootsrap</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOOMLA_GEN_MODEL__MINIFIED_BOOTSRAP = eINSTANCE.getJoomlaGenModel_MinifiedBootsrap();

		/**
		 * The meta object literal for the '{@link com.github.kanafghan.welipse.joomlagen.ExtensionType <em>Extension Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.kanafghan.welipse.joomlagen.ExtensionType
		 * @see com.github.kanafghan.welipse.joomlagen.impl.JoomlaGenPackageImpl#getExtensionType()
		 * @generated
		 */
		EEnum EXTENSION_TYPE = eINSTANCE.getExtensionType();

		/**
		 * The meta object literal for the '{@link com.github.kanafghan.welipse.joomlagen.JoomlaVersion <em>Joomla Version</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.kanafghan.welipse.joomlagen.JoomlaVersion
		 * @see com.github.kanafghan.welipse.joomlagen.impl.JoomlaGenPackageImpl#getJoomlaVersion()
		 * @generated
		 */
		EEnum JOOMLA_VERSION = eINSTANCE.getJoomlaVersion();

		/**
		 * The meta object literal for the '{@link com.github.kanafghan.welipse.joomlagen.FormFieldType <em>Form Field Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.kanafghan.welipse.joomlagen.FormFieldType
		 * @see com.github.kanafghan.welipse.joomlagen.impl.JoomlaGenPackageImpl#getFormFieldType()
		 * @generated
		 */
		EEnum FORM_FIELD_TYPE = eINSTANCE.getFormFieldType();

		/**
		 * The meta object literal for the '{@link com.github.kanafghan.welipse.joomlagen.DatabaseColumnType <em>Database Column Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.kanafghan.welipse.joomlagen.DatabaseColumnType
		 * @see com.github.kanafghan.welipse.joomlagen.impl.JoomlaGenPackageImpl#getDatabaseColumnType()
		 * @generated
		 */
		EEnum DATABASE_COLUMN_TYPE = eINSTANCE.getDatabaseColumnType();

		/**
		 * The meta object literal for the '{@link com.github.kanafghan.welipse.joomlagen.ForeignKeyGeneration <em>Foreign Key Generation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.kanafghan.welipse.joomlagen.ForeignKeyGeneration
		 * @see com.github.kanafghan.welipse.joomlagen.impl.JoomlaGenPackageImpl#getForeignKeyGeneration()
		 * @generated
		 */
		EEnum FOREIGN_KEY_GENERATION = eINSTANCE.getForeignKeyGeneration();

	}

} //JoomlaGenPackage
