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
	 * The feature id for the '<em><b>Declaration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__DECLARATION = 3;

	/**
	 * The number of structural features of the '<em>Variable Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_FEATURE_COUNT = 4;

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
	 * The feature id for the '<em><b>Declaration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_INITIALIZATION__DECLARATION = VARIABLE_DECLARATION__DECLARATION;

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
	 * The feature id for the '<em><b>Declaration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DECLARATION = VARIABLE_DECLARATION__DECLARATION;

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
	 * The meta object id for the '{@link com.github.kanafghan.welipse.webdsl.impl.FormImpl <em>Form</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.kanafghan.welipse.webdsl.impl.FormImpl
	 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getForm()
	 * @generated
	 */
	int FORM = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__NAME = GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Page</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__PAGE = GROUP__PAGE;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__CLASS = GROUP__CLASS;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__EXPRESSION = GROUP__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__ELEMENTS = GROUP__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__METHOD = GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_FEATURE_COUNT = GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_OPERATION_COUNT = GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.kanafghan.welipse.webdsl.impl.FormElementImpl <em>Form Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.kanafghan.welipse.webdsl.impl.FormElementImpl
	 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getFormElement()
	 * @generated
	 */
	int FORM_ELEMENT = 36;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_ELEMENT__NAME = PRESENTATION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Page</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_ELEMENT__PAGE = PRESENTATION_ELEMENT__PAGE;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_ELEMENT__CLASS = PRESENTATION_ELEMENT__CLASS;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_ELEMENT__EXPRESSION = PRESENTATION_ELEMENT__EXPRESSION;

	/**
	 * The number of structural features of the '<em>Form Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_ELEMENT_FEATURE_COUNT = PRESENTATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Form Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_ELEMENT_OPERATION_COUNT = PRESENTATION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.kanafghan.welipse.webdsl.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.kanafghan.welipse.webdsl.impl.InputImpl
	 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 33;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__NAME = FORM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Page</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__PAGE = FORM_ELEMENT__PAGE;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__CLASS = FORM_ELEMENT__CLASS;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__EXPRESSION = FORM_ELEMENT__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__LABEL = FORM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__VALUE = FORM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Label Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__LABEL_EXPRESSION = FORM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Value Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__VALUE_EXPRESSION = FORM_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__REQUIRED = FORM_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FEATURE_COUNT = FORM_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OPERATION_COUNT = FORM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.kanafghan.welipse.webdsl.impl.TextInputImpl <em>Text Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.kanafghan.welipse.webdsl.impl.TextInputImpl
	 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getTextInput()
	 * @generated
	 */
	int TEXT_INPUT = 34;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT__NAME = INPUT__NAME;

	/**
	 * The feature id for the '<em><b>Page</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT__PAGE = INPUT__PAGE;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT__CLASS = INPUT__CLASS;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT__EXPRESSION = INPUT__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT__LABEL = INPUT__LABEL;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT__VALUE = INPUT__VALUE;

	/**
	 * The feature id for the '<em><b>Label Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT__LABEL_EXPRESSION = INPUT__LABEL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Value Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT__VALUE_EXPRESSION = INPUT__VALUE_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT__REQUIRED = INPUT__REQUIRED;

	/**
	 * The feature id for the '<em><b>Is Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT__IS_PASSWORD = INPUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Text Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT__IS_TEXT_AREA = INPUT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Text Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_FEATURE_COUNT = INPUT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Text Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_OPERATION_COUNT = INPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.kanafghan.welipse.webdsl.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.kanafghan.welipse.webdsl.impl.ActionImpl
	 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 35;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = NAVIGATION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Page</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__PAGE = NAVIGATION_ELEMENT__PAGE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__TARGET = NAVIGATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = NAVIGATION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = NAVIGATION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.kanafghan.welipse.webdsl.impl.ButtonImpl <em>Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.kanafghan.welipse.webdsl.impl.ButtonImpl
	 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getButton()
	 * @generated
	 */
	int BUTTON = 37;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__NAME = FORM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Page</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__PAGE = FORM_ELEMENT__PAGE;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__CLASS = FORM_ELEMENT__CLASS;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__EXPRESSION = FORM_ELEMENT__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__VALUE = FORM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__TYPE = FORM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_FEATURE_COUNT = FORM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_OPERATION_COUNT = FORM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.kanafghan.welipse.webdsl.impl.SelectionListImpl <em>Selection List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.kanafghan.welipse.webdsl.impl.SelectionListImpl
	 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getSelectionList()
	 * @generated
	 */
	int SELECTION_LIST = 38;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_LIST__NAME = INPUT__NAME;

	/**
	 * The feature id for the '<em><b>Page</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_LIST__PAGE = INPUT__PAGE;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_LIST__CLASS = INPUT__CLASS;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_LIST__EXPRESSION = INPUT__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_LIST__LABEL = INPUT__LABEL;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_LIST__VALUE = INPUT__VALUE;

	/**
	 * The feature id for the '<em><b>Label Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_LIST__LABEL_EXPRESSION = INPUT__LABEL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Value Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_LIST__VALUE_EXPRESSION = INPUT__VALUE_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_LIST__REQUIRED = INPUT__REQUIRED;

	/**
	 * The feature id for the '<em><b>Rendering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_LIST__RENDERING = INPUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Multiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_LIST__IS_MULTIPLE = INPUT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_LIST__OPTIONS = INPUT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Options Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_LIST__OPTIONS_EXPRESSION = INPUT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Selection List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_LIST_FEATURE_COUNT = INPUT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Selection List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_LIST_OPERATION_COUNT = INPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.kanafghan.welipse.webdsl.impl.FileInputImpl <em>File Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.kanafghan.welipse.webdsl.impl.FileInputImpl
	 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getFileInput()
	 * @generated
	 */
	int FILE_INPUT = 39;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_INPUT__NAME = INPUT__NAME;

	/**
	 * The feature id for the '<em><b>Page</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_INPUT__PAGE = INPUT__PAGE;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_INPUT__CLASS = INPUT__CLASS;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_INPUT__EXPRESSION = INPUT__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_INPUT__LABEL = INPUT__LABEL;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_INPUT__VALUE = INPUT__VALUE;

	/**
	 * The feature id for the '<em><b>Label Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_INPUT__LABEL_EXPRESSION = INPUT__LABEL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Value Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_INPUT__VALUE_EXPRESSION = INPUT__VALUE_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_INPUT__REQUIRED = INPUT__REQUIRED;

	/**
	 * The number of structural features of the '<em>File Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_INPUT_FEATURE_COUNT = INPUT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>File Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_INPUT_OPERATION_COUNT = INPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.kanafghan.welipse.webdsl.impl.SubmitImpl <em>Submit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.kanafghan.welipse.webdsl.impl.SubmitImpl
	 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getSubmit()
	 * @generated
	 */
	int SUBMIT = 43;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMIT__NAME = BUTTON__NAME;

	/**
	 * The feature id for the '<em><b>Page</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMIT__PAGE = BUTTON__PAGE;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMIT__CLASS = BUTTON__CLASS;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMIT__EXPRESSION = BUTTON__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMIT__VALUE = BUTTON__VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMIT__TYPE = BUTTON__TYPE;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMIT__ACTION = BUTTON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMIT__PERFORMER = BUTTON_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Validator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMIT__VALIDATOR = BUTTON_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Performer Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMIT__PERFORMER_EXPRESSION = BUTTON_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Validator Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMIT__VALIDATOR_EXPRESSION = BUTTON_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Submit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMIT_FEATURE_COUNT = BUTTON_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Submit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMIT_OPERATION_COUNT = BUTTON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.kanafghan.welipse.webdsl.impl.StandardActionImpl <em>Standard Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.kanafghan.welipse.webdsl.impl.StandardActionImpl
	 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getStandardAction()
	 * @generated
	 */
	int STANDARD_ACTION = 40;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_ACTION__NAME = SUBMIT__NAME;

	/**
	 * The feature id for the '<em><b>Page</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_ACTION__PAGE = SUBMIT__PAGE;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_ACTION__CLASS = SUBMIT__CLASS;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_ACTION__EXPRESSION = SUBMIT__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_ACTION__VALUE = SUBMIT__VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_ACTION__TYPE = SUBMIT__TYPE;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_ACTION__ACTION = SUBMIT__ACTION;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_ACTION__PERFORMER = SUBMIT__PERFORMER;

	/**
	 * The feature id for the '<em><b>Validator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_ACTION__VALIDATOR = SUBMIT__VALIDATOR;

	/**
	 * The feature id for the '<em><b>Performer Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_ACTION__PERFORMER_EXPRESSION = SUBMIT__PERFORMER_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Validator Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_ACTION__VALIDATOR_EXPRESSION = SUBMIT__VALIDATOR_EXPRESSION;

	/**
	 * The number of structural features of the '<em>Standard Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_ACTION_FEATURE_COUNT = SUBMIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Standard Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_ACTION_OPERATION_COUNT = SUBMIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.kanafghan.welipse.webdsl.impl.CustomActionImpl <em>Custom Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.kanafghan.welipse.webdsl.impl.CustomActionImpl
	 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getCustomAction()
	 * @generated
	 */
	int CUSTOM_ACTION = 41;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ACTION__NAME = SUBMIT__NAME;

	/**
	 * The feature id for the '<em><b>Page</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ACTION__PAGE = SUBMIT__PAGE;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ACTION__CLASS = SUBMIT__CLASS;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ACTION__EXPRESSION = SUBMIT__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ACTION__VALUE = SUBMIT__VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ACTION__TYPE = SUBMIT__TYPE;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ACTION__ACTION = SUBMIT__ACTION;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ACTION__PERFORMER = SUBMIT__PERFORMER;

	/**
	 * The feature id for the '<em><b>Validator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ACTION__VALIDATOR = SUBMIT__VALIDATOR;

	/**
	 * The feature id for the '<em><b>Performer Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ACTION__PERFORMER_EXPRESSION = SUBMIT__PERFORMER_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Validator Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ACTION__VALIDATOR_EXPRESSION = SUBMIT__VALIDATOR_EXPRESSION;

	/**
	 * The number of structural features of the '<em>Custom Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ACTION_FEATURE_COUNT = SUBMIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Custom Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ACTION_OPERATION_COUNT = SUBMIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.kanafghan.welipse.webdsl.impl.SaveImpl <em>Save</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.kanafghan.welipse.webdsl.impl.SaveImpl
	 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getSave()
	 * @generated
	 */
	int SAVE = 42;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAVE__NAME = STANDARD_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Page</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAVE__PAGE = STANDARD_ACTION__PAGE;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAVE__CLASS = STANDARD_ACTION__CLASS;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAVE__EXPRESSION = STANDARD_ACTION__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAVE__VALUE = STANDARD_ACTION__VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAVE__TYPE = STANDARD_ACTION__TYPE;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAVE__ACTION = STANDARD_ACTION__ACTION;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAVE__PERFORMER = STANDARD_ACTION__PERFORMER;

	/**
	 * The feature id for the '<em><b>Validator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAVE__VALIDATOR = STANDARD_ACTION__VALIDATOR;

	/**
	 * The feature id for the '<em><b>Performer Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAVE__PERFORMER_EXPRESSION = STANDARD_ACTION__PERFORMER_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Validator Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAVE__VALIDATOR_EXPRESSION = STANDARD_ACTION__VALIDATOR_EXPRESSION;

	/**
	 * The number of structural features of the '<em>Save</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAVE_FEATURE_COUNT = STANDARD_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Save</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAVE_OPERATION_COUNT = STANDARD_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.kanafghan.welipse.webdsl.impl.ResetImpl <em>Reset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.kanafghan.welipse.webdsl.impl.ResetImpl
	 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getReset()
	 * @generated
	 */
	int RESET = 44;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET__NAME = STANDARD_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Page</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET__PAGE = STANDARD_ACTION__PAGE;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET__CLASS = STANDARD_ACTION__CLASS;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET__EXPRESSION = STANDARD_ACTION__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET__VALUE = STANDARD_ACTION__VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET__TYPE = STANDARD_ACTION__TYPE;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET__ACTION = STANDARD_ACTION__ACTION;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET__PERFORMER = STANDARD_ACTION__PERFORMER;

	/**
	 * The feature id for the '<em><b>Validator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET__VALIDATOR = STANDARD_ACTION__VALIDATOR;

	/**
	 * The feature id for the '<em><b>Performer Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET__PERFORMER_EXPRESSION = STANDARD_ACTION__PERFORMER_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Validator Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET__VALIDATOR_EXPRESSION = STANDARD_ACTION__VALIDATOR_EXPRESSION;

	/**
	 * The number of structural features of the '<em>Reset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_FEATURE_COUNT = STANDARD_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Reset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_OPERATION_COUNT = STANDARD_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.kanafghan.welipse.webdsl.impl.CancelImpl <em>Cancel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.kanafghan.welipse.webdsl.impl.CancelImpl
	 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getCancel()
	 * @generated
	 */
	int CANCEL = 45;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANCEL__NAME = STANDARD_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Page</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANCEL__PAGE = STANDARD_ACTION__PAGE;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANCEL__CLASS = STANDARD_ACTION__CLASS;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANCEL__EXPRESSION = STANDARD_ACTION__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANCEL__VALUE = STANDARD_ACTION__VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANCEL__TYPE = STANDARD_ACTION__TYPE;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANCEL__ACTION = STANDARD_ACTION__ACTION;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANCEL__PERFORMER = STANDARD_ACTION__PERFORMER;

	/**
	 * The feature id for the '<em><b>Validator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANCEL__VALIDATOR = STANDARD_ACTION__VALIDATOR;

	/**
	 * The feature id for the '<em><b>Performer Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANCEL__PERFORMER_EXPRESSION = STANDARD_ACTION__PERFORMER_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Validator Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANCEL__VALIDATOR_EXPRESSION = STANDARD_ACTION__VALIDATOR_EXPRESSION;

	/**
	 * The number of structural features of the '<em>Cancel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANCEL_FEATURE_COUNT = STANDARD_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cancel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANCEL_OPERATION_COUNT = STANDARD_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.kanafghan.welipse.webdsl.impl.ListExpImpl <em>List Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.kanafghan.welipse.webdsl.impl.ListExpImpl
	 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getListExp()
	 * @generated
	 */
	int LIST_EXP = 46;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_EXP__ELEMENTS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>List Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_EXP_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_EXP___TYPE = EXPRESSION___TYPE;

	/**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_EXP___INITIALIZE__PAGE = EXPRESSION___INITIALIZE__PAGE;

	/**
	 * The number of operations of the '<em>List Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_EXP_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.kanafghan.welipse.webdsl.impl.ListElementImpl <em>List Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.kanafghan.welipse.webdsl.impl.ListElementImpl
	 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getListElement()
	 * @generated
	 */
	int LIST_ELEMENT = 47;

	/**
	 * The feature id for the '<em><b>Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ELEMENT__KEY = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ELEMENT__VALUE = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>List Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ELEMENT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ELEMENT___TYPE = EXPRESSION___TYPE;

	/**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ELEMENT___INITIALIZE__PAGE = EXPRESSION___INITIALIZE__PAGE;

	/**
	 * The number of operations of the '<em>List Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ELEMENT_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.kanafghan.welipse.webdsl.impl.WebUtilExpImpl <em>Web Util Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.kanafghan.welipse.webdsl.impl.WebUtilExpImpl
	 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getWebUtilExp()
	 * @generated
	 */
	int WEB_UTIL_EXP = 48;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_UTIL_EXP__SOURCE = PROPERTY_OPERATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_UTIL_EXP__IDENTIFIER = PROPERTY_OPERATION__IDENTIFIER;

	/**
	 * The number of structural features of the '<em>Web Util Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_UTIL_EXP_FEATURE_COUNT = PROPERTY_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_UTIL_EXP___TYPE = PROPERTY_OPERATION___TYPE;

	/**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_UTIL_EXP___INITIALIZE__PAGE = PROPERTY_OPERATION___INITIALIZE__PAGE;

	/**
	 * The number of operations of the '<em>Web Util Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_UTIL_EXP_OPERATION_COUNT = PROPERTY_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.kanafghan.welipse.webdsl.ArithmeticOperator <em>Arithmetic Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.kanafghan.welipse.webdsl.ArithmeticOperator
	 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getArithmeticOperator()
	 * @generated
	 */
	int ARITHMETIC_OPERATOR = 49;

	/**
	 * The meta object id for the '{@link com.github.kanafghan.welipse.webdsl.StringOperator <em>String Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.kanafghan.welipse.webdsl.StringOperator
	 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getStringOperator()
	 * @generated
	 */
	int STRING_OPERATOR = 50;


	/**
	 * The meta object id for the '{@link com.github.kanafghan.welipse.webdsl.BooleanOperator <em>Boolean Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.kanafghan.welipse.webdsl.BooleanOperator
	 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getBooleanOperator()
	 * @generated
	 */
	int BOOLEAN_OPERATOR = 51;

	/**
	 * The meta object id for the '{@link com.github.kanafghan.welipse.webdsl.ComparisonOperator <em>Comparison Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.kanafghan.welipse.webdsl.ComparisonOperator
	 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getComparisonOperator()
	 * @generated
	 */
	int COMPARISON_OPERATOR = 52;


	/**
	 * The meta object id for the '{@link com.github.kanafghan.welipse.webdsl.SelectionListRendering <em>Selection List Rendering</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.kanafghan.welipse.webdsl.SelectionListRendering
	 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getSelectionListRendering()
	 * @generated
	 */
	int SELECTION_LIST_RENDERING = 53;

	/**
	 * The meta object id for the '{@link com.github.kanafghan.welipse.webdsl.ButtonType <em>Button Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.kanafghan.welipse.webdsl.ButtonType
	 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getButtonType()
	 * @generated
	 */
	int BUTTON_TYPE = 54;


	/**
	 * The meta object id for the '{@link com.github.kanafghan.welipse.webdsl.FormMethod <em>Form Method</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.kanafghan.welipse.webdsl.FormMethod
	 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getFormMethod()
	 * @generated
	 */
	int FORM_METHOD = 55;


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
	 * Returns the meta object for the attribute '{@link com.github.kanafghan.welipse.webdsl.VariableDeclaration#getDeclaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Declaration</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.VariableDeclaration#getDeclaration()
	 * @see #getVariableDeclaration()
	 * @generated
	 */
	EAttribute getVariableDeclaration_Declaration();

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
	 * Returns the meta object for class '{@link com.github.kanafghan.welipse.webdsl.Form <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.Form
	 * @generated
	 */
	EClass getForm();

	/**
	 * Returns the meta object for the attribute '{@link com.github.kanafghan.welipse.webdsl.Form#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.Form#getMethod()
	 * @see #getForm()
	 * @generated
	 */
	EAttribute getForm_Method();

	/**
	 * Returns the meta object for class '{@link com.github.kanafghan.welipse.webdsl.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.Input
	 * @generated
	 */
	EClass getInput();

	/**
	 * Returns the meta object for the containment reference '{@link com.github.kanafghan.welipse.webdsl.Input#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Label</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.Input#getLabel()
	 * @see #getInput()
	 * @generated
	 */
	EReference getInput_Label();

	/**
	 * Returns the meta object for the containment reference '{@link com.github.kanafghan.welipse.webdsl.Input#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.Input#getValue()
	 * @see #getInput()
	 * @generated
	 */
	EReference getInput_Value();

	/**
	 * Returns the meta object for the attribute '{@link com.github.kanafghan.welipse.webdsl.Input#getLabelExpression <em>Label Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label Expression</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.Input#getLabelExpression()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_LabelExpression();

	/**
	 * Returns the meta object for the attribute '{@link com.github.kanafghan.welipse.webdsl.Input#getValueExpression <em>Value Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Expression</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.Input#getValueExpression()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_ValueExpression();

	/**
	 * Returns the meta object for the attribute '{@link com.github.kanafghan.welipse.webdsl.Input#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.Input#isRequired()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Required();

	/**
	 * Returns the meta object for class '{@link com.github.kanafghan.welipse.webdsl.TextInput <em>Text Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Input</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.TextInput
	 * @generated
	 */
	EClass getTextInput();

	/**
	 * Returns the meta object for the attribute '{@link com.github.kanafghan.welipse.webdsl.TextInput#isIsPassword <em>Is Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Password</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.TextInput#isIsPassword()
	 * @see #getTextInput()
	 * @generated
	 */
	EAttribute getTextInput_IsPassword();

	/**
	 * Returns the meta object for the attribute '{@link com.github.kanafghan.welipse.webdsl.TextInput#isIsTextArea <em>Is Text Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Text Area</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.TextInput#isIsTextArea()
	 * @see #getTextInput()
	 * @generated
	 */
	EAttribute getTextInput_IsTextArea();

	/**
	 * Returns the meta object for class '{@link com.github.kanafghan.welipse.webdsl.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the reference '{@link com.github.kanafghan.welipse.webdsl.Action#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.Action#getTarget()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Target();

	/**
	 * Returns the meta object for class '{@link com.github.kanafghan.welipse.webdsl.FormElement <em>Form Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form Element</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.FormElement
	 * @generated
	 */
	EClass getFormElement();

	/**
	 * Returns the meta object for class '{@link com.github.kanafghan.welipse.webdsl.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.Button
	 * @generated
	 */
	EClass getButton();

	/**
	 * Returns the meta object for the attribute '{@link com.github.kanafghan.welipse.webdsl.Button#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.Button#getValue()
	 * @see #getButton()
	 * @generated
	 */
	EAttribute getButton_Value();

	/**
	 * Returns the meta object for the attribute '{@link com.github.kanafghan.welipse.webdsl.Button#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.Button#getType()
	 * @see #getButton()
	 * @generated
	 */
	EAttribute getButton_Type();

	/**
	 * Returns the meta object for class '{@link com.github.kanafghan.welipse.webdsl.SelectionList <em>Selection List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selection List</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.SelectionList
	 * @generated
	 */
	EClass getSelectionList();

	/**
	 * Returns the meta object for the attribute '{@link com.github.kanafghan.welipse.webdsl.SelectionList#getRendering <em>Rendering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rendering</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.SelectionList#getRendering()
	 * @see #getSelectionList()
	 * @generated
	 */
	EAttribute getSelectionList_Rendering();

	/**
	 * Returns the meta object for the attribute '{@link com.github.kanafghan.welipse.webdsl.SelectionList#isIsMultiple <em>Is Multiple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Multiple</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.SelectionList#isIsMultiple()
	 * @see #getSelectionList()
	 * @generated
	 */
	EAttribute getSelectionList_IsMultiple();

	/**
	 * Returns the meta object for the containment reference '{@link com.github.kanafghan.welipse.webdsl.SelectionList#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Options</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.SelectionList#getOptions()
	 * @see #getSelectionList()
	 * @generated
	 */
	EReference getSelectionList_Options();

	/**
	 * Returns the meta object for the attribute '{@link com.github.kanafghan.welipse.webdsl.SelectionList#getOptionsExpression <em>Options Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Options Expression</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.SelectionList#getOptionsExpression()
	 * @see #getSelectionList()
	 * @generated
	 */
	EAttribute getSelectionList_OptionsExpression();

	/**
	 * Returns the meta object for class '{@link com.github.kanafghan.welipse.webdsl.FileInput <em>File Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Input</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.FileInput
	 * @generated
	 */
	EClass getFileInput();

	/**
	 * Returns the meta object for class '{@link com.github.kanafghan.welipse.webdsl.StandardAction <em>Standard Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Standard Action</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.StandardAction
	 * @generated
	 */
	EClass getStandardAction();

	/**
	 * Returns the meta object for class '{@link com.github.kanafghan.welipse.webdsl.CustomAction <em>Custom Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Action</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.CustomAction
	 * @generated
	 */
	EClass getCustomAction();

	/**
	 * Returns the meta object for class '{@link com.github.kanafghan.welipse.webdsl.Save <em>Save</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Save</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.Save
	 * @generated
	 */
	EClass getSave();

	/**
	 * Returns the meta object for class '{@link com.github.kanafghan.welipse.webdsl.Submit <em>Submit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Submit</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.Submit
	 * @generated
	 */
	EClass getSubmit();

	/**
	 * Returns the meta object for the containment reference '{@link com.github.kanafghan.welipse.webdsl.Submit#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.Submit#getAction()
	 * @see #getSubmit()
	 * @generated
	 */
	EReference getSubmit_Action();

	/**
	 * Returns the meta object for the containment reference '{@link com.github.kanafghan.welipse.webdsl.Submit#getPerformer <em>Performer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Performer</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.Submit#getPerformer()
	 * @see #getSubmit()
	 * @generated
	 */
	EReference getSubmit_Performer();

	/**
	 * Returns the meta object for the containment reference '{@link com.github.kanafghan.welipse.webdsl.Submit#getValidator <em>Validator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Validator</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.Submit#getValidator()
	 * @see #getSubmit()
	 * @generated
	 */
	EReference getSubmit_Validator();

	/**
	 * Returns the meta object for the attribute '{@link com.github.kanafghan.welipse.webdsl.Submit#getPerformerExpression <em>Performer Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Performer Expression</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.Submit#getPerformerExpression()
	 * @see #getSubmit()
	 * @generated
	 */
	EAttribute getSubmit_PerformerExpression();

	/**
	 * Returns the meta object for the attribute '{@link com.github.kanafghan.welipse.webdsl.Submit#getValidatorExpression <em>Validator Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validator Expression</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.Submit#getValidatorExpression()
	 * @see #getSubmit()
	 * @generated
	 */
	EAttribute getSubmit_ValidatorExpression();

	/**
	 * Returns the meta object for class '{@link com.github.kanafghan.welipse.webdsl.Reset <em>Reset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reset</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.Reset
	 * @generated
	 */
	EClass getReset();

	/**
	 * Returns the meta object for class '{@link com.github.kanafghan.welipse.webdsl.Cancel <em>Cancel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cancel</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.Cancel
	 * @generated
	 */
	EClass getCancel();

	/**
	 * Returns the meta object for class '{@link com.github.kanafghan.welipse.webdsl.ListExp <em>List Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Exp</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.ListExp
	 * @generated
	 */
	EClass getListExp();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.kanafghan.welipse.webdsl.ListExp#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.ListExp#getElements()
	 * @see #getListExp()
	 * @generated
	 */
	EReference getListExp_Elements();

	/**
	 * Returns the meta object for class '{@link com.github.kanafghan.welipse.webdsl.ListElement <em>List Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Element</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.ListElement
	 * @generated
	 */
	EClass getListElement();

	/**
	 * Returns the meta object for the containment reference '{@link com.github.kanafghan.welipse.webdsl.ListElement#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Key</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.ListElement#getKey()
	 * @see #getListElement()
	 * @generated
	 */
	EReference getListElement_Key();

	/**
	 * Returns the meta object for the containment reference '{@link com.github.kanafghan.welipse.webdsl.ListElement#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.ListElement#getValue()
	 * @see #getListElement()
	 * @generated
	 */
	EReference getListElement_Value();

	/**
	 * Returns the meta object for class '{@link com.github.kanafghan.welipse.webdsl.WebUtilExp <em>Web Util Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web Util Exp</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.WebUtilExp
	 * @generated
	 */
	EClass getWebUtilExp();

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
	 * Returns the meta object for enum '{@link com.github.kanafghan.welipse.webdsl.SelectionListRendering <em>Selection List Rendering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Selection List Rendering</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.SelectionListRendering
	 * @generated
	 */
	EEnum getSelectionListRendering();

	/**
	 * Returns the meta object for enum '{@link com.github.kanafghan.welipse.webdsl.ButtonType <em>Button Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Button Type</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.ButtonType
	 * @generated
	 */
	EEnum getButtonType();

	/**
	 * Returns the meta object for enum '{@link com.github.kanafghan.welipse.webdsl.FormMethod <em>Form Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Form Method</em>'.
	 * @see com.github.kanafghan.welipse.webdsl.FormMethod
	 * @generated
	 */
	EEnum getFormMethod();

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
		 * The meta object literal for the '<em><b>Declaration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_DECLARATION__DECLARATION = eINSTANCE.getVariableDeclaration_Declaration();

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
		 * The meta object literal for the '{@link com.github.kanafghan.welipse.webdsl.impl.FormImpl <em>Form</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.kanafghan.welipse.webdsl.impl.FormImpl
		 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getForm()
		 * @generated
		 */
		EClass FORM = eINSTANCE.getForm();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__METHOD = eINSTANCE.getForm_Method();

		/**
		 * The meta object literal for the '{@link com.github.kanafghan.welipse.webdsl.impl.InputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.kanafghan.welipse.webdsl.impl.InputImpl
		 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getInput()
		 * @generated
		 */
		EClass INPUT = eINSTANCE.getInput();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT__LABEL = eINSTANCE.getInput_Label();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT__VALUE = eINSTANCE.getInput_Value();

		/**
		 * The meta object literal for the '<em><b>Label Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__LABEL_EXPRESSION = eINSTANCE.getInput_LabelExpression();

		/**
		 * The meta object literal for the '<em><b>Value Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__VALUE_EXPRESSION = eINSTANCE.getInput_ValueExpression();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__REQUIRED = eINSTANCE.getInput_Required();

		/**
		 * The meta object literal for the '{@link com.github.kanafghan.welipse.webdsl.impl.TextInputImpl <em>Text Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.kanafghan.welipse.webdsl.impl.TextInputImpl
		 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getTextInput()
		 * @generated
		 */
		EClass TEXT_INPUT = eINSTANCE.getTextInput();

		/**
		 * The meta object literal for the '<em><b>Is Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_INPUT__IS_PASSWORD = eINSTANCE.getTextInput_IsPassword();

		/**
		 * The meta object literal for the '<em><b>Is Text Area</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_INPUT__IS_TEXT_AREA = eINSTANCE.getTextInput_IsTextArea();

		/**
		 * The meta object literal for the '{@link com.github.kanafghan.welipse.webdsl.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.kanafghan.welipse.webdsl.impl.ActionImpl
		 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__TARGET = eINSTANCE.getAction_Target();

		/**
		 * The meta object literal for the '{@link com.github.kanafghan.welipse.webdsl.impl.FormElementImpl <em>Form Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.kanafghan.welipse.webdsl.impl.FormElementImpl
		 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getFormElement()
		 * @generated
		 */
		EClass FORM_ELEMENT = eINSTANCE.getFormElement();

		/**
		 * The meta object literal for the '{@link com.github.kanafghan.welipse.webdsl.impl.ButtonImpl <em>Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.kanafghan.welipse.webdsl.impl.ButtonImpl
		 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getButton()
		 * @generated
		 */
		EClass BUTTON = eINSTANCE.getButton();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUTTON__VALUE = eINSTANCE.getButton_Value();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUTTON__TYPE = eINSTANCE.getButton_Type();

		/**
		 * The meta object literal for the '{@link com.github.kanafghan.welipse.webdsl.impl.SelectionListImpl <em>Selection List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.kanafghan.welipse.webdsl.impl.SelectionListImpl
		 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getSelectionList()
		 * @generated
		 */
		EClass SELECTION_LIST = eINSTANCE.getSelectionList();

		/**
		 * The meta object literal for the '<em><b>Rendering</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECTION_LIST__RENDERING = eINSTANCE.getSelectionList_Rendering();

		/**
		 * The meta object literal for the '<em><b>Is Multiple</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECTION_LIST__IS_MULTIPLE = eINSTANCE.getSelectionList_IsMultiple();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECTION_LIST__OPTIONS = eINSTANCE.getSelectionList_Options();

		/**
		 * The meta object literal for the '<em><b>Options Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECTION_LIST__OPTIONS_EXPRESSION = eINSTANCE.getSelectionList_OptionsExpression();

		/**
		 * The meta object literal for the '{@link com.github.kanafghan.welipse.webdsl.impl.FileInputImpl <em>File Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.kanafghan.welipse.webdsl.impl.FileInputImpl
		 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getFileInput()
		 * @generated
		 */
		EClass FILE_INPUT = eINSTANCE.getFileInput();

		/**
		 * The meta object literal for the '{@link com.github.kanafghan.welipse.webdsl.impl.StandardActionImpl <em>Standard Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.kanafghan.welipse.webdsl.impl.StandardActionImpl
		 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getStandardAction()
		 * @generated
		 */
		EClass STANDARD_ACTION = eINSTANCE.getStandardAction();

		/**
		 * The meta object literal for the '{@link com.github.kanafghan.welipse.webdsl.impl.CustomActionImpl <em>Custom Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.kanafghan.welipse.webdsl.impl.CustomActionImpl
		 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getCustomAction()
		 * @generated
		 */
		EClass CUSTOM_ACTION = eINSTANCE.getCustomAction();

		/**
		 * The meta object literal for the '{@link com.github.kanafghan.welipse.webdsl.impl.SaveImpl <em>Save</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.kanafghan.welipse.webdsl.impl.SaveImpl
		 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getSave()
		 * @generated
		 */
		EClass SAVE = eINSTANCE.getSave();

		/**
		 * The meta object literal for the '{@link com.github.kanafghan.welipse.webdsl.impl.SubmitImpl <em>Submit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.kanafghan.welipse.webdsl.impl.SubmitImpl
		 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getSubmit()
		 * @generated
		 */
		EClass SUBMIT = eINSTANCE.getSubmit();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBMIT__ACTION = eINSTANCE.getSubmit_Action();

		/**
		 * The meta object literal for the '<em><b>Performer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBMIT__PERFORMER = eINSTANCE.getSubmit_Performer();

		/**
		 * The meta object literal for the '<em><b>Validator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBMIT__VALIDATOR = eINSTANCE.getSubmit_Validator();

		/**
		 * The meta object literal for the '<em><b>Performer Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBMIT__PERFORMER_EXPRESSION = eINSTANCE.getSubmit_PerformerExpression();

		/**
		 * The meta object literal for the '<em><b>Validator Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBMIT__VALIDATOR_EXPRESSION = eINSTANCE.getSubmit_ValidatorExpression();

		/**
		 * The meta object literal for the '{@link com.github.kanafghan.welipse.webdsl.impl.ResetImpl <em>Reset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.kanafghan.welipse.webdsl.impl.ResetImpl
		 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getReset()
		 * @generated
		 */
		EClass RESET = eINSTANCE.getReset();

		/**
		 * The meta object literal for the '{@link com.github.kanafghan.welipse.webdsl.impl.CancelImpl <em>Cancel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.kanafghan.welipse.webdsl.impl.CancelImpl
		 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getCancel()
		 * @generated
		 */
		EClass CANCEL = eINSTANCE.getCancel();

		/**
		 * The meta object literal for the '{@link com.github.kanafghan.welipse.webdsl.impl.ListExpImpl <em>List Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.kanafghan.welipse.webdsl.impl.ListExpImpl
		 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getListExp()
		 * @generated
		 */
		EClass LIST_EXP = eINSTANCE.getListExp();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_EXP__ELEMENTS = eINSTANCE.getListExp_Elements();

		/**
		 * The meta object literal for the '{@link com.github.kanafghan.welipse.webdsl.impl.ListElementImpl <em>List Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.kanafghan.welipse.webdsl.impl.ListElementImpl
		 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getListElement()
		 * @generated
		 */
		EClass LIST_ELEMENT = eINSTANCE.getListElement();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_ELEMENT__KEY = eINSTANCE.getListElement_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_ELEMENT__VALUE = eINSTANCE.getListElement_Value();

		/**
		 * The meta object literal for the '{@link com.github.kanafghan.welipse.webdsl.impl.WebUtilExpImpl <em>Web Util Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.kanafghan.welipse.webdsl.impl.WebUtilExpImpl
		 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getWebUtilExp()
		 * @generated
		 */
		EClass WEB_UTIL_EXP = eINSTANCE.getWebUtilExp();

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

		/**
		 * The meta object literal for the '{@link com.github.kanafghan.welipse.webdsl.SelectionListRendering <em>Selection List Rendering</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.kanafghan.welipse.webdsl.SelectionListRendering
		 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getSelectionListRendering()
		 * @generated
		 */
		EEnum SELECTION_LIST_RENDERING = eINSTANCE.getSelectionListRendering();

		/**
		 * The meta object literal for the '{@link com.github.kanafghan.welipse.webdsl.ButtonType <em>Button Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.kanafghan.welipse.webdsl.ButtonType
		 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getButtonType()
		 * @generated
		 */
		EEnum BUTTON_TYPE = eINSTANCE.getButtonType();

		/**
		 * The meta object literal for the '{@link com.github.kanafghan.welipse.webdsl.FormMethod <em>Form Method</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.kanafghan.welipse.webdsl.FormMethod
		 * @see com.github.kanafghan.welipse.webdsl.impl.WebDSLPackageImpl#getFormMethod()
		 * @generated
		 */
		EEnum FORM_METHOD = eINSTANCE.getFormMethod();

	}

} //WebDSLPackage
