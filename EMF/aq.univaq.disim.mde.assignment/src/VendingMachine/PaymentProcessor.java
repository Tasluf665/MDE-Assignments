/**
 */
package VendingMachine;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payment Processor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link VendingMachine.PaymentProcessor#getPaymentMethod <em>Payment Method</em>}</li>
 *   <li>{@link VendingMachine.PaymentProcessor#getPaymentAmount <em>Payment Amount</em>}</li>
 *   <li>{@link VendingMachine.PaymentProcessor#getState <em>State</em>}</li>
 * </ul>
 *
 * @see VendingMachine.VendingMachinePackage#getPaymentProcessor()
 * @model
 * @generated
 */
public interface PaymentProcessor extends HasOperation {
	/**
	 * Returns the value of the '<em><b>Payment Method</b></em>' attribute.
	 * The literals are from the enumeration {@link VendingMachine.PaymentMethod}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Method</em>' attribute.
	 * @see VendingMachine.PaymentMethod
	 * @see #setPaymentMethod(PaymentMethod)
	 * @see VendingMachine.VendingMachinePackage#getPaymentProcessor_PaymentMethod()
	 * @model required="true"
	 * @generated
	 */
	PaymentMethod getPaymentMethod();

	/**
	 * Sets the value of the '{@link VendingMachine.PaymentProcessor#getPaymentMethod <em>Payment Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Method</em>' attribute.
	 * @see VendingMachine.PaymentMethod
	 * @see #getPaymentMethod()
	 * @generated
	 */
	void setPaymentMethod(PaymentMethod value);

	/**
	 * Returns the value of the '<em><b>Payment Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Amount</em>' attribute.
	 * @see #setPaymentAmount(float)
	 * @see VendingMachine.VendingMachinePackage#getPaymentProcessor_PaymentAmount()
	 * @model required="true"
	 * @generated
	 */
	float getPaymentAmount();

	/**
	 * Sets the value of the '{@link VendingMachine.PaymentProcessor#getPaymentAmount <em>Payment Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Amount</em>' attribute.
	 * @see #getPaymentAmount()
	 * @generated
	 */
	void setPaymentAmount(float value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' reference.
	 * @see #setState(State)
	 * @see VendingMachine.VendingMachinePackage#getPaymentProcessor_State()
	 * @model required="true"
	 * @generated
	 */
	State getState();

	/**
	 * Sets the value of the '{@link VendingMachine.PaymentProcessor#getState <em>State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(State value);

} // PaymentProcessor
