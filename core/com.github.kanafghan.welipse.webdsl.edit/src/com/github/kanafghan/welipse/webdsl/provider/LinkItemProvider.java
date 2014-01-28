/**
 */
package com.github.kanafghan.welipse.webdsl.provider;


import com.github.kanafghan.welipse.webdsl.Link;
import com.github.kanafghan.welipse.webdsl.WebDSLFactory;
import com.github.kanafghan.welipse.webdsl.WebDSLPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.github.kanafghan.welipse.webdsl.Link} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LinkItemProvider
	extends NavigationElementItemProvider
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
	public LinkItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(WebDSLPackage.Literals.LINK__SOURCE);
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
		String label = ((Link)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Link_type") :
			getString("_UI_Link_type") + " " + label;
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

		switch (notification.getFeatureID(Link.class)) {
			case WebDSLPackage.LINK__SOURCE:
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
				(WebDSLPackage.Literals.LINK__SOURCE,
				 WebDSLFactory.eINSTANCE.createList()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.LINK__SOURCE,
				 WebDSLFactory.eINSTANCE.createText()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.LINK__SOURCE,
				 WebDSLFactory.eINSTANCE.createImage()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.LINK__SOURCE,
				 WebDSLFactory.eINSTANCE.createInternalLink()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.LINK__SOURCE,
				 WebDSLFactory.eINSTANCE.createExternalLink()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.LINK__SOURCE,
				 WebDSLFactory.eINSTANCE.createGroup()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.LINK__SOURCE,
				 WebDSLFactory.eINSTANCE.createForm()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.LINK__SOURCE,
				 WebDSLFactory.eINSTANCE.createTextInput()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.LINK__SOURCE,
				 WebDSLFactory.eINSTANCE.createAction()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.LINK__SOURCE,
				 WebDSLFactory.eINSTANCE.createButton()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.LINK__SOURCE,
				 WebDSLFactory.eINSTANCE.createSelectionList()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.LINK__SOURCE,
				 WebDSLFactory.eINSTANCE.createFileInput()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.LINK__SOURCE,
				 WebDSLFactory.eINSTANCE.createCustomAction()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.LINK__SOURCE,
				 WebDSLFactory.eINSTANCE.createSave()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.LINK__SOURCE,
				 WebDSLFactory.eINSTANCE.createReset()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.LINK__SOURCE,
				 WebDSLFactory.eINSTANCE.createCancel()));
	}

}
