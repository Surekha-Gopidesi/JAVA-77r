package com.encapsulation;

public class Manager extends Employee {
	double bonus=20000.0;

	public static void main(String[] args) {
		Manager m=new Manager();
      double totalsalry=(m.salary+m.bonus);
      System.out.println("totalSalry :"+totalsalry);
	}

}
