/**
 */
package VendingMachine;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Keypad</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link VendingMachine.Keypad#getInput <em>Input</em>}</li>
 *   <li>{@link VendingMachine.Keypad#getState <em>State</em>}</li>
 * </ul>
 *
 * @see VendingMachine.VendingMachinePackage#getKeypad()
 * @model
 * @generated
 */
public interface Keypad extends HasOperation {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' attribute.
	 * @see #setInput(String)
	 * @see VendingMachine.VendingMachinePackage#getKeypad_Input()
	 * @model required="true"
	 * @generated
	 */
	String getInput();

	/**
	 * Sets the value of the '{@link VendingMachine.Keypad#getInput <em>Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' attribute.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(String value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' reference.
	 * @see #setState(State)
	 * @see VendingMachine.VendingMachinePackage#getKeypad_State()
	 * @model required="true"
	 * @generated
	 */
	State getState();

	/**
	 * Sets the value of the '{@link VendingMachine.Keypad#getState <em>State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(State value);

} // Keypad
