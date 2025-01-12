/**
 */
package VendingMachine;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import VendingMachine.impl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see VendingMachine.VendingMachineFactory
 * @model kind="package"
 * @generated
 */
public interface VendingMachinePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "VendingMachine";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://aq.univaq.disim.mde.assignment/VM";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "VM";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VendingMachinePackage eINSTANCE = VendingMachinePackageImpl.init();

	/**
	 * The meta object id for the '{@link VendingMachine.impl.NameImpl <em>Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VendingMachine.impl.NameImpl
	 * @see VendingMachine.impl.VendingMachinePackageImpl#getName_()
	 * @generated
	 */
	int NAME = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME__NAME = 0;

	/**
	 * The number of structural features of the '<em>Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link VendingMachine.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VendingMachine.impl.LocationImpl
	 * @see VendingMachine.impl.VendingMachinePackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 1;

	/**
	 * The feature id for the '<em><b>Lattitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__LATTITUDE = 0;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__LONGITUDE = 1;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__LOCATION = 2;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link VendingMachine.impl.HasOperationImpl <em>Has Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VendingMachine.impl.HasOperationImpl
	 * @see VendingMachine.impl.VendingMachinePackageImpl#getHasOperation()
	 * @generated
	 */
	int HAS_OPERATION = 2;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_OPERATION__OPERATIONS = 0;

	/**
	 * The number of structural features of the '<em>Has Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_OPERATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Has Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_OPERATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link VendingMachine.HasId <em>Has Id</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VendingMachine.HasId
	 * @see VendingMachine.impl.VendingMachinePackageImpl#getHasId()
	 * @generated
	 */
	int HAS_ID = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_ID__ID = 0;

	/**
	 * The number of structural features of the '<em>Has Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_ID_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Has Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_ID_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link VendingMachine.impl.ItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VendingMachine.impl.ItemImpl
	 * @see VendingMachine.impl.VendingMachinePackageImpl#getItem()
	 * @generated
	 */
	int ITEM = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__ID = HAS_ID__ID;

	/**
	 * The feature id for the '<em><b>Expiry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__EXPIRY = HAS_ID_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__GROUP = HAS_ID_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE_COUNT = HAS_ID_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_OPERATION_COUNT = HAS_ID_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link VendingMachine.impl.KeypadImpl <em>Keypad</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VendingMachine.impl.KeypadImpl
	 * @see VendingMachine.impl.VendingMachinePackageImpl#getKeypad()
	 * @generated
	 */
	int KEYPAD = 5;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYPAD__OPERATIONS = HAS_OPERATION__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYPAD__INPUT = HAS_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYPAD__STATE = HAS_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Keypad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYPAD_FEATURE_COUNT = HAS_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Keypad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYPAD_OPERATION_COUNT = HAS_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link VendingMachine.impl.PaymentProcessorImpl <em>Payment Processor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VendingMachine.impl.PaymentProcessorImpl
	 * @see VendingMachine.impl.VendingMachinePackageImpl#getPaymentProcessor()
	 * @generated
	 */
	int PAYMENT_PROCESSOR = 6;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_PROCESSOR__OPERATIONS = HAS_OPERATION__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Payment Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_PROCESSOR__PAYMENT_METHOD = HAS_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Payment Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_PROCESSOR__PAYMENT_AMOUNT = HAS_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_PROCESSOR__STATE = HAS_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Payment Processor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_PROCESSOR_FEATURE_COUNT = HAS_OPERATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Payment Processor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_PROCESSOR_OPERATION_COUNT = HAS_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link VendingMachine.impl.ItemGroupImpl <em>Item Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VendingMachine.impl.ItemGroupImpl
	 * @see VendingMachine.impl.VendingMachinePackageImpl#getItemGroup()
	 * @generated
	 */
	int ITEM_GROUP = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_GROUP__NAME = NAME__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_GROUP__ID = NAME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_GROUP__QUANTITY = NAME_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_GROUP__PRICE = NAME_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_GROUP__IMAGE = NAME_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_GROUP__ITEM = NAME_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Item Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_GROUP_FEATURE_COUNT = NAME_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Item Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_GROUP_OPERATION_COUNT = NAME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link VendingMachine.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VendingMachine.impl.StateImpl
	 * @see VendingMachine.impl.VendingMachinePackageImpl#getState()
	 * @generated
	 */
	int STATE = 8;

	/**
	 * The feature id for the '<em><b>Stage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__STAGE = 0;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link VendingMachine.impl.ItemProcessorImpl <em>Item Processor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VendingMachine.impl.ItemProcessorImpl
	 * @see VendingMachine.impl.VendingMachinePackageImpl#getItemProcessor()
	 * @generated
	 */
	int ITEM_PROCESSOR = 9;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_PROCESSOR__OPERATIONS = HAS_OPERATION__OPERATIONS;

	/**
	 * The feature id for the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_PROCESSOR__STATE = HAS_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Item Processor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_PROCESSOR_FEATURE_COUNT = HAS_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Item Processor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_PROCESSOR_OPERATION_COUNT = HAS_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link VendingMachine.impl.InventoryImpl <em>Inventory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VendingMachine.impl.InventoryImpl
	 * @see VendingMachine.impl.VendingMachinePackageImpl#getInventory()
	 * @generated
	 */
	int INVENTORY = 10;

	/**
	 * The feature id for the '<em><b>Total Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY__TOTAL_CAPACITY = 0;

	/**
	 * The feature id for the '<em><b>Last Restocked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY__LAST_RESTOCKED = 1;

	/**
	 * The feature id for the '<em><b>Item Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY__ITEM_GROUP = 2;

	/**
	 * The number of structural features of the '<em>Inventory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Inventory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link VendingMachine.impl.VendingMachineImpl <em>Vending Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VendingMachine.impl.VendingMachineImpl
	 * @see VendingMachine.impl.VendingMachinePackageImpl#getVendingMachine()
	 * @generated
	 */
	int VENDING_MACHINE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDING_MACHINE__NAME = NAME__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDING_MACHINE__ID = NAME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inventory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDING_MACHINE__INVENTORY = NAME_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDING_MACHINE__STATE = NAME_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Payment Processor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDING_MACHINE__PAYMENT_PROCESSOR = NAME_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Item Processor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDING_MACHINE__ITEM_PROCESSOR = NAME_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Keypad</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDING_MACHINE__KEYPAD = NAME_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDING_MACHINE__LOCATION = NAME_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Vending Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDING_MACHINE_FEATURE_COUNT = NAME_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Vending Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDING_MACHINE_OPERATION_COUNT = NAME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link VendingMachine.PaymentMethod <em>Payment Method</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VendingMachine.PaymentMethod
	 * @see VendingMachine.impl.VendingMachinePackageImpl#getPaymentMethod()
	 * @generated
	 */
	int PAYMENT_METHOD = 12;

	/**
	 * The meta object id for the '{@link VendingMachine.States <em>States</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VendingMachine.States
	 * @see VendingMachine.impl.VendingMachinePackageImpl#getStates()
	 * @generated
	 */
	int STATES = 13;

	/**
	 * The meta object id for the '{@link VendingMachine.StateOperations <em>State Operations</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VendingMachine.StateOperations
	 * @see VendingMachine.impl.VendingMachinePackageImpl#getStateOperations()
	 * @generated
	 */
	int STATE_OPERATIONS = 14;


	/**
	 * Returns the meta object for class '{@link VendingMachine.Name <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name</em>'.
	 * @see VendingMachine.Name
	 * @generated
	 */
	EClass getName_();

	/**
	 * Returns the meta object for the attribute '{@link VendingMachine.Name#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see VendingMachine.Name#getName()
	 * @see #getName_()
	 * @generated
	 */
	EAttribute getName_Name();

	/**
	 * Returns the meta object for class '{@link VendingMachine.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see VendingMachine.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the attribute '{@link VendingMachine.Location#getLattitude <em>Lattitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lattitude</em>'.
	 * @see VendingMachine.Location#getLattitude()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Lattitude();

	/**
	 * Returns the meta object for the attribute '{@link VendingMachine.Location#getLongitude <em>Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Longitude</em>'.
	 * @see VendingMachine.Location#getLongitude()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Longitude();

	/**
	 * Returns the meta object for the attribute '{@link VendingMachine.Location#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see VendingMachine.Location#getLocation()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Location();

	/**
	 * Returns the meta object for class '{@link VendingMachine.HasOperation <em>Has Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Has Operation</em>'.
	 * @see VendingMachine.HasOperation
	 * @generated
	 */
	EClass getHasOperation();

	/**
	 * Returns the meta object for the attribute '{@link VendingMachine.HasOperation#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operations</em>'.
	 * @see VendingMachine.HasOperation#getOperations()
	 * @see #getHasOperation()
	 * @generated
	 */
	EAttribute getHasOperation_Operations();

	/**
	 * Returns the meta object for class '{@link VendingMachine.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see VendingMachine.Item
	 * @generated
	 */
	EClass getItem();

	/**
	 * Returns the meta object for the attribute '{@link VendingMachine.Item#getExpiry <em>Expiry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expiry</em>'.
	 * @see VendingMachine.Item#getExpiry()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Expiry();

	/**
	 * Returns the meta object for the container reference '{@link VendingMachine.Item#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Group</em>'.
	 * @see VendingMachine.Item#getGroup()
	 * @see #getItem()
	 * @generated
	 */
	EReference getItem_Group();

	/**
	 * Returns the meta object for class '{@link VendingMachine.HasId <em>Has Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Has Id</em>'.
	 * @see VendingMachine.HasId
	 * @generated
	 */
	EClass getHasId();

	/**
	 * Returns the meta object for the attribute '{@link VendingMachine.HasId#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see VendingMachine.HasId#getId()
	 * @see #getHasId()
	 * @generated
	 */
	EAttribute getHasId_Id();

	/**
	 * Returns the meta object for class '{@link VendingMachine.Keypad <em>Keypad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Keypad</em>'.
	 * @see VendingMachine.Keypad
	 * @generated
	 */
	EClass getKeypad();

	/**
	 * Returns the meta object for the attribute '{@link VendingMachine.Keypad#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input</em>'.
	 * @see VendingMachine.Keypad#getInput()
	 * @see #getKeypad()
	 * @generated
	 */
	EAttribute getKeypad_Input();

	/**
	 * Returns the meta object for the reference '{@link VendingMachine.Keypad#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>State</em>'.
	 * @see VendingMachine.Keypad#getState()
	 * @see #getKeypad()
	 * @generated
	 */
	EReference getKeypad_State();

	/**
	 * Returns the meta object for class '{@link VendingMachine.PaymentProcessor <em>Payment Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Payment Processor</em>'.
	 * @see VendingMachine.PaymentProcessor
	 * @generated
	 */
	EClass getPaymentProcessor();

	/**
	 * Returns the meta object for the attribute '{@link VendingMachine.PaymentProcessor#getPaymentMethod <em>Payment Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment Method</em>'.
	 * @see VendingMachine.PaymentProcessor#getPaymentMethod()
	 * @see #getPaymentProcessor()
	 * @generated
	 */
	EAttribute getPaymentProcessor_PaymentMethod();

	/**
	 * Returns the meta object for the attribute '{@link VendingMachine.PaymentProcessor#getPaymentAmount <em>Payment Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment Amount</em>'.
	 * @see VendingMachine.PaymentProcessor#getPaymentAmount()
	 * @see #getPaymentProcessor()
	 * @generated
	 */
	EAttribute getPaymentProcessor_PaymentAmount();

	/**
	 * Returns the meta object for the reference '{@link VendingMachine.PaymentProcessor#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>State</em>'.
	 * @see VendingMachine.PaymentProcessor#getState()
	 * @see #getPaymentProcessor()
	 * @generated
	 */
	EReference getPaymentProcessor_State();

	/**
	 * Returns the meta object for class '{@link VendingMachine.ItemGroup <em>Item Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Group</em>'.
	 * @see VendingMachine.ItemGroup
	 * @generated
	 */
	EClass getItemGroup();

	/**
	 * Returns the meta object for the attribute '{@link VendingMachine.ItemGroup#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see VendingMachine.ItemGroup#getQuantity()
	 * @see #getItemGroup()
	 * @generated
	 */
	EAttribute getItemGroup_Quantity();

	/**
	 * Returns the meta object for the attribute '{@link VendingMachine.ItemGroup#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see VendingMachine.ItemGroup#getPrice()
	 * @see #getItemGroup()
	 * @generated
	 */
	EAttribute getItemGroup_Price();

	/**
	 * Returns the meta object for the attribute '{@link VendingMachine.ItemGroup#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image</em>'.
	 * @see VendingMachine.ItemGroup#getImage()
	 * @see #getItemGroup()
	 * @generated
	 */
	EAttribute getItemGroup_Image();

	/**
	 * Returns the meta object for the containment reference list '{@link VendingMachine.ItemGroup#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Item</em>'.
	 * @see VendingMachine.ItemGroup#getItem()
	 * @see #getItemGroup()
	 * @generated
	 */
	EReference getItemGroup_Item();

	/**
	 * Returns the meta object for class '{@link VendingMachine.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see VendingMachine.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the attribute '{@link VendingMachine.State#getStage <em>Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stage</em>'.
	 * @see VendingMachine.State#getStage()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Stage();

	/**
	 * Returns the meta object for class '{@link VendingMachine.ItemProcessor <em>Item Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Processor</em>'.
	 * @see VendingMachine.ItemProcessor
	 * @generated
	 */
	EClass getItemProcessor();

	/**
	 * Returns the meta object for the reference '{@link VendingMachine.ItemProcessor#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>State</em>'.
	 * @see VendingMachine.ItemProcessor#getState()
	 * @see #getItemProcessor()
	 * @generated
	 */
	EReference getItemProcessor_State();

	/**
	 * Returns the meta object for class '{@link VendingMachine.Inventory <em>Inventory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inventory</em>'.
	 * @see VendingMachine.Inventory
	 * @generated
	 */
	EClass getInventory();

	/**
	 * Returns the meta object for the attribute '{@link VendingMachine.Inventory#getTotalCapacity <em>Total Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Capacity</em>'.
	 * @see VendingMachine.Inventory#getTotalCapacity()
	 * @see #getInventory()
	 * @generated
	 */
	EAttribute getInventory_TotalCapacity();

	/**
	 * Returns the meta object for the attribute '{@link VendingMachine.Inventory#getLastRestocked <em>Last Restocked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Restocked</em>'.
	 * @see VendingMachine.Inventory#getLastRestocked()
	 * @see #getInventory()
	 * @generated
	 */
	EAttribute getInventory_LastRestocked();

	/**
	 * Returns the meta object for the containment reference list '{@link VendingMachine.Inventory#getItemGroup <em>Item Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Item Group</em>'.
	 * @see VendingMachine.Inventory#getItemGroup()
	 * @see #getInventory()
	 * @generated
	 */
	EReference getInventory_ItemGroup();

	/**
	 * Returns the meta object for class '{@link VendingMachine.VendingMachine <em>Vending Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vending Machine</em>'.
	 * @see VendingMachine.VendingMachine
	 * @generated
	 */
	EClass getVendingMachine();

	/**
	 * Returns the meta object for the containment reference '{@link VendingMachine.VendingMachine#getInventory <em>Inventory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inventory</em>'.
	 * @see VendingMachine.VendingMachine#getInventory()
	 * @see #getVendingMachine()
	 * @generated
	 */
	EReference getVendingMachine_Inventory();

	/**
	 * Returns the meta object for the containment reference '{@link VendingMachine.VendingMachine#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>State</em>'.
	 * @see VendingMachine.VendingMachine#getState()
	 * @see #getVendingMachine()
	 * @generated
	 */
	EReference getVendingMachine_State();

	/**
	 * Returns the meta object for the containment reference '{@link VendingMachine.VendingMachine#getPaymentProcessor <em>Payment Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Payment Processor</em>'.
	 * @see VendingMachine.VendingMachine#getPaymentProcessor()
	 * @see #getVendingMachine()
	 * @generated
	 */
	EReference getVendingMachine_PaymentProcessor();

	/**
	 * Returns the meta object for the containment reference '{@link VendingMachine.VendingMachine#getItemProcessor <em>Item Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Item Processor</em>'.
	 * @see VendingMachine.VendingMachine#getItemProcessor()
	 * @see #getVendingMachine()
	 * @generated
	 */
	EReference getVendingMachine_ItemProcessor();

	/**
	 * Returns the meta object for the containment reference '{@link VendingMachine.VendingMachine#getKeypad <em>Keypad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Keypad</em>'.
	 * @see VendingMachine.VendingMachine#getKeypad()
	 * @see #getVendingMachine()
	 * @generated
	 */
	EReference getVendingMachine_Keypad();

	/**
	 * Returns the meta object for the containment reference '{@link VendingMachine.VendingMachine#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see VendingMachine.VendingMachine#getLocation()
	 * @see #getVendingMachine()
	 * @generated
	 */
	EReference getVendingMachine_Location();

	/**
	 * Returns the meta object for enum '{@link VendingMachine.PaymentMethod <em>Payment Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Payment Method</em>'.
	 * @see VendingMachine.PaymentMethod
	 * @generated
	 */
	EEnum getPaymentMethod();

	/**
	 * Returns the meta object for enum '{@link VendingMachine.States <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>States</em>'.
	 * @see VendingMachine.States
	 * @generated
	 */
	EEnum getStates();

	/**
	 * Returns the meta object for enum '{@link VendingMachine.StateOperations <em>State Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>State Operations</em>'.
	 * @see VendingMachine.StateOperations
	 * @generated
	 */
	EEnum getStateOperations();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VendingMachineFactory getVendingMachineFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link VendingMachine.impl.NameImpl <em>Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VendingMachine.impl.NameImpl
		 * @see VendingMachine.impl.VendingMachinePackageImpl#getName_()
		 * @generated
		 */
		EClass NAME = eINSTANCE.getName_();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME__NAME = eINSTANCE.getName_Name();

		/**
		 * The meta object literal for the '{@link VendingMachine.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VendingMachine.impl.LocationImpl
		 * @see VendingMachine.impl.VendingMachinePackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '<em><b>Lattitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__LATTITUDE = eINSTANCE.getLocation_Lattitude();

		/**
		 * The meta object literal for the '<em><b>Longitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__LONGITUDE = eINSTANCE.getLocation_Longitude();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__LOCATION = eINSTANCE.getLocation_Location();

		/**
		 * The meta object literal for the '{@link VendingMachine.impl.HasOperationImpl <em>Has Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VendingMachine.impl.HasOperationImpl
		 * @see VendingMachine.impl.VendingMachinePackageImpl#getHasOperation()
		 * @generated
		 */
		EClass HAS_OPERATION = eINSTANCE.getHasOperation();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAS_OPERATION__OPERATIONS = eINSTANCE.getHasOperation_Operations();

		/**
		 * The meta object literal for the '{@link VendingMachine.impl.ItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VendingMachine.impl.ItemImpl
		 * @see VendingMachine.impl.VendingMachinePackageImpl#getItem()
		 * @generated
		 */
		EClass ITEM = eINSTANCE.getItem();

		/**
		 * The meta object literal for the '<em><b>Expiry</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__EXPIRY = eINSTANCE.getItem_Expiry();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM__GROUP = eINSTANCE.getItem_Group();

		/**
		 * The meta object literal for the '{@link VendingMachine.HasId <em>Has Id</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VendingMachine.HasId
		 * @see VendingMachine.impl.VendingMachinePackageImpl#getHasId()
		 * @generated
		 */
		EClass HAS_ID = eINSTANCE.getHasId();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAS_ID__ID = eINSTANCE.getHasId_Id();

		/**
		 * The meta object literal for the '{@link VendingMachine.impl.KeypadImpl <em>Keypad</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VendingMachine.impl.KeypadImpl
		 * @see VendingMachine.impl.VendingMachinePackageImpl#getKeypad()
		 * @generated
		 */
		EClass KEYPAD = eINSTANCE.getKeypad();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYPAD__INPUT = eINSTANCE.getKeypad_Input();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEYPAD__STATE = eINSTANCE.getKeypad_State();

		/**
		 * The meta object literal for the '{@link VendingMachine.impl.PaymentProcessorImpl <em>Payment Processor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VendingMachine.impl.PaymentProcessorImpl
		 * @see VendingMachine.impl.VendingMachinePackageImpl#getPaymentProcessor()
		 * @generated
		 */
		EClass PAYMENT_PROCESSOR = eINSTANCE.getPaymentProcessor();

		/**
		 * The meta object literal for the '<em><b>Payment Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_PROCESSOR__PAYMENT_METHOD = eINSTANCE.getPaymentProcessor_PaymentMethod();

		/**
		 * The meta object literal for the '<em><b>Payment Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_PROCESSOR__PAYMENT_AMOUNT = eINSTANCE.getPaymentProcessor_PaymentAmount();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYMENT_PROCESSOR__STATE = eINSTANCE.getPaymentProcessor_State();

		/**
		 * The meta object literal for the '{@link VendingMachine.impl.ItemGroupImpl <em>Item Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VendingMachine.impl.ItemGroupImpl
		 * @see VendingMachine.impl.VendingMachinePackageImpl#getItemGroup()
		 * @generated
		 */
		EClass ITEM_GROUP = eINSTANCE.getItemGroup();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_GROUP__QUANTITY = eINSTANCE.getItemGroup_Quantity();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_GROUP__PRICE = eINSTANCE.getItemGroup_Price();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_GROUP__IMAGE = eINSTANCE.getItemGroup_Image();

		/**
		 * The meta object literal for the '<em><b>Item</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_GROUP__ITEM = eINSTANCE.getItemGroup_Item();

		/**
		 * The meta object literal for the '{@link VendingMachine.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VendingMachine.impl.StateImpl
		 * @see VendingMachine.impl.VendingMachinePackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Stage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__STAGE = eINSTANCE.getState_Stage();

		/**
		 * The meta object literal for the '{@link VendingMachine.impl.ItemProcessorImpl <em>Item Processor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VendingMachine.impl.ItemProcessorImpl
		 * @see VendingMachine.impl.VendingMachinePackageImpl#getItemProcessor()
		 * @generated
		 */
		EClass ITEM_PROCESSOR = eINSTANCE.getItemProcessor();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_PROCESSOR__STATE = eINSTANCE.getItemProcessor_State();

		/**
		 * The meta object literal for the '{@link VendingMachine.impl.InventoryImpl <em>Inventory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VendingMachine.impl.InventoryImpl
		 * @see VendingMachine.impl.VendingMachinePackageImpl#getInventory()
		 * @generated
		 */
		EClass INVENTORY = eINSTANCE.getInventory();

		/**
		 * The meta object literal for the '<em><b>Total Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVENTORY__TOTAL_CAPACITY = eINSTANCE.getInventory_TotalCapacity();

		/**
		 * The meta object literal for the '<em><b>Last Restocked</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVENTORY__LAST_RESTOCKED = eINSTANCE.getInventory_LastRestocked();

		/**
		 * The meta object literal for the '<em><b>Item Group</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVENTORY__ITEM_GROUP = eINSTANCE.getInventory_ItemGroup();

		/**
		 * The meta object literal for the '{@link VendingMachine.impl.VendingMachineImpl <em>Vending Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VendingMachine.impl.VendingMachineImpl
		 * @see VendingMachine.impl.VendingMachinePackageImpl#getVendingMachine()
		 * @generated
		 */
		EClass VENDING_MACHINE = eINSTANCE.getVendingMachine();

		/**
		 * The meta object literal for the '<em><b>Inventory</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VENDING_MACHINE__INVENTORY = eINSTANCE.getVendingMachine_Inventory();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VENDING_MACHINE__STATE = eINSTANCE.getVendingMachine_State();

		/**
		 * The meta object literal for the '<em><b>Payment Processor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VENDING_MACHINE__PAYMENT_PROCESSOR = eINSTANCE.getVendingMachine_PaymentProcessor();

		/**
		 * The meta object literal for the '<em><b>Item Processor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VENDING_MACHINE__ITEM_PROCESSOR = eINSTANCE.getVendingMachine_ItemProcessor();

		/**
		 * The meta object literal for the '<em><b>Keypad</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VENDING_MACHINE__KEYPAD = eINSTANCE.getVendingMachine_Keypad();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VENDING_MACHINE__LOCATION = eINSTANCE.getVendingMachine_Location();

		/**
		 * The meta object literal for the '{@link VendingMachine.PaymentMethod <em>Payment Method</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VendingMachine.PaymentMethod
		 * @see VendingMachine.impl.VendingMachinePackageImpl#getPaymentMethod()
		 * @generated
		 */
		EEnum PAYMENT_METHOD = eINSTANCE.getPaymentMethod();

		/**
		 * The meta object literal for the '{@link VendingMachine.States <em>States</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VendingMachine.States
		 * @see VendingMachine.impl.VendingMachinePackageImpl#getStates()
		 * @generated
		 */
		EEnum STATES = eINSTANCE.getStates();

		/**
		 * The meta object literal for the '{@link VendingMachine.StateOperations <em>State Operations</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VendingMachine.StateOperations
		 * @see VendingMachine.impl.VendingMachinePackageImpl#getStateOperations()
		 * @generated
		 */
		EEnum STATE_OPERATIONS = eINSTANCE.getStateOperations();

	}

} //VendingMachinePackage
