package com.arrays.day1;

public class Equilibrium {
	public static void main(String[] args) {
		int a[]= {1,7,3,6,5,6};
		for(int i=0;i<=a.length;i++) {
			int left=0;
			int right=0;
			for(int j=0;j<i;j++) {
				left+=a[j];
			}
			for(int j=i+1;j<=a.length-1;j++) {
				right+=a[j];
			}
			if(left==right) {
				System.out.println(i);
			}
		}
	}

}
