package com.twoDimantionalArrays;

public class DiagonalMatrix {

	public static void main(String[] args) {
		int [][]a= {{10,0,0},{0,1,0},{0,0,10}};
		boolean status=true;
		int d=a[0][0];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				if(i!=j) {
					if(a[i][j]!=0) {
						status=false;
						break;
						
					}	
				}
				
			}
		}
		if(status) {
			System.out.println("Diagonal Matrix");
		}else {
			System.out.println("Not a Diagonal Matrix");
		}

	}

}
