package com.twoDimantionalArrays;

import java.util.Arrays;

public class LowerTriangle {

	public static void main(String[] args) {
		int a[][]= {{1,2,3},{0,1,5},{0,0,6}};
		
		boolean status=true;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i][j]!=0) {
					status=false;
					break;
					
				}
			}
		}
		if(status) {
			System.out.println("It is Lower Triangular Matrix ");
		}
		else {
			System.out.println("Not Lower Triangular matrix");
		}

	}

}
