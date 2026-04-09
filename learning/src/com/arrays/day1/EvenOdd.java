package com.arrays.day1;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of Elements :");
		int num=sc.nextInt();
		int evencount=0;
		int oddcount=0;
		for(int i=0;i<num;i++) {
			System.out.println("Enter " +i+" Index value :");
			int n=sc.nextInt();
			
		    if(n%2==0) {
		    	evencount++;
		    }
		    else {
		    	oddcount++;
		    }
		}
		System.out.println("Even Count :"+evencount);
		System.out.println("Odd Count :"+oddcount);
		
	}

}
