package task17_11_25;

public class StudentPassOrFail {
	public void student(int marks) {
		if(marks>35) {
			System.out.println("pass");
			
		}
		else {
			System.out.println("Fail");
		}
	}
	
	public static void main(String[] args) {
		StudentPassOrFail student=new StudentPassOrFail();
	student.student(40);
	}

}
