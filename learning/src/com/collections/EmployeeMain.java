package com.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeMain {
	
		 public static void main(String[] args) {
			  ArrayList<EmployeeManagement> obj=new ArrayList<EmployeeManagement>();
			 
			Scanner sc=new Scanner(System.in);

			boolean flag=true;
			while(flag) {
				 System.out.println("1.Add Employee\n2.Display All Employees \n3.Find Highest Salary "
				 		+ "\n4.Increase Salary By Percentage \n5.exit");
				 System.out.println("Enter your Choice");
					int choice=sc.nextInt();
					switch(choice) {
					case 1:System.out.println("Enter Id :");
					       int id1=sc.nextInt();
					 
					       System.out.println("Enter your Name :");
					       String name1=sc.next();
					       
					       System.out.println("Enter salary :");
					       double sal=sc.nextDouble();
//					       if(EmployeeManagement.id!=id1 && sal>0)
					       obj.add (new EmployeeManagement(id1,name1,sal));
					      break;
					      
					      
					case 2:System.out.println("all the Employees :");
					       for( EmployeeManagement e:obj) {
					    	   System.out.println(e);
					    	   
					       }
					       break;
					       
					case 3:System.out.println("Heighest salary is :");
					 double max=0;
					 for( EmployeeManagement e:obj) {
//						 System.out.println(e);
						 if(e.salary>max) {
							 max=e.salary;
						 }   
				       }
					 System.out.println(max);
					 break;
					 
					 
					case 4:
						System.out.println("Enter your increment percentage");
						int per=sc.nextInt();
						for(EmployeeManagement e:obj) {
							
							System.out.println(e.salary*per/100
									+e.salary);
						}
						break;
					
					case 5:
						 System.out.println("Exit\n thank you...");
						 flag=false;
						 break;
						 
					}
				
				
			}
			
		}
		
	}


