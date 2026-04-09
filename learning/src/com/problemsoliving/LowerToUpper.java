package com.problemsoliving;
//1.JAVA-java

public class LowerToUpper {

	public static void main(String[] args) {
		String s="surekha";
		String res="";
		for(int i=0;i<s.length();i++) {
//			char ch=s.charAt(i);
//			if(ch>='a'&&ch<='z') {
//				res+=(char)(ch-32);
//			}
//			else {
//				res+=(char)(ch+32);
//			}
			res+=(char)(s.charAt(i)-32);
		}
		
System.out.println(res);
	}

}
