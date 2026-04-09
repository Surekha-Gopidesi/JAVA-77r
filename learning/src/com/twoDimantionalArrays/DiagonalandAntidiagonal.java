package com.twoDimantionalArrays;

public class DiagonalandAntidiagonal {

	public static void main(String[] args) {
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
	
		System.out.println("Diagonal Values :");
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr.length;j++) {
				if(i==j) {
					System.out.println(arr[i][j]);
				}			
		}

	}
		System.out.println("Anti Diagonal values :");
		for(int i=0;i<arr.length;i++){
		for(int j=0;j<arr.length;j++){
			if((i+j)==arr.length-1) {
		System.out.print(arr[i][j]);
			}
		}
		System.out.println();
		}
		
		}

	}


