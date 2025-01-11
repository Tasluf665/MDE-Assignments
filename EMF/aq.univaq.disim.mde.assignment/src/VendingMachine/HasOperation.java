/**
 */
package VendingMachine;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Has Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link VendingMachine.HasOperation#getOperations <em>Operations</em>}</li>
 * </ul>
 *
 * @see VendingMachine.VendingMachinePackage#getHasOperation()
 * @model abstract="true"
 * @generated
 */
public interface HasOperation extends EObject {
	/**
	 * Returns the value of the '<em><b>Operations</b></em>' attribute.
	 * The literals are from the enumeration {@link VendingMachine.StateOperations}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' attribute.
	 * @see VendingMachine.StateOperations
	 * @see #setOperations(StateOperations)
	 * @see VendingMachine.VendingMachinePackage#getHasOperation_Operations()
	 * @model required="true"
	 * @generated
	 */
	StateOperations getOperations();

	/**
	 * Sets the value of the '{@link VendingMachine.HasOperation#getOperations <em>Operations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operations</em>' attribute.
	 * @see VendingMachine.StateOperations
	 * @see #getOperations()
	 * @generated
	 */
	void setOperations(StateOperations value);

} // HasOperation
