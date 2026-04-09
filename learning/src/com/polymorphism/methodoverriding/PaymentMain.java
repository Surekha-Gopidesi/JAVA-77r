package com.polymorphism.methodoverriding;
class Payment {

    Double amount;
    Integer transactionLimit;

    Payment(Double amount, Integer transactionLimit) {
        this.amount = amount;
        this.transactionLimit = transactionLimit;
    }

    public void processPayment(Double paymentAmount) {
        System.out.println("Processing generic payment...");
    }
}
class CreditCardPayment extends Payment {

    CreditCardPayment(Double amount, Integer transactionLimit) {
        super(amount, transactionLimit);
    }

    @Override
    public void processPayment(Double paymentAmount) {
        if (paymentAmount <= transactionLimit) {
            System.out.println("Credit Card Payment Successful");
        } else {
            System.out.println("Credit Limit Exceeded");
        }
    }
}
class DebitCardPayment extends Payment {

    DebitCardPayment(Double amount, Integer transactionLimit) {
        super(amount, transactionLimit);
    }

    @Override
    public void processPayment(Double paymentAmount) {
        if (paymentAmount <= amount) {
            System.out.println("Debit Card Payment Successful");
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}
class UPIPayment extends Payment {

    UPIPayment(Double amount, Integer transactionLimit) {
        super(amount, transactionLimit);
    }

    @Override
    public void processPayment(Double paymentAmount) {
        if (paymentAmount <= transactionLimit) {
            System.out.println("UPI Payment Successful");
        } else {
            System.out.println("Daily Transaction Limit Exceeded");
        }
    }
}

public class PaymentMain {
	  public static void main(String[] args) {

	        Payment payment;

	        payment = new CreditCardPayment(5000.0, 10000);
	        payment.processPayment(2000.0);
	        System.out.println("-----------------");

	        payment = new DebitCardPayment(3000.0, 5000);
	        payment.processPayment(4000.0);
	        System.out.println("-----------------");

	        payment = new UPIPayment(2000.0, 1500);
	        payment.processPayment(1000.0);
	    }
}
