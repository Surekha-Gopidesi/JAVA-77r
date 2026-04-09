package task1;

public class Currency {


	    static double dollarRate = 84.5;

	    static void convertToINR(double usd) {
	        double inr = usd * dollarRate;
	        System.out.println(usd + " USD = " + inr + " INR");
	    }

	    public static void main(String[] args) {
	        convertToINR(3);     
	        convertToINR(4);     
	        convertToINR(10);    
	    }
	}



