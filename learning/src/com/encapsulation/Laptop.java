package com.encapsulation;

public class Laptop extends Computer {
 public void showModel() {
	 System.out.println("Model : XPS 15");
 }
	public static void main(String[] args) {
		Laptop l1=new Laptop();
		l1.showBrand();
		l1.showModel();
	}

}
