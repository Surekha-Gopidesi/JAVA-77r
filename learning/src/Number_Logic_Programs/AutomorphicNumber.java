package Number_Logic_Programs;


	public class AutomorphicNumber {
	  
public static void display(int num) {
	             // change number here
	        int square = num * num;

	        int temp = num;
	        boolean isAutomorphic = true;

	        while (temp > 0) {
	            if (temp % 10 != square % 10) {
	                isAutomorphic = false;
	                break;
	            }
	            temp = temp / 10;
	            square = square / 10;
	        }

	        if (isAutomorphic) {
	            System.out.println(num + " is an Automorphic Number");
	        } else {
	            System.out.println(num + " is Not an Automorphic Number");
	        }
	}
	
	  public static void main(String[] args) {
		  display(25);
		  display(12);
	
	  }

}
