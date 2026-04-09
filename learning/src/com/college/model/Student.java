package com.college.model;

public class Student extends Person{
	private int studentId;
	private String department;
	private String courseName;
	public Student() {}
	public Student(int studentId, String department, String courseName) {
		super();
		this.studentId = studentId;
		this.department = department;
		this.courseName = courseName;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public void dispalyDetails() {
		System.out.println("Name :"+getName());
		System.out.println("Student Age :"+getAge());
		System.out.println("Student Contact :"+getContactNumber());
		System.out.println("Student Id :"+getStudentId());
		System.out.println("Student Department :"+getDepartment());
		System.out.println("Course Name :"+getCourseName());
	}

	

}
