/**
 */
package com.github.kanafghan.welipse.webdsl.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import com.github.kanafghan.welipse.webdsl.Submit;
import com.github.kanafghan.welipse.webdsl.WebDSLFactory;
import com.github.kanafghan.welipse.webdsl.WebDSLPackage;
import com.github.kanafghan.welipse.webdsl.expressions.ExpressionsAnalyzer;

/**
 * This is the item provider adapter for a {@link com.github.kanafghan.welipse.webdsl.Submit} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SubmitItemProvider
	extends ButtonItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubmitItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addPerformerExpressionPropertyDescriptor(object);
			addValidatorExpressionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Performer Expression feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addPerformerExpressionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Submit_performerExpression_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Submit_performerExpression_feature", "_UI_Submit_type"),
				 WebDSLPackage.Literals.SUBMIT__PERFORMER_EXPRESSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null)
			{

				@Override
				public void setPropertyValue(Object object, Object value) {
					super.setPropertyValue(object, value);
					
					// get the expression
					if (value instanceof String && object instanceof Submit) {
						String expression = (String) value;
						if (!expression.isEmpty()) {
							Submit submit = (Submit) object;
							EditingDomain editingDomain = getEditingDomain(submit);
							// parse, initialize, analyze and set the expression of the input
							ExpressionsAnalyzer evaluator = new ExpressionsAnalyzer(
									editingDomain, submit, expression);
							evaluator.analyzeSubmitExpressions(true);
						}
					}
				}
				
			});
	}

	/**
	 * This adds a property descriptor for the Validator Expression feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addValidatorExpressionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Submit_validatorExpression_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Submit_validatorExpression_feature", "_UI_Submit_type"),
				 WebDSLPackage.Literals.SUBMIT__VALIDATOR_EXPRESSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null)
			{

				@Override
				public void setPropertyValue(Object object, Object value) {
					super.setPropertyValue(object, value);
					
					// get the expression
					if (value instanceof String && object instanceof Submit) {
						String expression = (String) value;
						if (!expression.isEmpty()) {
							Submit submit = (Submit) object;
							EditingDomain editingDomain = getEditingDomain(submit);
							// parse, initialize, analyze and set the expression of the input
							ExpressionsAnalyzer evaluator = new ExpressionsAnalyzer(
									editingDomain, submit, expression);
							evaluator.analyzeSubmitExpressions(false);
						}
					}
				}
				
			});
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(WebDSLPackage.Literals.SUBMIT__ACTION);
			childrenFeatures.add(WebDSLPackage.Literals.SUBMIT__PERFORMER);
			childrenFeatures.add(WebDSLPackage.Literals.SUBMIT__VALIDATOR);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Submit)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Submit_type") :
			getString("_UI_Submit_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Submit.class)) {
			case WebDSLPackage.SUBMIT__PERFORMER_EXPRESSION:
			case WebDSLPackage.SUBMIT__VALIDATOR_EXPRESSION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case WebDSLPackage.SUBMIT__ACTION:
			case WebDSLPackage.SUBMIT__PERFORMER:
			case WebDSLPackage.SUBMIT__VALIDATOR:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.SUBMIT__ACTION,
				 WebDSLFactory.eINSTANCE.createAction()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.SUBMIT__PERFORMER,
				 WebDSLFactory.eINSTANCE.createVariableExp()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.SUBMIT__PERFORMER,
				 WebDSLFactory.eINSTANCE.createArithmeticOperation()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.SUBMIT__PERFORMER,
				 WebDSLFactory.eINSTANCE.createStructuralExp()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.SUBMIT__PERFORMER,
				 WebDSLFactory.eINSTANCE.createClassifierOperation()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.SUBMIT__PERFORMER,
				 WebDSLFactory.eINSTANCE.createIntegerConstant()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.SUBMIT__PERFORMER,
				 WebDSLFactory.eINSTANCE.createStringConstant()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.SUBMIT__PERFORMER,
				 WebDSLFactory.eINSTANCE.createStringOperation()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.SUBMIT__PERFORMER,
				 WebDSLFactory.eINSTANCE.createBooleanConstant()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.SUBMIT__PERFORMER,
				 WebDSLFactory.eINSTANCE.createBooleanOperation()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.SUBMIT__PERFORMER,
				 WebDSLFactory.eINSTANCE.createComparisonOperation()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.SUBMIT__PERFORMER,
				 WebDSLFactory.eINSTANCE.createRealConstant()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.SUBMIT__PERFORMER,
				 WebDSLFactory.eINSTANCE.createListExp()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.SUBMIT__PERFORMER,
				 WebDSLFactory.eINSTANCE.createListElement()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.SUBMIT__PERFORMER,
				 WebDSLFactory.eINSTANCE.createWebUtilExp()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.SUBMIT__VALIDATOR,
				 WebDSLFactory.eINSTANCE.createVariableExp()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.SUBMIT__VALIDATOR,
				 WebDSLFactory.eINSTANCE.createArithmeticOperation()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.SUBMIT__VALIDATOR,
				 WebDSLFactory.eINSTANCE.createStructuralExp()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.SUBMIT__VALIDATOR,
				 WebDSLFactory.eINSTANCE.createClassifierOperation()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.SUBMIT__VALIDATOR,
				 WebDSLFactory.eINSTANCE.createIntegerConstant()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.SUBMIT__VALIDATOR,
				 WebDSLFactory.eINSTANCE.createStringConstant()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.SUBMIT__VALIDATOR,
				 WebDSLFactory.eINSTANCE.createStringOperation()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.SUBMIT__VALIDATOR,
				 WebDSLFactory.eINSTANCE.createBooleanConstant()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.SUBMIT__VALIDATOR,
				 WebDSLFactory.eINSTANCE.createBooleanOperation()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.SUBMIT__VALIDATOR,
				 WebDSLFactory.eINSTANCE.createComparisonOperation()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.SUBMIT__VALIDATOR,
				 WebDSLFactory.eINSTANCE.createRealConstant()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.SUBMIT__VALIDATOR,
				 WebDSLFactory.eINSTANCE.createListExp()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.SUBMIT__VALIDATOR,
				 WebDSLFactory.eINSTANCE.createListElement()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.SUBMIT__VALIDATOR,
				 WebDSLFactory.eINSTANCE.createWebUtilExp()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == WebDSLPackage.Literals.SUBMIT__PERFORMER ||
			childFeature == WebDSLPackage.Literals.SUBMIT__VALIDATOR;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
