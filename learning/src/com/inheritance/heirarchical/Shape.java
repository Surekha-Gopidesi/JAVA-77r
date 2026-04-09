package com.inheritance.heirarchical;

public class Shape {
public void calculateArea() {
	System.out.println("calculate the area of shape");
}
}
class Circle extends Shape{
	double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	public void calculateCircleArea() {
		double Area=2*3.14*radius;
		System.out.println("Area of Circle :"+Area);
	}
}
class Rectangle extends Shape{
	int  length;
	int width;
	public Rectangle(int length, int width) {
		super();
		this.length = length;
		this.width = width;
	}
	public void calculateRectangleArea() {
		double Area=2*length*width;
		System.out.println("Area of rectangle :"+Area);
	}
}
class Triangle extends Shape{
	int base;
	int height;
	public Triangle(int base, int height) {
		super();
		this.base = base;
		this.height = height;
	}
	public void calculateTriangleArea() {
		double Area=1/2*base*height;
		System.out.println("Area of traingle :"+Area);
	}
	
}

