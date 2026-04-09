package com.examples;

public class Task {
	java.lang.String name;
	public void setName(String name) {
		this.name=name;
		System.out.println(this.name);
		
	}
	public static void main(String[] args) {
		Task t1=new Task();
		t1.name="Surekha";
		
	}

}
