package javapractice;

public class SimpleIntrestCalculator {
	public static double calculateSimpleIntrest(double principal ,double rate,double time) {
		double simpleIntrest=(principal*rate*time)/100;
		return simpleIntrest;
	}

	public static void main(String[] args) {
	double result=calculateSimpleIntrest( 10000,1.5,2);
	System.out.println(result);

	}

}
