package javapractice;

public class Calculator {
	public static int add(int num1,int num2) {
		int sum=num1+num2;
		return sum;
	}
	public static int sub(int num1,int num2) {
		int subtract=num1-num2;
		return subtract;
	}
	public static int mul(int num1,int num2) {
		int mul=num1*num2;
		return mul;
	}
	public static int div(int num1,int num2) {
		int div=num1/num2;
		return div;
	}
	public static void main(String[] args) {
		int num1=10;
		int num2=5;
		int result1=add( num1, num2);
		System.out.println	("sum of two integers:"+result1);	
		int result2=sub(num1, num2);
		System.out.println	( "subtraction of two numbers:"+result2);	
		int result3=mul( num1, num2);
		System.out.println	( "multiplication of two numbers:"+result3);
		int result4=div( num1, num2);
		System.out.println	( "division of two numbers:"+result4);	
		
		

	}

}
