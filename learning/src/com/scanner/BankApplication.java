package com.scanner;

public class BankApplication {
	
	private String customer;
	private String customerAddress;
	private long phoneNumber;
	private double balance;
	public BankApplication(String customer,String customerAddress,long phoneNumber,double balance) {
		this.customer=customer;
		this.customerAddress=customerAddress;
		this.phoneNumber=phoneNumber;
		this.balance=balance;
		System.out.println("account created successfully");
	}
	
	
	public  void deposit( double amount) {
		
	balance+=amount;
	System.out.println("deposited successfully ..! and current balance is"+ balance);
	}
			
	public void withdraw(double amount) {
		if(amount<=balance) {
		balance-=amount;
		System.out.println("withdraw successfully..! and current bal is "+balance);
	}else {
		System.out.println("insufficient balance");
	}}
		public void showBalance() {
			System.out.println("available balance:"+ balance);
		}
	}


