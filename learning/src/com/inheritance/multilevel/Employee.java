package com.inheritance.multilevel;

public class Employee {
	String name;
	double baseSalary;
	public Employee(String name, double baseSalary) {
		this.name = name;
		this.baseSalary = baseSalary;
	}
	public void calculateAnnualSalary() {
		double sal=baseSalary*12;
		System.out.println("Employeee Base salary :"+baseSalary);
		System.out.println("employee salary :"+sal);
	}
}
class Manager extends Employee{
	double bonus;
	int numberOfEmployeesManaged;
	public Manager(String name, double baseSalary, double bonus, int numberOfEmployeesManaged) {
		super(name, baseSalary);
		this.bonus = bonus;
		this.numberOfEmployeesManaged = numberOfEmployeesManaged;
	}
	public void calculateManagerSalary() {
		double sal=(baseSalary*12)+bonus;
		System.out.println("Manager Base salary :"+baseSalary);
		System.out.println("manager salary :"+sal);
	}
	
}
class Engineer extends Employee{
	int projectCount;

	public Engineer(String name, double baseSalary, int projectCount) {
		super(name, baseSalary);
		this.projectCount = projectCount;
	}
	public void calculateEngineerSalary() {
		double sal=(baseSalary*12)+(projectCount*1000);
		System.out.println(" Engineer Base salary :"+baseSalary);
		System.out.println("Engineer salary :"+sal);
	}
	
}
class Salesperson extends Employee{
	double commissionRate;
	int totalSales;
	public Salesperson(String name, double baseSalary, int commissionRate, int totalSales) {
		super(name, baseSalary);
		this.commissionRate = commissionRate;
		this.totalSales = totalSales;
	}
	public void calculateSalespersonSalary() {
		double sal=(baseSalary*12)+(commissionRate/100.0)*totalSales;
		System.out.println("SalesPerson Base salary :"+baseSalary);
		System.out.println("sales person salary :"+sal);
	}
	
	
}
