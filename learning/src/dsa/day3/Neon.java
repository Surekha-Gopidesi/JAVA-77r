package dsa.day3;

public class Neon {
	public static void check(int n) {
		int square=n*n;
		int temp=square;
		int sum=0;
		while(n>0) {
			int rem=square%10;
			sum=sum+rem;
			square/=10;	
		}
		if(sum==n) {
			System.out.println("Neon");
		}
	}

	public static void main(String[] args) {
		check(9);
		 
	}

}
