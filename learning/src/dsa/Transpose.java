package dsa;

import java.util.Arrays;

public class Transpose {
	public static void main(String[] args) {
		
	int arr[][]= {{1,2},{3,4}};
	int c[][]=new int[arr.length][arr[0].length];
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[0].length;j++) {
			c[j][i]=arr[i][j];
		}
	}
	System.out.println(Arrays.deepToString(c));
	}
}
