package com.interfaces;

interface A{
	static void display() {
		System.out.println("display method in interface A");
	}
	public default void details() {
		System.out.println("this is default method ");
	}
}
class A1 implements A{
	
	static void display() {
		System.out.println("display method in interface B");
	}
	@Override
	 public void details() {
		System.out.println("this is default method ");
	}
	
}

public class Test implements A {

	public static void main(String[] args) {
		A.display();
		A1.display();
		A1 a=new A1();
		a.details();
		
		
	}

}
