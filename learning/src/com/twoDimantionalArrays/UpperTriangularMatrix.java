package com.twoDimantionalArrays;

public class UpperTriangularMatrix {
	public static void main(String[] args) {
		int a[][]= {{1,0,0},{1,3,0},{5,7,6}};
		boolean status=true;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<i;j++) {
				if(a[i][j]!=0) {
					status=false;
					
				}
			}
		}
		if(status) {
			System.out.println("It is Upper Triangular Matrix ");
		}
		else {
			System.out.println("Not Upper Triangular matrix");
		}
	}
	

}
