package Number_Logic_Programs;

public class LcmGcd {

	    static int gcd(int a, int b) {
	        while (b != 0) {
	            int rem = a % b;
	            a = b;
	            b = rem;
	        }
	        return a;
	    }

	    static int lcm(int a, int b) {
	        return (a / gcd(a, b)) * b;
	    }

	    public static void main(String[] args) {
	        int a = 10, b = 18;

	        System.out.println("GCD of a and b : " + gcd(a, b));
	        System.out.println("LCM of a and b : " + lcm(a, b));
	    }
	}

