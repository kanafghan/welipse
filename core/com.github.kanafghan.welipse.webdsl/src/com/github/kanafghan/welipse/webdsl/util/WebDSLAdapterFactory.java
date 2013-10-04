/**
 */
package com.github.kanafghan.welipse.webdsl.util;

import com.github.kanafghan.welipse.webdsl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.github.kanafghan.welipse.webdsl.WebDSLPackage
 * @generated
 */
public class WebDSLAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WebDSLPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebDSLAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = WebDSLPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebDSLSwitch<Adapter> modelSwitch =
		new WebDSLSwitch<Adapter>() {
			@Override
			public Adapter caseWebsite(Website object) {
				return createWebsiteAdapter();
			}
			@Override
			public Adapter casePage(Page object) {
				return createPageAdapter();
			}
			@Override
			public Adapter casePageElement(PageElement object) {
				return createPageElementAdapter();
			}
			@Override
			public Adapter casePresentationElement(PresentationElement object) {
				return createPresentationElementAdapter();
			}
			@Override
			public Adapter caseNavigationElement(NavigationElement object) {
				return createNavigationElementAdapter();
			}
			@Override
			public Adapter caseMultimedia(Multimedia object) {
				return createMultimediaAdapter();
			}
			@Override
			public Adapter caseText(Text object) {
				return createTextAdapter();
			}
			@Override
			public Adapter caseImage(Image object) {
				return createImageAdapter();
			}
			@Override
			public Adapter caseStaticText(StaticText object) {
				return createStaticTextAdapter();
			}
			@Override
			public Adapter caseStaticImage(StaticImage object) {
				return createStaticImageAdapter();
			}
			@Override
			public Adapter caseLink(Link object) {
				return createLinkAdapter();
			}
			@Override
			public Adapter caseInternalLink(InternalLink object) {
				return createInternalLinkAdapter();
			}
			@Override
			public Adapter caseExternalLink(ExternalLink object) {
				return createExternalLinkAdapter();
			}
			@Override
			public Adapter caseDynamicText(DynamicText object) {
				return createDynamicTextAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link com.github.kanafghan.welipse.webdsl.Website <em>Website</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.kanafghan.welipse.webdsl.Website
	 * @generated
	 */
	public Adapter createWebsiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.kanafghan.welipse.webdsl.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.kanafghan.welipse.webdsl.Page
	 * @generated
	 */
	public Adapter createPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.kanafghan.welipse.webdsl.PageElement <em>Page Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.kanafghan.welipse.webdsl.PageElement
	 * @generated
	 */
	public Adapter createPageElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.kanafghan.welipse.webdsl.PresentationElement <em>Presentation Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.kanafghan.welipse.webdsl.PresentationElement
	 * @generated
	 */
	public Adapter createPresentationElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.kanafghan.welipse.webdsl.NavigationElement <em>Navigation Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.kanafghan.welipse.webdsl.NavigationElement
	 * @generated
	 */
	public Adapter createNavigationElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.kanafghan.welipse.webdsl.Multimedia <em>Multimedia</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.kanafghan.welipse.webdsl.Multimedia
	 * @generated
	 */
	public Adapter createMultimediaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.kanafghan.welipse.webdsl.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.kanafghan.welipse.webdsl.Text
	 * @generated
	 */
	public Adapter createTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.kanafghan.welipse.webdsl.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.kanafghan.welipse.webdsl.Image
	 * @generated
	 */
	public Adapter createImageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.kanafghan.welipse.webdsl.StaticText <em>Static Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.kanafghan.welipse.webdsl.StaticText
	 * @generated
	 */
	public Adapter createStaticTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.kanafghan.welipse.webdsl.StaticImage <em>Static Image</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.kanafghan.welipse.webdsl.StaticImage
	 * @generated
	 */
	public Adapter createStaticImageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.kanafghan.welipse.webdsl.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.kanafghan.welipse.webdsl.Link
	 * @generated
	 */
	public Adapter createLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.kanafghan.welipse.webdsl.InternalLink <em>Internal Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.kanafghan.welipse.webdsl.InternalLink
	 * @generated
	 */
	public Adapter createInternalLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.kanafghan.welipse.webdsl.ExternalLink <em>External Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.kanafghan.welipse.webdsl.ExternalLink
	 * @generated
	 */
	public Adapter createExternalLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.kanafghan.welipse.webdsl.DynamicText <em>Dynamic Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.kanafghan.welipse.webdsl.DynamicText
	 * @generated
	 */
	public Adapter createDynamicTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //WebDSLAdapterFactory
