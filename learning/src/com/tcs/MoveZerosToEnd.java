package com.tcs;

import java.util.Arrays;

public class MoveZerosToEnd {
public static void main(String[] args) {
	int arr[]= {1,2,0,4,3,0,5};
	int l=0;
	for(int r=0;r<arr.length;r++) {
		if(arr[r]!=0) {
		int temp=arr[r];
		arr[r]=arr[l];
		arr[l]=temp;
		l++;
	}}
	System.out.println(Arrays.toString(arr));
}
}
