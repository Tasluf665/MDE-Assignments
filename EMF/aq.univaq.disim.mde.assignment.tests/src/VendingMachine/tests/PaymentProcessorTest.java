/**
 */
package VendingMachine.tests;

import VendingMachine.PaymentProcessor;
import VendingMachine.VendingMachineFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Payment Processor</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PaymentProcessorTest extends HasOperationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PaymentProcessorTest.class);
	}

	/**
	 * Constructs a new Payment Processor test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentProcessorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Payment Processor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PaymentProcessor getFixture() {
		return (PaymentProcessor)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(VendingMachineFactory.eINSTANCE.createPaymentProcessor());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //PaymentProcessorTest
