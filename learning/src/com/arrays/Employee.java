package com.arrays;

public class Employee {

    String employeeName;
    int employeeId;
    String Department;

    public Employee(String employeeName, int employeeId, String department) {

        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.Department = department;
    }
    

    public String getEmployeeName() {
		return employeeName;
	}


	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}


	public int getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}


	public String getDepartment() {
		return Department;
	}


	public void setDepartment(String department) {
		Department = department;
	}


	public void displayDetails() {
        System.out.println("Employee name : " + employeeName);
        System.out.println("Employee Id : " + employeeId);
        System.out.println("Department : " + Department);
    }
}