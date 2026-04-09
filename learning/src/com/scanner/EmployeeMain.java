package com.scanner;

import java.util.Scanner;
public class EmployeeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        System.out.print("Enter Initial Salary: ");
        double salary = sc.nextDouble();
        EmployeeSalary emp = new EmployeeSalary(name, id, salary);
        while (true) {
            System.out.println("\n*** Select Options ***");
            System.out.println("1. Add Salary");
            System.out.println("2. Deduct Salary");
            System.out.println("3. View Total Salary");
            System.out.println("4. Exit");
            System.out.print("Enter your option [1-4]: ");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.print("Enter amount to add: ");
                    emp.addSalary(sc.nextDouble());
                    break;
                case 2:
                    System.out.print("Enter amount to deduct: ");
                    emp.deductSalary(sc.nextDouble());
                    break;
                case 3:
                    emp.showSalary();
                    break;
                case 4:
                    System.out.println("Exit... Thank You");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
