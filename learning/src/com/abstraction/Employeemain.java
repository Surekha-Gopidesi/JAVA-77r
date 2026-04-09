package com.abstraction;

public class Employeemain {
public static void main(String[] args) {
	Employee e;
	e=new FullTimeEmployee("John Doe", "12345", 50000, 10000);
	e.calculateSalary();
	e.leave();
	e.getDetails();
	
	System.out.println("----------------");
	e=new PartTimeEmployee("Jane Smith", "67890", 20, 15);
	e.calculateSalary();
	e.leave();
	e.getDetails();
	System.out.println("----------------");
	e=new Freelancer("Alice Johnson", "54321", 5000);
	e.calculateSalary();
	e.leave();
	e.getDetails();
}
}
