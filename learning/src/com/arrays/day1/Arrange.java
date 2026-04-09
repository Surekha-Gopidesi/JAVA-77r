package com.arrays.day1;

import java.util.Arrays;

public class Arrange {

	public static void main(String[] args) {
		int a[]= {1,5,0,4,0,2,0};
		int j=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0) {
				int temp=a[j];
				a[j]=a[i];
				a[i]=temp;
				j++;
			}
			
		}
		System.out.println(Arrays.toString(a));

	}

}
