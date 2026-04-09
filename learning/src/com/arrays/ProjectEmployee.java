package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ProjectEmployee extends Employee {

    String ProjectName;
    String ProjectRole;
    int a[];

    public ProjectEmployee(String employeeName, int employeeId, String department,
                           String projectName, String projectRole, int a[]) {

        super(employeeName, employeeId, department);
        this.ProjectName = projectName;
        this.ProjectRole = projectRole;
        this.a = a;
    }

    public void role(String role) {
        this.ProjectRole = role;
        System.out.println("Updated role : " + role);
    }

    public void project(String pname) {
        this.ProjectName = pname;
        System.out.println("Updated Project name : " + pname);
    }

    public void profile() {
        displayDetails();
        System.out.println("Project Name : " + ProjectName);
        System.out.println("Project Role : " + ProjectRole);
        System.out.println("Performance Scores : " + Arrays.toString(a));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee name : ");
        String eName = sc.next();

        System.out.println("Enter Employee Id : ");
        int eId = sc.nextInt();

        System.out.println("Enter Employee Department : ");
        String dept = sc.next();

        System.out.println("Enter Employee Projectname : ");
        String pName = sc.next();

        System.out.println("Enter Employee Project role : ");
        String pRole = sc.next();

        int score[] = new int[3];
        System.out.println("Enter 3 Monthly performance scores");

        for (int i = 0; i < 3; i++) {
            System.out.println("Month " + (i + 1));
            score[i] = sc.nextInt();
        }

        ProjectEmployee p = new ProjectEmployee(eName, eId, dept, pName, pRole, score);

        System.out.println("1.Update Project role");
        System.out.println("2.Update Project Name");
        System.out.println("3.View Employee Profile");
        System.out.println("4.View Average performance");
        System.out.println("5.Exit");

        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                p.role("Developer");
                break;

            case 2:
                p.project("Banking App");
                break;

            case 3:
                p.profile();
                break;

            case 4:
                int sum = 0;
                for (int i = 0; i < 3; i++) {
                    sum += score[i];
                }
                System.out.println("Average scores : " + sum / 3);
                break;

            case 5:
                System.out.println("Exit");
                break;

            default:
                System.out.println("Invalid");
        }
    }
}