/**
 */
package com.github.kanafghan.welipse.webdsl.provider;

import com.github.kanafghan.welipse.webdsl.util.WebDSLAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WebDSLItemProviderAdapterFactory extends WebDSLAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebDSLItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.kanafghan.welipse.webdsl.Website} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebsiteItemProvider websiteItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.kanafghan.welipse.webdsl.Website}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWebsiteAdapter() {
		if (websiteItemProvider == null) {
			websiteItemProvider = new WebsiteItemProvider(this);
		}

		return websiteItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.kanafghan.welipse.webdsl.Page} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PageItemProvider pageItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.kanafghan.welipse.webdsl.Page}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPageAdapter() {
		if (pageItemProvider == null) {
			pageItemProvider = new PageItemProvider(this);
		}

		return pageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.kanafghan.welipse.webdsl.StaticText} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StaticTextItemProvider staticTextItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.kanafghan.welipse.webdsl.StaticText}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStaticTextAdapter() {
		if (staticTextItemProvider == null) {
			staticTextItemProvider = new StaticTextItemProvider(this);
		}

		return staticTextItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.kanafghan.welipse.webdsl.StaticImage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StaticImageItemProvider staticImageItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.kanafghan.welipse.webdsl.StaticImage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStaticImageAdapter() {
		if (staticImageItemProvider == null) {
			staticImageItemProvider = new StaticImageItemProvider(this);
		}

		return staticImageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.kanafghan.welipse.webdsl.InternalLink} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InternalLinkItemProvider internalLinkItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.kanafghan.welipse.webdsl.InternalLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInternalLinkAdapter() {
		if (internalLinkItemProvider == null) {
			internalLinkItemProvider = new InternalLinkItemProvider(this);
		}

		return internalLinkItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.kanafghan.welipse.webdsl.ExternalLink} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalLinkItemProvider externalLinkItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.kanafghan.welipse.webdsl.ExternalLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExternalLinkAdapter() {
		if (externalLinkItemProvider == null) {
			externalLinkItemProvider = new ExternalLinkItemProvider(this);
		}

		return externalLinkItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.kanafghan.welipse.webdsl.DynamicText} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DynamicTextItemProvider dynamicTextItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.kanafghan.welipse.webdsl.DynamicText}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDynamicTextAdapter() {
		if (dynamicTextItemProvider == null) {
			dynamicTextItemProvider = new DynamicTextItemProvider(this);
		}

		return dynamicTextItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.kanafghan.welipse.webdsl.DynamicImage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DynamicImageItemProvider dynamicImageItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.kanafghan.welipse.webdsl.DynamicImage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDynamicImageAdapter() {
		if (dynamicImageItemProvider == null) {
			dynamicImageItemProvider = new DynamicImageItemProvider(this);
		}

		return dynamicImageItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (websiteItemProvider != null) websiteItemProvider.dispose();
		if (pageItemProvider != null) pageItemProvider.dispose();
		if (staticTextItemProvider != null) staticTextItemProvider.dispose();
		if (staticImageItemProvider != null) staticImageItemProvider.dispose();
		if (internalLinkItemProvider != null) internalLinkItemProvider.dispose();
		if (externalLinkItemProvider != null) externalLinkItemProvider.dispose();
		if (dynamicTextItemProvider != null) dynamicTextItemProvider.dispose();
		if (dynamicImageItemProvider != null) dynamicImageItemProvider.dispose();
	}

}
