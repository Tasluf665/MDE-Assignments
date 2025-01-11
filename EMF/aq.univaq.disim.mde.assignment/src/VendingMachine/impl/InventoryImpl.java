/**
 */
package VendingMachine.impl;

import VendingMachine.Inventory;
import VendingMachine.ItemGroup;
import VendingMachine.VendingMachinePackage;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inventory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link VendingMachine.impl.InventoryImpl#getTotalCapacity <em>Total Capacity</em>}</li>
 *   <li>{@link VendingMachine.impl.InventoryImpl#getLastRestocked <em>Last Restocked</em>}</li>
 *   <li>{@link VendingMachine.impl.InventoryImpl#getItemGroup <em>Item Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InventoryImpl extends MinimalEObjectImpl.Container implements Inventory {
	/**
	 * The default value of the '{@link #getTotalCapacity() <em>Total Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final int TOTAL_CAPACITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTotalCapacity() <em>Total Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalCapacity()
	 * @generated
	 * @ordered
	 */
	protected int totalCapacity = TOTAL_CAPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastRestocked() <em>Last Restocked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastRestocked()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_RESTOCKED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastRestocked() <em>Last Restocked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastRestocked()
	 * @generated
	 * @ordered
	 */
	protected Date lastRestocked = LAST_RESTOCKED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getItemGroup() <em>Item Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<ItemGroup> itemGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InventoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VendingMachinePackage.Literals.INVENTORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTotalCapacity() {
		return totalCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalCapacity(int newTotalCapacity) {
		int oldTotalCapacity = totalCapacity;
		totalCapacity = newTotalCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VendingMachinePackage.INVENTORY__TOTAL_CAPACITY, oldTotalCapacity, totalCapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastRestocked() {
		return lastRestocked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastRestocked(Date newLastRestocked) {
		Date oldLastRestocked = lastRestocked;
		lastRestocked = newLastRestocked;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VendingMachinePackage.INVENTORY__LAST_RESTOCKED, oldLastRestocked, lastRestocked));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ItemGroup> getItemGroup() {
		if (itemGroup == null) {
			itemGroup = new EObjectContainmentEList<ItemGroup>(ItemGroup.class, this, VendingMachinePackage.INVENTORY__ITEM_GROUP);
		}
		return itemGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VendingMachinePackage.INVENTORY__ITEM_GROUP:
				return ((InternalEList<?>)getItemGroup()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VendingMachinePackage.INVENTORY__TOTAL_CAPACITY:
				return getTotalCapacity();
			case VendingMachinePackage.INVENTORY__LAST_RESTOCKED:
				return getLastRestocked();
			case VendingMachinePackage.INVENTORY__ITEM_GROUP:
				return getItemGroup();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VendingMachinePackage.INVENTORY__TOTAL_CAPACITY:
				setTotalCapacity((Integer)newValue);
				return;
			case VendingMachinePackage.INVENTORY__LAST_RESTOCKED:
				setLastRestocked((Date)newValue);
				return;
			case VendingMachinePackage.INVENTORY__ITEM_GROUP:
				getItemGroup().clear();
				getItemGroup().addAll((Collection<? extends ItemGroup>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case VendingMachinePackage.INVENTORY__TOTAL_CAPACITY:
				setTotalCapacity(TOTAL_CAPACITY_EDEFAULT);
				return;
			case VendingMachinePackage.INVENTORY__LAST_RESTOCKED:
				setLastRestocked(LAST_RESTOCKED_EDEFAULT);
				return;
			case VendingMachinePackage.INVENTORY__ITEM_GROUP:
				getItemGroup().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case VendingMachinePackage.INVENTORY__TOTAL_CAPACITY:
				return totalCapacity != TOTAL_CAPACITY_EDEFAULT;
			case VendingMachinePackage.INVENTORY__LAST_RESTOCKED:
				return LAST_RESTOCKED_EDEFAULT == null ? lastRestocked != null : !LAST_RESTOCKED_EDEFAULT.equals(lastRestocked);
			case VendingMachinePackage.INVENTORY__ITEM_GROUP:
				return itemGroup != null && !itemGroup.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (totalCapacity: ");
		result.append(totalCapacity);
		result.append(", lastRestocked: ");
		result.append(lastRestocked);
		result.append(')');
		return result.toString();
	}

} //InventoryImpl
