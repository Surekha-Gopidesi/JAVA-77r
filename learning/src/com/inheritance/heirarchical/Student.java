package com.inheritance.heirarchical;

public class Student {
     int studentId;
     String name;
	public Student(int studentId, String name) {
		super();
		this.studentId = studentId;
		this.name = name;
	}
	public void displayStudentInfo() {
		System.out.println("student Id :"+studentId);
		System.out.println("student Name :"+name);
	}
}
class Undergraduate extends Student{
	String major;

	public Undergraduate(int studentId, String name, String major) {
		super(studentId, name);
		this.major = major;
	}
	public void displayUndergraduateinfo() {
		System.out.println("student Id :"+studentId);
		System.out.println("student Name :"+name);
		System.out.println("major :"+major);
	}
}
class Graduate extends Student{
	String thesisTopic;

	public Graduate(int studentId, String name, String thesisTopic) {
		super(studentId, name);
		this.thesisTopic = thesisTopic;
	}
	public void displayGraduateInfo() {
		System.out.println("student Id :"+studentId);
		System.out.println("student Name :"+name);
		System.out.println("thesis topic :"+thesisTopic);
	}
}
class PhDstudent extends Student{
	String researchArea;

	public PhDstudent(int studentId, String name, String researchArea) {
		super(studentId, name);
		this.researchArea = researchArea;
	}
	public void displayPhDstudentInfo() {
		System.out.println("student Id :"+studentId);
		System.out.println("student Name :"+name);
		System.out.println("Research Area :"+researchArea);
	}
	
}
