/**
 */
package com.github.kanafghan.welipse.joomlagen;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Foreign Key Generation</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.github.kanafghan.welipse.joomlagen.JoomlaGenPackage#getForeignKeyGeneration()
 * @model
 * @generated
 */
public enum ForeignKeyGeneration implements Enumerator {
	/**
	 * The '<em><b>Generate In Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENERATE_IN_OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	GENERATE_IN_OTHER(0, "GenerateInOther", "GenerateInOther"),

	/**
	 * The '<em><b>Generate In This</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENERATE_IN_THIS_VALUE
	 * @generated
	 * @ordered
	 */
	GENERATE_IN_THIS(1, "GenerateInThis", "GenerateInThis");

	/**
	 * The '<em><b>Generate In Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Generate In Other</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GENERATE_IN_OTHER
	 * @model name="GenerateInOther"
	 * @generated
	 * @ordered
	 */
	public static final int GENERATE_IN_OTHER_VALUE = 0;

	/**
	 * The '<em><b>Generate In This</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Generate In This</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GENERATE_IN_THIS
	 * @model name="GenerateInThis"
	 * @generated
	 * @ordered
	 */
	public static final int GENERATE_IN_THIS_VALUE = 1;

	/**
	 * An array of all the '<em><b>Foreign Key Generation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ForeignKeyGeneration[] VALUES_ARRAY =
		new ForeignKeyGeneration[] {
			GENERATE_IN_OTHER,
			GENERATE_IN_THIS,
		};

	/**
	 * A public read-only list of all the '<em><b>Foreign Key Generation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ForeignKeyGeneration> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Foreign Key Generation</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ForeignKeyGeneration get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ForeignKeyGeneration result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Foreign Key Generation</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ForeignKeyGeneration getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ForeignKeyGeneration result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Foreign Key Generation</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ForeignKeyGeneration get(int value) {
		switch (value) {
			case GENERATE_IN_OTHER_VALUE: return GENERATE_IN_OTHER;
			case GENERATE_IN_THIS_VALUE: return GENERATE_IN_THIS;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ForeignKeyGeneration(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ForeignKeyGeneration
