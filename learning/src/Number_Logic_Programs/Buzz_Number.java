package Number_Logic_Programs;

public class Buzz_Number {
	
	    public static void checkBuzz(int num) {

	        if (num % 10 == 7 || num % 7 == 0) {
	            System.out.println(num + " is a Buzz Number");
	        } else {
	            System.out.println(num + " is Not a Buzz Number");
	        }
	    }

	    public static void main(String[] args) {
	        checkBuzz(27);
	        checkBuzz(21);
	        checkBuzz(32);
	    }
	}



