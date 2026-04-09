package Number_Logic_Programs;

public class DuckNumber {
	
	    public static void main(String[] args) {

	        int num = 1230;
	        int temp = num;
	        boolean hasZero = false;

	        while (temp > 0) {
	            int digit = temp % 10;

	            if (digit == 0) {
	                hasZero = true;
	                break;
	            }

	            temp = temp / 10;
	        }

	        if (hasZero) {
	            System.out.println(num + " is a Duck Number");
	        } else {
	            System.out.println(num + " is NOT a Duck Number");
	        }
	    }
	}



