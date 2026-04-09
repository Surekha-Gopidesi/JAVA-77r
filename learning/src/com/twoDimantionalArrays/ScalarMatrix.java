package com.twoDimantionalArrays;

public class ScalarMatrix {

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
					else {
						if(a[i][j]!=d) {
							status=false;
						}
					}
					
				
			}
		}
		if(status) {
			System.out.println("Scalar Matrix");
		}else {
			System.out.println("NOt a Scalar Matrix");
		}

	}

}
