package com.tcs;

public class Kadene {
 public static int sum(int [] num) {
	 int left=num[0];
	 int right=num[0];
	 for(int i=1;i<num.length;i++) {
		 right=Math.max(num[i], num[i]+right);
		 left=Math.max(left, right);
	 }
	 return left;
	 
 }
 public static void main(String[] args) {
	int arr[]= {-1,3,6,-3,5,-1,-2,7};
	System.out.println("max suubarray sum :"+sum(arr));
	
}
}
