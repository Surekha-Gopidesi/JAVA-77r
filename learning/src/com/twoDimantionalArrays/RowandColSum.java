package com.twoDimantionalArrays;

public class RowandColSum {

	public static void main(String[] args) {
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		
		
		for(int i=0;i<arr.length;i++) {
			int sum1=0;
			int sum2=0;
			for(int j=0;j<arr[i].length;j++) {
				sum1=sum1+arr[i][j];
				sum2=sum2+arr[j][i];
		}
			System.out.println(i+" Row sum :"+sum1);
			System.out.println(i+" col sum :"+sum2);
			System.out.println("===============");

	}
		
		}

	}


