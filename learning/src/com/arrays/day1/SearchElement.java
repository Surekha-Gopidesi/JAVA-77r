package com.arrays.day1;

import java.util.Scanner;

public class SearchElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the No of Elements :");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter "+n+ " elements");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			
		}
		System.out.println("Enter Element to search :");
		   int key=sc.nextInt();
		for(int i=0;i<n;i++) {
			
			if(a[i]==key) {
				System.out.println("Element found at index position :"+(i));
			}
		}

	}

}
