package Number_Logic_Programs;


	public class EvilOdiousNumber {
	    static void checkNumber(int num) {
	        int count = 0;
	        int temp = num;
	        while (temp > 0) {
	            if (temp % 2 == 1) {
	                count++;
	            }
	            temp = temp / 2;
	        }
	        if (count % 2 == 0) {
	            System.out.println(num + " is an Evil Number");
	        } else {
	            System.out.println(num + " is an Odious Number");
	        }
	    }

	    public static void main(String[] args) {
	        checkNumber(9);   
	        checkNumber(7);   
	    }
	}


