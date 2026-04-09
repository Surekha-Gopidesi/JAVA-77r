package com.inheritance.heirarchical;

public class Main {
	    public static void main(String[] args) {
	        Developer d1 = new Developer();
	        d1.salary();
	        d1.writeCode();
System.out.println("======================");
	        Tester test = new Tester();
	        test.salary();
	        test.testApplication();
	    }
	}


