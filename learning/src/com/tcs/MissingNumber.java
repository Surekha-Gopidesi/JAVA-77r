package com.tcs;

public class MissingNumber {
	public static int findNum(int [] nums,int n) {
		int ExpectedSum=n*(n+1)/2;
		int actualSum=0;
		for(int num:nums) {
		      actualSum+=num;
		}
		return ExpectedSum-actualSum;
	}
 public static void main(String[] args) {
	int [] nums= {1,3,4,5,6};
	int n=6;
	System.out.println("the missing Number is :"+findNum(nums, n));
	
}
}
