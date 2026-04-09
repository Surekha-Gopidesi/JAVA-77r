package com.arrays.day1;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of Elements :");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter index value");
		
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
System.out.println("Reversed Array :");

for(int i=size-1;i>=0;i--) {
	System.out.print(a[i]+" ");
}

}

}
