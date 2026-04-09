package com.abstraction;

public class PaymentMain {
	public static void main(String[] args) {
		Payment p;
		p=new CreditcardPayment("1234567890123456", "12/25", "123");
		p.processPayment();
		p.validateTransaction();
		p.generateTransactionId();
		System.out.println("-------------------");
		p=new UPIPayment("user@upi", "1234567890");
		p.processPayment();
		p.validateTransaction();
		p.generateTransactionId();
		System.out.println("-------------------");
		p=new PayPalPayment("user@example.com", "abc123");
		p.processPayment();
		p.validateTransaction();
		p.generateTransactionId();
		
		
	}

}
