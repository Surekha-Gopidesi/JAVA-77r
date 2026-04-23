package com.javaTask;

class MainClass {
	private String name;
	private long phoneNo;
	private long AccountNo;
	private double balance;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public long getAccountNo() {
		return AccountNo;
	}
	public void setAccountNo(long accountNo) {
		AccountNo = accountNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
abstract class Account {
    long accountNumber;
	double balance;
	public Account(int accountNumber, String accountHolderName, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	public abstract void withdraw(int amount); 
		
	public void deposit(int Amount) {
		if(Amount>0) {
		balance+=Amount;
		System.out.println("Amount Deposited Successfully and Available balance is :"+balance);
		}
	}
	public abstract void calculateCharges();
		
}
class SavingAccount extends Account{

	public SavingAccount(int accountNumber, String accountHolderName, double balance) {
		super(accountNumber, accountHolderName, balance);
		
	}

	@Override
	public void withdraw(int amount) {
		
			if(balance>amount) {
				balance=balance-amount;
				System.out.println("Amount withdraw Successfully.. Available Amount :"+balance);	
	}}

	@Override
	public void calculateCharges() {
		double charge=balance *0.05;
		System.out.println("Charges :"+charge);
		
	}
	
}
class Transaction {
	double amount;
	String type;

	
	public Transaction(double amount, String type, StringBuilder s) {
		super();
		this.amount = amount;
		this.type = type;
		this.s = s;
	}
	StringBuilder s=new StringBuilder();
	class Validator{
		
		
	}
	Validator v=new Validator();
	
}
interface PaymentService{
	public void sendMoney(double amount);
	public void recieveMoney(double amount);
	
}
class BankService implements PaymentService{

	@Override
	public void sendMoney(double amount) {
		System.out.println("Sended money :"+amount);	
	}
	@Override
	public void recieveMoney(double amount) {
		System.out.println("Recieved money :"+amount);
		
	}
	
}
enum Usage {
    SUCCESS,
    FAILED,
    PENDING
}


