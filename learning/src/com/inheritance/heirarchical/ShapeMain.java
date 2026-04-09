package com.inheritance.heirarchical;

public class ShapeMain {

	public static void main(String[] args) {

		Shape c1=new Circle(5);
		Circle c2=(Circle)c1;
		c2.calculateCircleArea();
		System.out.println("==============");
		Shape c3=new Rectangle(20, 40);
		Rectangle r=(Rectangle)c3;
		r.calculateRectangleArea();
		System.out.println("==============");
		Shape c4=new Triangle(20, 40);
		Triangle t=(Triangle)c4;
		t.calculateTriangleArea();
	
		
		
		

	}

}
