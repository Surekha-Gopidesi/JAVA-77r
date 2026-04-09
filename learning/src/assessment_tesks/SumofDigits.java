package assessment_tesks;

public class SumofDigits {

	public static void main(String[] args) {
		int num=1234;
		int sum=0;
		while(num!=0) {
			int rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println("sum of the digits :"+sum);

	}

}
