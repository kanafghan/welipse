/**
 */
package com.github.kanafghan.welipse.joomlagen;

import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.GenReference#getEcoreReference <em>Ecore Reference</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.GenReference#getOpposite <em>Opposite</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.GenReference#getDatabaseColumnGeneration <em>Database Column Generation</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.GenReference#isOneToMany <em>One To Many</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.GenReference#isManyToMany <em>Many To Many</em>}</li>
 *   <li>{@link com.github.kanafghan.welipse.joomlagen.GenReference#isMany <em>Many</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenPackage#getGenReference()
 * @model
 * @generated
 */
public interface GenReference extends GenFeature {
	/**
	 * Returns the value of the '<em><b>Ecore Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ecore Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ecore Reference</em>' reference.
	 * @see #setEcoreReference(EReference)
	 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenPackage#getGenReference_EcoreReference()
	 * @model required="true"
	 * @generated
	 */
	EReference getEcoreReference();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.joomlagen.GenReference#getEcoreReference <em>Ecore Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ecore Reference</em>' reference.
	 * @see #getEcoreReference()
	 * @generated
	 */
	void setEcoreReference(EReference value);

	/**
	 * Returns the value of the '<em><b>Opposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opposite</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opposite</em>' reference.
	 * @see #setOpposite(GenReference)
	 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenPackage#getGenReference_Opposite()
	 * @model
	 * @generated
	 */
	GenReference getOpposite();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.joomlagen.GenReference#getOpposite <em>Opposite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opposite</em>' reference.
	 * @see #getOpposite()
	 * @generated
	 */
	void setOpposite(GenReference value);

	/**
	 * Returns the value of the '<em><b>Database Column Generation</b></em>' attribute.
	 * The default value is <code>"GenerateInOther"</code>.
	 * The literals are from the enumeration {@link com.github.kanafghan.welipse.joomlagen.ForeignKeyGeneration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database Column Generation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database Column Generation</em>' attribute.
	 * @see com.github.kanafghan.welipse.joomlagen.ForeignKeyGeneration
	 * @see #setDatabaseColumnGeneration(ForeignKeyGeneration)
	 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenPackage#getGenReference_DatabaseColumnGeneration()
	 * @model default="GenerateInOther"
	 * @generated
	 */
	ForeignKeyGeneration getDatabaseColumnGeneration();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.joomlagen.GenReference#getDatabaseColumnGeneration <em>Database Column Generation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database Column Generation</em>' attribute.
	 * @see com.github.kanafghan.welipse.joomlagen.ForeignKeyGeneration
	 * @see #getDatabaseColumnGeneration()
	 * @generated
	 */
	void setDatabaseColumnGeneration(ForeignKeyGeneration value);

	/**
	 * Returns the value of the '<em><b>Many To Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Many To Many</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Many To Many</em>' attribute.
	 * @see #setManyToMany(boolean)
	 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenPackage#getGenReference_ManyToMany()
	 * @model transient="true" volatile="true" derived="true"
	 * @generated
	 */
	boolean isManyToMany();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.joomlagen.GenReference#isManyToMany <em>Many To Many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Many To Many</em>' attribute.
	 * @see #isManyToMany()
	 * @generated
	 */
	void setManyToMany(boolean value);

	/**
	 * Returns the value of the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Many</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Many</em>' attribute.
	 * @see #setMany(boolean)
	 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenPackage#getGenReference_Many()
	 * @model transient="true" volatile="true" derived="true"
	 * @generated
	 */
	boolean isMany();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.joomlagen.GenReference#isMany <em>Many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Many</em>' attribute.
	 * @see #isMany()
	 * @generated
	 */
	void setMany(boolean value);

	/**
	 * Returns the value of the '<em><b>One To Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>One To Many</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>One To Many</em>' attribute.
	 * @see #setOneToMany(boolean)
	 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenPackage#getGenReference_OneToMany()
	 * @model transient="true" volatile="true" derived="true"
	 * @generated
	 */
	boolean isOneToMany();

	/**
	 * Sets the value of the '{@link com.github.kanafghan.welipse.joomlagen.GenReference#isOneToMany <em>One To Many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>One To Many</em>' attribute.
	 * @see #isOneToMany()
	 * @generated
	 */
	void setOneToMany(boolean value);
	
	void initialize(EReference eReference);

} // GenReference
