package com.twoDimantionalArrays;

import java.util.Arrays;

public class Multiplication {

	public static void main(String[] args) {
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int b[][]= {{9,8,7},{6,5,4},{3,2,1}};
		int rowA=a.length;
		int colA=a[0].length;
		
		int c[][]=new int [rowA][colA];
		int mul=1;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				
				c[i][j]=a[i][j]*b[i][j];
				
				
			}
		}
		
		for(int i=0;i<c.length;i++) {
			System.out.println(Arrays.toString(c[i]));
		}

	}

}
