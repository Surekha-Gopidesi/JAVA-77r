package com.arrays;

public class Student {
int rollNumber;
String name;
int marks[];
public Student(int rollNumber, String name, int[] marks) {
	super();
	this.rollNumber = rollNumber;
	this.name = name;
	this.marks = marks;
}

double calculateAverage(int marks[]) {
	double sum=0;
	for(int num:marks) {
		sum=sum+num;
	}
	
	return sum/marks.length;
}


 public void displayDetails() {
	 System.out.println("Student Roll num :"+rollNumber);
	 System.out.println("Student name:"+name);
	 System.out.println("Student marks :"+calculateAverage(marks));
 }
 public static void main(String[] args) {
//	int[] Student=new int[3];
//	for(int i=0;i<Student.length;i++)
//	{
//		 Student[i]=i*10;
//	}
//	Student s=new Student(52,"Surekha",Student);
//	s.displayDetails();
//	System.out.println(s.calculateAverage(Student));
	 Student s1=new Student(101,"Surekha",new int[] {10,20,30});
	 Student s2=new Student(101,"rekha",new int[] {10,50,30});
	 Student s3=new Student(101,"Sushma",new int[] {10,40,30});
	 Student []s= {s1,s2,s3};
 }
}
