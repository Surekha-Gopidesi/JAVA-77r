package com.interfaces;

interface Payment {
    void pay(double amount);
}

class UPIPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI");
    }
}


