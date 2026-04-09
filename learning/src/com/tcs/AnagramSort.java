package com.tcs;

import java.util.Arrays;

public class AnagramSort {
public static boolean isanagram(String a,String b) {
	if(a.length()!=b.length())
		return false;
	char [] aChar=a.toCharArray();
	char [] bChar=b.toCharArray();
	Arrays.sort(aChar);
	Arrays.sort(bChar);
	return Arrays.equals(aChar, bChar);
}
public static void main(String[] args) {
	System.out.println(isanagram("amma", "mama"));
}
}
