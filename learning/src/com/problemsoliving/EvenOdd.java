package com.problemsoliving;

import java.util.Arrays;

public class EvenOdd {

	public static void main(String[] args) {
		int a[]= {6,7,11,2,1,3,12};
		int even[]=new int[a.length];
		int odd[]=new int[a.length];
		int ecount=0;
		int oddcount=0;
		for(int i=0;i<a.length;i++) {
			if((a[i]&1)==0) {
				 even[ecount]=a[i];
				 ecount++;
			}
			else {
				odd[oddcount]=a[i];
				oddcount++;
			}
		}
		for(int i=0;i<ecount;i++) {
			System.out.print(even[i]+" ");
		}
		System.out.println(" ");
		for(int i=0;i<oddcount;i++) {
			System.out.print(odd[i]+" ");
		}
	
		
	}

}
