package features_forloop;

public class Even_Odd_loop {

	
	  public static void main(String[] args) {
	        String evenNumbers = "";
	        String oddNumbers = "";

	        for (int i = 1; i <= 200; i++) {

	            if (i % 2 == 0) {
	                evenNumbers = evenNumbers + i + " ";
	            } else {
	                oddNumbers = oddNumbers + i + " ";
	            }
	        }

	        System.out.println(  evenNumbers);
	        System.out.println( oddNumbers);
	    }

	  
	     
	    
	}




