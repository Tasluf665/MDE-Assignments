/**
 */
package VendingMachine;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link VendingMachine.State#getStage <em>Stage</em>}</li>
 * </ul>
 *
 * @see VendingMachine.VendingMachinePackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject {
	/**
	 * Returns the value of the '<em><b>Stage</b></em>' attribute.
	 * The literals are from the enumeration {@link VendingMachine.States}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stage</em>' attribute.
	 * @see VendingMachine.States
	 * @see #setStage(States)
	 * @see VendingMachine.VendingMachinePackage#getState_Stage()
	 * @model required="true"
	 * @generated
	 */
	States getStage();

	/**
	 * Sets the value of the '{@link VendingMachine.State#getStage <em>Stage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stage</em>' attribute.
	 * @see VendingMachine.States
	 * @see #getStage()
	 * @generated
	 */
	void setStage(States value);

} // State
