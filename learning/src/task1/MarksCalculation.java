package task1;

public class MarksCalculation {
	static int sub1=85;
	static int sub2=90;
	static int sub3=80;
	public static void totalMarks() {
		int total=sub1+sub2+sub3;
		System.out.println("total marks:"+total);
	}
	public static void averageMarks() {
		int total=sub1+sub2+sub3;
		int avg=total/3;
		System.out.println("Average:"+avg);
	}
	

	public static void main(String[] args) {
		
		totalMarks();
		averageMarks();
		

	}

}
