package com.wrapper;

public class Demo {
	//convert primitive to non primitive using manualBoxing
	public static void manualBoxing() {
		int i=10;
		Integer j=Integer.valueOf(i);
		System.out.println("Manual Boxing");
		System.out.println(j.toString());//objects can call predefined methods. 
	}
	
	//convert non primitive to primitive
	public static void autoBoxing() {
		Integer i=15;
		int j=i; 
		System.out.println("Auto Boxing");
		System.out.println(j);
	}
	
	//manual unboxing
	public static void manualUnboxing() {
		Integer i=20;
		int j=Integer.valueOf(i);
		System.out.println("Manual Unboxing");
		System.out.println(j);
	}
	
	//auto Unboxing
	public static void autoUnboxing() {
		Integer i=25;
		int j=i;
		System.out.println("Auto Unboxing");
		System.out.println(j);
	} 
	
public static void main(String[] args) {
	manualBoxing();
	autoBoxing();
	manualUnboxing();
	autoUnboxing();
}
}
