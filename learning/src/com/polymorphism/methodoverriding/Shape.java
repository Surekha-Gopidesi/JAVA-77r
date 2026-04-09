package com.polymorphism.methodoverriding;

public class Shape {
public void draw() {
	System.out.println("Drawing Shape");
}
}
class Circle extends Shape{
	public void draw() {
		System.out.println("Drawing Circle");
	}
}
class Square extends Shape{
	public void draw() {
		System.out.println("Drawing Circle");
	}
} 
