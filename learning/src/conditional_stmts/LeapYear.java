package conditional_stmts;

public class LeapYear {
	public void year(int year) {
		if(year%4==0 &&year%100!=0) {
			System.out.println("Leap Year");
		}
		else {
			System.out.println("Not a year");
		}
		
	}
	public static void main(String[] args) {
		LeapYear l1=new LeapYear();
		l1.year(2024);
	}

}
