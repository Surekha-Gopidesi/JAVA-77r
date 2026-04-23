package com.serialization;

public class OuterClass2 {
	public void getData() {
		class Inner{
			public void printData() {
				System.out.println("Local Inner Class..");
			}
		}
		Inner i=new Inner();
		i.printData();
	}
	public static void main(String[] args) {
		OuterClass2 o=new OuterClass2();
		o.getData();
	}

}
