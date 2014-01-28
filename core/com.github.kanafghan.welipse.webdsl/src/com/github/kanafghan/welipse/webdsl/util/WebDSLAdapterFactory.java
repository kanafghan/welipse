/**
 */
package com.github.kanafghan.welipse.webdsl.util;

import com.github.kanafghan.welipse.webdsl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.github.kanafghan.welipse.webdsl.WebDSLPackage
 * @generated
 */
public class WebDSLAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WebDSLPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebDSLAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = WebDSLPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebDSLSwitch<Adapter> modelSwitch =
		new WebDSLSwitch<Adapter>() {
			@Override
			public Adapter caseWebsite(Website object) {
				return createWebsiteAdapter();
			}
			@Override
			public Adapter casePage(Page object) {
				return createPageAdapter();
			}
			@Override
			public Adapter casePageElement(PageElement object) {
				return createPageElementAdapter();
			}
			@Override
			public Adapter casePresentationElement(PresentationElement object) {
				return createPresentationElementAdapter();
			}
			@Override
			public Adapter caseNavigationElement(NavigationElement object) {
				return createNavigationElementAdapter();
			}
			@Override
			public Adapter caseList(List object) {
				return createListAdapter();
			}
			@Override
			public Adapter caseText(Text object) {
				return createTextAdapter();
			}
			@Override
			public Adapter caseImage(Image object) {
				return createImageAdapter();
			}
			@Override
			public Adapter caseLink(Link object) {
				return createLinkAdapter();
			}
			@Override
			public Adapter caseInternalLink(InternalLink object) {
				return createInternalLinkAdapter();
			}
			@Override
			public Adapter caseExternalLink(ExternalLink object) {
				return createExternalLinkAdapter();
			}
			@Override
			public Adapter caseExpression(Expression object) {
				return createExpressionAdapter();
			}
			@Override
			public Adapter caseVariableExp(VariableExp object) {
				return createVariableExpAdapter();
			}
			@Override
			public Adapter caseOperationExp(OperationExp object) {
				return createOperationExpAdapter();
			}
			@Override
			public Adapter caseVariableDeclaration(VariableDeclaration object) {
				return createVariableDeclarationAdapter();
			}
			@Override
			public Adapter caseVariableInitialization(VariableInitialization object) {
				return createVariableInitializationAdapter();
			}
			@Override
			public Adapter casePropertyOperation(PropertyOperation object) {
				return createPropertyOperationAdapter();
			}
			@Override
			public Adapter caseConstantExp(ConstantExp object) {
				return createConstantExpAdapter();
			}
			@Override
			public Adapter caseBasicOperation(BasicOperation object) {
				return createBasicOperationAdapter();
			}
			@Override
			public Adapter caseArithmeticOperation(ArithmeticOperation object) {
				return createArithmeticOperationAdapter();
			}
			@Override
			public Adapter caseStructuralExp(StructuralExp object) {
				return createStructuralExpAdapter();
			}
			@Override
			public Adapter caseClassifierOperation(ClassifierOperation object) {
				return createClassifierOperationAdapter();
			}
			@Override
			public Adapter caseIntegerConstant(IntegerConstant object) {
				return createIntegerConstantAdapter();
			}
			@Override
			public Adapter caseStringConstant(StringConstant object) {
				return createStringConstantAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter caseStringOperation(StringOperation object) {
				return createStringOperationAdapter();
			}
			@Override
			public Adapter caseBooleanConstant(BooleanConstant object) {
				return createBooleanConstantAdapter();
			}
			@Override
			public Adapter caseBooleanOperation(BooleanOperation object) {
				return createBooleanOperationAdapter();
			}
			@Override
			public Adapter caseComparisonOperation(ComparisonOperation object) {
				return createComparisonOperationAdapter();
			}
			@Override
			public Adapter caseRealConstant(RealConstant object) {
				return createRealConstantAdapter();
			}
			@Override
			public Adapter caseActualParameter(ActualParameter object) {
				return createActualParameterAdapter();
			}
			@Override
			public Adapter caseGroup(Group object) {
				return createGroupAdapter();
			}
			@Override
			public Adapter caseForm(Form object) {
				return createFormAdapter();
			}
			@Override
			public Adapter caseInput(Input object) {
				return createInputAdapter();
			}
			@Override
			public Adapter caseTextInput(TextInput object) {
				return createTextInputAdapter();
			}
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
			}
			@Override
			public Adapter caseFormElement(FormElement object) {
				return createFormElementAdapter();
			}
			@Override
			public Adapter caseButton(Button object) {
				return createButtonAdapter();
			}
			@Override
			public Adapter caseSelectionList(SelectionList object) {
				return createSelectionListAdapter();
			}
			@Override
			public Adapter caseFileInput(FileInput object) {
				return createFileInputAdapter();
			}
			@Override
			public Adapter caseStandardAction(StandardAction object) {
				return createStandardActionAdapter();
			}
			@Override
			public Adapter caseCustomAction(CustomAction object) {
				return createCustomActionAdapter();
			}
			@Override
			public Adapter caseSave(Save object) {
				return createSaveAdapter();
			}
			@Override
			public Adapter caseSubmit(Submit object) {
				return createSubmitAdapter();
			}
			@Override
			public Adapter caseReset(Reset object) {
				return createResetAdapter();
			}
			@Override
			public Adapter caseCancel(Cancel object) {
				return createCancelAdapter();
			}
			@Override
			public Adapter caseListExp(ListExp object) {
				return createListExpAdapter();
			}
			@Override
			public Adapter caseListElement(ListElement object) {
				return createListElementAdapter();
			}
			@Override
			public Adapter caseWebUtilExp(WebUtilExp object) {
				return createWebUtilExpAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link com.github.kanafghan.welipse.webdsl.Website <em>Website</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.kanafghan.welipse.webdsl.Website
	 * @generated
	 */
	public Adapter createWebsiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.kanafghan.welipse.webdsl.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.kanafghan.welipse.webdsl.Page
	 * @generated
	 */
	public Adapter createPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.kanafghan.welipse.webdsl.PageElement <em>Page Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.kanafghan.welipse.webdsl.PageElement
	 * @generated
	 */
	public Adapter createPageElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.kanafghan.welipse.webdsl.PresentationElement <em>Presentation Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.kanafghan.welipse.webdsl.PresentationElement
	 * @generated
	 */
	public Adapter createPresentationElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.kanafghan.welipse.webdsl.NavigationElement <em>Navigation Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.kanafghan.welipse.webdsl.NavigationElement
	 * @generated
	 */
	public Adapter createNavigationElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.kanafghan.welipse.webdsl.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.kanafghan.welipse.webdsl.List
	 * @generated
	 */
	public Adapter createListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.kanafghan.welipse.webdsl.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.kanafghan.welipse.webdsl.Text
	 * @generated
	 */
	public Adapter createTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.kanafghan.welipse.webdsl.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.kanafghan.welipse.webdsl.Image
	 * @generated
	 */
	public Adapter createImageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.kanafghan.welipse.webdsl.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.kanafghan.welipse.webdsl.Link
	 * @generated
	 */
	public Adapter createLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.kanafghan.welipse.webdsl.InternalLink <em>Internal Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.kanafghan.welipse.webdsl.InternalLink
	 * @generated
	 */
	public Adapter createInternalLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.kanafghan.welipse.webdsl.ExternalLink <em>External Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.kanafghan.welipse.webdsl.ExternalLink
	 * @generated
	 */
	public Adapter createExternalLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.kanafghan.welipse.webdsl.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.kanafghan.welipse.webdsl.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.kanafghan.welipse.webdsl.VariableExp <em>Variable Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.kanafghan.welipse.webdsl.VariableExp
	 * @generated
	 */
	public Adapter createVariableExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.kanafghan.welipse.webdsl.OperationExp <em>Operation Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.kanafghan.welipse.webdsl.OperationExp
	 * @generated
	 */
	public Adapter createOperationExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.kanafghan.welipse.webdsl.VariableDeclaration <em>Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.kanafghan.welipse.webdsl.VariableDeclaration
	 * @generated
	 */
	public Adapter createVariableDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.kanafghan.welipse.webdsl.VariableInitialization <em>Variable Initialization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.kanafghan.welipse.webdsl.VariableInitialization
	 * @generated
	 */
	public Adapter createVariableInitializationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.kanafghan.welipse.webdsl.PropertyOperation <em>Property Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.kanafghan.welipse.webdsl.PropertyOperation
	 * @generated
	 */
	public Adapter createPropertyOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.kanafghan.welipse.webdsl.ConstantExp <em>Constant Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.kanafghan.welipse.webdsl.ConstantExp
	 * @generated
	 */
	public Adapter createConstantExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.kanafghan.welipse.webdsl.BasicOperation <em>Basic Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.kanafghan.welipse.webdsl.BasicOperation
	 * @generated
	 */
	public Adapter createBasicOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.kanafghan.welipse.webdsl.ArithmeticOperation <em>Arithmetic Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.kanafghan.welipse.webdsl.ArithmeticOperation
	 * @generated
	 */
	public Adapter createArithmeticOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.kanafghan.welipse.webdsl.StructuralExp <em>Structural Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.kanafghan.welipse.webdsl.StructuralExp
	 * @generated
	 */
	public Adapter createStructuralExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.kanafghan.welipse.webdsl.ClassifierOperation <em>Classifier Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.kanafghan.welipse.webdsl.ClassifierOperation
	 * @generated
	 */
	public Adapter createClassifierOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.kanafghan.welipse.webdsl.IntegerConstant <em>Integer Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.kanafghan.welipse.webdsl.IntegerConstant
	 * @generated
	 */
	public Adapter createIntegerConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.kanafghan.welipse.webdsl.StringConstant <em>String Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.kanafghan.welipse.webdsl.StringConstant
	 * @generated
	 */
	public Adapter createStringConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.kanafghan.welipse.webdsl.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.kanafghan.welipse.webdsl.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.kanafghan.welipse.webdsl.StringOperation <em>String Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.kanafghan.welipse.webdsl.StringOperation
	 * @generated
	 */
	public Adapter createStringOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.kanafghan.welipse.webdsl.BooleanConstant <em>Boolean Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.kanafghan.welipse.webdsl.BooleanConstant
	 * @generated
	 */
	public Adapter createBooleanConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.kanafghan.welipse.webdsl.BooleanOperation <em>Boolean Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.kanafghan.welipse.webdsl.BooleanOperation
	 * @generated
	 */
	public Adapter createBooleanOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.kanafghan.welipse.webdsl.ComparisonOperation <em>Comparison Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.kanafghan.welipse.webdsl.ComparisonOperation
	 * @generated
	 */
	public Adapter createComparisonOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.kanafghan.welipse.webdsl.RealConstant <em>Real Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.kanafghan.welipse.webdsl.RealConstant
	 * @generated
	 */
	public Adapter createRealConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.kanafghan.welipse.webdsl.ActualParameter <em>Actual Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.kanafghan.welipse.webdsl.ActualParameter
	 * @generated
	 */
	public Adapter createActualParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.kanafghan.welipse.webdsl.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.kanafghan.welipse.webdsl.Group
	 * @generated
	 */
	public Adapter createGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.kanafghan.welipse.webdsl.Form <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.kanafghan.welipse.webdsl.Form
	 * @generated
	 */
	public Adapter createFormAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.kanafghan.welipse.webdsl.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.kanafghan.welipse.webdsl.Input
	 * @generated
	 */
	public Adapter createInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.kanafghan.welipse.webdsl.TextInput <em>Text Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.kanafghan.welipse.webdsl.TextInput
	 * @generated
	 */
	public Adapter createTextInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.kanafghan.welipse.webdsl.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.kanafghan.welipse.webdsl.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.kanafghan.welipse.webdsl.FormElement <em>Form Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.kanafghan.welipse.webdsl.FormElement
	 * @generated
	 */
	public Adapter createFormElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.kanafghan.welipse.webdsl.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.kanafghan.welipse.webdsl.Button
	 * @generated
	 */
	public Adapter createButtonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.kanafghan.welipse.webdsl.SelectionList <em>Selection List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.kanafghan.welipse.webdsl.SelectionList
	 * @generated
	 */
	public Adapter createSelectionListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.kanafghan.welipse.webdsl.FileInput <em>File Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.kanafghan.welipse.webdsl.FileInput
	 * @generated
	 */
	public Adapter createFileInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.kanafghan.welipse.webdsl.StandardAction <em>Standard Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.kanafghan.welipse.webdsl.StandardAction
	 * @generated
	 */
	public Adapter createStandardActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.kanafghan.welipse.webdsl.CustomAction <em>Custom Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.kanafghan.welipse.webdsl.CustomAction
	 * @generated
	 */
	public Adapter createCustomActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.kanafghan.welipse.webdsl.Save <em>Save</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.kanafghan.welipse.webdsl.Save
	 * @generated
	 */
	public Adapter createSaveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.kanafghan.welipse.webdsl.Submit <em>Submit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.kanafghan.welipse.webdsl.Submit
	 * @generated
	 */
	public Adapter createSubmitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.kanafghan.welipse.webdsl.Reset <em>Reset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.kanafghan.welipse.webdsl.Reset
	 * @generated
	 */
	public Adapter createResetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.kanafghan.welipse.webdsl.Cancel <em>Cancel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.kanafghan.welipse.webdsl.Cancel
	 * @generated
	 */
	public Adapter createCancelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.kanafghan.welipse.webdsl.ListExp <em>List Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.kanafghan.welipse.webdsl.ListExp
	 * @generated
	 */
	public Adapter createListExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.kanafghan.welipse.webdsl.ListElement <em>List Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.kanafghan.welipse.webdsl.ListElement
	 * @generated
	 */
	public Adapter createListElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.kanafghan.welipse.webdsl.WebUtilExp <em>Web Util Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.kanafghan.welipse.webdsl.WebUtilExp
	 * @generated
	 */
	public Adapter createWebUtilExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //WebDSLAdapterFactory
