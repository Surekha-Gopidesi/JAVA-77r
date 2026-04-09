package Number_Logic_Programs;

public class Happy_Number {
	    public static void checkHappy(int num) {
	        int temp = num;
	        while (temp != 1 && temp != 4) {  
	            int sum = 0;

	            while (temp > 0) {
	                int digit = temp % 10;
	                sum += digit * digit;  
	                temp = temp / 10;
	            }
	            temp = sum;  
	        }
	        if (temp == 1) {
	            System.out.println(num + " is a Happy Number");
	        } else {
	            System.out.println(num + " is Not a Happy Number");
	        }
	    }
	    public static void main(String[] args) {
	        checkHappy(19);
	        checkHappy(20);
	    }
	}


