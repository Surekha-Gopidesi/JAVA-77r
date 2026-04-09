package com.arrays.day1;

public class Frequency {

	public static void main(String[] args) {
	int arr[]= {5,6,7,3,8,9,6,4,5};
	boolean visited[]=new boolean[arr.length];
	for(int i=0;i<arr.length;i++) {
		if(visited[i]==true) {
			continue;
		}
		int count=0;
		for(int j=0;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				count++;
				visited[j]=true;
			}
		}
		System.out.println("The Frequency of "+arr[i]+" is :"+count);
			
	}
	

	}

}
