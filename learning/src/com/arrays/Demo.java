package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public interface Demo {
	public static int [] display() {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter Size :");
	int n=sc.nextInt();
	
	if((n<=0) ||(n>10)) {
	return null;	
		
	}else {
		int arr []=new int[n];
	for (int i=0;i<n;i++) {
		System.out.println("enter "+i+" index value :");
		int s=sc.nextInt();
		arr[i]=s;
	}
//	System.out.println(Arrays.toString(arr));
	return arr;
	}	

}
}
