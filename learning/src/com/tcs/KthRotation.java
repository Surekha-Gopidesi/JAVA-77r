package com.tcs;

import java.util.Arrays;

public class KthRotation{
	
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5,6};
	int k=2;
	int n=arr.length;
	for(int i=0;i<k;i++) {
		int last=arr[n-1];
		for(int j=n-1;j>0;j--) {
			arr[j]=arr[j-1];
		}
		arr[0]=last;
	}
	System.out.println(Arrays.toString(arr));
}

}
