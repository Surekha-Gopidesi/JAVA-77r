package com.polymorphism;

class Payment {

    void makePayment(int amount) {
        System.out.println("Payment made using Cash: " + amount);
        System.out.println("________________");
    }

    void makePayment(int amount, long cardNumber) {
        System.out.println("Payment made using Card: " + amount);
        System.out.println("________________");
    }

    void makePayment(int amount, String upiId) {
        System.out.println("Payment made using UPI: " + amount);
    }

    public static void main(String[] args) {
        Payment p = new Payment();
        p.makePayment(500);
        p.makePayment(1000, 8764555235221l);
        p.makePayment(750, "upi@bank");
    }
}
