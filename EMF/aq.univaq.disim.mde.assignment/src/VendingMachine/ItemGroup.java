/**
 */
package VendingMachine;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link VendingMachine.ItemGroup#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link VendingMachine.ItemGroup#getPrice <em>Price</em>}</li>
 *   <li>{@link VendingMachine.ItemGroup#getImage <em>Image</em>}</li>
 *   <li>{@link VendingMachine.ItemGroup#getItem <em>Item</em>}</li>
 * </ul>
 *
 * @see VendingMachine.VendingMachinePackage#getItemGroup()
 * @model
 * @generated
 */
public interface ItemGroup extends Name, ID {
	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #setQuantity(int)
	 * @see VendingMachine.VendingMachinePackage#getItemGroup_Quantity()
	 * @model required="true"
	 * @generated
	 */
	int getQuantity();

	/**
	 * Sets the value of the '{@link VendingMachine.ItemGroup#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(int value);

	/**
	 * Returns the value of the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price</em>' attribute.
	 * @see #setPrice(float)
	 * @see VendingMachine.VendingMachinePackage#getItemGroup_Price()
	 * @model required="true"
	 * @generated
	 */
	float getPrice();

	/**
	 * Sets the value of the '{@link VendingMachine.ItemGroup#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' attribute.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(float value);

	/**
	 * Returns the value of the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' attribute.
	 * @see #setImage(String)
	 * @see VendingMachine.VendingMachinePackage#getItemGroup_Image()
	 * @model
	 * @generated
	 */
	String getImage();

	/**
	 * Sets the value of the '{@link VendingMachine.ItemGroup#getImage <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' attribute.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(String value);

	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference list.
	 * The list contents are of type {@link VendingMachine.Item}.
	 * It is bidirectional and its opposite is '{@link VendingMachine.Item#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' containment reference list.
	 * @see VendingMachine.VendingMachinePackage#getItemGroup_Item()
	 * @see VendingMachine.Item#getGroup
	 * @model opposite="group" containment="true" required="true"
	 * @generated
	 */
	EList<Item> getItem();

} // ItemGroup
