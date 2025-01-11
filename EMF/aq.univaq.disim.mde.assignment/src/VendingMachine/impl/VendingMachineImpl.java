/**
 */
package VendingMachine.impl;

import VendingMachine.ID;
import VendingMachine.Inventory;
import VendingMachine.ItemProcessor;
import VendingMachine.Keypad;
import VendingMachine.Location;
import VendingMachine.PaymentProcessor;
import VendingMachine.State;
import VendingMachine.VendingMachine;
import VendingMachine.VendingMachinePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vending Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link VendingMachine.impl.VendingMachineImpl#getId <em>Id</em>}</li>
 *   <li>{@link VendingMachine.impl.VendingMachineImpl#getInventory <em>Inventory</em>}</li>
 *   <li>{@link VendingMachine.impl.VendingMachineImpl#getState <em>State</em>}</li>
 *   <li>{@link VendingMachine.impl.VendingMachineImpl#getPaymentProcessor <em>Payment Processor</em>}</li>
 *   <li>{@link VendingMachine.impl.VendingMachineImpl#getItemProcessor <em>Item Processor</em>}</li>
 *   <li>{@link VendingMachine.impl.VendingMachineImpl#getKeypad <em>Keypad</em>}</li>
 *   <li>{@link VendingMachine.impl.VendingMachineImpl#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VendingMachineImpl extends NameImpl implements VendingMachine {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInventory() <em>Inventory</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInventory()
	 * @generated
	 * @ordered
	 */
	protected Inventory inventory;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected State state;

	/**
	 * The cached value of the '{@link #getPaymentProcessor() <em>Payment Processor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentProcessor()
	 * @generated
	 * @ordered
	 */
	protected PaymentProcessor paymentProcessor;

	/**
	 * The cached value of the '{@link #getItemProcessor() <em>Item Processor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemProcessor()
	 * @generated
	 * @ordered
	 */
	protected ItemProcessor itemProcessor;

	/**
	 * The cached value of the '{@link #getKeypad() <em>Keypad</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeypad()
	 * @generated
	 * @ordered
	 */
	protected Keypad keypad;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected Location location;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VendingMachineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VendingMachinePackage.Literals.VENDING_MACHINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VendingMachinePackage.VENDING_MACHINE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Inventory getInventory() {
		return inventory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInventory(Inventory newInventory, NotificationChain msgs) {
		Inventory oldInventory = inventory;
		inventory = newInventory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VendingMachinePackage.VENDING_MACHINE__INVENTORY, oldInventory, newInventory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInventory(Inventory newInventory) {
		if (newInventory != inventory) {
			NotificationChain msgs = null;
			if (inventory != null)
				msgs = ((InternalEObject)inventory).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VendingMachinePackage.VENDING_MACHINE__INVENTORY, null, msgs);
			if (newInventory != null)
				msgs = ((InternalEObject)newInventory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VendingMachinePackage.VENDING_MACHINE__INVENTORY, null, msgs);
			msgs = basicSetInventory(newInventory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VendingMachinePackage.VENDING_MACHINE__INVENTORY, newInventory, newInventory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public State getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetState(State newState, NotificationChain msgs) {
		State oldState = state;
		state = newState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VendingMachinePackage.VENDING_MACHINE__STATE, oldState, newState);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setState(State newState) {
		if (newState != state) {
			NotificationChain msgs = null;
			if (state != null)
				msgs = ((InternalEObject)state).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VendingMachinePackage.VENDING_MACHINE__STATE, null, msgs);
			if (newState != null)
				msgs = ((InternalEObject)newState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VendingMachinePackage.VENDING_MACHINE__STATE, null, msgs);
			msgs = basicSetState(newState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VendingMachinePackage.VENDING_MACHINE__STATE, newState, newState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentProcessor getPaymentProcessor() {
		return paymentProcessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPaymentProcessor(PaymentProcessor newPaymentProcessor, NotificationChain msgs) {
		PaymentProcessor oldPaymentProcessor = paymentProcessor;
		paymentProcessor = newPaymentProcessor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VendingMachinePackage.VENDING_MACHINE__PAYMENT_PROCESSOR, oldPaymentProcessor, newPaymentProcessor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentProcessor(PaymentProcessor newPaymentProcessor) {
		if (newPaymentProcessor != paymentProcessor) {
			NotificationChain msgs = null;
			if (paymentProcessor != null)
				msgs = ((InternalEObject)paymentProcessor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VendingMachinePackage.VENDING_MACHINE__PAYMENT_PROCESSOR, null, msgs);
			if (newPaymentProcessor != null)
				msgs = ((InternalEObject)newPaymentProcessor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VendingMachinePackage.VENDING_MACHINE__PAYMENT_PROCESSOR, null, msgs);
			msgs = basicSetPaymentProcessor(newPaymentProcessor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VendingMachinePackage.VENDING_MACHINE__PAYMENT_PROCESSOR, newPaymentProcessor, newPaymentProcessor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ItemProcessor getItemProcessor() {
		return itemProcessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItemProcessor(ItemProcessor newItemProcessor, NotificationChain msgs) {
		ItemProcessor oldItemProcessor = itemProcessor;
		itemProcessor = newItemProcessor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VendingMachinePackage.VENDING_MACHINE__ITEM_PROCESSOR, oldItemProcessor, newItemProcessor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setItemProcessor(ItemProcessor newItemProcessor) {
		if (newItemProcessor != itemProcessor) {
			NotificationChain msgs = null;
			if (itemProcessor != null)
				msgs = ((InternalEObject)itemProcessor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VendingMachinePackage.VENDING_MACHINE__ITEM_PROCESSOR, null, msgs);
			if (newItemProcessor != null)
				msgs = ((InternalEObject)newItemProcessor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VendingMachinePackage.VENDING_MACHINE__ITEM_PROCESSOR, null, msgs);
			msgs = basicSetItemProcessor(newItemProcessor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VendingMachinePackage.VENDING_MACHINE__ITEM_PROCESSOR, newItemProcessor, newItemProcessor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Keypad getKeypad() {
		return keypad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKeypad(Keypad newKeypad, NotificationChain msgs) {
		Keypad oldKeypad = keypad;
		keypad = newKeypad;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VendingMachinePackage.VENDING_MACHINE__KEYPAD, oldKeypad, newKeypad);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKeypad(Keypad newKeypad) {
		if (newKeypad != keypad) {
			NotificationChain msgs = null;
			if (keypad != null)
				msgs = ((InternalEObject)keypad).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VendingMachinePackage.VENDING_MACHINE__KEYPAD, null, msgs);
			if (newKeypad != null)
				msgs = ((InternalEObject)newKeypad).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VendingMachinePackage.VENDING_MACHINE__KEYPAD, null, msgs);
			msgs = basicSetKeypad(newKeypad, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VendingMachinePackage.VENDING_MACHINE__KEYPAD, newKeypad, newKeypad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Location getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(Location newLocation, NotificationChain msgs) {
		Location oldLocation = location;
		location = newLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VendingMachinePackage.VENDING_MACHINE__LOCATION, oldLocation, newLocation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocation(Location newLocation) {
		if (newLocation != location) {
			NotificationChain msgs = null;
			if (location != null)
				msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VendingMachinePackage.VENDING_MACHINE__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VendingMachinePackage.VENDING_MACHINE__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VendingMachinePackage.VENDING_MACHINE__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VendingMachinePackage.VENDING_MACHINE__INVENTORY:
				return basicSetInventory(null, msgs);
			case VendingMachinePackage.VENDING_MACHINE__STATE:
				return basicSetState(null, msgs);
			case VendingMachinePackage.VENDING_MACHINE__PAYMENT_PROCESSOR:
				return basicSetPaymentProcessor(null, msgs);
			case VendingMachinePackage.VENDING_MACHINE__ITEM_PROCESSOR:
				return basicSetItemProcessor(null, msgs);
			case VendingMachinePackage.VENDING_MACHINE__KEYPAD:
				return basicSetKeypad(null, msgs);
			case VendingMachinePackage.VENDING_MACHINE__LOCATION:
				return basicSetLocation(null, msgs);
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
			case VendingMachinePackage.VENDING_MACHINE__ID:
				return getId();
			case VendingMachinePackage.VENDING_MACHINE__INVENTORY:
				return getInventory();
			case VendingMachinePackage.VENDING_MACHINE__STATE:
				return getState();
			case VendingMachinePackage.VENDING_MACHINE__PAYMENT_PROCESSOR:
				return getPaymentProcessor();
			case VendingMachinePackage.VENDING_MACHINE__ITEM_PROCESSOR:
				return getItemProcessor();
			case VendingMachinePackage.VENDING_MACHINE__KEYPAD:
				return getKeypad();
			case VendingMachinePackage.VENDING_MACHINE__LOCATION:
				return getLocation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VendingMachinePackage.VENDING_MACHINE__ID:
				setId((Integer)newValue);
				return;
			case VendingMachinePackage.VENDING_MACHINE__INVENTORY:
				setInventory((Inventory)newValue);
				return;
			case VendingMachinePackage.VENDING_MACHINE__STATE:
				setState((State)newValue);
				return;
			case VendingMachinePackage.VENDING_MACHINE__PAYMENT_PROCESSOR:
				setPaymentProcessor((PaymentProcessor)newValue);
				return;
			case VendingMachinePackage.VENDING_MACHINE__ITEM_PROCESSOR:
				setItemProcessor((ItemProcessor)newValue);
				return;
			case VendingMachinePackage.VENDING_MACHINE__KEYPAD:
				setKeypad((Keypad)newValue);
				return;
			case VendingMachinePackage.VENDING_MACHINE__LOCATION:
				setLocation((Location)newValue);
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
			case VendingMachinePackage.VENDING_MACHINE__ID:
				setId(ID_EDEFAULT);
				return;
			case VendingMachinePackage.VENDING_MACHINE__INVENTORY:
				setInventory((Inventory)null);
				return;
			case VendingMachinePackage.VENDING_MACHINE__STATE:
				setState((State)null);
				return;
			case VendingMachinePackage.VENDING_MACHINE__PAYMENT_PROCESSOR:
				setPaymentProcessor((PaymentProcessor)null);
				return;
			case VendingMachinePackage.VENDING_MACHINE__ITEM_PROCESSOR:
				setItemProcessor((ItemProcessor)null);
				return;
			case VendingMachinePackage.VENDING_MACHINE__KEYPAD:
				setKeypad((Keypad)null);
				return;
			case VendingMachinePackage.VENDING_MACHINE__LOCATION:
				setLocation((Location)null);
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
			case VendingMachinePackage.VENDING_MACHINE__ID:
				return id != ID_EDEFAULT;
			case VendingMachinePackage.VENDING_MACHINE__INVENTORY:
				return inventory != null;
			case VendingMachinePackage.VENDING_MACHINE__STATE:
				return state != null;
			case VendingMachinePackage.VENDING_MACHINE__PAYMENT_PROCESSOR:
				return paymentProcessor != null;
			case VendingMachinePackage.VENDING_MACHINE__ITEM_PROCESSOR:
				return itemProcessor != null;
			case VendingMachinePackage.VENDING_MACHINE__KEYPAD:
				return keypad != null;
			case VendingMachinePackage.VENDING_MACHINE__LOCATION:
				return location != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ID.class) {
			switch (derivedFeatureID) {
				case VendingMachinePackage.VENDING_MACHINE__ID: return VendingMachinePackage.ID__ID;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ID.class) {
			switch (baseFeatureID) {
				case VendingMachinePackage.ID__ID: return VendingMachinePackage.VENDING_MACHINE__ID;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //VendingMachineImpl
