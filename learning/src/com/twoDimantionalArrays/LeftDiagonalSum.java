package com.twoDimantionalArrays;

import java.util.Arrays;

public class LeftDiagonalSum {

		public static void main(String[] args) {
			int a[][]= {{1,2,3},{1,2,3},{1,2,3}};
			int b[][]= {{1,2,3},{1,2,3},{1,2,3}};
			int rowA=a.length;
			int colA=a[0].length;
			
			int sum=0;
			for(int i=0;i<a.length;i++) {
				for(int j=0;j<a.length;j++) {
					if(i==j) {
					sum=sum+a[i][j]+b[i][j];
					}
					
					
				}
			}
			System.out.println("Sum of left Diagonal :"+sum);
			

		}
}
