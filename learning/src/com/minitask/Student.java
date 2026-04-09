package com.minitask;

import java.util.function.Function;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.function.*;
interface EligibilityChecker{
	boolean checkEligibiliy(double average);
}

public class Student {
	private int studentId;
	private String studentName;
	private int[] marks=new int[3];
	
	
	public Student(int studentId, String studentName, int[] marks) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.marks = marks;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	
	public static double calculateTotal(int [] marks) {
		int total=0;
		for(int a:marks) {
			total+=marks[a];
		}
		return total;
		
	}
	public static double calculateAverage(int [] marks) {
		int total=0;
		for(int a:marks) {
			total+=marks[a];
		}
		 return total/3;
		
	}
	public void displayStudentDetails() {
		System.out.println("Student ID :"+studentId);
		System.out.println("Student Name :"+studentName);
		System.out.println("Student marks :"+marks);
		System.out.println("Total :"+calculateTotal(marks));
		System.out.println("Average :"+calculateAverage(marks));
		System.out.println("grade");
		System.out.println("Result");
	}
	Predicate<Double> check=(avg)->avg>=35;
	Function<Double, String> grade=avg->{
		if(avg>=75) {
			return "A";
		}
		else if(avg>=60) {
			return "B";
		}
		else if(avg>=50) {
			return "C";
		}
		
		else {
			return "D";
		}
	};


}

 