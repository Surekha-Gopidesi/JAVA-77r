package whileloop;

public class Ugly_Number {
	public static boolean isUgly(int num) {
	    if (num <= 0) return false;

	    while (num % 2 == 0) {
	        num = num / 2;
	    }
	    while (num % 3 == 0) {
	        num = num / 3;
	    }
	    while (num % 5 == 0) {
	        num = num / 5;
	    }
	    return num == 1;
	}
	public static void main(String[] args) {
	    for (int i = 1; i <= 20; i++) {
	        if (isUgly(i)) {
	            System.out.println(i );
	        }
	    }
	}
}
