package com.functionalInteface;
import java.util.function.Consumer;
import java.util.function.Predicate;;

public class Employee {
	private String empName;
	private String empDesg;
	private double empsal;
	public Employee(String empName, String empDesg, double empsal) {
		super();
		this.empName = empName;
		this.empDesg = empDesg;
		this.empsal = empsal;
	}
	
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpDesg() {
		return empDesg;
	}

	public void setEmpDesg(String empDesg) {
		this.empDesg = empDesg;
	}

	public double getEmpsal() {
		return empsal;
	}

	public void setEmpsal(double empsal) {
		this.empsal = empsal;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empDesg=" + empDesg + ", empsal=" + empsal + "]";
	}
	
	
}
class Main{
public static void main(String[] args) {
Predicate <Employee> pre=new Predicate<Employee>() {
		
		@Override
		public boolean test(Employee t) {
			
			return t.getEmpsal()>1000;
		}
	};
	
	Consumer<Employee> c=new Consumer<Employee>(){


		@Override
		public void accept(Employee t) {
			System.out.println(t);
			
		}
		};
		
	Employee emp1=new Employee("Surekha","Developer",45000);
	Employee emp2=new Employee("Sushma","Tester",48000);
	Employee emp3=new Employee("Bhanu","Manager",45000);
	Employee ee[]= {emp1,emp2,emp3};
	for(Employee E:ee) {
		if(pre.test(E)) {
			E.setEmpsal(E.getEmpsal()+E.getEmpsal()*0.1);
		  c.accept(E);
		}
	}
	
	
}
}	
