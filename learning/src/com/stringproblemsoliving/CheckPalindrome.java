package com.stringproblemsoliving;

public class CheckPalindrome {
	
	public static boolean ispalindrome(String s) {
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);	
		}
		return rev.equals(s);
	}
	
	public static String removeDuplicate(String s) {
		String res="";
		
		for(int i=0;i<s.length();i++) {
			boolean isfound=false;
			char ch=s.charAt(i);
		
		for(int j=0;j<i;j++) {
			if(ch==s.charAt(j)) {
				isfound=true;
				break;
			}
		}
			
			if(!isfound) {
				res+=s.charAt(i);
			}
		
		
		}
		return res;
		
	}

	public static void main(String[] args) {
		boolean res=ispalindrome("AMMA");
		System.out.println((res)?"palindrome":"not a palindrome");
		
		
		System.out.println("After removing duplicates : " +removeDuplicate("amma"));

	}

}
