package com.polymorphism;

class Check{
	public static void main(String[] args) {
		CheckDatatypes c=new CheckDatatypes();
		byte b1=10;
		byte b2=20;
		c.printData(b1, b2);//byte
		short b3=30;
		c.printData(b1, b3);//short
		c.printData(20, 30);//int
		c.printData(10l, 20);//long
		
		c.printData(10.0f, 20.0f);//float
		c.printData(10.0f, 15.0);//double
		
		
	}
}
