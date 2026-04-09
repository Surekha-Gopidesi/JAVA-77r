package com.arrays.day1;

import java.util.Arrays;

public class Riverese1 {

	public static void main(String[] args) {
		int a[]= {2,4,6};
		int i=0;
		int j=a.length-1;
		for(int k=0;k<=a.length;k++) {
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			
		}
		System.out.println(Arrays.toString(a));

}}
