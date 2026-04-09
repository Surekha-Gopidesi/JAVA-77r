package com.divisibilityrules;

public class example1 {

	public static void main(String[] args) {
		//Divisibility of 2
		int num=5;
		int last=num%10;
		if(last==0||last==2||last==4||last==6||last==8) {
			System.out.println("divisibility rule of 2");
		}

		
		//3
//		int n = 123;
//		int sum = 0;
//
//		while(n > 0){
//		    sum += n % 10;
//		    n /= 10;
//		}
//
//		if(sum % 3 == 0)
//		    System.out.println("Divisible by 3");
//		else
//		    System.out.println("Not divisible by 3");
//	}
	//4
	int n = 312;

	if((n % 100) % 4 == 0)
	    System.out.println("Divisible by 4");
	else
	    System.out.println("Not divisible by 4");

}}
