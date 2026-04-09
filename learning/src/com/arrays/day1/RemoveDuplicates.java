package com.arrays.day1;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int a[]= {1,0,5,0,1,3,3,8,4,9};
		System.out.println("Before removing :"+Arrays.toString(a)+" ");
		Arrays.sort(a);
		for(int i=0;i<a.length;i++) {
			if((i==0)||a[i]!=a[i-1]) {
				System.out.print(+a[i]+" ");
			}
		}

	}

}
