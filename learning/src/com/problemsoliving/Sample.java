package com.problemsoliving;

import java.util.Arrays;

public class Sample {
	
	public void sample(String s1, String s2) {
		String a=s1.toLowerCase();
		String b=s2.toLowerCase();
		 char ch1[]=a.toCharArray();
		 char ch2[]=b.toCharArray();
		 Arrays.sort(ch1);
		 Arrays.sort(ch2);
		 if(Arrays.equals(ch1, ch2)) {
			 System.out.println("Anagram");
		 }
		 else {
			 System.out.println("Not a Anagram");
		 }
	}
	public static void main(String[] args) {
		Sample s=new Sample();
		s.sample("eat", "tea");
		
		
}}

