package com.arrays.day1;

public class MaxminValues {
public static void main(String[] args) {
	int a[]= {3,6,7,4,9,2,8};
	int max=a[0];
	int min=a[0];
	for(int i=0;i<a.length;i++) {
		if(a[i]>max) {
			max=a[i];
			
		}
		 if(a[i]<min) {
			min=a[i];
		}
	}
	System.out.println("Maximum value:"+max);
	System.out.println("Minimum Value :"+min);
}
}
