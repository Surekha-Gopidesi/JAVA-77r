package com.tcs;

import java.util.Arrays;

public class Merge {
	
	public static void main(String[] args) {
	

	int arr1[]= {4,2,3,4};
	int arr2[]= {5,6,7,8};
	int merge[]=new int[arr1.length+arr2.length];
	for(int i=0;i<arr1.length;i++) {
		merge[i]=arr1[i];
	}
	for(int j=0;j<arr2.length;j++) {
		merge[arr1.length+j]=arr2[j];
	}
	System.out.println("Merged Array :"+Arrays.toString(merge));
	

}
}