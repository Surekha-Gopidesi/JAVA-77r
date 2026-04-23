package dsa;

import java.util.Arrays;

public class Addition2D {
	public static void main(String[] args) {
		int arr1[][]= {{1,2,3},{1,2,3}};
		int arr2[][]= {{1,2,3},{1,2,3}};
		int c[][]=new int[arr1.length][arr1[0].length];
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<=arr1.length;j++) {
				c[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
		System.out.println(Arrays.deepToString(c));
		
		
//		for(int i=0;i<arr1.length;i++) {
//			System.out.println(Arrays.toString(c[i]));
//		}
		
		
//		for(int i=0;i<arr1.length;i++){
//			for(int j=0;j<arr1[0].length;j++) {
//				System.out.print(c[i][j]+" ");
//			}
//			System.out.println();	
//		}
	}

}
