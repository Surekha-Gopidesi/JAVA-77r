package com.stringproblemsoliving;

public class LargestSubstring {

	public static void main(String[] args) {
		String str="abcdabbade"
				+ "";
		int max=0;
		for(int i=0;i<str.length();i++) {
			int arr[]=new int[256];
			int count=0;
			for(int j=i;j<str.length();j++) {
				if(arr[str.charAt(j)]==1) {
					break;
					
				}
				else {
					arr[str.charAt(j)]=1;
					count++;
					if(count>max) {
						max=count;
					}
					
				}
			}
			
		}
		System.out.println("largest substring length :"+max);

	}

}
