package com.arrays.day1;

public class LagestElement {
	public static void main(String[] args) {
		int a[]= {2,4,3,5,7};
			int max=a[0];
			for(int i=0;i<a.length;i++) {
				if(a[i]>max) {
					max=a[i];
				}
				
				
			}
			System.out.println("The largest element in Array is :"+max);
			
		}
	}

