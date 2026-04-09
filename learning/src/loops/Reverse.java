package loops;

public class Reverse {
	public static void main(String[] args) {
		int rev=0;
		int n=1234;
		for(;n!=0;n/=10) {
		
		   rev=rev*10+n%10;
		   
		}
		System.out.println(rev);
	}

}
