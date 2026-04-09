package com.tcs;

public class LongestPalindrome {

	public static void main(String[] args) {
		String s="babai";
		String longest="";
		for(int i=0;i<s.length();i++) {
			for(int j=i;j<s.length();j++) {
				String sub=s.substring(i,j+1);
				String rev="";
				for(int k=sub.length()-1;k>=0;k--) {
					rev=rev+sub.charAt(k);
					if(sub.equals(rev)) {
						if(sub.length()>longest.length()) {
							longest=sub;
						}
					}
				}
			}
		}
		System.out.println(longest);

	}

}
