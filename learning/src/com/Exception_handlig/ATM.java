package com.Exception_handlig;

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String msg) {
        super(msg);
    }
}
public class ATM {
    static void withdraw(int balance, int amount) throws InsufficientBalanceException {

        if(amount > balance) {
            throw new InsufficientBalanceException("Insufficient Balance");
        }

        System.out.println("Withdrawal Successful");
        System.out.println("Remaining Balance: " + (balance - amount));
    }

    public static void main(String[] args) {

        int balance = 5000;
        try {
            withdraw(balance, 6000);
        }

        catch(InsufficientBalanceException e) {
              System.out.println(e.getMessage());
        }

        finally {
            System.out.println("Transaction Completed");

        }
    }
}