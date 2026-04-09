package com.scanner;
import java.util.Scanner;
public class Bank   {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name :");
		String customerName=sc.nextLine();
		System.out.println("enter tour address :");
		String address=sc.nextLine();
		System.out.println("enter your phone number :");
		long phoneNumber=sc.nextLong();
		System.out.println("enter your balance :");
		int bal=sc.nextInt();
		BankApplication b=new BankApplication("Surekha", "Nellore", 1234567890, 50000.0);
		while(true) {
			System.out.println("select options from below :");
			System.out.println("1.deposit");
			System.out.println("2.withdraw");
			System.out.println("3.show balance");
			System.out.println("4.exit");
			System.out.println("Enter your option{1-4}");
			int option=sc.nextInt();
			switch(option) {
			case 1:System.out.println("enter amount for depisit :");
			       double depositAmount=sc.nextDouble();
			       b.deposit(depositAmount);break;
			case 2:System.out.println("enter amount for withdraw :");
			double withdrawAmount=sc.nextDouble();
			b.withdraw(withdrawAmount);break;
			case 3:b.showBalance();break;
			case 4:System.out.println("exit ...");break;
		    default:
		    	System.out.println(" sorry invalid option...");
			}}
		
		}}
