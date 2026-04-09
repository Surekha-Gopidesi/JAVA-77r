package com.tcs;

public class DecimalToBinary {

	public static void main(String[] args) {
		int num=11;
		String binary="";
		while(num>0) {
			int rem=num%2;
			binary=rem+binary;
			num/=2;
		}
		System.out.println(binary);

	}

}
