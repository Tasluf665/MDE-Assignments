/**
 */
package VendingMachine.impl;

import VendingMachine.HasId;
import VendingMachine.HasOperation;
import VendingMachine.Inventory;
import VendingMachine.Item;
import VendingMachine.ItemGroup;
import VendingMachine.ItemProcessor;
import VendingMachine.Keypad;
import VendingMachine.Location;
import VendingMachine.Name;
import VendingMachine.PaymentMethod;
import VendingMachine.PaymentProcessor;
import VendingMachine.State;
import VendingMachine.StateOperations;
import VendingMachine.States;
import VendingMachine.VendingMachine;
import VendingMachine.VendingMachineFactory;
import VendingMachine.VendingMachinePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VendingMachinePackageImpl extends EPackageImpl implements VendingMachinePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hasOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hasIdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keypadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paymentProcessorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemProcessorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inventoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vendingMachineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum paymentMethodEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum statesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum stateOperationsEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see VendingMachine.VendingMachinePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private VendingMachinePackageImpl() {
		super(eNS_URI, VendingMachineFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link VendingMachinePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static VendingMachinePackage init() {
		if (isInited) return (VendingMachinePackage)EPackage.Registry.INSTANCE.getEPackage(VendingMachinePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredVendingMachinePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		VendingMachinePackageImpl theVendingMachinePackage = registeredVendingMachinePackage instanceof VendingMachinePackageImpl ? (VendingMachinePackageImpl)registeredVendingMachinePackage : new VendingMachinePackageImpl();

		isInited = true;

		// Create package meta-data objects
		theVendingMachinePackage.createPackageContents();

		// Initialize created meta-data
		theVendingMachinePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theVendingMachinePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(VendingMachinePackage.eNS_URI, theVendingMachinePackage);
		return theVendingMachinePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getName_() {
		return nameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getName_Name() {
		return (EAttribute)nameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLocation() {
		return locationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLocation_Lattitude() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLocation_Longitude() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLocation_Location() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHasOperation() {
		return hasOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHasOperation_Operations() {
		return (EAttribute)hasOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getItem() {
		return itemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getItem_Expiry() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getItem_Group() {
		return (EReference)itemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHasId() {
		return hasIdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHasId_Id() {
		return (EAttribute)hasIdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKeypad() {
		return keypadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKeypad_Input() {
		return (EAttribute)keypadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKeypad_State() {
		return (EReference)keypadEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPaymentProcessor() {
		return paymentProcessorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentProcessor_PaymentMethod() {
		return (EAttribute)paymentProcessorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentProcessor_PaymentAmount() {
		return (EAttribute)paymentProcessorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPaymentProcessor_State() {
		return (EReference)paymentProcessorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getItemGroup() {
		return itemGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getItemGroup_Quantity() {
		return (EAttribute)itemGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getItemGroup_Price() {
		return (EAttribute)itemGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getItemGroup_Image() {
		return (EAttribute)itemGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getItemGroup_Item() {
		return (EReference)itemGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getState() {
		return stateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getState_Stage() {
		return (EAttribute)stateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getItemProcessor() {
		return itemProcessorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getItemProcessor_State() {
		return (EReference)itemProcessorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInventory() {
		return inventoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInventory_TotalCapacity() {
		return (EAttribute)inventoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInventory_LastRestocked() {
		return (EAttribute)inventoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInventory_ItemGroup() {
		return (EReference)inventoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVendingMachine() {
		return vendingMachineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVendingMachine_Inventory() {
		return (EReference)vendingMachineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVendingMachine_State() {
		return (EReference)vendingMachineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVendingMachine_PaymentProcessor() {
		return (EReference)vendingMachineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVendingMachine_ItemProcessor() {
		return (EReference)vendingMachineEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVendingMachine_Keypad() {
		return (EReference)vendingMachineEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVendingMachine_Location() {
		return (EReference)vendingMachineEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPaymentMethod() {
		return paymentMethodEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getStates() {
		return statesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getStateOperations() {
		return stateOperationsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VendingMachineFactory getVendingMachineFactory() {
		return (VendingMachineFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		nameEClass = createEClass(NAME);
		createEAttribute(nameEClass, NAME__NAME);

		locationEClass = createEClass(LOCATION);
		createEAttribute(locationEClass, LOCATION__LATTITUDE);
		createEAttribute(locationEClass, LOCATION__LONGITUDE);
		createEAttribute(locationEClass, LOCATION__LOCATION);

		hasOperationEClass = createEClass(HAS_OPERATION);
		createEAttribute(hasOperationEClass, HAS_OPERATION__OPERATIONS);

		itemEClass = createEClass(ITEM);
		createEAttribute(itemEClass, ITEM__EXPIRY);
		createEReference(itemEClass, ITEM__GROUP);

		hasIdEClass = createEClass(HAS_ID);
		createEAttribute(hasIdEClass, HAS_ID__ID);

		keypadEClass = createEClass(KEYPAD);
		createEAttribute(keypadEClass, KEYPAD__INPUT);
		createEReference(keypadEClass, KEYPAD__STATE);

		paymentProcessorEClass = createEClass(PAYMENT_PROCESSOR);
		createEAttribute(paymentProcessorEClass, PAYMENT_PROCESSOR__PAYMENT_METHOD);
		createEAttribute(paymentProcessorEClass, PAYMENT_PROCESSOR__PAYMENT_AMOUNT);
		createEReference(paymentProcessorEClass, PAYMENT_PROCESSOR__STATE);

		itemGroupEClass = createEClass(ITEM_GROUP);
		createEAttribute(itemGroupEClass, ITEM_GROUP__QUANTITY);
		createEAttribute(itemGroupEClass, ITEM_GROUP__PRICE);
		createEAttribute(itemGroupEClass, ITEM_GROUP__IMAGE);
		createEReference(itemGroupEClass, ITEM_GROUP__ITEM);

		stateEClass = createEClass(STATE);
		createEAttribute(stateEClass, STATE__STAGE);

		itemProcessorEClass = createEClass(ITEM_PROCESSOR);
		createEReference(itemProcessorEClass, ITEM_PROCESSOR__STATE);

		inventoryEClass = createEClass(INVENTORY);
		createEAttribute(inventoryEClass, INVENTORY__TOTAL_CAPACITY);
		createEAttribute(inventoryEClass, INVENTORY__LAST_RESTOCKED);
		createEReference(inventoryEClass, INVENTORY__ITEM_GROUP);

		vendingMachineEClass = createEClass(VENDING_MACHINE);
		createEReference(vendingMachineEClass, VENDING_MACHINE__INVENTORY);
		createEReference(vendingMachineEClass, VENDING_MACHINE__STATE);
		createEReference(vendingMachineEClass, VENDING_MACHINE__PAYMENT_PROCESSOR);
		createEReference(vendingMachineEClass, VENDING_MACHINE__ITEM_PROCESSOR);
		createEReference(vendingMachineEClass, VENDING_MACHINE__KEYPAD);
		createEReference(vendingMachineEClass, VENDING_MACHINE__LOCATION);

		// Create enums
		paymentMethodEEnum = createEEnum(PAYMENT_METHOD);
		statesEEnum = createEEnum(STATES);
		stateOperationsEEnum = createEEnum(STATE_OPERATIONS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		itemEClass.getESuperTypes().add(this.getHasId());
		keypadEClass.getESuperTypes().add(this.getHasOperation());
		paymentProcessorEClass.getESuperTypes().add(this.getHasOperation());
		itemGroupEClass.getESuperTypes().add(this.getName_());
		itemGroupEClass.getESuperTypes().add(this.getHasId());
		itemProcessorEClass.getESuperTypes().add(this.getHasOperation());
		vendingMachineEClass.getESuperTypes().add(this.getName_());
		vendingMachineEClass.getESuperTypes().add(this.getHasId());

		// Initialize classes, features, and operations; add parameters
		initEClass(nameEClass, Name.class, "Name", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getName_Name(), ecorePackage.getEString(), "name", null, 1, 1, Name.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locationEClass, Location.class, "Location", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocation_Lattitude(), ecorePackage.getEFloat(), "lattitude", null, 0, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocation_Longitude(), ecorePackage.getEFloat(), "longitude", null, 0, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocation_Location(), ecorePackage.getEString(), "location", null, 1, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hasOperationEClass, HasOperation.class, "HasOperation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHasOperation_Operations(), this.getStateOperations(), "operations", null, 1, 1, HasOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(itemEClass, Item.class, "Item", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getItem_Expiry(), ecorePackage.getEDate(), "expiry", null, 1, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItem_Group(), this.getItemGroup(), this.getItemGroup_Item(), "group", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hasIdEClass, HasId.class, "HasId", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHasId_Id(), ecorePackage.getEInt(), "id", null, 1, 1, HasId.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(keypadEClass, Keypad.class, "Keypad", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKeypad_Input(), ecorePackage.getEString(), "input", null, 1, 1, Keypad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKeypad_State(), this.getState(), null, "state", null, 1, 1, Keypad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paymentProcessorEClass, PaymentProcessor.class, "PaymentProcessor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPaymentProcessor_PaymentMethod(), this.getPaymentMethod(), "paymentMethod", null, 1, 1, PaymentProcessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentProcessor_PaymentAmount(), ecorePackage.getEFloat(), "paymentAmount", null, 1, 1, PaymentProcessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPaymentProcessor_State(), this.getState(), null, "state", null, 1, 1, PaymentProcessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(itemGroupEClass, ItemGroup.class, "ItemGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getItemGroup_Quantity(), ecorePackage.getEInt(), "Quantity", null, 1, 1, ItemGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItemGroup_Price(), ecorePackage.getEFloat(), "Price", null, 1, 1, ItemGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItemGroup_Image(), ecorePackage.getEString(), "Image", null, 0, 1, ItemGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItemGroup_Item(), this.getItem(), this.getItem_Group(), "Item", null, 1, -1, ItemGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getState_Stage(), this.getStates(), "stage", null, 1, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(itemProcessorEClass, ItemProcessor.class, "ItemProcessor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getItemProcessor_State(), this.getState(), null, "state", null, 1, 1, ItemProcessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inventoryEClass, Inventory.class, "Inventory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInventory_TotalCapacity(), ecorePackage.getEInt(), "totalCapacity", null, 1, 1, Inventory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInventory_LastRestocked(), ecorePackage.getEDate(), "lastRestocked", null, 1, 1, Inventory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInventory_ItemGroup(), this.getItemGroup(), null, "ItemGroup", null, 1, -1, Inventory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vendingMachineEClass, VendingMachine.class, "VendingMachine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVendingMachine_Inventory(), this.getInventory(), null, "inventory", null, 1, 1, VendingMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVendingMachine_State(), this.getState(), null, "state", null, 1, 1, VendingMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVendingMachine_PaymentProcessor(), this.getPaymentProcessor(), null, "paymentProcessor", null, 1, 1, VendingMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVendingMachine_ItemProcessor(), this.getItemProcessor(), null, "itemProcessor", null, 1, 1, VendingMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVendingMachine_Keypad(), this.getKeypad(), null, "keypad", null, 1, 1, VendingMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVendingMachine_Location(), this.getLocation(), null, "location", null, 1, 1, VendingMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(paymentMethodEEnum, PaymentMethod.class, "PaymentMethod");
		addEEnumLiteral(paymentMethodEEnum, PaymentMethod.COIN);
		addEEnumLiteral(paymentMethodEEnum, PaymentMethod.APP);
		addEEnumLiteral(paymentMethodEEnum, PaymentMethod.NFC);

		initEEnum(statesEEnum, States.class, "States");
		addEEnumLiteral(statesEEnum, States.SELECT_ITEM);
		addEEnumLiteral(statesEEnum, States.WAIT_FOR_PAYMENT);
		addEEnumLiteral(statesEEnum, States.PROCESSING_PAYMENT);
		addEEnumLiteral(statesEEnum, States.PROCESSING_ITEM);
		addEEnumLiteral(statesEEnum, States.ITEM_DESPATCHED);

		initEEnum(stateOperationsEEnum, StateOperations.class, "StateOperations");
		addEEnumLiteral(stateOperationsEEnum, StateOperations.SELECT_ITEM_COLLECT_COIN);
		addEEnumLiteral(stateOperationsEEnum, StateOperations.SELECT_ITEM_SEND_INPUT);
		addEEnumLiteral(stateOperationsEEnum, StateOperations.PROCESSING_ITEM_PROCESS_ITEM);
		addEEnumLiteral(stateOperationsEEnum, StateOperations.ITEM_DISPATCHED_DISPATCH_CHANGE);
		addEEnumLiteral(stateOperationsEEnum, StateOperations.WIAT_FOR_PAYMENT_COLLECT_COIN);

		// Create resource
		createResource(eNS_URI);
	}

} //VendingMachinePackageImpl
