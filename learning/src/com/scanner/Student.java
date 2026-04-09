package com.scanner;
import java.util.Scanner;
public class Student {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student Name :");
		String name=sc.nextLine();
		System.out.println("Enter Student ID :");
		int Id=sc.nextInt();
		System.out.println("Enter Course Name :");
		String courseName=sc.next();
		System.out.println("Enter your marks :");
		double marks=sc.nextDouble();
		StudentResult s1=new StudentResult( name, Id,courseName, marks);
		while(true) {
		System.out.println("******select options*******");
		System.out.println("1.add more subjects Marks");
        System.out.println("2.calculate Grade");
        System.out.println("3.View total Marks");
        System.out.println("4.Exit");
        System.out.println("enter your options from 1 to 4 :");
        int option=sc.nextInt();
        switch(option) {
        case 1:System.out.println("Adding marks :");
         double mark=sc.nextDouble();
         s1.addmarks(mark); break;
        case 2:System.out.println("Calculate Grade :");
         s1.calculateGrade(); break;
        case 3:System.out.println("view total marks :");
            s1.showmarks(70.0); break; 
        case 4:System.out.println("exit... thank You"); break;
        default:
        	System.out.println("invalid choice...please enter currect choice");
        	sc.close();
        }}
		}}

