/**
 */
package com.github.kanafghan.welipse.webdsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.github.kanafghan.welipse.webdsl.WebDSLFactory
 * @model kind="package"
 * @generated
 */
public interface WebDSLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "webdsl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://github.com/kanafghan/welipse/webdsl/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "webdsl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WebDSLPackage eINSTANCE = com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.github.kanafghan.welipse.webdsl.impl.WebsiteImpl <em>Website</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.kanafghan.welipse.webdsl.impl.WebsiteImpl
	 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getWebsite()
	 * @generated
	 */
	int WEBSITE = 0;

	/**
	 * The feature id for the '<em><b>Pages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBSITE__PAGES = 0;

	/**
	 * The feature id for the '<em><b>Home</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBSITE__HOME = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBSITE__NAME = 2;

	/**
	 * The number of structural features of the '<em>Website</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBSITE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Website</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBSITE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.github.kanafghan.welipse.webdsl.impl.PageImpl <em>Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.kanafghan.welipse.webdsl.impl.PageImpl
	 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getPage()
	 * @generated
	 */
	int PAGE = 1;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.github.kanafghan.welipse.webdsl.impl.PageElementImpl <em>Page Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.kanafghan.welipse.webdsl.impl.PageElementImpl
	 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getPageElement()
	 * @generated
	 */
	int PAGE_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Page</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_ELEMENT__PAGE = 1;

	/**
	 * The number of structural features of the '<em>Page Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Page Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.github.kanafghan.welipse.webdsl.impl.PresentationElementImpl <em>Presentation Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.kanafghan.welipse.webdsl.impl.PresentationElementImpl
	 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getPresentationElement()
	 * @generated
	 */
	int PRESENTATION_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION_ELEMENT__NAME = PAGE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Page</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION_ELEMENT__PAGE = PAGE_ELEMENT__PAGE;

	/**
	 * The number of structural features of the '<em>Presentation Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION_ELEMENT_FEATURE_COUNT = PAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Presentation Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION_ELEMENT_OPERATION_COUNT = PAGE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.kanafghan.welipse.webdsl.impl.NavigationElementImpl <em>Navigation Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.kanafghan.welipse.webdsl.impl.NavigationElementImpl
	 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getNavigationElement()
	 * @generated
	 */
	int NAVIGATION_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_ELEMENT__NAME = PAGE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Page</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_ELEMENT__PAGE = PAGE_ELEMENT__PAGE;

	/**
	 * The number of structural features of the '<em>Navigation Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_ELEMENT_FEATURE_COUNT = PAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Navigation Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_ELEMENT_OPERATION_COUNT = PAGE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.kanafghan.welipse.webdsl.impl.MultimediaImpl <em>Multimedia</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.kanafghan.welipse.webdsl.impl.MultimediaImpl
	 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getMultimedia()
	 * @generated
	 */
	int MULTIMEDIA = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIMEDIA__NAME = PRESENTATION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Page</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIMEDIA__PAGE = PRESENTATION_ELEMENT__PAGE;

	/**
	 * The number of structural features of the '<em>Multimedia</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIMEDIA_FEATURE_COUNT = PRESENTATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Multimedia</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIMEDIA_OPERATION_COUNT = PRESENTATION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.kanafghan.welipse.webdsl.impl.TextImpl <em>Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.kanafghan.welipse.webdsl.impl.TextImpl
	 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getText()
	 * @generated
	 */
	int TEXT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__NAME = PRESENTATION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Page</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__PAGE = PRESENTATION_ELEMENT__PAGE;

	/**
	 * The number of structural features of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FEATURE_COUNT = PRESENTATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_OPERATION_COUNT = PRESENTATION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.kanafghan.welipse.webdsl.impl.ImageImpl <em>Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.kanafghan.welipse.webdsl.impl.ImageImpl
	 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__NAME = PRESENTATION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Page</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__PAGE = PRESENTATION_ELEMENT__PAGE;

	/**
	 * The number of structural features of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FEATURE_COUNT = PRESENTATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_OPERATION_COUNT = PRESENTATION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.kanafghan.welipse.webdsl.impl.StaticTextImpl <em>Static Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.kanafghan.welipse.webdsl.impl.StaticTextImpl
	 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getStaticText()
	 * @generated
	 */
	int STATIC_TEXT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_TEXT__NAME = TEXT__NAME;

	/**
	 * The feature id for the '<em><b>Page</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_TEXT__PAGE = TEXT__PAGE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_TEXT__CONTENT = TEXT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Static Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_TEXT_FEATURE_COUNT = TEXT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Static Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_TEXT_OPERATION_COUNT = TEXT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.kanafghan.welipse.webdsl.impl.StaticImageImpl <em>Static Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.kanafghan.welipse.webdsl.impl.StaticImageImpl
	 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getStaticImage()
	 * @generated
	 */
	int STATIC_IMAGE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_IMAGE__NAME = IMAGE__NAME;

	/**
	 * The feature id for the '<em><b>Page</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_IMAGE__PAGE = IMAGE__PAGE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_IMAGE__SOURCE = IMAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Static Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_IMAGE_FEATURE_COUNT = IMAGE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Static Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_IMAGE_OPERATION_COUNT = IMAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.kanafghan.welipse.webdsl.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.kanafghan.welipse.webdsl.impl.LinkImpl
	 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__NAME = NAVIGATION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Page</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__PAGE = NAVIGATION_ELEMENT__PAGE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__CONTENT = NAVIGATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = NAVIGATION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_COUNT = NAVIGATION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.kanafghan.welipse.webdsl.impl.InternalLinkImpl <em>Internal Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.kanafghan.welipse.webdsl.impl.InternalLinkImpl
	 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getInternalLink()
	 * @generated
	 */
	int INTERNAL_LINK = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_LINK__NAME = LINK__NAME;

	/**
	 * The feature id for the '<em><b>Page</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_LINK__PAGE = LINK__PAGE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_LINK__CONTENT = LINK__CONTENT;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_LINK__TARGET = LINK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Internal Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_LINK_FEATURE_COUNT = LINK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Internal Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_LINK_OPERATION_COUNT = LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.kanafghan.welipse.webdsl.impl.ExternalLinkImpl <em>External Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.kanafghan.welipse.webdsl.impl.ExternalLinkImpl
	 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getExternalLink()
	 * @generated
	 */
	int EXTERNAL_LINK = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_LINK__NAME = LINK__NAME;

	/**
	 * The feature id for the '<em><b>Page</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_LINK__PAGE = LINK__PAGE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_LINK__CONTENT = LINK__CONTENT;

	/**
	 * The number of structural features of the '<em>External Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_LINK_FEATURE_COUNT = LINK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>External Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_LINK_OPERATION_COUNT = LINK_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link com.github.kanafghan.welipse.webdsl.impl.DynamicTextImpl <em>Dynamic Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.kanafghan.welipse.webdsl.impl.DynamicTextImpl
	 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getDynamicText()
	 * @generated
	 */
	int DYNAMIC_TEXT = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_TEXT__NAME = TEXT__NAME;

	/**
	 * The feature id for the '<em><b>Page</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_TEXT__PAGE = TEXT__PAGE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_TEXT__CONTENT = TEXT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dynamic Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_TEXT_FEATURE_COUNT = TEXT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Dynamic Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_TEXT_OPERATION_COUNT = TEXT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link com.github.kanafghan.welipse.webdsl.Website <em>Website</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Website</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.Website
	 * @generated
	 */
	EClass getWebsite();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.kanafghan.welipse.webdsl.Website#getPages <em>Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pages</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.Website#getPages()
	 * @see #getWebsite()
	 * @generated
	 */
	EReference getWebsite_Pages();

	/**
	 * Returns the meta object for the reference '{@link com.github.kanafghan.welipse.webdsl.Website#getHome <em>Home</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Home</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.Website#getHome()
	 * @see #getWebsite()
	 * @generated
	 */
	EReference getWebsite_Home();

	/**
	 * Returns the meta object for the attribute '{@link com.github.kanafghan.welipse.webdsl.Website#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.Website#getName()
	 * @see #getWebsite()
	 * @generated
	 */
	EAttribute getWebsite_Name();

	/**
	 * Returns the meta object for class '{@link com.github.kanafghan.welipse.webdsl.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.Page
	 * @generated
	 */
	EClass getPage();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.kanafghan.welipse.webdsl.Page#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.Page#getElements()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Elements();

	/**
	 * Returns the meta object for the attribute '{@link com.github.kanafghan.welipse.webdsl.Page#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.Page#getName()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Name();

	/**
	 * Returns the meta object for class '{@link com.github.kanafghan.welipse.webdsl.PageElement <em>Page Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page Element</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.PageElement
	 * @generated
	 */
	EClass getPageElement();

	/**
	 * Returns the meta object for the attribute '{@link com.github.kanafghan.welipse.webdsl.PageElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.PageElement#getName()
	 * @see #getPageElement()
	 * @generated
	 */
	EAttribute getPageElement_Name();

	/**
	 * Returns the meta object for the container reference '{@link com.github.kanafghan.welipse.webdsl.PageElement#getPage <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Page</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.PageElement#getPage()
	 * @see #getPageElement()
	 * @generated
	 */
	EReference getPageElement_Page();

	/**
	 * Returns the meta object for class '{@link com.github.kanafghan.welipse.webdsl.PresentationElement <em>Presentation Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Presentation Element</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.PresentationElement
	 * @generated
	 */
	EClass getPresentationElement();

	/**
	 * Returns the meta object for class '{@link com.github.kanafghan.welipse.webdsl.NavigationElement <em>Navigation Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Navigation Element</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.NavigationElement
	 * @generated
	 */
	EClass getNavigationElement();

	/**
	 * Returns the meta object for class '{@link com.github.kanafghan.welipse.webdsl.Multimedia <em>Multimedia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multimedia</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.Multimedia
	 * @generated
	 */
	EClass getMultimedia();

	/**
	 * Returns the meta object for class '{@link com.github.kanafghan.welipse.webdsl.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.Text
	 * @generated
	 */
	EClass getText();

	/**
	 * Returns the meta object for class '{@link com.github.kanafghan.welipse.webdsl.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.Image
	 * @generated
	 */
	EClass getImage();

	/**
	 * Returns the meta object for class '{@link com.github.kanafghan.welipse.webdsl.StaticText <em>Static Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Static Text</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.StaticText
	 * @generated
	 */
	EClass getStaticText();

	/**
	 * Returns the meta object for the attribute '{@link com.github.kanafghan.welipse.webdsl.StaticText#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.StaticText#getContent()
	 * @see #getStaticText()
	 * @generated
	 */
	EAttribute getStaticText_Content();

	/**
	 * Returns the meta object for class '{@link com.github.kanafghan.welipse.webdsl.StaticImage <em>Static Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Static Image</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.StaticImage
	 * @generated
	 */
	EClass getStaticImage();

	/**
	 * Returns the meta object for the attribute '{@link com.github.kanafghan.welipse.webdsl.StaticImage#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.StaticImage#getSource()
	 * @see #getStaticImage()
	 * @generated
	 */
	EAttribute getStaticImage_Source();

	/**
	 * Returns the meta object for class '{@link com.github.kanafghan.welipse.webdsl.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the containment reference '{@link com.github.kanafghan.welipse.webdsl.Link#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.Link#getContent()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Content();

	/**
	 * Returns the meta object for class '{@link com.github.kanafghan.welipse.webdsl.InternalLink <em>Internal Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Link</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.InternalLink
	 * @generated
	 */
	EClass getInternalLink();

	/**
	 * Returns the meta object for the reference '{@link com.github.kanafghan.welipse.webdsl.InternalLink#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.InternalLink#getTarget()
	 * @see #getInternalLink()
	 * @generated
	 */
	EReference getInternalLink_Target();

	/**
	 * Returns the meta object for class '{@link com.github.kanafghan.welipse.webdsl.ExternalLink <em>External Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Link</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.ExternalLink
	 * @generated
	 */
	EClass getExternalLink();

	/**
	 * Returns the meta object for class '{@link com.github.kanafghan.welipse.webdsl.DynamicText <em>Dynamic Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamic Text</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.DynamicText
	 * @generated
	 */
	EClass getDynamicText();

	/**
	 * Returns the meta object for the reference '{@link com.github.kanafghan.welipse.webdsl.DynamicText#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.DynamicText#getContent()
	 * @see #getDynamicText()
	 * @generated
	 */
	EReference getDynamicText_Content();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WebDSLFactory getWebDSLFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.github.kanafghan.welipse.webdsl.impl.WebsiteImpl <em>Website</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.kanafghan.welipse.webdsl.impl.WebsiteImpl
		 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getWebsite()
		 * @generated
		 */
		EClass WEBSITE = eINSTANCE.getWebsite();

		/**
		 * The meta object literal for the '<em><b>Pages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEBSITE__PAGES = eINSTANCE.getWebsite_Pages();

		/**
		 * The meta object literal for the '<em><b>Home</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEBSITE__HOME = eINSTANCE.getWebsite_Home();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEBSITE__NAME = eINSTANCE.getWebsite_Name();

		/**
		 * The meta object literal for the '{@link com.github.kanafghan.welipse.webdsl.impl.PageImpl <em>Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.kanafghan.welipse.webdsl.impl.PageImpl
		 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getPage()
		 * @generated
		 */
		EClass PAGE = eINSTANCE.getPage();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__ELEMENTS = eINSTANCE.getPage_Elements();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__NAME = eINSTANCE.getPage_Name();

		/**
		 * The meta object literal for the '{@link com.github.kanafghan.welipse.webdsl.impl.PageElementImpl <em>Page Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.kanafghan.welipse.webdsl.impl.PageElementImpl
		 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getPageElement()
		 * @generated
		 */
		EClass PAGE_ELEMENT = eINSTANCE.getPageElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE_ELEMENT__NAME = eINSTANCE.getPageElement_Name();

		/**
		 * The meta object literal for the '<em><b>Page</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE_ELEMENT__PAGE = eINSTANCE.getPageElement_Page();

		/**
		 * The meta object literal for the '{@link com.github.kanafghan.welipse.webdsl.impl.PresentationElementImpl <em>Presentation Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.kanafghan.welipse.webdsl.impl.PresentationElementImpl
		 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getPresentationElement()
		 * @generated
		 */
		EClass PRESENTATION_ELEMENT = eINSTANCE.getPresentationElement();

		/**
		 * The meta object literal for the '{@link com.github.kanafghan.welipse.webdsl.impl.NavigationElementImpl <em>Navigation Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.kanafghan.welipse.webdsl.impl.NavigationElementImpl
		 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getNavigationElement()
		 * @generated
		 */
		EClass NAVIGATION_ELEMENT = eINSTANCE.getNavigationElement();

		/**
		 * The meta object literal for the '{@link com.github.kanafghan.welipse.webdsl.impl.MultimediaImpl <em>Multimedia</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.kanafghan.welipse.webdsl.impl.MultimediaImpl
		 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getMultimedia()
		 * @generated
		 */
		EClass MULTIMEDIA = eINSTANCE.getMultimedia();

		/**
		 * The meta object literal for the '{@link com.github.kanafghan.welipse.webdsl.impl.TextImpl <em>Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.kanafghan.welipse.webdsl.impl.TextImpl
		 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getText()
		 * @generated
		 */
		EClass TEXT = eINSTANCE.getText();

		/**
		 * The meta object literal for the '{@link com.github.kanafghan.welipse.webdsl.impl.ImageImpl <em>Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.kanafghan.welipse.webdsl.impl.ImageImpl
		 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getImage()
		 * @generated
		 */
		EClass IMAGE = eINSTANCE.getImage();

		/**
		 * The meta object literal for the '{@link com.github.kanafghan.welipse.webdsl.impl.StaticTextImpl <em>Static Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.kanafghan.welipse.webdsl.impl.StaticTextImpl
		 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getStaticText()
		 * @generated
		 */
		EClass STATIC_TEXT = eINSTANCE.getStaticText();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATIC_TEXT__CONTENT = eINSTANCE.getStaticText_Content();

		/**
		 * The meta object literal for the '{@link com.github.kanafghan.welipse.webdsl.impl.StaticImageImpl <em>Static Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.kanafghan.welipse.webdsl.impl.StaticImageImpl
		 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getStaticImage()
		 * @generated
		 */
		EClass STATIC_IMAGE = eINSTANCE.getStaticImage();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATIC_IMAGE__SOURCE = eINSTANCE.getStaticImage_Source();

		/**
		 * The meta object literal for the '{@link com.github.kanafghan.welipse.webdsl.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.kanafghan.welipse.webdsl.impl.LinkImpl
		 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__CONTENT = eINSTANCE.getLink_Content();

		/**
		 * The meta object literal for the '{@link com.github.kanafghan.welipse.webdsl.impl.InternalLinkImpl <em>Internal Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.kanafghan.welipse.webdsl.impl.InternalLinkImpl
		 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getInternalLink()
		 * @generated
		 */
		EClass INTERNAL_LINK = eINSTANCE.getInternalLink();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_LINK__TARGET = eINSTANCE.getInternalLink_Target();

		/**
		 * The meta object literal for the '{@link com.github.kanafghan.welipse.webdsl.impl.ExternalLinkImpl <em>External Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.kanafghan.welipse.webdsl.impl.ExternalLinkImpl
		 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getExternalLink()
		 * @generated
		 */
		EClass EXTERNAL_LINK = eINSTANCE.getExternalLink();

		/**
		 * The meta object literal for the '{@link com.github.kanafghan.welipse.webdsl.impl.DynamicTextImpl <em>Dynamic Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.kanafghan.welipse.webdsl.impl.DynamicTextImpl
		 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getDynamicText()
		 * @generated
		 */
		EClass DYNAMIC_TEXT = eINSTANCE.getDynamicText();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_TEXT__CONTENT = eINSTANCE.getDynamicText_Content();

	}

} //WebDSLPackage
