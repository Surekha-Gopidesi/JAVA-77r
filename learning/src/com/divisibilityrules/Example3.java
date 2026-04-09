package com.divisibilityrules;

public class Example3 {

	public static void main(String[] args) {
		int sum=0;
		int num=6;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				sum+=i;
			}
		}
		System.out.println((sum==num)?"perfect":"not perfect");

	}

}
