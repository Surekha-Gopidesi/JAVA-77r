package com.stringproblemsoliving;

public class LetterCount {

	public static void main(String[] args) {
		String s="ammu";
		
		
		for(int i=0;i<s.length();i++) {
			int count=0;
			boolean isprinted=false;
			for(int k=0;k<i;k++) {
				if(s.charAt(i)==s.charAt(k)) {
					isprinted=true;
					break;
				}
			}
			if(isprinted) 
				continue;
			for(int j=0;j<s.length();j++) {
				if (s.charAt(i)==s.charAt(j)) {
					count++;
				}
			}	
			System.out.println(s.charAt(i)+" count :"+ count);
			
		}
	}

}
