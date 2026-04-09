package com.functionalInteface;
import java.util.function.*;
class Main1{
	public static boolean isPrime(int num) {
		if(num<=1) {
			return false;
		}
	for (int i=2;i*i<num;i++) {
		if(num%i==0) {
			return false;
		}
	}
	return true;
	}
public static void main(String[] args) {
	

	 Predicate <Integer> p= num->isPrime(num);
	 System.out.println(p.test(5)?"prime":"not prime");
	 
	 
	 Consumer<Character> c=ch->
		System.out.println(isPrime(ch)?"prime":"not prime");
	    c.accept('c');
		
	
}}
