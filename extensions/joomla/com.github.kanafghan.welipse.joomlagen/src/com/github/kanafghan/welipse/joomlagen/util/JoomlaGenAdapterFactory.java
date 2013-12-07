/**
 */
package com.github.kanafghan.welipse.joomlagen.util;

import com.github.kanafghan.welipse.joomlagen.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenPackage
 * @generated
 */
public class JoomlaGenAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JoomlaGenPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoomlaGenAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = JoomlaGenPackage.eINSTANCE;
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
	protected JoomlaGenSwitch<Adapter> modelSwitch =
		new JoomlaGenSwitch<Adapter>() {
			@Override
			public Adapter caseJoomlaGenModel(JoomlaGenModel object) {
				return createJoomlaGenModelAdapter();
			}
			@Override
			public Adapter caseGenPackage(GenPackage object) {
				return createGenPackageAdapter();
			}
			@Override
			public Adapter caseGenClassifier(GenClassifier object) {
				return createGenClassifierAdapter();
			}
			@Override
			public Adapter caseGenClass(GenClass object) {
				return createGenClassAdapter();
			}
			@Override
			public Adapter caseGenTypedElement(GenTypedElement object) {
				return createGenTypedElementAdapter();
			}
			@Override
			public Adapter caseGenFeature(GenFeature object) {
				return createGenFeatureAdapter();
			}
			@Override
			public Adapter caseGenAttribute(GenAttribute object) {
				return createGenAttributeAdapter();
			}
			@Override
			public Adapter caseGenReference(GenReference object) {
				return createGenReferenceAdapter();
			}
			@Override
			public Adapter caseDatabaseTable(DatabaseTable object) {
				return createDatabaseTableAdapter();
			}
			@Override
			public Adapter caseGenOperation(GenOperation object) {
				return createGenOperationAdapter();
			}
			@Override
			public Adapter caseGenParameter(GenParameter object) {
				return createGenParameterAdapter();
			}
			@Override
			public Adapter caseGenDataType(GenDataType object) {
				return createGenDataTypeAdapter();
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
	 * Creates a new adapter for an object of class '{@link com.github.kanafghan.welipse.joomlagen.JoomlaGenModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenModel
	 * @generated
	 */
	public Adapter createJoomlaGenModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.kanafghan.welipse.joomlagen.GenPackage <em>Gen Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.kanafghan.welipse.joomlagen.GenPackage
	 * @generated
	 */
	public Adapter createGenPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.kanafghan.welipse.joomlagen.GenClassifier <em>Gen Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.kanafghan.welipse.joomlagen.GenClassifier
	 * @generated
	 */
	public Adapter createGenClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.kanafghan.welipse.joomlagen.GenClass <em>Gen Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.kanafghan.welipse.joomlagen.GenClass
	 * @generated
	 */
	public Adapter createGenClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.kanafghan.welipse.joomlagen.GenTypedElement <em>Gen Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.kanafghan.welipse.joomlagen.GenTypedElement
	 * @generated
	 */
	public Adapter createGenTypedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.kanafghan.welipse.joomlagen.GenFeature <em>Gen Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.kanafghan.welipse.joomlagen.GenFeature
	 * @generated
	 */
	public Adapter createGenFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.kanafghan.welipse.joomlagen.GenAttribute <em>Gen Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.kanafghan.welipse.joomlagen.GenAttribute
	 * @generated
	 */
	public Adapter createGenAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.kanafghan.welipse.joomlagen.GenReference <em>Gen Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.kanafghan.welipse.joomlagen.GenReference
	 * @generated
	 */
	public Adapter createGenReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.kanafghan.welipse.joomlagen.DatabaseTable <em>Database Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.kanafghan.welipse.joomlagen.DatabaseTable
	 * @generated
	 */
	public Adapter createDatabaseTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.kanafghan.welipse.joomlagen.GenOperation <em>Gen Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.kanafghan.welipse.joomlagen.GenOperation
	 * @generated
	 */
	public Adapter createGenOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.kanafghan.welipse.joomlagen.GenParameter <em>Gen Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.kanafghan.welipse.joomlagen.GenParameter
	 * @generated
	 */
	public Adapter createGenParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.kanafghan.welipse.joomlagen.GenDataType <em>Gen Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.kanafghan.welipse.joomlagen.GenDataType
	 * @generated
	 */
	public Adapter createGenDataTypeAdapter() {
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

} //JoomlaGenAdapterFactory
