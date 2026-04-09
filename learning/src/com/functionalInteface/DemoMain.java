package com.functionalInteface;

class DemoMain{
	public static void main(String[] args) {
		Demo2 add=(a,b)->System.out.println("Addition of two Numbers  :"+(a+b));
		Demo2 sub=(a,b)->System.out.println("Subtraction of two Numbers  :"+(a-b));
		Demo2 mul=(a,b)->System.out.println("Multiplication of two Numbers  :"+(a*b));
		Demo2 div=(a,b)->System.out.println("Division of two Numbers  :"+(a/b));
		Demo2 mod=(a,b)->System.out.println("modulo of two Numbers  :"+(a%b));
		add.calculate(10, 20);
		sub.calculate(10, 20);
		mul.calculate(10, 20);
		div.calculate(10, 20);
		mod.calculate(10, 20);
	}
}
