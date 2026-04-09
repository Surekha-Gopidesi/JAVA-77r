package com.arrays.day1;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an array :");
		int n=sc.nextInt();
		int []a=new int[n];
		
		int sum=0;
		System.out.println("Enter "+(n+1)+" Elements :");
		for(int i=0;i<=n;i++) {
		
             int num=sc.nextInt();
             sum=sum+num;
		}
		System.out.println("Sum of the Elements :"+sum);

	}

}
