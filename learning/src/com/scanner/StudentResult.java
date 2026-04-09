package com.scanner;
public class StudentResult {
	private String studentname;
	private int studentId;
	private String courseName;
	private double totalMarks;
	public StudentResult(String studentname,int  studentId,String courseName, double totalMarks) {
		this.studentname=studentname;
		this.studentId=studentId;
		this.courseName=courseName;
		this.totalMarks=totalMarks;
		System.out.println("Student record created successfully");	
	}
	public void addmarks(double marks) {
		totalMarks+=marks;
		System.out.println("Marks added successfully and current marks are :"+totalMarks);
		if(marks<=0) {
			System.out.println("invalid marks enterd...");
		}
	}
	public void calculateGrade() {
		System.out.println("Grade criteria");
		if(totalMarks>=90) {
			System.out.println("Grade A");	
		}
		else if(totalMarks>=80 || totalMarks<=89) {
			System.out.println("Grade B");	
		}
		else if(totalMarks>=70 || totalMarks<=79) {
			System.out.println("Grade C");
		}
		else if(totalMarks>=60 || totalMarks<=69) {
			System.out.println("Grade D");
		}
		else {
			System.out.println("Failed");
			}
		if(totalMarks<=0) {
			System.out.println("No marks available to calculate grade");
		}
		}
	public void showmarks(double marks) {
		double  totalmarks=marks;
		System.out.println("marks :"+totalMarks);
	}
}
