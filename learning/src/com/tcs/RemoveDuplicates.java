package com.tcs;

public class RemoveDuplicates {
	public static String remove(String s) {
		String rev="";
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
				rev+=s.charAt(i);
			}
		}return rev;
	}

	public static void main(String[] args) {
	System.out.println(remove("mama"));

	}

}
