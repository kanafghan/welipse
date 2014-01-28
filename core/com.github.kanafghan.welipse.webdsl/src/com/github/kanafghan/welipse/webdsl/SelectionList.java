/**
 */
package com.github.kanafghan.welipse.webdsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selection List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.kanafghan.welipse.webdsl.SelectionList#getRendering <em>Rendering</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.webdsl.SelectionList#isIsMultiple <em>Is Multiple</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.webdsl.SelectionList#getOptions <em>Options</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.webdsl.SelectionList#getOptionsExpression <em>Options Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.kanafghan.welipse.webdsl.WebDSLPackage#getSelectionList()
 * @model
 * @generated
 */
public interface SelectionList extends Input {
	/**
	 * Returns the value of the '<em><b>Rendering</b></em>' attribute.
	 * The literals are from the enumeration {@link com.github.kanafghan.welipse.webdsl.SelectionListRendering}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rendering</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rendering</em>' attribute.
	 * @see com.github.kanafghan.welipse.webdsl.SelectionListRendering
	 * @see #setRendering(SelectionListRendering)
	 * @see com.github.kanafghan.welipse.webdsl.WebDSLPackage#getSelectionList_Rendering()
	 * @model
	 * @generated
	 */
	SelectionListRendering getRendering();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.webdsl.SelectionList#getRendering <em>Rendering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rendering</em>' attribute.
	 * @see com.github.kanafghan.welipse.webdsl.SelectionListRendering
	 * @see #getRendering()
	 * @generated
	 */
	void setRendering(SelectionListRendering value);

	/**
	 * Returns the value of the '<em><b>Is Multiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Multiple</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Multiple</em>' attribute.
	 * @see #setIsMultiple(boolean)
	 * @see com.github.kanafghan.welipse.webdsl.WebDSLPackage#getSelectionList_IsMultiple()
	 * @model
	 * @generated
	 */
	boolean isIsMultiple();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.webdsl.SelectionList#isIsMultiple <em>Is Multiple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Multiple</em>' attribute.
	 * @see #isIsMultiple()
	 * @generated
	 */
	void setIsMultiple(boolean value);

	/**
	 * Returns the value of the '<em><b>Options</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Options</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' containment reference.
	 * @see #setOptions(Expression)
	 * @see com.github.kanafghan.welipse.webdsl.WebDSLPackage#getSelectionList_Options()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getOptions();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.webdsl.SelectionList#getOptions <em>Options</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Options</em>' containment reference.
	 * @see #getOptions()
	 * @generated
	 */
	void setOptions(Expression value);

	/**
	 * Returns the value of the '<em><b>Options Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Options Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options Expression</em>' attribute.
	 * @see #setOptionsExpression(String)
	 * @see com.github.kanafghan.welipse.webdsl.WebDSLPackage#getSelectionList_OptionsExpression()
	 * @model
	 * @generated
	 */
	String getOptionsExpression();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.webdsl.SelectionList#getOptionsExpression <em>Options Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Options Expression</em>' attribute.
	 * @see #getOptionsExpression()
	 * @generated
	 */
	void setOptionsExpression(String value);

} // SelectionList
