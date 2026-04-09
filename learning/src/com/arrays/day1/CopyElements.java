package com.arrays.day1;

import java.util.Arrays;
import java.util.Scanner;

public class CopyElements {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of Elements :");
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		System.out.println("Enter "+n+"Elements");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			for(int j=0;j<n;j++) {
				b[j]=a[i];
			}
		}
		System.out.println("Copied Array :"+Arrays.toString(a));
		
	}

}
