package com.tcs;

public class GCDabdLCM {
	public static int gcd(int a,int b) {
		
		while(b!=0) {
			int temp=b;
			b=(a%b);
			a=temp;
		}
		return a;
	}
	public static void LCM() {
		int a=12;int b=18;
		int lcm=(a*b)/gcd(a,b);
		System.out.println("LCM "+lcm);
	}
	
public static void main(String[] args) {
	System.out.println("GCD :"+gcd(12,18));
	LCM();
}
}
