package com.arrays;

public class Employee1 {
 int empId;
 String empName;
 int monthlysalries[];
public Employee1(int empId, String empName, int[] monthlysalries) {
	super();
	this.empId = empId;
	this.empName = empName;
	this.monthlysalries = monthlysalries;
}
 double calculateAnnualSalary() {
	 int sum=0;
	 for(int ele:monthlysalries) {
		 sum+=ele;
	 }
	 return sum;
 }
 public void displayEmployeeDetails() {
	 System.out.println("employee Name :"+empName);
	 System.out.println("employee Id :"+empId);
	 System.out.println("employee Annual sal :"+calculateAnnualSalary());
	 System.out.println("-----------------------------");
 }
 public static void main(String[] args) {
	 Employee1 e=new Employee1(101,"surekha",new int[] {35000,30000,40000,30000,30000,50000,30000,30000,30000,45000,30000,60000});
	 Employee1 e1=new Employee1(102,"Sushma",new int[] {50000,30000,30000,40000,55000,40000,30000,60000,30000,30000,30000,30000});
	 Employee1 [] e2= {e,e1};
	 for(Employee1 e4:e2) {
		e4.displayEmployeeDetails();
	 }
	 
}
}
