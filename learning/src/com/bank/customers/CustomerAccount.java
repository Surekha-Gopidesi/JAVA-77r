package com.bank.customers;

public class CustomerAccount {
	private int customerId;
	private String customerName;
	private String email;
	private String phoneNumber;
	private String address;
	private String accountType;
	private double balance;
	private boolean kycStatus;
	
	
	public CustomerAccount() {
		this.kycStatus=false;
		System.out.println("Customer Profile initialized- status: Pending KYC");
	}
	
	public CustomerAccount(String customerName, String phoneNumber) {
		this();
		this.customerName = customerName;
		this.phoneNumber = phoneNumber;
	}

	public CustomerAccount(String customerName, String phoneNumber, String accountType) {
		this("Surekha", "8522895061");
		this.customerName = customerName;
		this.phoneNumber = phoneNumber;
		this.accountType = accountType;
	}
	public CustomerAccount(int customerId, String customerName, String email, String phoneNumber, String address,
			String accountType, double balance, boolean kycStatus) {
		this("Surekha","8522895061","savings");
		this.customerId = customerId;
		this.customerName = customerName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.accountType = accountType;
		this.balance = balance;
		this.kycStatus = kycStatus;
	
	}
	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		
		if(this.customerName!=null&&!customerName.isBlank()) {
			this.customerName = customerName;
		}
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		
		if(this.email!=null && this.email.contains("@")) {
			this.email = email;
		}
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		
		if(phoneNumber!=null &&phoneNumber.length()==10) {
			this.phoneNumber = phoneNumber;
		}
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		if(accountType.equalsIgnoreCase("Savings")||accountType.equalsIgnoreCase("Current")||accountType.equalsIgnoreCase("Salary")||accountType.equalsIgnoreCase("Premium"));
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
		if(this.balance<=0) {
			System.out.println("Balance cannot be negative");
		}
	}
	public void activateKYC(String documentType) {
		if(documentType!=null&&!documentType.isBlank()) {
			this.kycStatus=true;
			System.out.println("kyc activated successfully...");
		}
	}
	public String getMaskedPhone() {
		return "***********"+phoneNumber.substring(6);
		
	}
	public void viewAccountSummary() {
		System.out.println("*****Account summary*****");
		System.out.println("Name :"+this.customerName);
		System.out.println("phone :"+this.phoneNumber);
		System.out.println("Account type :"+this.accountType);
		System.out.println("balance :"+this.balance);
		System.out.println("kyc status :"+(kycStatus?"verified":"pending..."));
	}
	public void deposit(double ammount) {
		if(ammount>0) {
		this.balance=balance+ammount;
		System.out.println("Amount deposited successfully.. ");
System.out.println("Current balance :"+balance);
	}
	}
	public void withdraw(double ammount) {
		if(ammount>0 &&ammount<=balance) {
			this.balance=balance-ammount;
			System.out.println("Amount withdraw successfully.. ");
			System.out.println("Current balance :"+balance);
		}
	}
	

	
	
	
	

}
