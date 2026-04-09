package com.arrays;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length : ");
		int n=sc.nextInt();
		String arr[]=new String[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter names");
			arr[i]=sc.next();
			
		}
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
			
		}
		
		
	}

}
