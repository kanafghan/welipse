/**
 */
package com.github.kanafghan.welipse.joomlagen.impl;

import com.github.kanafghan.welipse.joomlagen.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JoomlaGenFactoryImpl extends EFactoryImpl implements JoomlaGenFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JoomlaGenFactory init() {
		try {
			JoomlaGenFactory theJoomlaGenFactory = (JoomlaGenFactory)EPackage.Registry.INSTANCE.getEFactory(JoomlaGenPackage.eNS_URI);
			if (theJoomlaGenFactory != null) {
				return theJoomlaGenFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new JoomlaGenFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoomlaGenFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case JoomlaGenPackage.JOOMLA_GEN_MODEL: return createJoomlaGenModel();
			case JoomlaGenPackage.GEN_PACKAGE: return createGenPackage();
			case JoomlaGenPackage.GEN_CLASS: return createGenClass();
			case JoomlaGenPackage.GEN_ATTRIBUTE: return createGenAttribute();
			case JoomlaGenPackage.GEN_REFERENCE: return createGenReference();
			case JoomlaGenPackage.DATABASE_TABLE: return createDatabaseTable();
			case JoomlaGenPackage.GEN_OPERATION: return createGenOperation();
			case JoomlaGenPackage.GEN_PARAMETER: return createGenParameter();
			case JoomlaGenPackage.GEN_DATA_TYPE: return createGenDataType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case JoomlaGenPackage.EXTENSION_TYPE:
				return createExtensionTypeFromString(eDataType, initialValue);
			case JoomlaGenPackage.JOOMLA_VERSION:
				return createJoomlaVersionFromString(eDataType, initialValue);
			case JoomlaGenPackage.FORM_FIELD_TYPE:
				return createFormFieldTypeFromString(eDataType, initialValue);
			case JoomlaGenPackage.DATABASE_COLUMN_TYPE:
				return createDatabaseColumnTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case JoomlaGenPackage.EXTENSION_TYPE:
				return convertExtensionTypeToString(eDataType, instanceValue);
			case JoomlaGenPackage.JOOMLA_VERSION:
				return convertJoomlaVersionToString(eDataType, instanceValue);
			case JoomlaGenPackage.FORM_FIELD_TYPE:
				return convertFormFieldTypeToString(eDataType, instanceValue);
			case JoomlaGenPackage.DATABASE_COLUMN_TYPE:
				return convertDatabaseColumnTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoomlaGenModel createJoomlaGenModel() {
		JoomlaGenModelImpl joomlaGenModel = new JoomlaGenModelImpl();
		return joomlaGenModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenPackage createGenPackage() {
		GenPackageImpl genPackage = new GenPackageImpl();
		return genPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenClass createGenClass() {
		GenClassImpl genClass = new GenClassImpl();
		return genClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenAttribute createGenAttribute() {
		GenAttributeImpl genAttribute = new GenAttributeImpl();
		return genAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenReference createGenReference() {
		GenReferenceImpl genReference = new GenReferenceImpl();
		return genReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseTable createDatabaseTable() {
		DatabaseTableImpl databaseTable = new DatabaseTableImpl();
		return databaseTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenOperation createGenOperation() {
		GenOperationImpl genOperation = new GenOperationImpl();
		return genOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenParameter createGenParameter() {
		GenParameterImpl genParameter = new GenParameterImpl();
		return genParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenDataType createGenDataType() {
		GenDataTypeImpl genDataType = new GenDataTypeImpl();
		return genDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionType createExtensionTypeFromString(EDataType eDataType, String initialValue) {
		ExtensionType result = ExtensionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExtensionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoomlaVersion createJoomlaVersionFromString(EDataType eDataType, String initialValue) {
		JoomlaVersion result = JoomlaVersion.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJoomlaVersionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormFieldType createFormFieldTypeFromString(EDataType eDataType, String initialValue) {
		FormFieldType result = FormFieldType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFormFieldTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseColumnType createDatabaseColumnTypeFromString(EDataType eDataType, String initialValue) {
		DatabaseColumnType result = DatabaseColumnType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDatabaseColumnTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoomlaGenPackage getJoomlaGenPackage() {
		return (JoomlaGenPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static JoomlaGenPackage getPackage() {
		return JoomlaGenPackage.eINSTANCE;
	}

} //JoomlaGenFactoryImpl
