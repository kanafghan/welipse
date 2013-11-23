/**
 */
package com.github.kanafghan.welipse.webdsl.provider;


import com.github.kanafghan.welipse.webdsl.PresentationElement;
import com.github.kanafghan.welipse.webdsl.WebDSLFactory;
import com.github.kanafghan.welipse.webdsl.WebDSLPackage;
import com.github.kanafghan.welipse.webdsl.expressions.ExpressionsAnalyzer;

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

/**
 * This is the item provider adapter for a {@link com.github.kanafghan.welipse.webdsl.List} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ListItemProvider
	extends PresentationElementItemProvider
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
	public ListItemProvider(AdapterFactory adapterFactory) {
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

			addVariablePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Variable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addVariablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_List_variable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_List_variable_feature", "_UI_List_type"),
				 WebDSLPackage.Literals.LIST__VARIABLE,
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
					
					// get the variable declaration
					if (value instanceof String && object instanceof PresentationElement) {
						String expression = (String) value;
						PresentationElement element = (PresentationElement) object;
						EditingDomain editingDomain = getEditingDomain(element);
						
						// parse, initialize, analyze and set the iteratorVariable of the list
						ExpressionsAnalyzer evaluator = new ExpressionsAnalyzer(editingDomain, element, expression);
						evaluator.analyzeIteratorVariable();
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
			childrenFeatures.add(WebDSLPackage.Literals.LIST__ELEMENTS);
			childrenFeatures.add(WebDSLPackage.Literals.LIST__COLLECTION);
			childrenFeatures.add(WebDSLPackage.Literals.LIST__ITERATOR_VARIABLE);
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
	 * This returns List.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/List"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((com.github.kanafghan.welipse.webdsl.List)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_List_type") :
			getString("_UI_List_type") + " " + label;
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

		switch (notification.getFeatureID(com.github.kanafghan.welipse.webdsl.List.class)) {
			case WebDSLPackage.LIST__VARIABLE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case WebDSLPackage.LIST__ELEMENTS:
			case WebDSLPackage.LIST__COLLECTION:
			case WebDSLPackage.LIST__ITERATOR_VARIABLE:
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
				(WebDSLPackage.Literals.LIST__ELEMENTS,
				 WebDSLFactory.eINSTANCE.createList()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.LIST__ELEMENTS,
				 WebDSLFactory.eINSTANCE.createText()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.LIST__ELEMENTS,
				 WebDSLFactory.eINSTANCE.createImage()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.LIST__ELEMENTS,
				 WebDSLFactory.eINSTANCE.createInternalLink()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.LIST__ELEMENTS,
				 WebDSLFactory.eINSTANCE.createExternalLink()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.LIST__COLLECTION,
				 WebDSLFactory.eINSTANCE.createVariableExp()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.LIST__COLLECTION,
				 WebDSLFactory.eINSTANCE.createArithmeticOperation()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.LIST__COLLECTION,
				 WebDSLFactory.eINSTANCE.createStructuralExp()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.LIST__COLLECTION,
				 WebDSLFactory.eINSTANCE.createClassifierOperation()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.LIST__COLLECTION,
				 WebDSLFactory.eINSTANCE.createIntegerConstant()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.LIST__COLLECTION,
				 WebDSLFactory.eINSTANCE.createStringConstant()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.LIST__COLLECTION,
				 WebDSLFactory.eINSTANCE.createStringOperation()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.LIST__COLLECTION,
				 WebDSLFactory.eINSTANCE.createBooleanConstant()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.LIST__COLLECTION,
				 WebDSLFactory.eINSTANCE.createBooleanOperation()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.LIST__COLLECTION,
				 WebDSLFactory.eINSTANCE.createComparisonOperation()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.LIST__COLLECTION,
				 WebDSLFactory.eINSTANCE.createRealConstant()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.LIST__ITERATOR_VARIABLE,
				 WebDSLFactory.eINSTANCE.createVariableInitialization()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.LIST__ITERATOR_VARIABLE,
				 WebDSLFactory.eINSTANCE.createParameter()));
	}

}
