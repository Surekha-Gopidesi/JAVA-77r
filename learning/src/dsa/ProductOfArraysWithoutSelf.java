package dsa;

import java.util.Arrays;

public class ProductOfArraysWithoutSelf {
	public static int[] product(int []nums) {
		int arr[]=new int[nums.length];
		for(int i=0;i<nums.length;i++) {
			int prod=1;
			for(int j=0;j<nums.length;j++) {
				if(i==j) {
					continue;
				}
				prod*=nums[j];
			}
			arr[i]=prod;
		}
		return arr;
	}
	
	
	public static void main(String[] args) {
		int arr[]= {1,2,3,4};
		System.out.println(Arrays.toString(product(arr)));
		
	}
	

}
