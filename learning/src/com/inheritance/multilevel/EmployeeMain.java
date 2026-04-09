package com.inheritance.multilevel;

public class EmployeeMain {

	public static void main(String[] args) {
		 
					Employee e1=new Employee("Surekha", 50000.0);
					e1.calculateAnnualSalary();
					System.out.println("===================");
					
					Employee e2=new Manager("Sushma", 50000.0, 10000.0, 10);
					Manager m=(Manager) e2;
					m.calculateManagerSalary();
					System.out.println("===================");
					Employee e3=new Engineer("Surekha", 40000.0, 10);
					Engineer en=(Engineer) e3;
					en.calculateEngineerSalary();
					System.out.println("================");
					Employee e4=new Salesperson("Surekha", 30000.0, 5, 100);
					Salesperson s1=(Salesperson)e4;
					s1.calculateSalespersonSalary();

				}
				
			}

	