package conditional_stmts;

public class LargestOfThreeNumbers {
	public void largest(int a,int b,int c) {
		int large;
		if(a>b) {
			large=a;	
		}
		else {
			large=b;
		}
		if(large<c) {
			large=c;
		}
		else {
			large=large;	
		}
		System.out.println("the largest number  :"+large);
	}

	public static void main(String[] args) {
		LargestOfThreeNumbers large=new LargestOfThreeNumbers();
		large.largest(40, 50, 80);

	}

}
