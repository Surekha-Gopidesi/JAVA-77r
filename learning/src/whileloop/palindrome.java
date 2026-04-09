package whileloop;

public class palindrome {

	public static void main(String[] args) {
		int num=1234321;
		int temp=num;
		int remainder=0;
		int rev=0;
		while(num!=0) {
			remainder=num%10;
			rev=rev*10+remainder;
			num=num/10;
			
		}
		/* System.out.println(rev); */
		System.out.println((temp==rev)? "palindrome":  "Not polindrome");
		

	}

}
