package com.stringproblemsoliving;

public class VowelCount {
	
	public static int countVowels(String s) {
		
		int count=0;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
				count++;
			}
			
		}return count;
	}
	
	
	  public static void main(String[] args) {
		int s=countVowels("surekhaaaaaa");
		System.out.println(s);
	}
}
