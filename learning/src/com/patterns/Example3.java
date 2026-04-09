package com.patterns;

public class Example3 {
public static void main(String[] args) {
	int n=3;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println("");
		
	}
	for(int i=n-1;i>0;i--) {
		for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println("");
	}
//	
//	
//	for(int i=1;i<=n;i++) {
//		for(int j=1;j<=n-i;j++) {
//			System.out.print(" ");
//		}
//		for(int k=1;k<=i;k++) {
//			System.out.print("*");
//		}
//		System.out.println();
//	}
//
//	for(int i=n-1;i>0;i--) {
//		for(int j=1;j<=n-i;j++) {
//			System.out.print(" ");
//		}
//		for(int k=1;k<=i;k++) {
//			System.out.print("*");
//		}
//		System.out.println();
//	}
//	
	
	//butterfly
//	int n=5;
//	for (int i=1;i<=n;i++) {
//		for(int j=1;j<=n;j++) {
//			if(j==1||j==n||i==j||i+j==n+1||i==Math.floor((n+1)/2)) {
//				System.out.print("* ");
//			}
//			else {
//				System.out.print("  ");
//			}
//		}
//		System.out.println();
//		
//	}
//	
	
	
	
}}
