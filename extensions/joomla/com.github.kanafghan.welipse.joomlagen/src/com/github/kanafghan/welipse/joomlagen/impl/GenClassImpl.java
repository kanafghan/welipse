/**
 */
package com.github.kanafghan.welipse.joomlagen.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.github.kanafghan.welipse.joomlagen.GenAttribute;
import com.github.kanafghan.welipse.joomlagen.GenClass;
import com.github.kanafghan.welipse.joomlagen.GenFeature;
import com.github.kanafghan.welipse.joomlagen.GenOperation;
import com.github.kanafghan.welipse.joomlagen.GenReference;
import com.github.kanafghan.welipse.joomlagen.JoomlaGenFactory;
import com.github.kanafghan.welipse.joomlagen.JoomlaGenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.impl.GenClassImpl#getEcoreClass <em>Ecore Class</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.impl.GenClassImpl#getGenFeatures <em>Gen Features</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.impl.GenClassImpl#isGenerateContentManager <em>Generate Content Manager</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.impl.GenClassImpl#getItemMVCName <em>Item MVC Name</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.impl.GenClassImpl#getListMVCName <em>List MVC Name</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.impl.GenClassImpl#getDatabaseTableName <em>Database Table Name</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.impl.GenClassImpl#getGenOperations <em>Gen Operations</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.impl.GenClassImpl#getLabelFeature <em>Label Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenClassImpl extends GenClassifierImpl implements GenClass {
	/**
	 * The cached value of the '{@link #getEcoreClass() <em>Ecore Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcoreClass()
	 * @generated
	 * @ordered
	 */
	protected EClass ecoreClass;

	/**
	 * The cached value of the '{@link #getGenFeatures() <em>Gen Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<GenFeature> genFeatures;

	/**
	 * The default value of the '{@link #isGenerateContentManager() <em>Generate Content Manager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerateContentManager()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERATE_CONTENT_MANAGER_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isGenerateContentManager() <em>Generate Content Manager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerateContentManager()
	 * @generated
	 * @ordered
	 */
	protected boolean generateContentManager = GENERATE_CONTENT_MANAGER_EDEFAULT;

	/**
	 * The default value of the '{@link #getItemMVCName() <em>Item MVC Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemMVCName()
	 * @generated
	 * @ordered
	 */
	protected static final String ITEM_MVC_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getItemMVCName() <em>Item MVC Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemMVCName()
	 * @generated
	 * @ordered
	 */
	protected String itemMVCName = ITEM_MVC_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getListMVCName() <em>List MVC Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListMVCName()
	 * @generated
	 * @ordered
	 */
	protected static final String LIST_MVC_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getListMVCName() <em>List MVC Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListMVCName()
	 * @generated
	 * @ordered
	 */
	protected String listMVCName = LIST_MVC_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDatabaseTableName() <em>Database Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseTableName()
	 * @generated
	 * @ordered
	 */
	protected static final String DATABASE_TABLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatabaseTableName() <em>Database Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseTableName()
	 * @generated
	 * @ordered
	 */
	protected String databaseTableName = DATABASE_TABLE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGenOperations() <em>Gen Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<GenOperation> genOperations;

	/**
	 * The cached value of the '{@link #getLabelFeature() <em>Label Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelFeature()
	 * @generated
	 * @ordered
	 */
	protected GenFeature labelFeature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JoomlaGenPackage.Literals.GEN_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEcoreClass() {
		if (ecoreClass != null && ecoreClass.eIsProxy()) {
			InternalEObject oldEcoreClass = (InternalEObject)ecoreClass;
			ecoreClass = (EClass)eResolveProxy(oldEcoreClass);
			if (ecoreClass != oldEcoreClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JoomlaGenPackage.GEN_CLASS__ECORE_CLASS, oldEcoreClass, ecoreClass));
			}
		}
		return ecoreClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetEcoreClass() {
		return ecoreClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEcoreClass(EClass newEcoreClass) {
		EClass oldEcoreClass = ecoreClass;
		ecoreClass = newEcoreClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JoomlaGenPackage.GEN_CLASS__ECORE_CLASS, oldEcoreClass, ecoreClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenFeature> getGenFeatures() {
		if (genFeatures == null) {
			genFeatures = new EObjectContainmentWithInverseEList<GenFeature>(GenFeature.class, this, JoomlaGenPackage.GEN_CLASS__GEN_FEATURES, JoomlaGenPackage.GEN_FEATURE__GEN_CLASS);
		}
		return genFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGenerateContentManager() {
		return generateContentManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerateContentManager(boolean newGenerateContentManager) {
		boolean oldGenerateContentManager = generateContentManager;
		generateContentManager = newGenerateContentManager;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JoomlaGenPackage.GEN_CLASS__GENERATE_CONTENT_MANAGER, oldGenerateContentManager, generateContentManager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getItemMVCName() {
		return itemMVCName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemMVCName(String newItemMVCName) {
		String oldItemMVCName = itemMVCName;
		itemMVCName = newItemMVCName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JoomlaGenPackage.GEN_CLASS__ITEM_MVC_NAME, oldItemMVCName, itemMVCName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getListMVCName() {
		return listMVCName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListMVCName(String newListMVCName) {
		String oldListMVCName = listMVCName;
		listMVCName = newListMVCName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JoomlaGenPackage.GEN_CLASS__LIST_MVC_NAME, oldListMVCName, listMVCName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDatabaseTableName() {
		return databaseTableName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabaseTableName(String newDatabaseTableName) {
		String oldDatabaseTableName = databaseTableName;
		databaseTableName = newDatabaseTableName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JoomlaGenPackage.GEN_CLASS__DATABASE_TABLE_NAME, oldDatabaseTableName, databaseTableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenOperation> getGenOperations() {
		if (genOperations == null) {
			genOperations = new EObjectContainmentWithInverseEList<GenOperation>(GenOperation.class, this, JoomlaGenPackage.GEN_CLASS__GEN_OPERATIONS, JoomlaGenPackage.GEN_OPERATION__GEN_CLASS);
		}
		return genOperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenFeature getLabelFeatureGen() {
		if (labelFeature != null && labelFeature.eIsProxy()) {
			InternalEObject oldLabelFeature = (InternalEObject)labelFeature;
			labelFeature = (GenFeature)eResolveProxy(oldLabelFeature);
			if (labelFeature != oldLabelFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JoomlaGenPackage.GEN_CLASS__LABEL_FEATURE, oldLabelFeature, labelFeature));
			}
		}
		return labelFeature;
	}

	public GenFeature getLabelFeature() {
		/*
		 * NOTE: the following implementation is inspired by:
		 * org.eclipse.emf.codegen.ecore.genmodel.impl.GenClassImpl.getLabelFeature()
		 */
		GenFeature labelFeature = getLabelFeatureGen();
		if (labelFeature != null)
			return labelFeature;

		Locale locale = Locale.getDefault();
		for (GenFeature feature : getLabelFeatureCandidates()) {
			if (!feature.isListType()) {
				String featureName = feature.getName();
				if (featureName != null) {
					if (featureName.equalsIgnoreCase("name")) {
						labelFeature = feature;
					} else if (featureName.equalsIgnoreCase("id")) {
						if (labelFeature == null
								|| !labelFeature.getName().toLowerCase(locale)
										.endsWith("name")) {
							labelFeature = feature;
						}
					} else if (featureName.toLowerCase(locale).endsWith("name")) {
						if (labelFeature == null
								|| !labelFeature.getName().toLowerCase(locale)
										.endsWith("name")
								&& !labelFeature.getName().equalsIgnoreCase(
										"id")) {
							labelFeature = feature;
						}
					} else if (featureName.toLowerCase(locale).indexOf("name") != -1) {
						if (labelFeature == null
								|| labelFeature.getName().toLowerCase(locale)
										.indexOf("name") == -1
								&& !labelFeature.getName().equalsIgnoreCase(
										"id")) {
							labelFeature = feature;
						}
					} else if (labelFeature == null) {
						labelFeature = feature;
					}
				}
			}
		}

		return labelFeature;
	}	
	
	public List<GenFeature> getLabelFeatureCandidates() {
		return collectGenFeatures(getAllBaseGenClasses(), getGenFeatures(),
				new GenFeatureFilter() {
					public boolean accept(GenFeature genFeature) {
						return !genFeature.isReferenceType()
								&& !genFeature.isListType()
								&& !genFeature.isMapType();
					}
				});
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenFeature basicGetLabelFeature() {
		return labelFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabelFeature(GenFeature newLabelFeature) {
		GenFeature oldLabelFeature = labelFeature;
		labelFeature = newLabelFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JoomlaGenPackage.GEN_CLASS__LABEL_FEATURE, oldLabelFeature, labelFeature));
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
			case JoomlaGenPackage.GEN_CLASS__GEN_FEATURES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGenFeatures()).basicAdd(otherEnd, msgs);
			case JoomlaGenPackage.GEN_CLASS__GEN_OPERATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGenOperations()).basicAdd(otherEnd, msgs);
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
			case JoomlaGenPackage.GEN_CLASS__GEN_FEATURES:
				return ((InternalEList<?>)getGenFeatures()).basicRemove(otherEnd, msgs);
			case JoomlaGenPackage.GEN_CLASS__GEN_OPERATIONS:
				return ((InternalEList<?>)getGenOperations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JoomlaGenPackage.GEN_CLASS__ECORE_CLASS:
				if (resolve) return getEcoreClass();
				return basicGetEcoreClass();
			case JoomlaGenPackage.GEN_CLASS__GEN_FEATURES:
				return getGenFeatures();
			case JoomlaGenPackage.GEN_CLASS__GENERATE_CONTENT_MANAGER:
				return isGenerateContentManager();
			case JoomlaGenPackage.GEN_CLASS__ITEM_MVC_NAME:
				return getItemMVCName();
			case JoomlaGenPackage.GEN_CLASS__LIST_MVC_NAME:
				return getListMVCName();
			case JoomlaGenPackage.GEN_CLASS__DATABASE_TABLE_NAME:
				return getDatabaseTableName();
			case JoomlaGenPackage.GEN_CLASS__GEN_OPERATIONS:
				return getGenOperations();
			case JoomlaGenPackage.GEN_CLASS__LABEL_FEATURE:
				if (resolve) return getLabelFeature();
				return basicGetLabelFeature();
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
			case JoomlaGenPackage.GEN_CLASS__ECORE_CLASS:
				setEcoreClass((EClass)newValue);
				return;
			case JoomlaGenPackage.GEN_CLASS__GEN_FEATURES:
				getGenFeatures().clear();
				getGenFeatures().addAll((Collection<? extends GenFeature>)newValue);
				return;
			case JoomlaGenPackage.GEN_CLASS__GENERATE_CONTENT_MANAGER:
				setGenerateContentManager((Boolean)newValue);
				return;
			case JoomlaGenPackage.GEN_CLASS__ITEM_MVC_NAME:
				setItemMVCName((String)newValue);
				return;
			case JoomlaGenPackage.GEN_CLASS__LIST_MVC_NAME:
				setListMVCName((String)newValue);
				return;
			case JoomlaGenPackage.GEN_CLASS__DATABASE_TABLE_NAME:
				setDatabaseTableName((String)newValue);
				return;
			case JoomlaGenPackage.GEN_CLASS__GEN_OPERATIONS:
				getGenOperations().clear();
				getGenOperations().addAll((Collection<? extends GenOperation>)newValue);
				return;
			case JoomlaGenPackage.GEN_CLASS__LABEL_FEATURE:
				setLabelFeature((GenFeature)newValue);
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
			case JoomlaGenPackage.GEN_CLASS__ECORE_CLASS:
				setEcoreClass((EClass)null);
				return;
			case JoomlaGenPackage.GEN_CLASS__GEN_FEATURES:
				getGenFeatures().clear();
				return;
			case JoomlaGenPackage.GEN_CLASS__GENERATE_CONTENT_MANAGER:
				setGenerateContentManager(GENERATE_CONTENT_MANAGER_EDEFAULT);
				return;
			case JoomlaGenPackage.GEN_CLASS__ITEM_MVC_NAME:
				setItemMVCName(ITEM_MVC_NAME_EDEFAULT);
				return;
			case JoomlaGenPackage.GEN_CLASS__LIST_MVC_NAME:
				setListMVCName(LIST_MVC_NAME_EDEFAULT);
				return;
			case JoomlaGenPackage.GEN_CLASS__DATABASE_TABLE_NAME:
				setDatabaseTableName(DATABASE_TABLE_NAME_EDEFAULT);
				return;
			case JoomlaGenPackage.GEN_CLASS__GEN_OPERATIONS:
				getGenOperations().clear();
				return;
			case JoomlaGenPackage.GEN_CLASS__LABEL_FEATURE:
				setLabelFeature((GenFeature)null);
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
			case JoomlaGenPackage.GEN_CLASS__ECORE_CLASS:
				return ecoreClass != null;
			case JoomlaGenPackage.GEN_CLASS__GEN_FEATURES:
				return genFeatures != null && !genFeatures.isEmpty();
			case JoomlaGenPackage.GEN_CLASS__GENERATE_CONTENT_MANAGER:
				return generateContentManager != GENERATE_CONTENT_MANAGER_EDEFAULT;
			case JoomlaGenPackage.GEN_CLASS__ITEM_MVC_NAME:
				return ITEM_MVC_NAME_EDEFAULT == null ? itemMVCName != null : !ITEM_MVC_NAME_EDEFAULT.equals(itemMVCName);
			case JoomlaGenPackage.GEN_CLASS__LIST_MVC_NAME:
				return LIST_MVC_NAME_EDEFAULT == null ? listMVCName != null : !LIST_MVC_NAME_EDEFAULT.equals(listMVCName);
			case JoomlaGenPackage.GEN_CLASS__DATABASE_TABLE_NAME:
				return DATABASE_TABLE_NAME_EDEFAULT == null ? databaseTableName != null : !DATABASE_TABLE_NAME_EDEFAULT.equals(databaseTableName);
			case JoomlaGenPackage.GEN_CLASS__GEN_OPERATIONS:
				return genOperations != null && !genOperations.isEmpty();
			case JoomlaGenPackage.GEN_CLASS__LABEL_FEATURE:
				return labelFeature != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (generateContentManager: ");
		result.append(generateContentManager);
		result.append(", itemMVCName: ");
		result.append(itemMVCName);
		result.append(", listMVCName: ");
		result.append(listMVCName);
		result.append(", databaseTableName: ");
		result.append(databaseTableName);
		result.append(')');
		return result.toString();
	}

	@Override
	public EClassifier getEcoreClassifier() {
		return getEcoreClass();
	}

	@Override
	public void initialize(EClass eClass) {
		int localFeatureIndex = 0;
		LOOP: for (EStructuralFeature eStructuralFeature : eClass.getEStructuralFeatures()) {
			if (eStructuralFeature instanceof EAttribute) {
				EAttribute attribute = (EAttribute) eStructuralFeature;
				for (GenFeature genFeature : getGenFeatures()) {
					if (genFeature.getEcoreFeature() == attribute) {
						((GenAttribute) genFeature).initialize(attribute);
						getGenFeatures().move(localFeatureIndex++, genFeature);
						continue LOOP;
					}
				}
				
				GenAttribute genAttribute = JoomlaGenFactory.eINSTANCE.createGenAttribute(); 
		        getGenFeatures().add(localFeatureIndex++, genAttribute);
		        genAttribute.setGenClass(this);
		        genAttribute.initialize(attribute);
			} else {
				EReference reference = (EReference) eStructuralFeature;
		        for (GenFeature genFeature : getGenFeatures())
		        {
		          if (genFeature.getEcoreFeature() == reference)
		          {
		            ((GenReference) genFeature).initialize(reference);
		            getGenFeatures().move(localFeatureIndex++, genFeature);
		            continue LOOP;
		          }
		        }

		        GenReference genReference = JoomlaGenFactory.eINSTANCE.createGenReference(); 
		        getGenFeatures().add(localFeatureIndex++, genReference);
		        genReference.setGenClass(this);
		        genReference.initialize(reference);
			}
		}
		
		int localOperationIndex = 0;
		LOOP: for (EOperation operation : eClass.getEOperations()) {
			for (GenOperation genOperation : getGenOperations()) {
				if (genOperation.getEcoreOperation() == operation) {
					genOperation.initialize(operation);
					getGenOperations().move(localOperationIndex++, genOperation);
					continue LOOP;
				}
			}
			
			GenOperation genOperation = JoomlaGenFactory.eINSTANCE.createGenOperation();
			getGenOperations().add(localOperationIndex++, genOperation);
			genOperation.setGenClass(this);
			genOperation.initialize(operation);
		}
		
		if (getEcoreClass() != eClass) {
			setEcoreClass(eClass);
			setGenerateContentManager(true);
			setItemMVCName(eClass.getName());
			setListMVCName(eClass.getName().concat("List"));
		}
	}

	@Override
	public boolean reconcile(GenClass oldGenClassVersion) {
		if (getEcoreClass().getName().equals(oldGenClassVersion.getEcoreClass().getName())) {
			for (GenFeature genFeature : getGenFeatures()) {
				if (genFeature instanceof GenAttribute) {					
					GenAttribute genAttribute = (GenAttribute) genFeature;
					for (GenFeature oldGenFeatureVersion : oldGenClassVersion.getGenFeatures()) {
						if (oldGenFeatureVersion instanceof GenAttribute) {
							GenAttribute oldGenAttributeVersion = (GenAttribute) oldGenFeatureVersion;
							if (genAttribute.reconcile(oldGenAttributeVersion)) {
								break;
							}
						}
					}
				}
				
				if (genFeature instanceof GenReference) {					
					GenReference genReference = (GenReference) genFeature;
					for (GenFeature oldGenFeatureVersion : oldGenClassVersion.getGenFeatures()) {
						if (oldGenFeatureVersion instanceof GenReference) {
							GenReference oldGenReferenceVersion = (GenReference) oldGenFeatureVersion;
							if (genReference.reconcile(oldGenReferenceVersion)) {
								break;
							}
						}
					}
				}				
			}
			
			for (GenOperation genOperation : getGenOperations()) {
				for (GenOperation oldGenOperationVersion : oldGenClassVersion.getGenOperations()) {
					if (genOperation.reconcile(oldGenOperationVersion)) {
						break;
					}
				}
			}
			
			reconcileSettings(oldGenClassVersion);
			return true;
		}
		return false;
	}

	protected void reconcileSettings(GenClass oldGenClassVersion) {
		setDatabaseTableName(oldGenClassVersion.getDatabaseTableName());
		setGenerateContentManager(oldGenClassVersion.isGenerateContentManager());
		setItemMVCName(oldGenClassVersion.getItemMVCName());
		setListMVCName(oldGenClassVersion.getListMVCName());
	}

	@Override
	public boolean reconcile() {
		EClass eClass = getEcoreClass();
		if (eClass == null || eClass.eIsProxy() || eClass.eResource() == null) {
			return false;
		} else {		
			for (Iterator<GenFeature> i = getGenFeatures().iterator(); i.hasNext(); ) {
				GenFeature genFeature = i.next();
				if (genFeature instanceof GenAttribute) {
					GenAttribute genAttribute = (GenAttribute) genFeature;
					if (!genAttribute.reconcile()) {
						i.remove();
					}
				} else if (genFeature instanceof GenReference) {
					GenReference genReference = (GenReference) genFeature;
					if (!genReference.reconcile()) {
						i.remove();
					}
				}
			}
			
			for (Iterator<GenOperation> i = getGenOperations().iterator(); i.hasNext();) {
				GenOperation genOperation = i.next();
				if (!genOperation.reconcile()) {
					i.remove();
				}
			}
			
			return true;
		}
	}

	@Override
	public List<GenClass> getAllBaseGenClasses() {
		return collectGenClasses(getEcoreClass().getEAllSuperTypes(), null);
	}

} //GenClassImpl
