/**
 */
package com.github.kanafghan.welipse.webdsl.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
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
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import com.github.kanafghan.welipse.webdsl.Page;
import com.github.kanafghan.welipse.webdsl.WebDSLFactory;
import com.github.kanafghan.welipse.webdsl.WebDSLPackage;
import com.github.kanafghan.welipse.webdsl.expressions.ExpressionsAnalyzer;

/**
 * This is the item provider adapter for a {@link com.github.kanafghan.welipse.webdsl.Page} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PageItemProvider
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
	public PageItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addParameterPropertyDescriptor(object);
			addVariablePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Page_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Page_name_feature", "_UI_Page_type"),
				 WebDSLPackage.Literals.PAGE__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Page_parameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Page_parameter_feature", "_UI_Page_type"),
				 WebDSLPackage.Literals.PAGE__PARAMETER,
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
					
					// get the declaration of the parameter
					if (value instanceof String && object instanceof Page) {
						String expression = (String) value;
						if (!expression.isEmpty()) {							
							Page page = (Page) object;
							EditingDomain editingDomain = getEditingDomain(page);
							
							// parse, initialize, analyze and add the parameter to the page
							ExpressionsAnalyzer evaluator = new ExpressionsAnalyzer(editingDomain, page, expression);
							evaluator.analyzeParameter();
						}
					}
				}
			});
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
                  getString("_UI_Page_variable_feature"),
                  getString("_UI_PropertyDescriptor_description", "_UI_Page_variable_feature", "_UI_Page_type"),
                  WebDSLPackage.Literals.PAGE__VARIABLE,
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
                         
                         // get the declaration of the parameter
                         if (value instanceof String && object instanceof Page) {
                                 String expression = (String) value;
                                 if (!expression.isEmpty()) {                                	 
                                	 Page page = (Page) object;
                                	 EditingDomain editingDomain = getEditingDomain(page);
                                	 
                                	 // parse, initialize, analyze and add the variable to the page
                                	 ExpressionsAnalyzer analyzer = new ExpressionsAnalyzer(editingDomain, page, expression);
                                	 analyzer.analyzeVariable();
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
			childrenFeatures.add(WebDSLPackage.Literals.PAGE__ELEMENTS);
			childrenFeatures.add(WebDSLPackage.Literals.PAGE__PARAMETERS);
			childrenFeatures.add(WebDSLPackage.Literals.PAGE__VARIABLES);
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
	 * This returns Page.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Page"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Page)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Page_type") :
			getString("_UI_Page_type") + " " + label;
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

		switch (notification.getFeatureID(Page.class)) {
			case WebDSLPackage.PAGE__NAME:
			case WebDSLPackage.PAGE__PARAMETER:
			case WebDSLPackage.PAGE__VARIABLE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case WebDSLPackage.PAGE__ELEMENTS:
			case WebDSLPackage.PAGE__PARAMETERS:
			case WebDSLPackage.PAGE__VARIABLES:
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
				(WebDSLPackage.Literals.PAGE__ELEMENTS,
				 WebDSLFactory.eINSTANCE.createList()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.PAGE__ELEMENTS,
				 WebDSLFactory.eINSTANCE.createText()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.PAGE__ELEMENTS,
				 WebDSLFactory.eINSTANCE.createImage()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.PAGE__ELEMENTS,
				 WebDSLFactory.eINSTANCE.createInternalLink()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.PAGE__ELEMENTS,
				 WebDSLFactory.eINSTANCE.createExternalLink()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.PAGE__ELEMENTS,
				 WebDSLFactory.eINSTANCE.createGroup()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.PAGE__ELEMENTS,
				 WebDSLFactory.eINSTANCE.createForm()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.PAGE__ELEMENTS,
				 WebDSLFactory.eINSTANCE.createTextInput()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.PAGE__ELEMENTS,
				 WebDSLFactory.eINSTANCE.createAction()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.PAGE__ELEMENTS,
				 WebDSLFactory.eINSTANCE.createButton()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.PAGE__ELEMENTS,
				 WebDSLFactory.eINSTANCE.createSelectionList()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.PAGE__ELEMENTS,
				 WebDSLFactory.eINSTANCE.createFileInput()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.PAGE__ELEMENTS,
				 WebDSLFactory.eINSTANCE.createCustomAction()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.PAGE__ELEMENTS,
				 WebDSLFactory.eINSTANCE.createSave()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.PAGE__ELEMENTS,
				 WebDSLFactory.eINSTANCE.createReset()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.PAGE__ELEMENTS,
				 WebDSLFactory.eINSTANCE.createCancel()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.PAGE__PARAMETERS,
				 WebDSLFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add
			(createChildParameter
				(WebDSLPackage.Literals.PAGE__VARIABLES,
				 WebDSLFactory.eINSTANCE.createVariableInitialization()));
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
