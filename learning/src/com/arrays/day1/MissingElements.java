package com.arrays.day1;

public class MissingElements {
	public static void main(String[] args) {
		int  a[]= {1,2,4};
		int start=a[0];
		int end=a[a.length-1];
		System.out.println("The missing elements in an array :");
		for(int i=start+1;i<=end;i++) {
			if(a[i]==i)
			System.out.print(i+" ");
		}
	}

}
