package com.interfaces;

public interface Example {
	
	    default void show() {
	        System.out.println("Default method");
	    }

	    static void display() {
	        System.out.println("Static method");
	    }
	}
interface Example1  {
	
	public default void show() {
    System.out.println("this is default method in example 1");
	}
	
}
class Example2 implements Example,Example1{

	@Override
	public void show() {
		Example.super.show();  //Example class default method
		Example1.super.show();  //Example1 class default method
	}
		 
}
	

