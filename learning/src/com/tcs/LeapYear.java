package com.tcs;

import java.util.Arrays;

public class LeapYear {

public static void checkYear(int year) {
	if((year%4==0)&&(year%100!=0)||(year%4==0)) {
		System.out.println("leap year");
	}
	else {
		System.out.println("not a leap year");
	}
}


public static void reverse(String s) {
	String rev="";
	for(int i=s.length()-1;i>=0;i--) {
		rev+=s.charAt(i);
	}
	System.out.println("Reverse of a string :"+rev);
}


public static void reverseArray() {
	int arr[]= {1,2,3,4,5};
	int i=0;
	int j=arr.length-1;
	while(i<j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		i++;
		j--;
		
		
	}
	System.out.println(Arrays.toString(arr));
}


public static void checkAnagram(String s1,String s2) {
	String a=s1.toLowerCase();
	String b=s2.toLowerCase();
	char ch1[]=a.toCharArray();
	char ch2[]=b.toCharArray();
	
    Arrays.sort(ch1);
    Arrays.sort(ch2);
    if(Arrays.equals(ch1,ch2)) {
    	System.out.println("Anagram");
    }
    else {
    	System.out.println("Not A Anagram");
    }
	
}

public static void removeDuplicates() {
	int arr[]= {1,2,2,3,4,5,4};

	for(int i=0;i<arr.length;i++) {
		
		boolean isfound=false;
		for(int j=0;j<i;j++) {
			if(arr[i]==arr[j]) {
				isfound=true;
				break;
			}
			
		}
		if(!isfound) {
			System.out.print(arr[i]+"  ");
		}
		
	}
	System.out.println();
}
public static void removeStringDuplicates(String s) {
	String res=" ";
	for(int i=0;i<s.length();i++) {
		boolean isfound=false;
		char ch=s.charAt(i);
		for(int j=i+1;j<s.length();j++) {
			if(ch==s.charAt(j)) {
				isfound=true;
				break;
			}
			
		}
		if(!isfound) 
			res+=s.charAt(i);
	}
		System.out.println(res);
	
	
}
public static void secondlargest() {
	int arr[]= {1,2,3,4,5};
	int largest=arr[0];
	int secLargest=arr[0];
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>largest) {
			secLargest=largest;
			largest=arr[i];
			
		
		}
		else if(arr[i]>secLargest && arr[i]!=largest) {
			
			secLargest=arr[i];
		}
	}
//	System.out.println("The largest element :"+largest);
	System.out.println("the second largest element :"+secLargest);
	
}

public static void main(String[] args) {
	checkYear(2023);
	reverse("Surekha");
	reverseArray();
	checkAnagram("TEA","eat");
	removeDuplicates();
	removeStringDuplicates("amma");
	secondlargest();
	
}
}
