/**
 */
package com.github.kanafghan.welipse.joomlagen.impl;

import com.github.kanafghan.welipse.joomlagen.GenClass;
import com.github.kanafghan.welipse.joomlagen.GenClassifier;
import com.github.kanafghan.welipse.joomlagen.GenDataType;
import com.github.kanafghan.welipse.joomlagen.GenOperation;
import com.github.kanafghan.welipse.joomlagen.GenPackage;
import com.github.kanafghan.welipse.joomlagen.GenParameter;
import com.github.kanafghan.welipse.joomlagen.GenReference;
import com.github.kanafghan.welipse.joomlagen.GenFeature;
import com.github.kanafghan.welipse.joomlagen.JoomlaGenModel;
import com.github.kanafghan.welipse.joomlagen.JoomlaGenPackage;
import com.github.kanafghan.welipse.joomlagen.JoomlaGenFactory;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.impl.GenPackageImpl#getEcorePackage <em>Ecore Package</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.impl.GenPackageImpl#getGenClassifiers <em>Gen Classifiers</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.impl.GenPackageImpl#getGenModel <em>Gen Model</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.impl.GenPackageImpl#getGenClasses <em>Gen Classes</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.impl.GenPackageImpl#getGenDataTypes <em>Gen Data Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenPackageImpl extends MinimalEObjectImpl.Container implements GenPackage {
	/**
	 * The cached value of the '{@link #getEcorePackage() <em>Ecore Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcorePackage()
	 * @generated
	 * @ordered
	 */
	protected EPackage ecorePackage;

	/**
	 * The cached value of the '{@link #getGenClassifiers() <em>Gen Classifiers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenClassifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<GenClassifier> genClassifiers;

	/**
	 * The cached value of the '{@link #getGenClasses() <em>Gen Classes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<GenClass> genClasses;

	/**
	 * The cached value of the '{@link #getGenDataTypes() <em>Gen Data Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenDataTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<GenDataType> genDataTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JoomlaGenPackage.Literals.GEN_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPackage getEcorePackage() {
		if (ecorePackage != null && ecorePackage.eIsProxy()) {
			InternalEObject oldEcorePackage = (InternalEObject)ecorePackage;
			ecorePackage = (EPackage)eResolveProxy(oldEcorePackage);
			if (ecorePackage != oldEcorePackage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JoomlaGenPackage.GEN_PACKAGE__ECORE_PACKAGE, oldEcorePackage, ecorePackage));
			}
		}
		return ecorePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPackage basicGetEcorePackage() {
		return ecorePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEcorePackage(EPackage newEcorePackage) {
		EPackage oldEcorePackage = ecorePackage;
		ecorePackage = newEcorePackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JoomlaGenPackage.GEN_PACKAGE__ECORE_PACKAGE, oldEcorePackage, ecorePackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenClassifier> getGenClassifiers() {
		if (genClassifiers == null) {
			genClassifiers = new EObjectWithInverseResolvingEList<GenClassifier>(GenClassifier.class, this, JoomlaGenPackage.GEN_PACKAGE__GEN_CLASSIFIERS, JoomlaGenPackage.GEN_CLASSIFIER__GEN_PACKAGE);
		}
		return genClassifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoomlaGenModel getGenModel() {
		if (eContainerFeatureID() != JoomlaGenPackage.GEN_PACKAGE__GEN_MODEL) return null;
		return (JoomlaGenModel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenModel(JoomlaGenModel newGenModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGenModel, JoomlaGenPackage.GEN_PACKAGE__GEN_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenModel(JoomlaGenModel newGenModel) {
		if (newGenModel != eInternalContainer() || (eContainerFeatureID() != JoomlaGenPackage.GEN_PACKAGE__GEN_MODEL && newGenModel != null)) {
			if (EcoreUtil.isAncestor(this, newGenModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGenModel != null)
				msgs = ((InternalEObject)newGenModel).eInverseAdd(this, JoomlaGenPackage.JOOMLA_GEN_MODEL__DATAMODEL, JoomlaGenModel.class, msgs);
			msgs = basicSetGenModel(newGenModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JoomlaGenPackage.GEN_PACKAGE__GEN_MODEL, newGenModel, newGenModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenClass> getGenClasses() {
		if (genClasses == null) {
			genClasses = new EObjectContainmentEList<GenClass>(GenClass.class, this, JoomlaGenPackage.GEN_PACKAGE__GEN_CLASSES);
		}
		return genClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenDataType> getGenDataTypes() {
		if (genDataTypes == null) {
			genDataTypes = new EObjectContainmentEList<GenDataType>(GenDataType.class, this, JoomlaGenPackage.GEN_PACKAGE__GEN_DATA_TYPES);
		}
		return genDataTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JoomlaGenPackage.GEN_PACKAGE__GEN_CLASSIFIERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGenClassifiers()).basicAdd(otherEnd, msgs);
			case JoomlaGenPackage.GEN_PACKAGE__GEN_MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGenModel((JoomlaGenModel)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JoomlaGenPackage.GEN_PACKAGE__GEN_CLASSIFIERS:
				return ((InternalEList<?>)getGenClassifiers()).basicRemove(otherEnd, msgs);
			case JoomlaGenPackage.GEN_PACKAGE__GEN_MODEL:
				return basicSetGenModel(null, msgs);
			case JoomlaGenPackage.GEN_PACKAGE__GEN_CLASSES:
				return ((InternalEList<?>)getGenClasses()).basicRemove(otherEnd, msgs);
			case JoomlaGenPackage.GEN_PACKAGE__GEN_DATA_TYPES:
				return ((InternalEList<?>)getGenDataTypes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case JoomlaGenPackage.GEN_PACKAGE__GEN_MODEL:
				return eInternalContainer().eInverseRemove(this, JoomlaGenPackage.JOOMLA_GEN_MODEL__DATAMODEL, JoomlaGenModel.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JoomlaGenPackage.GEN_PACKAGE__ECORE_PACKAGE:
				if (resolve) return getEcorePackage();
				return basicGetEcorePackage();
			case JoomlaGenPackage.GEN_PACKAGE__GEN_CLASSIFIERS:
				return getGenClassifiers();
			case JoomlaGenPackage.GEN_PACKAGE__GEN_MODEL:
				return getGenModel();
			case JoomlaGenPackage.GEN_PACKAGE__GEN_CLASSES:
				return getGenClasses();
			case JoomlaGenPackage.GEN_PACKAGE__GEN_DATA_TYPES:
				return getGenDataTypes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JoomlaGenPackage.GEN_PACKAGE__ECORE_PACKAGE:
				setEcorePackage((EPackage)newValue);
				return;
			case JoomlaGenPackage.GEN_PACKAGE__GEN_CLASSIFIERS:
				getGenClassifiers().clear();
				getGenClassifiers().addAll((Collection<? extends GenClassifier>)newValue);
				return;
			case JoomlaGenPackage.GEN_PACKAGE__GEN_MODEL:
				setGenModel((JoomlaGenModel)newValue);
				return;
			case JoomlaGenPackage.GEN_PACKAGE__GEN_CLASSES:
				getGenClasses().clear();
				getGenClasses().addAll((Collection<? extends GenClass>)newValue);
				return;
			case JoomlaGenPackage.GEN_PACKAGE__GEN_DATA_TYPES:
				getGenDataTypes().clear();
				getGenDataTypes().addAll((Collection<? extends GenDataType>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case JoomlaGenPackage.GEN_PACKAGE__ECORE_PACKAGE:
				setEcorePackage((EPackage)null);
				return;
			case JoomlaGenPackage.GEN_PACKAGE__GEN_CLASSIFIERS:
				getGenClassifiers().clear();
				return;
			case JoomlaGenPackage.GEN_PACKAGE__GEN_MODEL:
				setGenModel((JoomlaGenModel)null);
				return;
			case JoomlaGenPackage.GEN_PACKAGE__GEN_CLASSES:
				getGenClasses().clear();
				return;
			case JoomlaGenPackage.GEN_PACKAGE__GEN_DATA_TYPES:
				getGenDataTypes().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case JoomlaGenPackage.GEN_PACKAGE__ECORE_PACKAGE:
				return ecorePackage != null;
			case JoomlaGenPackage.GEN_PACKAGE__GEN_CLASSIFIERS:
				return genClassifiers != null && !genClassifiers.isEmpty();
			case JoomlaGenPackage.GEN_PACKAGE__GEN_MODEL:
				return getGenModel() != null;
			case JoomlaGenPackage.GEN_PACKAGE__GEN_CLASSES:
				return genClasses != null && !genClasses.isEmpty();
			case JoomlaGenPackage.GEN_PACKAGE__GEN_DATA_TYPES:
				return genDataTypes != null && !genDataTypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	@Override
	public void initialize(EPackage ePackage) {
		if (getEcorePackage() != ePackage) {
			setEcorePackage(ePackage);
		}
		
		int eClassIndex = 0;
		LOOP: for (EClassifier eClassifier : ePackage.getEClassifiers()) {
			for (GenClassifier genClassifier : getGenClassifiers()) {
				if (genClassifier.getEcoreClassifier() == eClassifier) {
					if (eClassifier instanceof EClass) {
						((GenClass) genClassifier).initialize((EClass) eClassifier);
						int index = getGenClasses().indexOf(genClassifier);
						if (index != eClassIndex) {
							getGenClasses().move(eClassIndex, index);
						}
						++eClassIndex;
					}
					
					continue LOOP;
				}
			}
			
			if (eClassifier instanceof EClass) {
				EClass eClass = (EClass) eClassifier;
				GenClass genClass = JoomlaGenFactory.eINSTANCE.createGenClass();
				genClass.setGenPackage(this);
				genClass.initialize(eClass);
				genClass.setDatabaseTableName(getDatabaseTableName(eClass));
				getGenClasses().add(eClassIndex++, genClass);
				getGenClassifiers().add(genClass);
				eClassifierToGenClassifierMap.put(eClass, genClass);
			}
		}
		
		// Set the type of the features, operations and parameters
		// and also set the opposite references
		for (GenClass genClass : getGenClasses()) {
			for (GenFeature genFeature : genClass.getGenFeatures()) {
				genFeature.setType(getGenClassifier(genFeature.getEcoreFeature().getEType()));
				// Set the opposite references
				if (genFeature instanceof GenReference) {
					GenReference genReference = (GenReference) genFeature;
					if (genReference.getEcoreReference().getEOpposite() != null) {
						if (genReference.getOpposite() == null) {							
							GenReference opposite = getGenReference(genReference.getEcoreReference().getEOpposite());
							genReference.setOpposite(opposite);
							opposite.setOpposite(genReference);
						}
					}
				}
			}
			
			for (GenOperation genOperation : genClass.getGenOperations()) {
				// Set the type of the operation
				EClassifier type = genOperation.getEcoreOperation().getEType(); 
				if (type != null) {
					genOperation.setType(getGenClassifier(type));
				}
				
				// Set the type of the parameters
				for (GenParameter genParameter : genOperation.getGenParameters()) {
					type = genParameter.getEcoreParameter().getEType();
					if (type != null) {
						genParameter.setType(getGenClassifier(type));
					}
				}
			}
		}
	}

	Map<EClass, String> eClassToDBTableNameMap = new HashMap<EClass, String>();
	
	private String getDatabaseTableName(EClass eClass) {
		// Lookup the eClass
		String tblName = eClassToDBTableNameMap.get(eClass);
		
		if (tblName == null) {
			if (!eClass.getEAllSuperTypes().isEmpty()) {
				tblName = getDatabaseTableName(eClass.getEAllSuperTypes().get(0));
			} else {
				tblName = eClass.getName();
				eClassToDBTableNameMap.put(eClass, tblName);
			}
		}
		
		return tblName;
	}

	Map<EClassifier, GenClassifier> eClassifierToGenClassifierMap = new HashMap<EClassifier, GenClassifier>();
	
	@Override
	public GenClassifier getGenClassifier(EClassifier ecoreClassifier) {
		if (ecoreClassifier == null) {
			throw new Error("Got null instead of EClassifier instance.");
		}
		
		GenClassifier genClassifier = eClassifierToGenClassifierMap.get(ecoreClassifier);
		
		if (genClassifier == null) {
			if (ecoreClassifier instanceof EDataType) {
				EDataType eDataType = (EDataType) ecoreClassifier;
				GenDataType genDataType = JoomlaGenFactory.eINSTANCE.createGenDataType();
				genDataType.setEcoreDataType(eDataType);
				genDataType.setGenPackage(this);
				getGenDataTypes().add(genDataType);
				eClassifierToGenClassifierMap.put(eDataType, genDataType);
				return genDataType;
			} else {
				// Look after it among the GenClasses	
				for (GenClassifier cls : getGenClassifiers()) {
					if (cls.getEcoreClassifier() == ecoreClassifier) {
						eClassifierToGenClassifierMap.put(cls.getEcoreClassifier(), cls);
						return cls;
					}
				}
				
				// Now, look after it among EClasses
				for (EClassifier eClassifier : getEcorePackage().getEClassifiers()) {
					if (eClassifier instanceof EClass) {
						EClass cls = (EClass) eClassifier;
						if (cls == ecoreClassifier) {
							GenClass genClass = JoomlaGenFactory.eINSTANCE.createGenClass();
							eClassifierToGenClassifierMap.put(cls, genClass);
							getGenClasses().add(genClass);
							getGenClassifiers().add(genClass);
							genClass.setGenPackage(this);
							genClass.initialize(cls);
							genClass.setDatabaseTableName(getDatabaseTableName(cls));
							return genClass;
						}
					}
				}
			}
		}
		
		// If we still could not find it throw an error
		if (genClassifier == null) {
			throw new Error("Could not find the EClassifier: "+ ecoreClassifier.getName());
		}
		
		return genClassifier;
	}
	
	@Override
	public GenReference getGenReference(EReference eReference) {
		GenClassifier genClassifier = getGenClassifier(eReference.getEContainingClass());
		
		if (genClassifier != null) {
			GenClass genClass = (GenClass) genClassifier;
			if (!genClass.getGenFeatures().isEmpty()) {
				for (GenFeature genFeature : genClass.getGenFeatures()) {
					if (genFeature.getEcoreFeature() == eReference) {
						return (GenReference) genFeature;
					}
				}
			} else {
				//TODO this is probably not needed in the new approach
				GenReference genReference = JoomlaGenFactory.eINSTANCE.createGenReference();
				genReference.setGenClass(genClass);
				genReference.initialize(eReference);
				genClass.getGenFeatures().add(genReference);
				return genReference;
			}
		}
		
		return null;
	}

} //GenPackageImpl
