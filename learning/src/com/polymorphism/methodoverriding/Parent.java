package com.polymorphism.methodoverriding;

public class Parent {
public static void print() {
	System.out.println("parent class");
}
}
class Child extends Parent{
	public static void print() {
		System.out.println("Child class");
	}
}
