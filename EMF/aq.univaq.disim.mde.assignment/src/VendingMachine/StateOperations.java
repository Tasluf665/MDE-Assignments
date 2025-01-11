/**
 */
package VendingMachine;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>State Operations</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see VendingMachine.VendingMachinePackage#getStateOperations()
 * @model
 * @generated
 */
public enum StateOperations implements Enumerator {
	/**
	 * The '<em><b>SELECT ITEM collect Coin</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SELECT_ITEM_COLLECT_COIN_VALUE
	 * @generated
	 * @ordered
	 */
	SELECT_ITEM_COLLECT_COIN(0, "SELECT_ITEM_collectCoin", "SELECT_ITEM_collectCoin"),

	/**
	 * The '<em><b>SELECT ITEM send Input</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SELECT_ITEM_SEND_INPUT_VALUE
	 * @generated
	 * @ordered
	 */
	SELECT_ITEM_SEND_INPUT(1, "SELECT_ITEM_sendInput", "SELECT_ITEM_sendInput"),

	/**
	 * The '<em><b>PROCESSING ITEM process Item</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROCESSING_ITEM_PROCESS_ITEM_VALUE
	 * @generated
	 * @ordered
	 */
	PROCESSING_ITEM_PROCESS_ITEM(2, "PROCESSING_ITEM_processItem", "PROCESSING_ITEM_processItem"),

	/**
	 * The '<em><b>ITEM DISPATCHED dispatch Change</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ITEM_DISPATCHED_DISPATCH_CHANGE_VALUE
	 * @generated
	 * @ordered
	 */
	ITEM_DISPATCHED_DISPATCH_CHANGE(3, "ITEM_DISPATCHED_dispatchChange", "ITEM_DISPATCHED_dispatchChange"),

	/**
	 * The '<em><b>WIAT FOR PAYMENT collect Coin</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIAT_FOR_PAYMENT_COLLECT_COIN_VALUE
	 * @generated
	 * @ordered
	 */
	WIAT_FOR_PAYMENT_COLLECT_COIN(4, "WIAT_FOR_PAYMENT_collectCoin", "WIAT_FOR_PAYMENT_collectCoin");

	/**
	 * The '<em><b>SELECT ITEM collect Coin</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SELECT_ITEM_COLLECT_COIN
	 * @model name="SELECT_ITEM_collectCoin"
	 * @generated
	 * @ordered
	 */
	public static final int SELECT_ITEM_COLLECT_COIN_VALUE = 0;

	/**
	 * The '<em><b>SELECT ITEM send Input</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SELECT_ITEM_SEND_INPUT
	 * @model name="SELECT_ITEM_sendInput"
	 * @generated
	 * @ordered
	 */
	public static final int SELECT_ITEM_SEND_INPUT_VALUE = 1;

	/**
	 * The '<em><b>PROCESSING ITEM process Item</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROCESSING_ITEM_PROCESS_ITEM
	 * @model name="PROCESSING_ITEM_processItem"
	 * @generated
	 * @ordered
	 */
	public static final int PROCESSING_ITEM_PROCESS_ITEM_VALUE = 2;

	/**
	 * The '<em><b>ITEM DISPATCHED dispatch Change</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ITEM_DISPATCHED_DISPATCH_CHANGE
	 * @model name="ITEM_DISPATCHED_dispatchChange"
	 * @generated
	 * @ordered
	 */
	public static final int ITEM_DISPATCHED_DISPATCH_CHANGE_VALUE = 3;

	/**
	 * The '<em><b>WIAT FOR PAYMENT collect Coin</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIAT_FOR_PAYMENT_COLLECT_COIN
	 * @model name="WIAT_FOR_PAYMENT_collectCoin"
	 * @generated
	 * @ordered
	 */
	public static final int WIAT_FOR_PAYMENT_COLLECT_COIN_VALUE = 4;

	/**
	 * An array of all the '<em><b>State Operations</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final StateOperations[] VALUES_ARRAY =
		new StateOperations[] {
			SELECT_ITEM_COLLECT_COIN,
			SELECT_ITEM_SEND_INPUT,
			PROCESSING_ITEM_PROCESS_ITEM,
			ITEM_DISPATCHED_DISPATCH_CHANGE,
			WIAT_FOR_PAYMENT_COLLECT_COIN,
		};

	/**
	 * A public read-only list of all the '<em><b>State Operations</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<StateOperations> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>State Operations</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StateOperations get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StateOperations result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>State Operations</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StateOperations getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StateOperations result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>State Operations</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StateOperations get(int value) {
		switch (value) {
			case SELECT_ITEM_COLLECT_COIN_VALUE: return SELECT_ITEM_COLLECT_COIN;
			case SELECT_ITEM_SEND_INPUT_VALUE: return SELECT_ITEM_SEND_INPUT;
			case PROCESSING_ITEM_PROCESS_ITEM_VALUE: return PROCESSING_ITEM_PROCESS_ITEM;
			case ITEM_DISPATCHED_DISPATCH_CHANGE_VALUE: return ITEM_DISPATCHED_DISPATCH_CHANGE;
			case WIAT_FOR_PAYMENT_COLLECT_COIN_VALUE: return WIAT_FOR_PAYMENT_COLLECT_COIN;
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
	private StateOperations(int value, String name, String literal) {
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
	
} //StateOperations
