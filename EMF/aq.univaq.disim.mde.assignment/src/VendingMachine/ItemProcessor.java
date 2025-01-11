/**
 */
package VendingMachine;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item Processor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link VendingMachine.ItemProcessor#getState <em>State</em>}</li>
 * </ul>
 *
 * @see VendingMachine.VendingMachinePackage#getItemProcessor()
 * @model
 * @generated
 */
public interface ItemProcessor extends HasOperation {
	/**
	 * Returns the value of the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' reference.
	 * @see #setState(State)
	 * @see VendingMachine.VendingMachinePackage#getItemProcessor_State()
	 * @model required="true"
	 * @generated
	 */
	State getState();

	/**
	 * Sets the value of the '{@link VendingMachine.ItemProcessor#getState <em>State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(State value);

} // ItemProcessor
