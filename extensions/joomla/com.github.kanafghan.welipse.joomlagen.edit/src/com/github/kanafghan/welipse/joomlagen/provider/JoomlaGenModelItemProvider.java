/**
 */
package com.github.kanafghan.welipse.joomlagen.provider;


import com.github.kanafghan.welipse.joomlagen.JoomlaGenModel;
import com.github.kanafghan.welipse.joomlagen.JoomlaGenPackage;
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

/**
 * This is the item provider adapter for a {@link com.github.kanafghan.welipse.joomlagen.JoomlaGenModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class JoomlaGenModelItemProvider
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
	public JoomlaGenModelItemProvider(AdapterFactory adapterFactory) {
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

			addExtensionTypePropertyDescriptor(object);
			addJoomlaVersionPropertyDescriptor(object);
			addWebmodelPropertyDescriptor(object);
			addCustomCSSFilesPropertyDescriptor(object);
			addDatamodelPropertyDescriptor(object);
			addUseBootstrapPropertyDescriptor(object);
			addMinifiedBootsrapPropertyDescriptor(object);
			addExtensionNamePropertyDescriptor(object);
			addCreationDatePropertyDescriptor(object);
			addAuthorPropertyDescriptor(object);
			addAuthorEmailPropertyDescriptor(object);
			addAuthorURLPropertyDescriptor(object);
			addCopyrightPropertyDescriptor(object);
			addLicensePropertyDescriptor(object);
			addVersionPropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addDatabaseTablePrefixPropertyDescriptor(object);
			addComponentNamePropertyDescriptor(object);
			addInitialDataPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Extension Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExtensionTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JoomlaGenModel_extensionType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JoomlaGenModel_extensionType_feature", "_UI_JoomlaGenModel_type"),
				 JoomlaGenPackage.Literals.JOOMLA_GEN_MODEL__EXTENSION_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_ManifestPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Joomla Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addJoomlaVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JoomlaGenModel_joomlaVersion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JoomlaGenModel_joomlaVersion_feature", "_UI_JoomlaGenModel_type"),
				 JoomlaGenPackage.Literals.JOOMLA_GEN_MODEL__JOOMLA_VERSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_ManifestPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Webmodel feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWebmodelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JoomlaGenModel_webmodel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JoomlaGenModel_webmodel_feature", "_UI_JoomlaGenModel_type"),
				 JoomlaGenPackage.Literals.JOOMLA_GEN_MODEL__WEBMODEL,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_GeneralPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Custom CSS Files feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCustomCSSFilesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JoomlaGenModel_customCSSFiles_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JoomlaGenModel_customCSSFiles_feature", "_UI_JoomlaGenModel_type"),
				 JoomlaGenPackage.Literals.JOOMLA_GEN_MODEL__CUSTOM_CSS_FILES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_GeneralPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Extension Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExtensionNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JoomlaGenModel_extensionName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JoomlaGenModel_extensionName_feature", "_UI_JoomlaGenModel_type"),
				 JoomlaGenPackage.Literals.JOOMLA_GEN_MODEL__EXTENSION_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_ManifestPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Creation Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCreationDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JoomlaGenModel_creationDate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JoomlaGenModel_creationDate_feature", "_UI_JoomlaGenModel_type"),
				 JoomlaGenPackage.Literals.JOOMLA_GEN_MODEL__CREATION_DATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_ManifestPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Author feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAuthorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JoomlaGenModel_author_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JoomlaGenModel_author_feature", "_UI_JoomlaGenModel_type"),
				 JoomlaGenPackage.Literals.JOOMLA_GEN_MODEL__AUTHOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_ManifestPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Author Email feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAuthorEmailPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JoomlaGenModel_authorEmail_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JoomlaGenModel_authorEmail_feature", "_UI_JoomlaGenModel_type"),
				 JoomlaGenPackage.Literals.JOOMLA_GEN_MODEL__AUTHOR_EMAIL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_ManifestPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Author URL feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAuthorURLPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JoomlaGenModel_authorURL_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JoomlaGenModel_authorURL_feature", "_UI_JoomlaGenModel_type"),
				 JoomlaGenPackage.Literals.JOOMLA_GEN_MODEL__AUTHOR_URL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_ManifestPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Copyright feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCopyrightPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JoomlaGenModel_copyright_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JoomlaGenModel_copyright_feature", "_UI_JoomlaGenModel_type"),
				 JoomlaGenPackage.Literals.JOOMLA_GEN_MODEL__COPYRIGHT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_ManifestPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the License feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLicensePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JoomlaGenModel_license_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JoomlaGenModel_license_feature", "_UI_JoomlaGenModel_type"),
				 JoomlaGenPackage.Literals.JOOMLA_GEN_MODEL__LICENSE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_ManifestPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JoomlaGenModel_version_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JoomlaGenModel_version_feature", "_UI_JoomlaGenModel_type"),
				 JoomlaGenPackage.Literals.JOOMLA_GEN_MODEL__VERSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_ManifestPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JoomlaGenModel_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JoomlaGenModel_description_feature", "_UI_JoomlaGenModel_type"),
				 JoomlaGenPackage.Literals.JOOMLA_GEN_MODEL__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_ManifestPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Database Table Prefix feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDatabaseTablePrefixPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JoomlaGenModel_databaseTablePrefix_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JoomlaGenModel_databaseTablePrefix_feature", "_UI_JoomlaGenModel_type"),
				 JoomlaGenPackage.Literals.JOOMLA_GEN_MODEL__DATABASE_TABLE_PREFIX,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_DatabasePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Component Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addComponentNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JoomlaGenModel_componentName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JoomlaGenModel_componentName_feature", "_UI_JoomlaGenModel_type"),
				 JoomlaGenPackage.Literals.JOOMLA_GEN_MODEL__COMPONENT_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_GeneralPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Initial Data feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInitialDataPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JoomlaGenModel_initialData_feature"),
				 getString("_UI_JoomlaGenModel_initialData_description"),
				 JoomlaGenPackage.Literals.JOOMLA_GEN_MODEL__INITIAL_DATA,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_GeneralPropertyCategory"),
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
			childrenFeatures.add(JoomlaGenPackage.Literals.JOOMLA_GEN_MODEL__DATAMODEL);
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
	 * This adds a property descriptor for the Datamodel feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDatamodelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JoomlaGenModel_datamodel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JoomlaGenModel_datamodel_feature", "_UI_JoomlaGenModel_type"),
				 JoomlaGenPackage.Literals.JOOMLA_GEN_MODEL__DATAMODEL,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_GeneralPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Use Bootstrap feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUseBootstrapPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JoomlaGenModel_useBootstrap_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JoomlaGenModel_useBootstrap_feature", "_UI_JoomlaGenModel_type"),
				 JoomlaGenPackage.Literals.JOOMLA_GEN_MODEL__USE_BOOTSTRAP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_GeneralPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Minified Bootsrap feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinifiedBootsrapPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JoomlaGenModel_minifiedBootsrap_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JoomlaGenModel_minifiedBootsrap_feature", "_UI_JoomlaGenModel_type"),
				 JoomlaGenPackage.Literals.JOOMLA_GEN_MODEL__MINIFIED_BOOTSRAP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_GeneralPropertyCategory"),
				 null));
	}

	/**
	 * This returns JoomlaGenModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/JoomlaGenModel"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((JoomlaGenModel)object).getExtensionName();
		return label == null || label.length() == 0 ?
			getString("_UI_JoomlaGenModel_type") :
			getString("_UI_JoomlaGenModel_type") + " " + label;
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

		switch (notification.getFeatureID(JoomlaGenModel.class)) {
			case JoomlaGenPackage.JOOMLA_GEN_MODEL__EXTENSION_TYPE:
			case JoomlaGenPackage.JOOMLA_GEN_MODEL__JOOMLA_VERSION:
			case JoomlaGenPackage.JOOMLA_GEN_MODEL__CUSTOM_CSS_FILES:
			case JoomlaGenPackage.JOOMLA_GEN_MODEL__USE_BOOTSTRAP:
			case JoomlaGenPackage.JOOMLA_GEN_MODEL__MINIFIED_BOOTSRAP:
			case JoomlaGenPackage.JOOMLA_GEN_MODEL__EXTENSION_NAME:
			case JoomlaGenPackage.JOOMLA_GEN_MODEL__CREATION_DATE:
			case JoomlaGenPackage.JOOMLA_GEN_MODEL__AUTHOR:
			case JoomlaGenPackage.JOOMLA_GEN_MODEL__AUTHOR_EMAIL:
			case JoomlaGenPackage.JOOMLA_GEN_MODEL__AUTHOR_URL:
			case JoomlaGenPackage.JOOMLA_GEN_MODEL__COPYRIGHT:
			case JoomlaGenPackage.JOOMLA_GEN_MODEL__LICENSE:
			case JoomlaGenPackage.JOOMLA_GEN_MODEL__VERSION:
			case JoomlaGenPackage.JOOMLA_GEN_MODEL__DESCRIPTION:
			case JoomlaGenPackage.JOOMLA_GEN_MODEL__DATABASE_TABLE_PREFIX:
			case JoomlaGenPackage.JOOMLA_GEN_MODEL__COMPONENT_NAME:
			case JoomlaGenPackage.JOOMLA_GEN_MODEL__DATABASE_TABLES:
			case JoomlaGenPackage.JOOMLA_GEN_MODEL__INITIAL_DATA:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case JoomlaGenPackage.JOOMLA_GEN_MODEL__DATAMODEL:
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
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return JoomlagenEditPlugin.INSTANCE;
	}

}
