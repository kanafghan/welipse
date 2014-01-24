/**
 */
package com.github.kanafghan.welipse.joomlagen.impl;

import java.util.ArrayList;
import java.util.List;

import com.github.kanafghan.welipse.joomlagen.GenBase;
import com.github.kanafghan.welipse.joomlagen.GenClass;
import com.github.kanafghan.welipse.joomlagen.GenFeature;
import com.github.kanafghan.welipse.joomlagen.GenOperation;
import com.github.kanafghan.welipse.joomlagen.JoomlaGenModel;
import com.github.kanafghan.welipse.joomlagen.JoomlaGenPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Base</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class GenBaseImpl extends MinimalEObjectImpl.Container implements GenBase {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenBaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JoomlaGenPackage.Literals.GEN_BASE;
	}

	protected static interface GenClassFilter {
		boolean accept(GenClass genClass);
	}

	protected static interface GenFeatureFilter {
		boolean accept(GenFeature genFeature);
	}

	protected static interface GenOperationFilter {
		boolean accept(GenOperation genOperation);
	}
	
	/**
	 * Iterate over the specified eClasses list, finding the GenClass
	 * corresponding to each EClass. Return all such GenClasses if filter is
	 * null, or those accepted by filter, otherwise.
	 */
	protected List<GenClass> collectGenClasses(List<EClass> eClasses,
			GenClassFilter filter) {
		JoomlaGenModelImpl genModel = (JoomlaGenModelImpl) getGenModel();
		List<GenClass> result = new ArrayList<GenClass>();
		for (int i = 0, size = eClasses.size(); i < size; ++i) {
			GenClass genClass = genModel.findGenClass(eClasses.get(i));
			if (genClass != null && (filter == null || filter.accept(genClass))) {
				result.add(genClass);
			}
		}
		return result;
	}

	/**
	 * Iterate over the lists returned by calling getGenFeatures() on items in
	 * the list of genClasses, and then over the list of genFeatures. Return all
	 * such GenFeatures if filter is null, or those accepted by filter,
	 * otherwise. Either list argument is ignored if it is null.
	 */
	protected List<GenFeature> collectGenFeatures(List<GenClass> genClasses,
			List<GenFeature> genFeatures, GenFeatureFilter filter) {
		List<GenFeature> result = new ArrayList<GenFeature>();

		if (genClasses != null) {
			for (int i = 0, iSize = genClasses.size(); i < iSize; ++i) {
				GenClass genClass = genClasses.get(i);
				List<GenFeature> features = genClass.getGenFeatures();
				if (filter == null) {
					result.addAll(features);
				} else {
					for (int j = 0, jSize = features.size(); j < jSize; ++j) {
						GenFeature genFeature = features.get(j);
						if (filter.accept(genFeature)) {
							result.add(genFeature);
						}
					}
				}
			}
		}

		if (genFeatures != null) {
			if (filter == null) {
				result.addAll(genFeatures);
			} else {
				for (int i = 0, size = genFeatures.size(); i < size; ++i) {
					GenFeature genFeature = genFeatures.get(i);
					if (filter.accept(genFeature)) {
						result.add(genFeature);
					}
				}
			}
		}
		return result;
	}

	@Override
	public JoomlaGenModel getGenModel() {
		return ((GenBase) eInternalContainer()).getGenModel();
	}
	
	protected GenClass findGenClass(EClass eClass) {
		return ((JoomlaGenModelImpl) getGenModel()).findGenClass(eClass);
	}
	
} //GenBaseImpl
