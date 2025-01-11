/**
 */
package VendingMachine;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inventory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link VendingMachine.Inventory#getTotalCapacity <em>Total Capacity</em>}</li>
 *   <li>{@link VendingMachine.Inventory#getLastRestocked <em>Last Restocked</em>}</li>
 *   <li>{@link VendingMachine.Inventory#getItemGroup <em>Item Group</em>}</li>
 * </ul>
 *
 * @see VendingMachine.VendingMachinePackage#getInventory()
 * @model
 * @generated
 */
public interface Inventory extends EObject {
	/**
	 * Returns the value of the '<em><b>Total Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Capacity</em>' attribute.
	 * @see #setTotalCapacity(int)
	 * @see VendingMachine.VendingMachinePackage#getInventory_TotalCapacity()
	 * @model required="true"
	 * @generated
	 */
	int getTotalCapacity();

	/**
	 * Sets the value of the '{@link VendingMachine.Inventory#getTotalCapacity <em>Total Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Capacity</em>' attribute.
	 * @see #getTotalCapacity()
	 * @generated
	 */
	void setTotalCapacity(int value);

	/**
	 * Returns the value of the '<em><b>Last Restocked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Restocked</em>' attribute.
	 * @see #setLastRestocked(Date)
	 * @see VendingMachine.VendingMachinePackage#getInventory_LastRestocked()
	 * @model required="true"
	 * @generated
	 */
	Date getLastRestocked();

	/**
	 * Sets the value of the '{@link VendingMachine.Inventory#getLastRestocked <em>Last Restocked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Restocked</em>' attribute.
	 * @see #getLastRestocked()
	 * @generated
	 */
	void setLastRestocked(Date value);

	/**
	 * Returns the value of the '<em><b>Item Group</b></em>' containment reference list.
	 * The list contents are of type {@link VendingMachine.ItemGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Group</em>' containment reference list.
	 * @see VendingMachine.VendingMachinePackage#getInventory_ItemGroup()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ItemGroup> getItemGroup();

} // Inventory
