package Number_Logic_Programs;


	public class AdamNumber {

	    public static void main(String[] args) {

	        int num = 12;
	        int square = num * num;

	        int rev = 0, temp = num;
	        while (temp > 0) {
	            rev = rev * 10 + temp % 10;
	            temp /= 10;
	        }

	        int revSquare = rev * rev;

	        int revRevSquare = 0;
	        temp = revSquare;
	        while (temp > 0) {
	            revRevSquare = revRevSquare * 10 + temp % 10;
	            temp /= 10;
	        }

	        if (square == revRevSquare) {
	            System.out.println(num + " is an Adam Number");
	        } else {
	            System.out.println(num + " is not an Adam Number");
	        }
	    }
	}


