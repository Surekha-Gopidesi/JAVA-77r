package com.Exception_handlig;

public class Example1 {
public static void main(String[] args) {
	
//	try {
//		int c=10/0;
//		System.out.println(c);
//	}
//	catch(Exception e){
//		System.out.println(e.getMessage());
//	}
//	System.out.println("hello");
	
	
	try {
	String s=null;
	System.out.println(s.toUpperCase());
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	System.out.println("hello");
	
}
}
