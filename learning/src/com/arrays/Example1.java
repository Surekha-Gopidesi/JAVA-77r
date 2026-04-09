package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Example1 {

//	public static void main(String[] args) {
//	int arr[]=new int[3];
//	arr[0]=10;
//	arr[1]=20;
//	arr[2]=30;
//	for(int i=0;i<=arr.length-1;i++) {
//		System.out.println(arr[i]);
//	}
//
//	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Size :");
		int n=sc.nextInt();// or    int n=Integer.parseInt(sc.nextline());
		
		if((n<=0) ||(n>10)) {
			System.out.println("invalid");	
			
		}else {
			String arr []=new String[n];
		for (int i=0;i<n;i++) {
			System.out.println("enter"+i+"index value :");
			String s=sc.next();
			arr[i]=s;
		}
		System.out.println(Arrays.toString(arr));
		}	
			
		
	
	}
	
	
//	public static void main(String[] args) {
//		double arr[]= {10.5,20.5,30.25};
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
//	}
	
	
//	public static void main(String[] args) {
//		char arr[]= {'A','B','C','D'};
//		for(char a:arr) {
//			System.out.println(a);
//		}
//			
//	}
	
	
//	public static void main(String[] args) {
//	boolean arr[]= {true,false};
//	for(boolean a:arr) {
//		System.out.println(a);
//	}}
	
//	public static void main(String[] args) {
//	int arr[]= {5,15,25,35,45};
//	for(int a:arr) {
//		System.out.println(a);
//	}}
	
	
//	public static void main(String[] args) {
//	String arr[]= { "Delhi", "Mumbai",  "Chennai"};
//	for(String a:arr) {
//		System.out.println(a);
//	}}
	
	
//	public static void main(String[] args) {
//		float arr[]= {  1.1f, 2.2f, 3.3f,  4.4f};
//		for(float a:arr) {
//			System.out.println(a);
//		}}
	
	
//	public static void main(String[] args) {
//		long arr[]= { 100000L, 200000L, 300000L};
//		for(long a:arr) {
//			System.out.println(a);
//		}}
	
//	public static void main(String[] args) {
//		short arr[]= { 100, 200, 300,400};
//		for(short a:arr) {
//			System.out.println(a);
//		}}
	
}
