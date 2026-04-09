package com.tcs;

import java.util.Arrays;

public class FreaquencyCount {

	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5,5,5,3,3,2,6};
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
		int count=1;
	
			while(i<arr.length-1&&arr[i]==arr[i+1]) {
				count++;
				i++;
				
		}
		System.out.println("count of "+arr[i]+" "+count);
		

	}

}
}