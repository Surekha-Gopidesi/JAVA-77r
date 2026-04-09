package com.twoDimantionalArrays;

import java.util.Arrays;

public class Transpose {
public static void main(String[] args) {
	int org[][]= {{1,2,3},{7,8,9}};
	int rows=org.length;
	int cols=org[0].length;
	int transpose[][]=new int [cols][rows];
	for(int i=0;i<rows;i++) {
		for(int j=0;j<cols;j++) {
			transpose[j][i]=org[i][j];
		}
	}
	
	System.out.println("transpose matrix :");
	for(int i=0;i<cols;i++) {
		for (int j=0;j<rows;j++) {
			System.out.print(transpose[i][j]+" ");
		}
		System.out.println();
	}

}
	
}
