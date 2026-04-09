package com.inheritance;

class Account {

    Account() {
        System.out.println("Account created");
    }

    Account(String holderName) {
        System.out.println("Account holder: " + holderName);
    }
}

class SavingsAccount extends Account {

    SavingsAccount() {
        this("Surekha");
        System.out.println("Savings Account created");
    }

    SavingsAccount(String name) {
        super(name); 
        System.out.println("Welcome to Savings Account");
    }
}



