package com.patterns;

public class Example4 {

	public static void main(String[] args) {
		int n=7;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			for(int j=1;j<=2*(n-i);j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	
	
	for(int i=n-1;i>0;i--) {
		for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
		for(int j=1;j<=2*(n-i);j++) {
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	
	for (int i=1;i<=n;i++) {
		for(int j=1;j<=n;j++) {
			if(j==1||i==n||i==j) {
				System.out.print("* ");
			}
			else { 
				System.out.print("  ");
			}
		}
		System.out.println();
		
	}
	
//	int n=5;
	
	System.out.println("==========================");
	for (int i=1;i<=n;i++) {
		for(int j=1;j<=n;j++) {
			if(j==1||j==n||i==j||i+j==n+1) {
				System.out.print("* ");
			}
			else {
				System.out.print("  ");
			}
		}
		System.out.println();
		
	}

}

}
