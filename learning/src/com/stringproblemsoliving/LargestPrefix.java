package com.stringproblemsoliving;

public class LargestPrefix {
	public static void main(String[] args) {
		String str[]= {"Surekha","Surekha Sushma","Surekha yadav"};
		String shortest=str[0];
		String prefix="";
		for(int i=0;i<str.length;i++) {
			if(str[i].length()<shortest.length()) {
				shortest=str[i];
				
			}
		}
		
		for(int i=0;i<shortest.length();i++) {
			int count=0;
			for(int j=0;j<str.length;j++) {
				if(str[j].charAt(i)==shortest.charAt(i)) {
					count++;
					
				}
				else {
					break;
				}
			}
		    if(count==str.length) {
		    	prefix+=shortest.charAt(i);
		    }
		}
		System.out.println("Largest prefix :"+ prefix);
	}

}
