package com.arrays;

import java.util.Arrays;

public class Merge {

	public static int[] merged(int []num1,int num2[]) {
		int merged[]=new int[num1.length+num2.length];
		for(int i=0;i<num1.length;i++) {
			merged[i]=num1[i];
		}
		for(int j=0;j<num2.length;j++) {
			merged[num1.length+j]=num2[j];
		}
		return merged;
		
	}
	public static void main(String[] args) {
		int num1[]= {1,2,3,4};
		int num2[]= {5,6,7,8};
		System.out.println(Arrays.toString(merged(num1, num2)));
	}

}
