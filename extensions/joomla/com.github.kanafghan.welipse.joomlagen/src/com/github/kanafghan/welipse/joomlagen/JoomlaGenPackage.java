/**
 */
package com.github.kanafghan.welipse.joomlagen;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
	 * The feature id for the '<em><b>Extension Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOOMLA_GEN_MODEL__EXTENSION_NAME = 2;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOOMLA_GEN_MODEL__EXTENSION = 3;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOOMLA_GEN_MODEL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOOMLA_GEN_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.github.kanafghan.welipse.joomlagen.ExtensionType <em>Extension Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.kanafghan.welipse.joomlagen.ExtensionType
	 * @see com.github.kanafghan.welipse.joomlagen.impl.JoomlaGenPackageImpl#getExtensionType()
	 * @generated
	 */
	int EXTENSION_TYPE = 1;

	/**
	 * The meta object id for the '{@link com.github.kanafghan.welipse.joomlagen.JoomlaVersion <em>Joomla Version</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.kanafghan.welipse.joomlagen.JoomlaVersion
	 * @see com.github.kanafghan.welipse.joomlagen.impl.JoomlaGenPackageImpl#getJoomlaVersion()
	 * @generated
	 */
	int JOOMLA_VERSION = 2;


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
	 * Returns the meta object for the reference '{@link com.github.kanafghan.welipse.joomlagen.JoomlaGenModel#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Extension</em>'.
	 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenModel#getExtension()
	 * @see #getJoomlaGenModel()
	 * @generated
	 */
	EReference getJoomlaGenModel_Extension();

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
		 * The meta object literal for the '<em><b>Extension Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOOMLA_GEN_MODEL__EXTENSION_NAME = eINSTANCE.getJoomlaGenModel_ExtensionName();

		/**
		 * The meta object literal for the '<em><b>Extension</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOOMLA_GEN_MODEL__EXTENSION = eINSTANCE.getJoomlaGenModel_Extension();

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

	}

} //JoomlaGenPackage
