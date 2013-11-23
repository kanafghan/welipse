/**
 */
package com.github.kanafghan.welipse.webdsl.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
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

import com.github.kanafghan.welipse.webdsl.PresentationElement;
import com.github.kanafghan.welipse.webdsl.WebDSLPackage;
import com.github.kanafghan.welipse.webdsl.expressions.ExpressionsAnalyzer;

/**
 * This is the item provider adapter for a {@link com.github.kanafghan.welipse.webdsl.PresentationElement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PresentationElementItemProvider
	extends PageElementItemProvider
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
	public PresentationElementItemProvider(AdapterFactory adapterFactory) {
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

			addClassPropertyDescriptor(object);
			addExpressionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PresentationElement_class_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PresentationElement_class_feature", "_UI_PresentationElement_type"),
				 WebDSLPackage.Literals.PRESENTATION_ELEMENT__CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Expression feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addExpressionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PresentationElement_expression_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PresentationElement_expression_feature", "_UI_PresentationElement_type"),
				 WebDSLPackage.Literals.PRESENTATION_ELEMENT__EXPRESSION,
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
					if (value instanceof String && object instanceof PresentationElement) {
						String expression = (String) value;
						if (!expression.isEmpty()) {
							PresentationElement element = (PresentationElement) object;
							EditingDomain editingDomain = getEditingDomain(element);
							// parse, initialize, analyze and set the expression of the element
							ExpressionsAnalyzer evaluator = new ExpressionsAnalyzer(
									editingDomain, element, expression);
							evaluator.analyzeExpression();
						}
					}
				}
			});
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((PresentationElement)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_PresentationElement_type") :
			getString("_UI_PresentationElement_type") + " " + label;
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

		switch (notification.getFeatureID(PresentationElement.class)) {
			case WebDSLPackage.PRESENTATION_ELEMENT__CLASS:
			case WebDSLPackage.PRESENTATION_ELEMENT__EXPRESSION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

}
