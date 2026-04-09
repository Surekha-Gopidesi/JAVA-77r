package com.constructor;

public class Student {
	
	    int id;
	    String name;

	    Student(int id, String name) {
	        this.id = id;
	        this.name = name;
	    }

	    void display() {
	        System.out.println( "Name : " + name);
	        System.out.println("Id : " + id);
	    }
	


	public static void main(String[] args) {
		Student s1=new Student(1,"Surekha");
		s1.display();

	}

}
