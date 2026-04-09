package conditional_stmts;

public class Marks {
	
		public void student(int marks) {
			if(marks>35) {
				if(marks>75) {
					System.out.println("Distinction");
				}
				else {
					System.out.println("pass");	
				}
			}
				else {
					System.out.println("fail");	
				}
			}
			
		
		
		public static void main(String[] args) {
			Marks student=new Marks();
		student.student(90);
		}

	}



