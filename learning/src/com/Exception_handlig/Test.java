package com.Exception_handlig;

 class Test {
	public static void tiMethod(int n)  {
		try {
			
			System.out.println("10000");
			tilMethod(n);
			System.out.println("Coders");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void tilMethod(int n1) {
		try {
			int num=100/n1;
			if(n1==10) {
				throw new Exception("value cant be 10");
			}
			System.out.println("Completed");
		}
		catch(ArithmeticException e) {
			System.out.println("not divisible by zero");
		}
		catch(Exception t) {
//			t.printStackTrace();
			System.out.println("not divisible by 10");
			
			}
		finally {
			System.out.println("finally");
		}
	}
	public static void main(String[] args) {
		Test.tiMethod(0);
		System.out.println("=====================");
		Test.tiMethod(1);
		System.out.println("=====================");
		Test.tiMethod(10);
		System.out.println("=====================");
		Test.tiMethod(15);
	}
}
