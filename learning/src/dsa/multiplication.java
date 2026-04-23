package dsa;

import java.util.Arrays;

public class multiplication {
	public static void main(String[] args) {
		int arr1[][]= {{1,2},{3,4}};
		int arr2[][]= {{3,4},{1,2}};
		int res[][]=new int [arr1.length][arr1[0].length];
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[0].length;j++) {
				for(int k=0;k<arr1[0].length;k++) {
					res[i][j]=res[i][j]+arr1[i][k]*arr2[k][i];
				}
			}
			
		}
		System.out.println(Arrays.deepToString(res));
		
	}

}
