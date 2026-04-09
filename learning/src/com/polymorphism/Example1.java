package com.polymorphism;

 class A{
	public void print(int a) {
		System.out.println("parent method");
	}
}
 class B extends A{
	 public void print(int a) {
		 System.out.println("Child method");
	 }
 }
 class Example1 {
	 public static void main(String[] args) {
		A a=new A();
		a.print(10);
		System.out.println("============");
		A a1=new B();
		B b=(B) a1;
		b.print(20);
	}
	

}
