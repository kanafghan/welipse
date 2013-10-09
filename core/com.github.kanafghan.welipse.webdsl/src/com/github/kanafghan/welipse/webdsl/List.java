/**
 */
package com.github.kanafghan.welipse.webdsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.kanafghan.welipse.webdsl.List#getItem <em>Item</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.webdsl.List#getCollectionProvider <em>Collection Provider</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.webdsl.List#getType <em>Type</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.webdsl.List#getContent <em>Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.kanafghan.welipse.webdsl.WebDSLPackage#getList()
 * @model
 * @generated
 */
public interface List extends PresentationElement {
	/**
	 * Returns the value of the '<em><b>Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' attribute.
	 * @see #setItem(String)
	 * @see com.github.kanafghan.welipse.webdsl.WebDSLPackage#getList_Item()
	 * @model required="true"
	 * @generated
	 */
	String getItem();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.webdsl.List#getItem <em>Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item</em>' attribute.
	 * @see #getItem()
	 * @generated
	 */
	void setItem(String value);

	/**
	 * Returns the value of the '<em><b>Collection Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collection Provider</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection Provider</em>' reference.
	 * @see #setCollectionProvider(EOperation)
	 * @see com.github.kanafghan.welipse.webdsl.WebDSLPackage#getList_CollectionProvider()
	 * @model required="true"
	 * @generated
	 */
	EOperation getCollectionProvider();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.webdsl.List#getCollectionProvider <em>Collection Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection Provider</em>' reference.
	 * @see #getCollectionProvider()
	 * @generated
	 */
	void setCollectionProvider(EOperation value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(EClass)
	 * @see com.github.kanafghan.welipse.webdsl.WebDSLPackage#getList_Type()
	 * @model required="true"
	 * @generated
	 */
	EClass getType();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.webdsl.List#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(EClass value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference list.
	 * The list contents are of type {@link com.github.kanafghan.welipse.webdsl.PageElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' containment reference list.
	 * @see com.github.kanafghan.welipse.webdsl.WebDSLPackage#getList_Content()
	 * @model containment="true"
	 * @generated
	 */
	EList<PageElement> getContent();

} // List
