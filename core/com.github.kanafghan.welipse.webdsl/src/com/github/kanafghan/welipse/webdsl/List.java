/**
 */
package com.github.kanafghan.welipse.webdsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.kanafghan.welipse.webdsl.List#getElements <em>Elements</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.webdsl.List#getCollection <em>Collection</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.webdsl.List#getIteratorVariable <em>Iterator Variable</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.webdsl.List#getVariable <em>Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.kanafghan.welipse.webdsl.WebDSLPackage#getList()
 * @model
 * @generated
 */
public interface List extends PresentationElement {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link com.github.kanafghan.welipse.webdsl.PageElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see com.github.kanafghan.welipse.webdsl.WebDSLPackage#getList_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<PageElement> getElements();

	/**
	 * Returns the value of the '<em><b>Collection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collection</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection</em>' containment reference.
	 * @see #setCollection(Expression)
	 * @see com.github.kanafghan.welipse.webdsl.WebDSLPackage#getList_Collection()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getCollection();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.webdsl.List#getCollection <em>Collection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection</em>' containment reference.
	 * @see #getCollection()
	 * @generated
	 */
	void setCollection(Expression value);

	/**
	 * Returns the value of the '<em><b>Iterator Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iterator Variable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iterator Variable</em>' containment reference.
	 * @see #setIteratorVariable(VariableDeclaration)
	 * @see com.github.kanafghan.welipse.webdsl.WebDSLPackage#getList_IteratorVariable()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VariableDeclaration getIteratorVariable();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.webdsl.List#getIteratorVariable <em>Iterator Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iterator Variable</em>' containment reference.
	 * @see #getIteratorVariable()
	 * @generated
	 */
	void setIteratorVariable(VariableDeclaration value);

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' attribute.
	 * @see #setVariable(String)
	 * @see com.github.kanafghan.welipse.webdsl.WebDSLPackage#getList_Variable()
	 * @model
	 * @generated
	 */
	String getVariable();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.webdsl.List#getVariable <em>Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' attribute.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(String value);

} // List
