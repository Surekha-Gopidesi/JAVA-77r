package com.divisibilityrules;

//public class example2 {
//public static void main(String[] args) {
//
//int num=123;
//int temp=num;
//int sum=0;
//int product=1;
//while(num>0) {
//	int rem=num%10;
//	sum+=rem;
//	product*=rem;
//	num=num/10;
//}
//System.out.println((sum==product)?"spy":"not spy");
//
//
//}}

class example2{
	public static boolean say(int num) {
//		 num=123;
		int temp=num;
		int sum=0;
		int product=1;
		while(num>0) {
			int rem=num%10;
			sum+=rem;
			product*=rem;
			num=num/10;
		}return sum==product;
	}
	public static void main(String[] args) {
		for(int i=1;i<=100;i++) {
			if(say(i)) {
				System.out.println(i);
			}
			
		}
	}
}
