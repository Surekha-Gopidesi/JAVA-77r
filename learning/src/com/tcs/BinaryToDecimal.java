package com.tcs;

public class BinaryToDecimal {
public static void main(String[] args) {
 String s="10001";
 int decimal=0;
 int n=s.length();
 for(int i=0;i<n;i++) {
	 int digit=s.charAt(i)-'0';
	 decimal+=digit*Math.pow(2,n-i-1);
 }
 System.out.println(decimal);


}}
