package com.minitask;

import java.util.InputMismatchException;
import java.util.Scanner;

class OnlineRegistration{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter Student Id");
			int id=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Student Name");
			String name=sc.next();
			int marks[]=new int[3];
			for(int i=0;i<=3;i++) {
				System.out.println("enter :");
				marks[i]= sc.nextInt();
				if(marks[i]<0||marks[i]>100) {
					throw new IllegalArgumentException("Marks should between 0 and 100");
				}
			
			}
			Student st=new Student(id, name, marks);
			st.displayStudentDetails();
			
		}
		catch(InputMismatchException e) {
			System.out.println("invalid input type");
		}
		catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		finally {
			sc.close();
		}
	}
	
}

