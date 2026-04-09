package Number_Logic_Programs;

public class Fibonacci_check {
	public boolean getsum(int num) {
		for(int i=1;i<=num;i++) {
		if(i*i==num) {
			return true;
		}
		}return false;
	}
	public static void main(String[] args) {
		Fibonacci_check f1=new Fibonacci_check();
		int a=0, b=1, c;
		System.out.println(f1.getsum(a));
		c=a+b;
		a=b;
		b=c;
		
	}
}

