package conditional_stmts;

public class CheckNumber {
	public void number(int num) {
		if(num>0) {
			System.out.println("positive number");
		}
		else if(num<0) {
			System.out.println("Negative number");
		}
		else {
			System.out.println("zero");
		}
		
	}

	public static void main(String[] args) {
		
	CheckNumber check =new CheckNumber();
	check.number(-5);

	}

}
