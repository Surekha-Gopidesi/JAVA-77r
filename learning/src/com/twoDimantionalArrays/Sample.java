package com.twoDimantionalArrays;

public class Sample {
	
	public static boolean isfound(int a[]){
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if((a[j]*2==a[i])&&(i!=j)) {
					return true;
					
				}
				
			}
		}return false;
		
	}

	public static void main(String[] args) {
	System.out.println(isfound(new int[]{10,2,3,5}));
	System.out.println(isfound(new int [] {2,3,5,7}));
     
}
}