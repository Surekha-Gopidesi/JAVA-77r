package dsa;

import java.util.Arrays;

public class Jumping {
	 public static int[] jump(int x) {
		 int arr[]=new int[3];
		 int i=1;
		 int x1=0;
		 while(Math.pow(i, 2)<10) {
			 arr[x1++]=(int)Math.pow(i, 2);
			 i++;
		 }
		return arr;
	 }
	
	public static void main(String[] args) {
		int x=10;
		int arr[]=jump(x);
		System.out.println(Arrays.toString(arr));

	}

}
