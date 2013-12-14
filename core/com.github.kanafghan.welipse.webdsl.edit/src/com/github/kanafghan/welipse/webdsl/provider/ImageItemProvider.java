/**
 */
package com.github.kanafghan.welipse.webdsl.provider;


import com.github.kanafghan.welipse.webdsl.Image;
import com.github.kanafghan.welipse.webdsl.WebDSLFactory;
import com.github.kanafghan.welipse.webdsl.WebDSLPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

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
 * This is the item provider adapter for a {@link com.github.kanafghan.welipse.webdsl.Image} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ImageItemProvider
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
	public ImageItemProvider(AdapterFactory adapterFactory) {
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

			addReferencedPropertyDescriptor(object);
			addStaticPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Referenced feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReferencedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Image_referenced_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Image_referenced_feature", "_UI_Image_type"),
				 WebDSLPackage.Literals.IMAGE__REFERENCED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Static feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStaticPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Image_static_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Image_static_feature", "_UI_Image_type"),
				 WebDSLPackage.Literals.IMAGE__STATIC,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
			childrenFeatures.add(WebDSLPackage.Literals.IMAGE__SOURCE);
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
	 * This returns Image.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Image"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Image)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Image_type") :
			getString("_UI_Image_type") + " " + label;
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

		switch (notification.getFeatureID(Image.class)) {
			case WebDSLPackage.IMAGE__REFERENCED:
			case WebDSLPackage.IMAGE__STATIC:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case WebDSLPackage.IMAGE__SOURCE:
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
				(WebDSLPackage.Literals.IMAGE__SOURCE,
				 WebDSLFactory.eINSTANCE.createVariableExp()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.IMAGE__SOURCE,
				 WebDSLFactory.eINSTANCE.createArithmeticOperation()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.IMAGE__SOURCE,
				 WebDSLFactory.eINSTANCE.createStructuralExp()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.IMAGE__SOURCE,
				 WebDSLFactory.eINSTANCE.createClassifierOperation()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.IMAGE__SOURCE,
				 WebDSLFactory.eINSTANCE.createIntegerConstant()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.IMAGE__SOURCE,
				 WebDSLFactory.eINSTANCE.createStringConstant()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.IMAGE__SOURCE,
				 WebDSLFactory.eINSTANCE.createStringOperation()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.IMAGE__SOURCE,
				 WebDSLFactory.eINSTANCE.createBooleanConstant()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.IMAGE__SOURCE,
				 WebDSLFactory.eINSTANCE.createBooleanOperation()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.IMAGE__SOURCE,
				 WebDSLFactory.eINSTANCE.createComparisonOperation()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.IMAGE__SOURCE,
				 WebDSLFactory.eINSTANCE.createRealConstant()));
	}

}
