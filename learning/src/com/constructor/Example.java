package com.constructor;

public class Example {
	int id;
	String name;
	public   Example(int id,String name){
		this.id=id;
		this.name=name;
		
	}
	public   Example(String name) {
		this.name=name;
	}
	public void display() {
		System.out.println("id :"+id+"\nname :"+name);
	}
	public static void main(String[] args) {
		Example ex1=new Example(1,"surekha");
		Example ex2=new Example("Sushma");
		ex1.display();
		ex2.display();
		
	}
	

}
