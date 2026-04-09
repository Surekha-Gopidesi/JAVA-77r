package com.abstraction;

public abstract class Employee {
	String name,Id;
	
	public Employee(String name, String id) {
		super();
		this.name = name;
		Id = id;
	}
	public abstract void calculateSalary();
	public void leave() {
		System.out.println( "Leave applied successfully.");
	}
	public void getDetails() {
		System.out.println("Employee Details:");
	}

}
class FullTimeEmployee extends Employee{
	Integer basePay , benefits;

	public FullTimeEmployee(String name, String id, Integer basePay, Integer benefits) {
		super(name, id);
		this.basePay = basePay;
		this.benefits = benefits;
	}
	@Override
	public void calculateSalary() {
		System.out.println( "Calculating salary:   "+(basePay + benefits));
		
	}
	public void getDetails() {
		System.out.println( "Employee Details:"+ name+", id"+Id);
	}

}
class PartTimeEmployee extends Employee{
	Integer hourlyRate , hoursWorked;

	public PartTimeEmployee(String name, String id, Integer hourlyRate, Integer hoursWorked) {
		super(name, id);
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}

	@Override
	public void calculateSalary() {
	System.out.println("calculate salary :"+(hourlyRate*hoursWorked));
		
	}
	public void getDetails() {
		System.out.println( "Employee Details:"+ name+", id"+Id);
	}
	
}
class Freelancer extends Employee{
	Integer projectpayment;

	public Freelancer(String name, String id, Integer projectpayment) {
		super(name, id);
		this.projectpayment = projectpayment;
	}

	@Override
	public void calculateSalary() {
		System.out.println("Claculate salary :"+projectpayment);
		
	}
	public void getDetails() {
		System.out.println( "Employee Details:"+ name+", id"+Id);
	}
}


