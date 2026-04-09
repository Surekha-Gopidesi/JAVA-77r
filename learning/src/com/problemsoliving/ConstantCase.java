package com.problemsoliving;

public class ConstantCase {

	public static void main(String[] args) {
//		String str="HELLO SUREKHA";
//		String str="hello surekha";
		String str="Hello Surekha";
		String res=" ";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>='A'&&ch<='Z') {
				 res+=(char)(ch+32);
			}
			else {
				res+=(char)(ch-32);
			}
		}
		System.out.println(res);

	}

}
