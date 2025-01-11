/**
 */
package VendingMachine;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link VendingMachine.Item#getExpiry <em>Expiry</em>}</li>
 *   <li>{@link VendingMachine.Item#getGroup <em>Group</em>}</li>
 * </ul>
 *
 * @see VendingMachine.VendingMachinePackage#getItem()
 * @model
 * @generated
 */
public interface Item extends ID {
	/**
	 * Returns the value of the '<em><b>Expiry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expiry</em>' attribute.
	 * @see #setExpiry(Date)
	 * @see VendingMachine.VendingMachinePackage#getItem_Expiry()
	 * @model required="true"
	 * @generated
	 */
	Date getExpiry();

	/**
	 * Sets the value of the '{@link VendingMachine.Item#getExpiry <em>Expiry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expiry</em>' attribute.
	 * @see #getExpiry()
	 * @generated
	 */
	void setExpiry(Date value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link VendingMachine.ItemGroup#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' container reference.
	 * @see #setGroup(ItemGroup)
	 * @see VendingMachine.VendingMachinePackage#getItem_Group()
	 * @see VendingMachine.ItemGroup#getItem
	 * @model opposite="Item" transient="false"
	 * @generated
	 */
	ItemGroup getGroup();

	/**
	 * Sets the value of the '{@link VendingMachine.Item#getGroup <em>Group</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' container reference.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(ItemGroup value);

} // Item
