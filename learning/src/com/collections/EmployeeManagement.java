package com.collections;

import java.util.ArrayList;
import java.util.Scanner;

class EmployeeManagement {
	int id;
	String name;
	double salary;
	public EmployeeManagement(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		System.out.println("Data added Successfully...");
	}
	@Override
	public String toString() {
		return "EmployeeManagement [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}
 
