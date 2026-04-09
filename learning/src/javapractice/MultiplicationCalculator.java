package javapractice;

public class MultiplicationCalculator {
	public static int multiplyTwoNumbers(int a,int b) {
		int product=a*b;
		return product;
		
	}

	public static void main(String[] args) {
		int num1=15;
		int num2=27;
		int result=multiplyTwoNumbers(num1,num2);
		System.out.println(result);
		

	}

}
