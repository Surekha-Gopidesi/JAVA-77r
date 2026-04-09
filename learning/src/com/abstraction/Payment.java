package com.abstraction;

public abstract class Payment {
	abstract void processPayment();
	abstract void validateTransaction();
	public void generateTransactionId() {
		System.out.println("Generated transaction ID:123456789");
	}
}
class CreditcardPayment extends Payment{
	String cardNumber , expiryDate , cvv;
	

	public CreditcardPayment(String cardNumber, String expiryDate, String cvv) {
		super();
		this.cardNumber = cardNumber;
		this.expiryDate = expiryDate;
		this.cvv = cvv;
	}

	@Override
	void processPayment() {
		System.out.println("Processing credit card payment.");
		
	}

	@Override
	void validateTransaction() {
		System.out.println("Validating card number, expiry, and CVV.");
		
	}
//	public void generateTransactionId() {
//		System.out.println("Generated transaction ID:"+cardNumber);
//	}
	
}
class UPIPayment extends Payment{
	String upiId;
	String phoneNumber;
	public UPIPayment(String upiId, String phoneNumber) {
		super();
		this.upiId = upiId;
		this.phoneNumber =phoneNumber;
	}
	@Override
	void processPayment() {
       System.out.println("Processing UPI payment.");
		
	}
	@Override
	void validateTransaction() {
		System.out.println("Validating UPI ID and phone number.");
		
	}
	
}
class PayPalPayment extends Payment{
	String  email , authToken;
	

	public PayPalPayment(String email, String authToken) {
		super();
		this.email = email;
		this.authToken = authToken;
	}

	@Override
	void processPayment() {
		System.out.println("Processing PayPal payment.");
	}

	@Override
	void validateTransaction() {
		System.out.println("Validating email and authentication");
		
	}
}

