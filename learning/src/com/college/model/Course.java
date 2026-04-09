package com.college.model;

public class Course {
	private int courseCode;
	private String courseTitle;
	private double coursefee;
	public Course(int courseCode, String courseTitle, double coursefee) {
		super();
		this.courseCode = courseCode;
		this.courseTitle = courseTitle;
		this.coursefee = coursefee;
	}
	public int getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(int courseCode) {
		this.courseCode = courseCode;
	}
	public String getCourseTitle() {
		return courseTitle;
	}
	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}
	public double getCoursefee() {
		return coursefee;
	}
	public void setCoursefee(double coursefee) {
		this.coursefee = coursefee;
	}
	

}
