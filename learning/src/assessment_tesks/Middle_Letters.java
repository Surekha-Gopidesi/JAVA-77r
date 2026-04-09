package assessment_tesks;

public class Middle_Letters {

	public static void main(String[] args) {
		String s = "Surekha";
		int len = s.length();

		if (len % 2 == 0) {
		
		    char c1 = s.charAt(len/2 - 1);
		    char c2 = s.charAt(len/2);
		    System.out.println(" middle characters :" + c1 + c2);
		} else {
		  
		    char c = s.charAt(len/2);
		    System.out.println("middle character :"+c);
		}

	}}	


