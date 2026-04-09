package com.tcs;

import java.util.Arrays;

public class HighestFrequency {
 public static void main(String[] args) {
// int arr[]= {1,2,2,3,3,3,4};
// int maxCount=0;
// int maxElement=0;
// for(int i=0;i<arr.length;i++) {
//	 int count=1;
//	 for(int j=i+1;j<arr.length;j++) {
//		 if(arr[i]==arr[j]) {
//			 count++;
//			 
//		 }
//		 if(count>maxCount) {
//			 maxCount=count;
//			 maxElement=arr[i];
//		 }
//	 }
// }
// System.out.println("maximum Count is "+maxCount);
// 
// 
// 
// 
// 
	 
	 int arr[]= {1,2,3,4,4};
	 Arrays.sort(arr);
	 for(int i=0;i<arr.length;i++) {
		 
		 int count=1;
		 while(i<arr.length-1 && (arr[i]==arr[i+1])) {
				 count ++;
				 i++;
		 }
			 System.out.println("the count of "+arr[i]+"is :"+count); 
		 
	 }
 
 }
 
 
 
}
