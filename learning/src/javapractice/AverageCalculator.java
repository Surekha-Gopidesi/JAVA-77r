package javapractice;

public class AverageCalculator {
	public static double averageOfThreeNumbers(double a,double b,double c) {
		double average=(a+b+c)/3;
		return average;
		
	}

	public static void main(String[] args) {
		double result=averageOfThreeNumbers(10,15,20);
		System.out.println(result);
		

	}

}
