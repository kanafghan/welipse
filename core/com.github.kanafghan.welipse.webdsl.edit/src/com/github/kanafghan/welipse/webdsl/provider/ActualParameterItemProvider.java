/**
 */
package com.github.kanafghan.welipse.webdsl.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import com.github.kanafghan.welipse.webdsl.ActualParameter;
import com.github.kanafghan.welipse.webdsl.WebDSLFactory;
import com.github.kanafghan.welipse.webdsl.WebDSLPackage;
import com.github.kanafghan.welipse.webdsl.provider.integration.ParseableItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link com.github.kanafghan.welipse.webdsl.ActualParameter} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ActualParameterItemProvider
	extends ItemProviderAdapter
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
	public ActualParameterItemProvider(AdapterFactory adapterFactory) {
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

			addIdentifierPropertyDescriptor(object);
			addFormalParameterPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Identifier feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addIdentifierPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ParseableItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActualParameter_identifier_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActualParameter_identifier_feature", "_UI_ActualParameter_type"),
				 WebDSLPackage.Literals.ACTUAL_PARAMETER__IDENTIFIER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Formal Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFormalParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActualParameter_formalParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActualParameter_formalParameter_feature", "_UI_ActualParameter_type"),
				 WebDSLPackage.Literals.ACTUAL_PARAMETER__FORMAL_PARAMETER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
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
			childrenFeatures.add(WebDSLPackage.Literals.ACTUAL_PARAMETER__VALUE);
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
	 * This returns ActualParameter.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ActualParameter"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ActualParameter)object).getIdentifier();
		return label == null || label.length() == 0 ?
			getString("_UI_ActualParameter_type") :
			getString("_UI_ActualParameter_type") + " " + label;
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

		switch (notification.getFeatureID(ActualParameter.class)) {
			case WebDSLPackage.ACTUAL_PARAMETER__IDENTIFIER:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case WebDSLPackage.ACTUAL_PARAMETER__VALUE:
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
				(WebDSLPackage.Literals.ACTUAL_PARAMETER__VALUE,
				 WebDSLFactory.eINSTANCE.createVariableExp()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.ACTUAL_PARAMETER__VALUE,
				 WebDSLFactory.eINSTANCE.createArithmeticOperation()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.ACTUAL_PARAMETER__VALUE,
				 WebDSLFactory.eINSTANCE.createStructuralExp()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.ACTUAL_PARAMETER__VALUE,
				 WebDSLFactory.eINSTANCE.createClassifierOperation()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.ACTUAL_PARAMETER__VALUE,
				 WebDSLFactory.eINSTANCE.createIntegerConstant()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.ACTUAL_PARAMETER__VALUE,
				 WebDSLFactory.eINSTANCE.createStringConstant()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.ACTUAL_PARAMETER__VALUE,
				 WebDSLFactory.eINSTANCE.createStringOperation()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.ACTUAL_PARAMETER__VALUE,
				 WebDSLFactory.eINSTANCE.createBooleanConstant()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.ACTUAL_PARAMETER__VALUE,
				 WebDSLFactory.eINSTANCE.createBooleanOperation()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.ACTUAL_PARAMETER__VALUE,
				 WebDSLFactory.eINSTANCE.createComparisonOperation()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.ACTUAL_PARAMETER__VALUE,
				 WebDSLFactory.eINSTANCE.createRealConstant()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.ACTUAL_PARAMETER__VALUE,
				 WebDSLFactory.eINSTANCE.createListExp()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.ACTUAL_PARAMETER__VALUE,
				 WebDSLFactory.eINSTANCE.createListElement()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.ACTUAL_PARAMETER__VALUE,
				 WebDSLFactory.eINSTANCE.createWebUtilExp()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return WebdslEditPlugin.INSTANCE;
	}

}
