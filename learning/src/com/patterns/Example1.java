package com.patterns;

public class Example1 {
	public static void main(String[] args) {
		int n=4;
		
		
		//Right angle Triangle
		System.out.println("Right angle Triangle");
		for(int i=1;i<=n;i++) {
			String s="";
			for(int j=1;j<=i;j++) {
				s=s+"*";
			}
			System.out.println(s);
		}
		
		System.out.println("Reverse Right angle Triangle");
		for(int i=n;i>0;i--) {
			String s="";
			for(int j=1;j<=i;j++) {
				s=s+"*";
			}
			System.out.println(s);
		}
		System.out.println("square");
		
		for(int i=1;i<=n;i++) {
			String s="";
			for(int j=1;j<=n;j++) {
				s=s+"*";
			}
			System.out.println(s);
		}
		
		
		System.out.println("rectangle");
		for(int i=1;i<=n;i++) {
			String s="";
			for(int j=1;j<=n*2;j++) {
				s=s+"*";
			}
			System.out.println(s);
		}
		
		
		
		
	}

}
