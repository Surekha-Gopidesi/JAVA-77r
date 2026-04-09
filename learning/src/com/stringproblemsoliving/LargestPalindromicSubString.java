package com.stringproblemsoliving;

public class LargestPalindromicSubString {
	public static void main(String[] args) {
		
	
	String s="abbbace";
	String largest="";
	for(int i=0;i<s.length();i++) {
		for(int j=i;j<s.length();j++) {
			String sub=s.substring(i,j+1);
			String rev="";
			for(int k=sub.length()-1;k>=0;k--) {
				rev=rev+sub.charAt(k);
				if(sub.equals(rev)) {
					if(sub.length()>largest.length()) {
						largest=sub;
					}
				}}
			}
		}
		System.out.println("Largest palindromic subString : "+largest);

}}
