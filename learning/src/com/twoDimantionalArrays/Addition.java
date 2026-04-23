package com.twoDimantionalArrays;

import java.util.Arrays;

public class Addition {

	public static void main(String[] args) {
		int a[][]= {{1,2,3},{1,2,3},{1,2,3}};
		int b[][]= {{1,2,3},{1,2,3},{1,2,3}};
		int rowA=a.length;
		int colA=a[0].length;
		
		int c[][]=new int [rowA][colA];
		int sum=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				
				c[i][j]=a[i][j]+b[i][j];
				
				
			}
		}
		
		System.out.println(Arrays.deepToString(c));
//		for(int i=0;i<c.length;i++) {
//			System.out.println(Arrays.toString(c[i]));
//		}

	}

}
