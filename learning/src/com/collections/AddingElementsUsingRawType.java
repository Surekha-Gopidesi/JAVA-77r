package com.collections;

import java.util.ArrayList;

public class AddingElementsUsingRawType {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add(52);
		a1.add("Java");
		a1.add(55.0);
		a1.add("python");
		
		for(Object obj:a1) {
			System.out.println(obj);	
		}
		System.out.println("\nAccessing String Type values");
		String s=(String) a1.get(1);
		System.out.println(s);
		System.out.println("\nAccessing Integer Values ");
		int i=(int) a1.get(0);
		System.out.println(i);
		
	}
}
