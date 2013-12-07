/**
 */
package com.github.kanafghan.welipse.webdsl;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Internal Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.kanafghan.welipse.webdsl.InternalLink#getTarget <em>Target</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.webdsl.InternalLink#getActualParameters <em>Actual Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.kanafghan.welipse.webdsl.WebDSLPackage#getInternalLink()
 * @model
 * @generated
 */
public interface InternalLink extends Link {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(PageElement)
	 * @see com.github.kanafghan.welipse.webdsl.WebDSLPackage#getInternalLink_Target()
	 * @model required="true"
	 * @generated
	 */
	PageElement getTarget();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.webdsl.InternalLink#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(PageElement value);

	/**
	 * Returns the value of the '<em><b>Actual Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link com.github.kanafghan.welipse.webdsl.ActualParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Parameters</em>' containment reference list.
	 * @see com.github.kanafghan.welipse.webdsl.WebDSLPackage#getInternalLink_ActualParameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActualParameter> getActualParameters();

} // InternalLink
