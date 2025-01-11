/**
 */
package VendingMachine;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>States</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see VendingMachine.VendingMachinePackage#getStates()
 * @model
 * @generated
 */
public enum States implements Enumerator {
	/**
	 * The '<em><b>SELECT ITEM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SELECT_ITEM_VALUE
	 * @generated
	 * @ordered
	 */
	SELECT_ITEM(0, "SELECT_ITEM", "SELECT_ITEM"),

	/**
	 * The '<em><b>WAIT FOR PAYMENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WAIT_FOR_PAYMENT_VALUE
	 * @generated
	 * @ordered
	 */
	WAIT_FOR_PAYMENT(1, "WAIT_FOR_PAYMENT", "WAIT_FOR_PAYMENT"),

	/**
	 * The '<em><b>PROCESSING PAYMENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROCESSING_PAYMENT_VALUE
	 * @generated
	 * @ordered
	 */
	PROCESSING_PAYMENT(2, "PROCESSING_PAYMENT", "PROCESSING_PAYMENT"),

	/**
	 * The '<em><b>PROCESSING ITEM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROCESSING_ITEM_VALUE
	 * @generated
	 * @ordered
	 */
	PROCESSING_ITEM(3, "PROCESSING_ITEM", "PROCESSING_ITEM"),

	/**
	 * The '<em><b>ITEM DESPATCHED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ITEM_DESPATCHED_VALUE
	 * @generated
	 * @ordered
	 */
	ITEM_DESPATCHED(4, "ITEM_DESPATCHED", "ITEM_DESPATCHED");

	/**
	 * The '<em><b>SELECT ITEM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SELECT_ITEM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SELECT_ITEM_VALUE = 0;

	/**
	 * The '<em><b>WAIT FOR PAYMENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WAIT_FOR_PAYMENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WAIT_FOR_PAYMENT_VALUE = 1;

	/**
	 * The '<em><b>PROCESSING PAYMENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROCESSING_PAYMENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PROCESSING_PAYMENT_VALUE = 2;

	/**
	 * The '<em><b>PROCESSING ITEM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROCESSING_ITEM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PROCESSING_ITEM_VALUE = 3;

	/**
	 * The '<em><b>ITEM DESPATCHED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ITEM_DESPATCHED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ITEM_DESPATCHED_VALUE = 4;

	/**
	 * An array of all the '<em><b>States</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final States[] VALUES_ARRAY =
		new States[] {
			SELECT_ITEM,
			WAIT_FOR_PAYMENT,
			PROCESSING_PAYMENT,
			PROCESSING_ITEM,
			ITEM_DESPATCHED,
		};

	/**
	 * A public read-only list of all the '<em><b>States</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<States> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>States</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static States get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			States result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>States</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static States getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			States result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>States</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static States get(int value) {
		switch (value) {
			case SELECT_ITEM_VALUE: return SELECT_ITEM;
			case WAIT_FOR_PAYMENT_VALUE: return WAIT_FOR_PAYMENT;
			case PROCESSING_PAYMENT_VALUE: return PROCESSING_PAYMENT;
			case PROCESSING_ITEM_VALUE: return PROCESSING_ITEM;
			case ITEM_DESPATCHED_VALUE: return ITEM_DESPATCHED;
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
	private States(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	
} //States
