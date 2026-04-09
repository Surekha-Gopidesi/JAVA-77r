package com.scanner;


public class EmployeeSalary {

    private String employeeName;
    private int employeeId;
    private double salary;

    public EmployeeSalary(String employeeName, int employeeId, double salary) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.salary = salary;
        System.out.println("Employee record created successfully");
    }

    public void addSalary(double amount) {
        if (amount > 0) {
            salary += amount;
            System.out.println("Salary added successfully. Current salary: " + salary);
        } else {
            System.out.println("Invalid amount");
        }
    }

    public void deductSalary(double amount) {
        if (amount > 0 && amount <= salary) {
            salary -= amount;
            System.out.println("Salary deducted successfully. Current salary: " + salary);
        } else {
            System.out.println("Insufficient salary or invalid amount");
        }
    }

    public void showSalary() {
        System.out.println("Total Salary: " + salary);
    }
}
