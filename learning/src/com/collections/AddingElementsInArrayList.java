package com.collections;

import java.util.ArrayList;

public class AddingElementsInArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList();
		for(int i=1;i<=10;i++) {
			arr.add(i);
		}
		System.out.println("Adding Elements into the Arraylist :");
		System.out.println(arr);
		int a=arr.get(5);
		System.out.println("Accessing Element:");
		System.out.println(a);
		
	}
	

}
