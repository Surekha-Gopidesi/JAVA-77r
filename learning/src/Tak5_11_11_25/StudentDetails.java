package Tak5_11_11_25;

public class StudentDetails {
	
		
		public void printDetails(Student s) {
			System.out.println(" Student Name :"+s.name);
			System.out.println("Student Marks :"+s.marks);
			
		}
		public static void main(String[] args) {
			Student s=new Student();
			s.name="surekha";
			s.marks=92.0;
			StudentDetails s1=new StudentDetails();
			s1.printDetails(s);
		}

	}

