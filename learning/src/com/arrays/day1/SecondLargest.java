package com.arrays.day1;

public class SecondLargest {
public static void main(String[] args) {
	int a[]= {2,5,4,8,6,9,3};
	int largest=a[0];
	int secLargest=a[0];
	for(int i=0;i<a.length;i++) {
		if(a[i]>largest) {
			secLargest=largest;
			largest=a[i];	
		}
		else if(a[i]>secLargest &&a[i]!=largest) {
			secLargest=a[i];
			
		}
	}
	System.out.println("The second largest element is :"+secLargest);
	
}
}
