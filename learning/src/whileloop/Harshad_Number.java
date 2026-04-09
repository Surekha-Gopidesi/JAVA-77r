package whileloop;

public class Harshad_Number {
	public static void isHarshad(int num) {
	    int temp = num;
	    int sum = 0;

	    while (temp > 0) {
	        int digit = temp % 10;
	        sum += digit;
	        temp /= 10;
	    }

	    if (sum > 0) {
	        if (num % sum == 0)
	            System.out.println(num + " is Harshad");
	        else
	            System.out.println(num + " is NOT Harshad");
	    }
	}
	public static void main(String[] args) {
		isHarshad(100);
	}


}
