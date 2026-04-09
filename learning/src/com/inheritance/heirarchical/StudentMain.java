package com.inheritance.heirarchical;

public class StudentMain {
	public static void main(String[] args) {
		
	
	Student st=new Student(52,"Surekha");
	st.displayStudentInfo();
	System.out.println("================");
	Student undergraduate = new Undergraduate( 1,"Alice", "Computer Science"); 
	Undergraduate u=(Undergraduate) undergraduate; 
	u.displayUndergraduateinfo();
	System.out.println("=================");
	
	Student graduate = new Graduate(2,"Bob", "Machine Learning"); 
//	graduate.displayStudentInfo();  
	Graduate g=(Graduate) graduate; 
	g.displayGraduateInfo();
	System.out.println("=================");
	Student phdStudent = new PhDstudent(3,"Charlie", "Artificial Intelligence"); 
//	phdStudent.displayStudentInfo(); 
	PhDstudent p= (PhDstudent) phdStudent;
   p.displayPhDstudentInfo(); 
}
}