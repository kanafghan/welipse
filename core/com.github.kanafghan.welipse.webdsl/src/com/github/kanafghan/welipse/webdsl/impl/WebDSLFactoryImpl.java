/**
 */
package com.github.kanafghan.welipse.webdsl.impl;

import com.github.kanafghan.welipse.webdsl.*;

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
public class WebDSLFactoryImpl extends EFactoryImpl implements WebDSLFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WebDSLFactory init() {
		try {
			WebDSLFactory theWebDSLFactory = (WebDSLFactory)EPackage.Registry.INSTANCE.getEFactory(WebDSLPackage.eNS_URI);
			if (theWebDSLFactory != null) {
				return theWebDSLFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WebDSLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebDSLFactoryImpl() {
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
			case WebDSLPackage.WEBSITE: return createWebsite();
			case WebDSLPackage.PAGE: return createPage();
			case WebDSLPackage.LIST: return createList();
			case WebDSLPackage.TEXT: return createText();
			case WebDSLPackage.IMAGE: return createImage();
			case WebDSLPackage.INTERNAL_LINK: return createInternalLink();
			case WebDSLPackage.EXTERNAL_LINK: return createExternalLink();
			case WebDSLPackage.VARIABLE_EXP: return createVariableExp();
			case WebDSLPackage.VARIABLE_INITIALIZATION: return createVariableInitialization();
			case WebDSLPackage.ARITHMETIC_OPERATION: return createArithmeticOperation();
			case WebDSLPackage.STRUCTURAL_EXP: return createStructuralExp();
			case WebDSLPackage.CLASSIFIER_OPERATION: return createClassifierOperation();
			case WebDSLPackage.INTEGER_CONSTANT: return createIntegerConstant();
			case WebDSLPackage.STRING_CONSTANT: return createStringConstant();
			case WebDSLPackage.PARAMETER: return createParameter();
			case WebDSLPackage.STRING_OPERATION: return createStringOperation();
			case WebDSLPackage.BOOLEAN_CONSTANT: return createBooleanConstant();
			case WebDSLPackage.BOOLEAN_OPERATION: return createBooleanOperation();
			case WebDSLPackage.COMPARISON_OPERATION: return createComparisonOperation();
			case WebDSLPackage.REAL_CONSTANT: return createRealConstant();
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
			case WebDSLPackage.ARITHMETIC_OPERATOR:
				return createArithmeticOperatorFromString(eDataType, initialValue);
			case WebDSLPackage.STRING_OPERATOR:
				return createStringOperatorFromString(eDataType, initialValue);
			case WebDSLPackage.BOOLEAN_OPERATOR:
				return createBooleanOperatorFromString(eDataType, initialValue);
			case WebDSLPackage.COMPARISON_OPERATOR:
				return createComparisonOperatorFromString(eDataType, initialValue);
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
			case WebDSLPackage.ARITHMETIC_OPERATOR:
				return convertArithmeticOperatorToString(eDataType, instanceValue);
			case WebDSLPackage.STRING_OPERATOR:
				return convertStringOperatorToString(eDataType, instanceValue);
			case WebDSLPackage.BOOLEAN_OPERATOR:
				return convertBooleanOperatorToString(eDataType, instanceValue);
			case WebDSLPackage.COMPARISON_OPERATOR:
				return convertComparisonOperatorToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Website createWebsite() {
		WebsiteImpl website = new WebsiteImpl();
		return website;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page createPage() {
		PageImpl page = new PageImpl();
		return page;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List createList() {
		ListImpl list = new ListImpl();
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text createText() {
		TextImpl text = new TextImpl();
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Image createImage() {
		ImageImpl image = new ImageImpl();
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalLink createInternalLink() {
		InternalLinkImpl internalLink = new InternalLinkImpl();
		return internalLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalLink createExternalLink() {
		ExternalLinkImpl externalLink = new ExternalLinkImpl();
		return externalLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableExp createVariableExp() {
		VariableExpImpl variableExp = new VariableExpImpl();
		return variableExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableInitialization createVariableInitialization() {
		VariableInitializationImpl variableInitialization = new VariableInitializationImpl();
		return variableInitialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArithmeticOperation createArithmeticOperation() {
		ArithmeticOperationImpl arithmeticOperation = new ArithmeticOperationImpl();
		return arithmeticOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuralExp createStructuralExp() {
		StructuralExpImpl structuralExp = new StructuralExpImpl();
		return structuralExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassifierOperation createClassifierOperation() {
		ClassifierOperationImpl classifierOperation = new ClassifierOperationImpl();
		return classifierOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerConstant createIntegerConstant() {
		IntegerConstantImpl integerConstant = new IntegerConstantImpl();
		return integerConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringConstant createStringConstant() {
		StringConstantImpl stringConstant = new StringConstantImpl();
		return stringConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringOperation createStringOperation() {
		StringOperationImpl stringOperation = new StringOperationImpl();
		return stringOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanConstant createBooleanConstant() {
		BooleanConstantImpl booleanConstant = new BooleanConstantImpl();
		return booleanConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanOperation createBooleanOperation() {
		BooleanOperationImpl booleanOperation = new BooleanOperationImpl();
		return booleanOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparisonOperation createComparisonOperation() {
		ComparisonOperationImpl comparisonOperation = new ComparisonOperationImpl();
		return comparisonOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealConstant createRealConstant() {
		RealConstantImpl realConstant = new RealConstantImpl();
		return realConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArithmeticOperator createArithmeticOperatorFromString(EDataType eDataType, String initialValue) {
		ArithmeticOperator result = ArithmeticOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArithmeticOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringOperator createStringOperatorFromString(EDataType eDataType, String initialValue) {
		StringOperator result = StringOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStringOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanOperator createBooleanOperatorFromString(EDataType eDataType, String initialValue) {
		BooleanOperator result = BooleanOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBooleanOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparisonOperator createComparisonOperatorFromString(EDataType eDataType, String initialValue) {
		ComparisonOperator result = ComparisonOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComparisonOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebDSLPackage getWebDSLPackage() {
		return (WebDSLPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WebDSLPackage getPackage() {
		return WebDSLPackage.eINSTANCE;
	}

} //WebDSLFactoryImpl
