/**
 */
package com.github.kanafghan.welipse.webdsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
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
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__PARAMETERS = 2;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__VARIABLES = 3;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__PARAMETER = 4;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__VARIABLE = 5;

	/**
	 * The number of structural features of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_FEATURE_COUNT = 6;

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
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION_ELEMENT__CLASS = PAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION_ELEMENT__EXPRESSION = PAGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Presentation Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION_ELEMENT_FEATURE_COUNT = PAGE_ELEMENT_FEATURE_COUNT + 2;

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
	 * The meta object id for the '{@link com.github.kanafghan.welipse.webdsl.impl.ListImpl <em>List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.kanafghan.welipse.webdsl.impl.ListImpl
	 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getList()
	 * @generated
	 */
	int LIST = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__NAME = PRESENTATION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Page</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__PAGE = PRESENTATION_ELEMENT__PAGE;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__CLASS = PRESENTATION_ELEMENT__CLASS;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__EXPRESSION = PRESENTATION_ELEMENT__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__ELEMENTS = PRESENTATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__COLLECTION = PRESENTATION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Iterator Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__ITERATOR_VARIABLE = PRESENTATION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__VARIABLE = PRESENTATION_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FEATURE_COUNT = PRESENTATION_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OPERATION_COUNT = PRESENTATION_ELEMENT_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__CLASS = PRESENTATION_ELEMENT__CLASS;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__EXPRESSION = PRESENTATION_ELEMENT__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__CONTENT = PRESENTATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__STATIC = PRESENTATION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FEATURE_COUNT = PRESENTATION_ELEMENT_FEATURE_COUNT + 2;

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
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__CLASS = PRESENTATION_ELEMENT__CLASS;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__EXPRESSION = PRESENTATION_ELEMENT__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Referenced</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__REFERENCED = PRESENTATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__SOURCE = PRESENTATION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__STATIC = PRESENTATION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FEATURE_COUNT = PRESENTATION_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_OPERATION_COUNT = PRESENTATION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.kanafghan.welipse.webdsl.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.kanafghan.welipse.webdsl.impl.LinkImpl
	 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 8;

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
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__SOURCE = NAVIGATION_ELEMENT_FEATURE_COUNT + 0;

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
	int INTERNAL_LINK = 9;

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
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_LINK__SOURCE = LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_LINK__TARGET = LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Actual Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_LINK__ACTUAL_PARAMETERS = LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Internal Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_LINK_FEATURE_COUNT = LINK_FEATURE_COUNT + 2;

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
	int EXTERNAL_LINK = 10;

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
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_LINK__SOURCE = LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_LINK__TARGET = LINK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>External Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_LINK_FEATURE_COUNT = LINK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>External Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_LINK_OPERATION_COUNT = LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.kanafghan.welipse.webdsl.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.kanafghan.welipse.webdsl.impl.ExpressionImpl
	 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 11;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION___TYPE = 0;

	/**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION___INITIALIZE__PAGE = 1;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.github.kanafghan.welipse.webdsl.impl.VariableExpImpl <em>Variable Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.kanafghan.welipse.webdsl.impl.VariableExpImpl
	 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getVariableExp()
	 * @generated
	 */
	int VARIABLE_EXP = 12;

	/**
	 * The feature id for the '<em><b>Var</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_EXP__VAR = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_EXP__DECLARATION = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Variable Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_EXP_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_EXP___TYPE = EXPRESSION___TYPE;

	/**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_EXP___INITIALIZE__PAGE = EXPRESSION___INITIALIZE__PAGE;

	/**
	 * The number of operations of the '<em>Variable Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_EXP_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.kanafghan.welipse.webdsl.impl.OperationExpImpl <em>Operation Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.kanafghan.welipse.webdsl.impl.OperationExpImpl
	 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getOperationExp()
	 * @generated
	 */
	int OPERATION_EXP = 13;

	/**
	 * The number of structural features of the '<em>Operation Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_EXP_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_EXP___TYPE = EXPRESSION___TYPE;

	/**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_EXP___INITIALIZE__PAGE = EXPRESSION___INITIALIZE__PAGE;

	/**
	 * The number of operations of the '<em>Operation Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_EXP_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.kanafghan.welipse.webdsl.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.kanafghan.welipse.webdsl.impl.VariableDeclarationImpl
	 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getVariableDeclaration()
	 * @generated
	 */
	int VARIABLE_DECLARATION = 14;

	/**
	 * The feature id for the '<em><b>Var</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__VAR = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Classifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__CLASSIFIER = 2;

	/**
	 * The number of structural features of the '<em>Variable Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION___INITIALIZE__PAGE = 0;

	/**
	 * The number of operations of the '<em>Variable Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.github.kanafghan.welipse.webdsl.impl.VariableInitializationImpl <em>Variable Initialization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.kanafghan.welipse.webdsl.impl.VariableInitializationImpl
	 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getVariableInitialization()
	 * @generated
	 */
	int VARIABLE_INITIALIZATION = 15;

	/**
	 * The feature id for the '<em><b>Var</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_INITIALIZATION__VAR = VARIABLE_DECLARATION__VAR;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_INITIALIZATION__TYPE = VARIABLE_DECLARATION__TYPE;

	/**
	 * The feature id for the '<em><b>Classifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_INITIALIZATION__CLASSIFIER = VARIABLE_DECLARATION__CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Init Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_INITIALIZATION__INIT_EXP = VARIABLE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable Initialization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_INITIALIZATION_FEATURE_COUNT = VARIABLE_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_INITIALIZATION___INITIALIZE__PAGE = VARIABLE_DECLARATION___INITIALIZE__PAGE;

	/**
	 * The number of operations of the '<em>Variable Initialization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_INITIALIZATION_OPERATION_COUNT = VARIABLE_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.kanafghan.welipse.webdsl.impl.PropertyOperationImpl <em>Property Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.kanafghan.welipse.webdsl.impl.PropertyOperationImpl
	 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getPropertyOperation()
	 * @generated
	 */
	int PROPERTY_OPERATION = 16;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION__SOURCE = OPERATION_EXP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION__IDENTIFIER = OPERATION_EXP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Property Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_FEATURE_COUNT = OPERATION_EXP_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION___TYPE = OPERATION_EXP___TYPE;

	/**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION___INITIALIZE__PAGE = OPERATION_EXP___INITIALIZE__PAGE;

	/**
	 * The number of operations of the '<em>Property Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_OPERATION_COUNT = OPERATION_EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.kanafghan.welipse.webdsl.impl.ConstantExpImpl <em>Constant Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.kanafghan.welipse.webdsl.impl.ConstantExpImpl
	 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getConstantExp()
	 * @generated
	 */
	int CONSTANT_EXP = 17;

	/**
	 * The number of structural features of the '<em>Constant Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_EXP_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_EXP___TYPE = EXPRESSION___TYPE;

	/**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_EXP___INITIALIZE__PAGE = EXPRESSION___INITIALIZE__PAGE;

	/**
	 * The number of operations of the '<em>Constant Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_EXP_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.kanafghan.welipse.webdsl.impl.BasicOperationImpl <em>Basic Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.kanafghan.welipse.webdsl.impl.BasicOperationImpl
	 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getBasicOperation()
	 * @generated
	 */
	int BASIC_OPERATION = 18;

	/**
	 * The feature id for the '<em><b>Operands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_OPERATION__OPERANDS = OPERATION_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Basic Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_OPERATION_FEATURE_COUNT = OPERATION_EXP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_OPERATION___TYPE = OPERATION_EXP___TYPE;

	/**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_OPERATION___INITIALIZE__PAGE = OPERATION_EXP___INITIALIZE__PAGE;

	/**
	 * The number of operations of the '<em>Basic Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_OPERATION_OPERATION_COUNT = OPERATION_EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.kanafghan.welipse.webdsl.impl.ArithmeticOperationImpl <em>Arithmetic Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.kanafghan.welipse.webdsl.impl.ArithmeticOperationImpl
	 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getArithmeticOperation()
	 * @generated
	 */
	int ARITHMETIC_OPERATION = 19;

	/**
	 * The feature id for the '<em><b>Operands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_OPERATION__OPERANDS = BASIC_OPERATION__OPERANDS;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_OPERATION__OPERATOR = BASIC_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Arithmetic Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_OPERATION_FEATURE_COUNT = BASIC_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_OPERATION___TYPE = BASIC_OPERATION___TYPE;

	/**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_OPERATION___INITIALIZE__PAGE = BASIC_OPERATION___INITIALIZE__PAGE;

	/**
	 * The number of operations of the '<em>Arithmetic Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_OPERATION_OPERATION_COUNT = BASIC_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.kanafghan.welipse.webdsl.impl.StructuralExpImpl <em>Structural Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.kanafghan.welipse.webdsl.impl.StructuralExpImpl
	 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getStructuralExp()
	 * @generated
	 */
	int STRUCTURAL_EXP = 20;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_EXP__SOURCE = PROPERTY_OPERATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_EXP__IDENTIFIER = PROPERTY_OPERATION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_EXP__FEATURE = PROPERTY_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Structural Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_EXP_FEATURE_COUNT = PROPERTY_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_EXP___TYPE = PROPERTY_OPERATION___TYPE;

	/**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_EXP___INITIALIZE__PAGE = PROPERTY_OPERATION___INITIALIZE__PAGE;

	/**
	 * The number of operations of the '<em>Structural Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_EXP_OPERATION_COUNT = PROPERTY_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.kanafghan.welipse.webdsl.impl.ClassifierOperationImpl <em>Classifier Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.kanafghan.welipse.webdsl.impl.ClassifierOperationImpl
	 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getClassifierOperation()
	 * @generated
	 */
	int CLASSIFIER_OPERATION = 21;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_OPERATION__SOURCE = PROPERTY_OPERATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_OPERATION__IDENTIFIER = PROPERTY_OPERATION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_OPERATION__OPERATION = PROPERTY_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_OPERATION__ARGUMENTS = PROPERTY_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Classifier Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_OPERATION_FEATURE_COUNT = PROPERTY_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_OPERATION___TYPE = PROPERTY_OPERATION___TYPE;

	/**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_OPERATION___INITIALIZE__PAGE = PROPERTY_OPERATION___INITIALIZE__PAGE;

	/**
	 * The number of operations of the '<em>Classifier Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_OPERATION_OPERATION_COUNT = PROPERTY_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.kanafghan.welipse.webdsl.impl.IntegerConstantImpl <em>Integer Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.kanafghan.welipse.webdsl.impl.IntegerConstantImpl
	 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getIntegerConstant()
	 * @generated
	 */
	int INTEGER_CONSTANT = 22;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CONSTANT__VALUE = CONSTANT_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CONSTANT_FEATURE_COUNT = CONSTANT_EXP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CONSTANT___TYPE = CONSTANT_EXP___TYPE;

	/**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CONSTANT___INITIALIZE__PAGE = CONSTANT_EXP___INITIALIZE__PAGE;

	/**
	 * The number of operations of the '<em>Integer Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CONSTANT_OPERATION_COUNT = CONSTANT_EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.kanafghan.welipse.webdsl.impl.StringConstantImpl <em>String Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.kanafghan.welipse.webdsl.impl.StringConstantImpl
	 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getStringConstant()
	 * @generated
	 */
	int STRING_CONSTANT = 23;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CONSTANT__VALUE = CONSTANT_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CONSTANT_FEATURE_COUNT = CONSTANT_EXP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CONSTANT___TYPE = CONSTANT_EXP___TYPE;

	/**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CONSTANT___INITIALIZE__PAGE = CONSTANT_EXP___INITIALIZE__PAGE;

	/**
	 * The number of operations of the '<em>String Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CONSTANT_OPERATION_COUNT = CONSTANT_EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.kanafghan.welipse.webdsl.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.kanafghan.welipse.webdsl.impl.ParameterImpl
	 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 24;

	/**
	 * The feature id for the '<em><b>Var</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VAR = VARIABLE_DECLARATION__VAR;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = VARIABLE_DECLARATION__TYPE;

	/**
	 * The feature id for the '<em><b>Classifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__CLASSIFIER = VARIABLE_DECLARATION__CLASSIFIER;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = VARIABLE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___INITIALIZE__PAGE = VARIABLE_DECLARATION___INITIALIZE__PAGE;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = VARIABLE_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.kanafghan.welipse.webdsl.impl.StringOperationImpl <em>String Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.kanafghan.welipse.webdsl.impl.StringOperationImpl
	 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getStringOperation()
	 * @generated
	 */
	int STRING_OPERATION = 25;

	/**
	 * The feature id for the '<em><b>Operands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_OPERATION__OPERANDS = BASIC_OPERATION__OPERANDS;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_OPERATION__OPERATOR = BASIC_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_OPERATION_FEATURE_COUNT = BASIC_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_OPERATION___TYPE = BASIC_OPERATION___TYPE;

	/**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_OPERATION___INITIALIZE__PAGE = BASIC_OPERATION___INITIALIZE__PAGE;

	/**
	 * The number of operations of the '<em>String Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_OPERATION_OPERATION_COUNT = BASIC_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.kanafghan.welipse.webdsl.impl.BooleanConstantImpl <em>Boolean Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.kanafghan.welipse.webdsl.impl.BooleanConstantImpl
	 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getBooleanConstant()
	 * @generated
	 */
	int BOOLEAN_CONSTANT = 26;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_CONSTANT__VALUE = CONSTANT_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_CONSTANT_FEATURE_COUNT = CONSTANT_EXP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_CONSTANT___TYPE = CONSTANT_EXP___TYPE;

	/**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_CONSTANT___INITIALIZE__PAGE = CONSTANT_EXP___INITIALIZE__PAGE;

	/**
	 * The number of operations of the '<em>Boolean Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_CONSTANT_OPERATION_COUNT = CONSTANT_EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.kanafghan.welipse.webdsl.impl.BooleanOperationImpl <em>Boolean Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.kanafghan.welipse.webdsl.impl.BooleanOperationImpl
	 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getBooleanOperation()
	 * @generated
	 */
	int BOOLEAN_OPERATION = 27;

	/**
	 * The feature id for the '<em><b>Operands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATION__OPERANDS = BASIC_OPERATION__OPERANDS;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATION__OPERATOR = BASIC_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATION_FEATURE_COUNT = BASIC_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATION___TYPE = BASIC_OPERATION___TYPE;

	/**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATION___INITIALIZE__PAGE = BASIC_OPERATION___INITIALIZE__PAGE;

	/**
	 * The number of operations of the '<em>Boolean Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATION_OPERATION_COUNT = BASIC_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.kanafghan.welipse.webdsl.impl.ComparisonOperationImpl <em>Comparison Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.kanafghan.welipse.webdsl.impl.ComparisonOperationImpl
	 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getComparisonOperation()
	 * @generated
	 */
	int COMPARISON_OPERATION = 28;

	/**
	 * The feature id for the '<em><b>Operands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPERATION__OPERANDS = BASIC_OPERATION__OPERANDS;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPERATION__OPERATOR = BASIC_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Comparison Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPERATION_FEATURE_COUNT = BASIC_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPERATION___TYPE = BASIC_OPERATION___TYPE;

	/**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPERATION___INITIALIZE__PAGE = BASIC_OPERATION___INITIALIZE__PAGE;

	/**
	 * The number of operations of the '<em>Comparison Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPERATION_OPERATION_COUNT = BASIC_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.kanafghan.welipse.webdsl.impl.RealConstantImpl <em>Real Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.kanafghan.welipse.webdsl.impl.RealConstantImpl
	 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getRealConstant()
	 * @generated
	 */
	int REAL_CONSTANT = 29;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_CONSTANT__VALUE = CONSTANT_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Real Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_CONSTANT_FEATURE_COUNT = CONSTANT_EXP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_CONSTANT___TYPE = CONSTANT_EXP___TYPE;

	/**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_CONSTANT___INITIALIZE__PAGE = CONSTANT_EXP___INITIALIZE__PAGE;

	/**
	 * The number of operations of the '<em>Real Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_CONSTANT_OPERATION_COUNT = CONSTANT_EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.kanafghan.welipse.webdsl.impl.ActualParameterImpl <em>Actual Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.kanafghan.welipse.webdsl.impl.ActualParameterImpl
	 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getActualParameter()
	 * @generated
	 */
	int ACTUAL_PARAMETER = 30;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_PARAMETER__IDENTIFIER = 0;

	/**
	 * The feature id for the '<em><b>Formal Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_PARAMETER__FORMAL_PARAMETER = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_PARAMETER__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Actual Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_PARAMETER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Actual Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.github.kanafghan.welipse.webdsl.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.kanafghan.welipse.webdsl.impl.GroupImpl
	 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 31;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__NAME = PRESENTATION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Page</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__PAGE = PRESENTATION_ELEMENT__PAGE;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__CLASS = PRESENTATION_ELEMENT__CLASS;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__EXPRESSION = PRESENTATION_ELEMENT__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__ELEMENTS = PRESENTATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = PRESENTATION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_OPERATION_COUNT = PRESENTATION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.kanafghan.welipse.webdsl.ArithmeticOperator <em>Arithmetic Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.kanafghan.welipse.webdsl.ArithmeticOperator
	 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getArithmeticOperator()
	 * @generated
	 */
	int ARITHMETIC_OPERATOR = 32;

	/**
	 * The meta object id for the '{@link com.github.kanafghan.welipse.webdsl.StringOperator <em>String Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.kanafghan.welipse.webdsl.StringOperator
	 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getStringOperator()
	 * @generated
	 */
	int STRING_OPERATOR = 33;


	/**
	 * The meta object id for the '{@link com.github.kanafghan.welipse.webdsl.BooleanOperator <em>Boolean Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.kanafghan.welipse.webdsl.BooleanOperator
	 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getBooleanOperator()
	 * @generated
	 */
	int BOOLEAN_OPERATOR = 34;

	/**
	 * The meta object id for the '{@link com.github.kanafghan.welipse.webdsl.ComparisonOperator <em>Comparison Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.kanafghan.welipse.webdsl.ComparisonOperator
	 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getComparisonOperator()
	 * @generated
	 */
	int COMPARISON_OPERATOR = 35;


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
	 * Returns the meta object for the containment reference list '{@link com.github.kanafghan.welipse.webdsl.Page#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.Page#getParameters()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Parameters();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.kanafghan.welipse.webdsl.Page#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.Page#getVariables()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Variables();

	/**
	 * Returns the meta object for the attribute '{@link com.github.kanafghan.welipse.webdsl.Page#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.Page#getParameter()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Parameter();

	/**
	 * Returns the meta object for the attribute '{@link com.github.kanafghan.welipse.webdsl.Page#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.Page#getVariable()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Variable();

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
	 * Returns the meta object for the attribute '{@link com.github.kanafghan.welipse.webdsl.PresentationElement#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.PresentationElement#getClass_()
	 * @see #getPresentationElement()
	 * @generated
	 */
	EAttribute getPresentationElement_Class();

	/**
	 * Returns the meta object for the attribute '{@link com.github.kanafghan.welipse.webdsl.PresentationElement#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.PresentationElement#getExpression()
	 * @see #getPresentationElement()
	 * @generated
	 */
	EAttribute getPresentationElement_Expression();

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
	 * Returns the meta object for class '{@link com.github.kanafghan.welipse.webdsl.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.List
	 * @generated
	 */
	EClass getList();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.kanafghan.welipse.webdsl.List#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.List#getElements()
	 * @see #getList()
	 * @generated
	 */
	EReference getList_Elements();

	/**
	 * Returns the meta object for the containment reference '{@link com.github.kanafghan.welipse.webdsl.List#getCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Collection</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.List#getCollection()
	 * @see #getList()
	 * @generated
	 */
	EReference getList_Collection();

	/**
	 * Returns the meta object for the containment reference '{@link com.github.kanafghan.welipse.webdsl.List#getIteratorVariable <em>Iterator Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Iterator Variable</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.List#getIteratorVariable()
	 * @see #getList()
	 * @generated
	 */
	EReference getList_IteratorVariable();

	/**
	 * Returns the meta object for the attribute '{@link com.github.kanafghan.welipse.webdsl.List#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.List#getVariable()
	 * @see #getList()
	 * @generated
	 */
	EAttribute getList_Variable();

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
	 * Returns the meta object for the containment reference '{@link com.github.kanafghan.welipse.webdsl.Text#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.Text#getContent()
	 * @see #getText()
	 * @generated
	 */
	EReference getText_Content();

	/**
	 * Returns the meta object for the attribute '{@link com.github.kanafghan.welipse.webdsl.Text#isStatic <em>Static</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Static</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.Text#isStatic()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Static();

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
	 * Returns the meta object for the attribute '{@link com.github.kanafghan.welipse.webdsl.Image#isReferenced <em>Referenced</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Referenced</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.Image#isReferenced()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Referenced();

	/**
	 * Returns the meta object for the containment reference '{@link com.github.kanafghan.welipse.webdsl.Image#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.Image#getSource()
	 * @see #getImage()
	 * @generated
	 */
	EReference getImage_Source();

	/**
	 * Returns the meta object for the attribute '{@link com.github.kanafghan.welipse.webdsl.Image#isStatic <em>Static</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Static</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.Image#isStatic()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Static();

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
	 * Returns the meta object for the containment reference '{@link com.github.kanafghan.welipse.webdsl.Link#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.Link#getSource()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Source();

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
	 * Returns the meta object for the containment reference list '{@link com.github.kanafghan.welipse.webdsl.InternalLink#getActualParameters <em>Actual Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actual Parameters</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.InternalLink#getActualParameters()
	 * @see #getInternalLink()
	 * @generated
	 */
	EReference getInternalLink_ActualParameters();

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
	 * Returns the meta object for the containment reference '{@link com.github.kanafghan.welipse.webdsl.ExternalLink#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.ExternalLink#getTarget()
	 * @see #getExternalLink()
	 * @generated
	 */
	EReference getExternalLink_Target();

	/**
	 * Returns the meta object for class '{@link com.github.kanafghan.welipse.webdsl.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for the '{@link com.github.kanafghan.welipse.webdsl.Expression#type() <em>Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Type</em>' operation.
	 * @see com.github.kanafghan.welipse.webdsl.Expression#type()
	 * @generated
	 */
	EOperation getExpression__Type();

	/**
	 * Returns the meta object for the '{@link com.github.kanafghan.welipse.webdsl.Expression#initialize(com.github.kanafghan.welipse.webdsl.Page) <em>Initialize</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Initialize</em>' operation.
	 * @see com.github.kanafghan.welipse.webdsl.Expression#initialize(com.github.kanafghan.welipse.webdsl.Page)
	 * @generated
	 */
	EOperation getExpression__Initialize__Page();

	/**
	 * Returns the meta object for class '{@link com.github.kanafghan.welipse.webdsl.VariableExp <em>Variable Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Exp</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.VariableExp
	 * @generated
	 */
	EClass getVariableExp();

	/**
	 * Returns the meta object for the attribute '{@link com.github.kanafghan.welipse.webdsl.VariableExp#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.VariableExp#getVar()
	 * @see #getVariableExp()
	 * @generated
	 */
	EAttribute getVariableExp_Var();

	/**
	 * Returns the meta object for the reference '{@link com.github.kanafghan.welipse.webdsl.VariableExp#getDeclaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Declaration</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.VariableExp#getDeclaration()
	 * @see #getVariableExp()
	 * @generated
	 */
	EReference getVariableExp_Declaration();

	/**
	 * Returns the meta object for class '{@link com.github.kanafghan.welipse.webdsl.OperationExp <em>Operation Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Exp</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.OperationExp
	 * @generated
	 */
	EClass getOperationExp();

	/**
	 * Returns the meta object for class '{@link com.github.kanafghan.welipse.webdsl.VariableDeclaration <em>Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Declaration</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.VariableDeclaration
	 * @generated
	 */
	EClass getVariableDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link com.github.kanafghan.welipse.webdsl.VariableDeclaration#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.VariableDeclaration#getVar()
	 * @see #getVariableDeclaration()
	 * @generated
	 */
	EAttribute getVariableDeclaration_Var();

	/**
	 * Returns the meta object for the reference '{@link com.github.kanafghan.welipse.webdsl.VariableDeclaration#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.VariableDeclaration#getType()
	 * @see #getVariableDeclaration()
	 * @generated
	 */
	EReference getVariableDeclaration_Type();

	/**
	 * Returns the meta object for the attribute '{@link com.github.kanafghan.welipse.webdsl.VariableDeclaration#getClassifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classifier</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.VariableDeclaration#getClassifier()
	 * @see #getVariableDeclaration()
	 * @generated
	 */
	EAttribute getVariableDeclaration_Classifier();

	/**
	 * Returns the meta object for the '{@link com.github.kanafghan.welipse.webdsl.VariableDeclaration#initialize(com.github.kanafghan.welipse.webdsl.Page) <em>Initialize</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Initialize</em>' operation.
	 * @see com.github.kanafghan.welipse.webdsl.VariableDeclaration#initialize(com.github.kanafghan.welipse.webdsl.Page)
	 * @generated
	 */
	EOperation getVariableDeclaration__Initialize__Page();

	/**
	 * Returns the meta object for class '{@link com.github.kanafghan.welipse.webdsl.VariableInitialization <em>Variable Initialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Initialization</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.VariableInitialization
	 * @generated
	 */
	EClass getVariableInitialization();

	/**
	 * Returns the meta object for the containment reference '{@link com.github.kanafghan.welipse.webdsl.VariableInitialization#getInitExp <em>Init Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Init Exp</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.VariableInitialization#getInitExp()
	 * @see #getVariableInitialization()
	 * @generated
	 */
	EReference getVariableInitialization_InitExp();

	/**
	 * Returns the meta object for class '{@link com.github.kanafghan.welipse.webdsl.PropertyOperation <em>Property Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Operation</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.PropertyOperation
	 * @generated
	 */
	EClass getPropertyOperation();

	/**
	 * Returns the meta object for the containment reference '{@link com.github.kanafghan.welipse.webdsl.PropertyOperation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.PropertyOperation#getSource()
	 * @see #getPropertyOperation()
	 * @generated
	 */
	EReference getPropertyOperation_Source();

	/**
	 * Returns the meta object for the attribute '{@link com.github.kanafghan.welipse.webdsl.PropertyOperation#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.PropertyOperation#getIdentifier()
	 * @see #getPropertyOperation()
	 * @generated
	 */
	EAttribute getPropertyOperation_Identifier();

	/**
	 * Returns the meta object for class '{@link com.github.kanafghan.welipse.webdsl.ConstantExp <em>Constant Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant Exp</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.ConstantExp
	 * @generated
	 */
	EClass getConstantExp();

	/**
	 * Returns the meta object for class '{@link com.github.kanafghan.welipse.webdsl.BasicOperation <em>Basic Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Operation</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.BasicOperation
	 * @generated
	 */
	EClass getBasicOperation();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.kanafghan.welipse.webdsl.BasicOperation#getOperands <em>Operands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operands</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.BasicOperation#getOperands()
	 * @see #getBasicOperation()
	 * @generated
	 */
	EReference getBasicOperation_Operands();

	/**
	 * Returns the meta object for class '{@link com.github.kanafghan.welipse.webdsl.ArithmeticOperation <em>Arithmetic Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arithmetic Operation</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.ArithmeticOperation
	 * @generated
	 */
	EClass getArithmeticOperation();

	/**
	 * Returns the meta object for the attribute '{@link com.github.kanafghan.welipse.webdsl.ArithmeticOperation#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.ArithmeticOperation#getOperator()
	 * @see #getArithmeticOperation()
	 * @generated
	 */
	EAttribute getArithmeticOperation_Operator();

	/**
	 * Returns the meta object for class '{@link com.github.kanafghan.welipse.webdsl.StructuralExp <em>Structural Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structural Exp</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.StructuralExp
	 * @generated
	 */
	EClass getStructuralExp();

	/**
	 * Returns the meta object for the reference '{@link com.github.kanafghan.welipse.webdsl.StructuralExp#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.StructuralExp#getFeature()
	 * @see #getStructuralExp()
	 * @generated
	 */
	EReference getStructuralExp_Feature();

	/**
	 * Returns the meta object for class '{@link com.github.kanafghan.welipse.webdsl.ClassifierOperation <em>Classifier Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classifier Operation</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.ClassifierOperation
	 * @generated
	 */
	EClass getClassifierOperation();

	/**
	 * Returns the meta object for the reference '{@link com.github.kanafghan.welipse.webdsl.ClassifierOperation#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.ClassifierOperation#getOperation()
	 * @see #getClassifierOperation()
	 * @generated
	 */
	EReference getClassifierOperation_Operation();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.kanafghan.welipse.webdsl.ClassifierOperation#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.ClassifierOperation#getArguments()
	 * @see #getClassifierOperation()
	 * @generated
	 */
	EReference getClassifierOperation_Arguments();

	/**
	 * Returns the meta object for class '{@link com.github.kanafghan.welipse.webdsl.IntegerConstant <em>Integer Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Constant</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.IntegerConstant
	 * @generated
	 */
	EClass getIntegerConstant();

	/**
	 * Returns the meta object for the attribute '{@link com.github.kanafghan.welipse.webdsl.IntegerConstant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.IntegerConstant#getValue()
	 * @see #getIntegerConstant()
	 * @generated
	 */
	EAttribute getIntegerConstant_Value();

	/**
	 * Returns the meta object for class '{@link com.github.kanafghan.welipse.webdsl.StringConstant <em>String Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Constant</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.StringConstant
	 * @generated
	 */
	EClass getStringConstant();

	/**
	 * Returns the meta object for the attribute '{@link com.github.kanafghan.welipse.webdsl.StringConstant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.StringConstant#getValue()
	 * @see #getStringConstant()
	 * @generated
	 */
	EAttribute getStringConstant_Value();

	/**
	 * Returns the meta object for class '{@link com.github.kanafghan.welipse.webdsl.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for class '{@link com.github.kanafghan.welipse.webdsl.StringOperation <em>String Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Operation</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.StringOperation
	 * @generated
	 */
	EClass getStringOperation();

	/**
	 * Returns the meta object for the attribute '{@link com.github.kanafghan.welipse.webdsl.StringOperation#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.StringOperation#getOperator()
	 * @see #getStringOperation()
	 * @generated
	 */
	EAttribute getStringOperation_Operator();

	/**
	 * Returns the meta object for class '{@link com.github.kanafghan.welipse.webdsl.BooleanConstant <em>Boolean Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Constant</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.BooleanConstant
	 * @generated
	 */
	EClass getBooleanConstant();

	/**
	 * Returns the meta object for the attribute '{@link com.github.kanafghan.welipse.webdsl.BooleanConstant#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.BooleanConstant#isValue()
	 * @see #getBooleanConstant()
	 * @generated
	 */
	EAttribute getBooleanConstant_Value();

	/**
	 * Returns the meta object for class '{@link com.github.kanafghan.welipse.webdsl.BooleanOperation <em>Boolean Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Operation</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.BooleanOperation
	 * @generated
	 */
	EClass getBooleanOperation();

	/**
	 * Returns the meta object for the attribute '{@link com.github.kanafghan.welipse.webdsl.BooleanOperation#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.BooleanOperation#getOperator()
	 * @see #getBooleanOperation()
	 * @generated
	 */
	EAttribute getBooleanOperation_Operator();

	/**
	 * Returns the meta object for class '{@link com.github.kanafghan.welipse.webdsl.ComparisonOperation <em>Comparison Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparison Operation</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.ComparisonOperation
	 * @generated
	 */
	EClass getComparisonOperation();

	/**
	 * Returns the meta object for the attribute '{@link com.github.kanafghan.welipse.webdsl.ComparisonOperation#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.ComparisonOperation#getOperator()
	 * @see #getComparisonOperation()
	 * @generated
	 */
	EAttribute getComparisonOperation_Operator();

	/**
	 * Returns the meta object for class '{@link com.github.kanafghan.welipse.webdsl.RealConstant <em>Real Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Real Constant</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.RealConstant
	 * @generated
	 */
	EClass getRealConstant();

	/**
	 * Returns the meta object for the attribute '{@link com.github.kanafghan.welipse.webdsl.RealConstant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.RealConstant#getValue()
	 * @see #getRealConstant()
	 * @generated
	 */
	EAttribute getRealConstant_Value();

	/**
	 * Returns the meta object for class '{@link com.github.kanafghan.welipse.webdsl.ActualParameter <em>Actual Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actual Parameter</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.ActualParameter
	 * @generated
	 */
	EClass getActualParameter();

	/**
	 * Returns the meta object for the attribute '{@link com.github.kanafghan.welipse.webdsl.ActualParameter#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.ActualParameter#getIdentifier()
	 * @see #getActualParameter()
	 * @generated
	 */
	EAttribute getActualParameter_Identifier();

	/**
	 * Returns the meta object for the reference '{@link com.github.kanafghan.welipse.webdsl.ActualParameter#getFormalParameter <em>Formal Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Formal Parameter</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.ActualParameter#getFormalParameter()
	 * @see #getActualParameter()
	 * @generated
	 */
	EReference getActualParameter_FormalParameter();

	/**
	 * Returns the meta object for the containment reference '{@link com.github.kanafghan.welipse.webdsl.ActualParameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.ActualParameter#getValue()
	 * @see #getActualParameter()
	 * @generated
	 */
	EReference getActualParameter_Value();

	/**
	 * Returns the meta object for class '{@link com.github.kanafghan.welipse.webdsl.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.Group
	 * @generated
	 */
	EClass getGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.kanafghan.welipse.webdsl.Group#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.Group#getElements()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_Elements();

	/**
	 * Returns the meta object for enum '{@link com.github.kanafghan.welipse.webdsl.ArithmeticOperator <em>Arithmetic Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Arithmetic Operator</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.ArithmeticOperator
	 * @generated
	 */
	EEnum getArithmeticOperator();

	/**
	 * Returns the meta object for enum '{@link com.github.kanafghan.welipse.webdsl.StringOperator <em>String Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>String Operator</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.StringOperator
	 * @generated
	 */
	EEnum getStringOperator();

	/**
	 * Returns the meta object for enum '{@link com.github.kanafghan.welipse.webdsl.BooleanOperator <em>Boolean Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Boolean Operator</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.BooleanOperator
	 * @generated
	 */
	EEnum getBooleanOperator();

	/**
	 * Returns the meta object for enum '{@link com.github.kanafghan.welipse.webdsl.ComparisonOperator <em>Comparison Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Comparison Operator</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.ComparisonOperator
	 * @generated
	 */
	EEnum getComparisonOperator();

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
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__PARAMETERS = eINSTANCE.getPage_Parameters();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__VARIABLES = eINSTANCE.getPage_Variables();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__PARAMETER = eINSTANCE.getPage_Parameter();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__VARIABLE = eINSTANCE.getPage_Variable();

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
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESENTATION_ELEMENT__CLASS = eINSTANCE.getPresentationElement_Class();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESENTATION_ELEMENT__EXPRESSION = eINSTANCE.getPresentationElement_Expression();

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
		 * The meta object literal for the '{@link com.github.kanafghan.welipse.webdsl.impl.ListImpl <em>List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.kanafghan.welipse.webdsl.impl.ListImpl
		 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getList()
		 * @generated
		 */
		EClass LIST = eINSTANCE.getList();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST__ELEMENTS = eINSTANCE.getList_Elements();

		/**
		 * The meta object literal for the '<em><b>Collection</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST__COLLECTION = eINSTANCE.getList_Collection();

		/**
		 * The meta object literal for the '<em><b>Iterator Variable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST__ITERATOR_VARIABLE = eINSTANCE.getList_IteratorVariable();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST__VARIABLE = eINSTANCE.getList_Variable();

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
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT__CONTENT = eINSTANCE.getText_Content();

		/**
		 * The meta object literal for the '<em><b>Static</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__STATIC = eINSTANCE.getText_Static();

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
		 * The meta object literal for the '<em><b>Referenced</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__REFERENCED = eINSTANCE.getImage_Referenced();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMAGE__SOURCE = eINSTANCE.getImage_Source();

		/**
		 * The meta object literal for the '<em><b>Static</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__STATIC = eINSTANCE.getImage_Static();

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
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__SOURCE = eINSTANCE.getLink_Source();

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
		 * The meta object literal for the '<em><b>Actual Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_LINK__ACTUAL_PARAMETERS = eINSTANCE.getInternalLink_ActualParameters();

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
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_LINK__TARGET = eINSTANCE.getExternalLink_Target();

		/**
		 * The meta object literal for the '{@link com.github.kanafghan.welipse.webdsl.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.kanafghan.welipse.webdsl.impl.ExpressionImpl
		 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXPRESSION___TYPE = eINSTANCE.getExpression__Type();

		/**
		 * The meta object literal for the '<em><b>Initialize</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXPRESSION___INITIALIZE__PAGE = eINSTANCE.getExpression__Initialize__Page();

		/**
		 * The meta object literal for the '{@link com.github.kanafghan.welipse.webdsl.impl.VariableExpImpl <em>Variable Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.kanafghan.welipse.webdsl.impl.VariableExpImpl
		 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getVariableExp()
		 * @generated
		 */
		EClass VARIABLE_EXP = eINSTANCE.getVariableExp();

		/**
		 * The meta object literal for the '<em><b>Var</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_EXP__VAR = eINSTANCE.getVariableExp_Var();

		/**
		 * The meta object literal for the '<em><b>Declaration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_EXP__DECLARATION = eINSTANCE.getVariableExp_Declaration();

		/**
		 * The meta object literal for the '{@link com.github.kanafghan.welipse.webdsl.impl.OperationExpImpl <em>Operation Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.kanafghan.welipse.webdsl.impl.OperationExpImpl
		 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getOperationExp()
		 * @generated
		 */
		EClass OPERATION_EXP = eINSTANCE.getOperationExp();

		/**
		 * The meta object literal for the '{@link com.github.kanafghan.welipse.webdsl.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.kanafghan.welipse.webdsl.impl.VariableDeclarationImpl
		 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getVariableDeclaration()
		 * @generated
		 */
		EClass VARIABLE_DECLARATION = eINSTANCE.getVariableDeclaration();

		/**
		 * The meta object literal for the '<em><b>Var</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_DECLARATION__VAR = eINSTANCE.getVariableDeclaration_Var();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_DECLARATION__TYPE = eINSTANCE.getVariableDeclaration_Type();

		/**
		 * The meta object literal for the '<em><b>Classifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_DECLARATION__CLASSIFIER = eINSTANCE.getVariableDeclaration_Classifier();

		/**
		 * The meta object literal for the '<em><b>Initialize</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VARIABLE_DECLARATION___INITIALIZE__PAGE = eINSTANCE.getVariableDeclaration__Initialize__Page();

		/**
		 * The meta object literal for the '{@link com.github.kanafghan.welipse.webdsl.impl.VariableInitializationImpl <em>Variable Initialization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.kanafghan.welipse.webdsl.impl.VariableInitializationImpl
		 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getVariableInitialization()
		 * @generated
		 */
		EClass VARIABLE_INITIALIZATION = eINSTANCE.getVariableInitialization();

		/**
		 * The meta object literal for the '<em><b>Init Exp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_INITIALIZATION__INIT_EXP = eINSTANCE.getVariableInitialization_InitExp();

		/**
		 * The meta object literal for the '{@link com.github.kanafghan.welipse.webdsl.impl.PropertyOperationImpl <em>Property Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.kanafghan.welipse.webdsl.impl.PropertyOperationImpl
		 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getPropertyOperation()
		 * @generated
		 */
		EClass PROPERTY_OPERATION = eINSTANCE.getPropertyOperation();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_OPERATION__SOURCE = eINSTANCE.getPropertyOperation_Source();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_OPERATION__IDENTIFIER = eINSTANCE.getPropertyOperation_Identifier();

		/**
		 * The meta object literal for the '{@link com.github.kanafghan.welipse.webdsl.impl.ConstantExpImpl <em>Constant Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.kanafghan.welipse.webdsl.impl.ConstantExpImpl
		 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getConstantExp()
		 * @generated
		 */
		EClass CONSTANT_EXP = eINSTANCE.getConstantExp();

		/**
		 * The meta object literal for the '{@link com.github.kanafghan.welipse.webdsl.impl.BasicOperationImpl <em>Basic Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.kanafghan.welipse.webdsl.impl.BasicOperationImpl
		 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getBasicOperation()
		 * @generated
		 */
		EClass BASIC_OPERATION = eINSTANCE.getBasicOperation();

		/**
		 * The meta object literal for the '<em><b>Operands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASIC_OPERATION__OPERANDS = eINSTANCE.getBasicOperation_Operands();

		/**
		 * The meta object literal for the '{@link com.github.kanafghan.welipse.webdsl.impl.ArithmeticOperationImpl <em>Arithmetic Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.kanafghan.welipse.webdsl.impl.ArithmeticOperationImpl
		 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getArithmeticOperation()
		 * @generated
		 */
		EClass ARITHMETIC_OPERATION = eINSTANCE.getArithmeticOperation();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARITHMETIC_OPERATION__OPERATOR = eINSTANCE.getArithmeticOperation_Operator();

		/**
		 * The meta object literal for the '{@link com.github.kanafghan.welipse.webdsl.impl.StructuralExpImpl <em>Structural Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.kanafghan.welipse.webdsl.impl.StructuralExpImpl
		 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getStructuralExp()
		 * @generated
		 */
		EClass STRUCTURAL_EXP = eINSTANCE.getStructuralExp();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURAL_EXP__FEATURE = eINSTANCE.getStructuralExp_Feature();

		/**
		 * The meta object literal for the '{@link com.github.kanafghan.welipse.webdsl.impl.ClassifierOperationImpl <em>Classifier Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.kanafghan.welipse.webdsl.impl.ClassifierOperationImpl
		 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getClassifierOperation()
		 * @generated
		 */
		EClass CLASSIFIER_OPERATION = eINSTANCE.getClassifierOperation();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER_OPERATION__OPERATION = eINSTANCE.getClassifierOperation_Operation();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER_OPERATION__ARGUMENTS = eINSTANCE.getClassifierOperation_Arguments();

		/**
		 * The meta object literal for the '{@link com.github.kanafghan.welipse.webdsl.impl.IntegerConstantImpl <em>Integer Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.kanafghan.welipse.webdsl.impl.IntegerConstantImpl
		 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getIntegerConstant()
		 * @generated
		 */
		EClass INTEGER_CONSTANT = eINSTANCE.getIntegerConstant();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_CONSTANT__VALUE = eINSTANCE.getIntegerConstant_Value();

		/**
		 * The meta object literal for the '{@link com.github.kanafghan.welipse.webdsl.impl.StringConstantImpl <em>String Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.kanafghan.welipse.webdsl.impl.StringConstantImpl
		 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getStringConstant()
		 * @generated
		 */
		EClass STRING_CONSTANT = eINSTANCE.getStringConstant();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_CONSTANT__VALUE = eINSTANCE.getStringConstant_Value();

		/**
		 * The meta object literal for the '{@link com.github.kanafghan.welipse.webdsl.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.kanafghan.welipse.webdsl.impl.ParameterImpl
		 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '{@link com.github.kanafghan.welipse.webdsl.impl.StringOperationImpl <em>String Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.kanafghan.welipse.webdsl.impl.StringOperationImpl
		 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getStringOperation()
		 * @generated
		 */
		EClass STRING_OPERATION = eINSTANCE.getStringOperation();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_OPERATION__OPERATOR = eINSTANCE.getStringOperation_Operator();

		/**
		 * The meta object literal for the '{@link com.github.kanafghan.welipse.webdsl.impl.BooleanConstantImpl <em>Boolean Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.kanafghan.welipse.webdsl.impl.BooleanConstantImpl
		 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getBooleanConstant()
		 * @generated
		 */
		EClass BOOLEAN_CONSTANT = eINSTANCE.getBooleanConstant();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_CONSTANT__VALUE = eINSTANCE.getBooleanConstant_Value();

		/**
		 * The meta object literal for the '{@link com.github.kanafghan.welipse.webdsl.impl.BooleanOperationImpl <em>Boolean Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.kanafghan.welipse.webdsl.impl.BooleanOperationImpl
		 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getBooleanOperation()
		 * @generated
		 */
		EClass BOOLEAN_OPERATION = eINSTANCE.getBooleanOperation();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_OPERATION__OPERATOR = eINSTANCE.getBooleanOperation_Operator();

		/**
		 * The meta object literal for the '{@link com.github.kanafghan.welipse.webdsl.impl.ComparisonOperationImpl <em>Comparison Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.kanafghan.welipse.webdsl.impl.ComparisonOperationImpl
		 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getComparisonOperation()
		 * @generated
		 */
		EClass COMPARISON_OPERATION = eINSTANCE.getComparisonOperation();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARISON_OPERATION__OPERATOR = eINSTANCE.getComparisonOperation_Operator();

		/**
		 * The meta object literal for the '{@link com.github.kanafghan.welipse.webdsl.impl.RealConstantImpl <em>Real Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.kanafghan.welipse.webdsl.impl.RealConstantImpl
		 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getRealConstant()
		 * @generated
		 */
		EClass REAL_CONSTANT = eINSTANCE.getRealConstant();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REAL_CONSTANT__VALUE = eINSTANCE.getRealConstant_Value();

		/**
		 * The meta object literal for the '{@link com.github.kanafghan.welipse.webdsl.impl.ActualParameterImpl <em>Actual Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.kanafghan.welipse.webdsl.impl.ActualParameterImpl
		 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getActualParameter()
		 * @generated
		 */
		EClass ACTUAL_PARAMETER = eINSTANCE.getActualParameter();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTUAL_PARAMETER__IDENTIFIER = eINSTANCE.getActualParameter_Identifier();

		/**
		 * The meta object literal for the '<em><b>Formal Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTUAL_PARAMETER__FORMAL_PARAMETER = eINSTANCE.getActualParameter_FormalParameter();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTUAL_PARAMETER__VALUE = eINSTANCE.getActualParameter_Value();

		/**
		 * The meta object literal for the '{@link com.github.kanafghan.welipse.webdsl.impl.GroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.kanafghan.welipse.webdsl.impl.GroupImpl
		 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getGroup()
		 * @generated
		 */
		EClass GROUP = eINSTANCE.getGroup();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__ELEMENTS = eINSTANCE.getGroup_Elements();

		/**
		 * The meta object literal for the '{@link com.github.kanafghan.welipse.webdsl.ArithmeticOperator <em>Arithmetic Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.kanafghan.welipse.webdsl.ArithmeticOperator
		 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getArithmeticOperator()
		 * @generated
		 */
		EEnum ARITHMETIC_OPERATOR = eINSTANCE.getArithmeticOperator();

		/**
		 * The meta object literal for the '{@link com.github.kanafghan.welipse.webdsl.StringOperator <em>String Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.kanafghan.welipse.webdsl.StringOperator
		 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getStringOperator()
		 * @generated
		 */
		EEnum STRING_OPERATOR = eINSTANCE.getStringOperator();

		/**
		 * The meta object literal for the '{@link com.github.kanafghan.welipse.webdsl.BooleanOperator <em>Boolean Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.kanafghan.welipse.webdsl.BooleanOperator
		 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getBooleanOperator()
		 * @generated
		 */
		EEnum BOOLEAN_OPERATOR = eINSTANCE.getBooleanOperator();

		/**
		 * The meta object literal for the '{@link com.github.kanafghan.welipse.webdsl.ComparisonOperator <em>Comparison Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.kanafghan.welipse.webdsl.ComparisonOperator
		 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getComparisonOperator()
		 * @generated
		 */
		EEnum COMPARISON_OPERATOR = eINSTANCE.getComparisonOperator();

	}

} //WebDSLPackage
