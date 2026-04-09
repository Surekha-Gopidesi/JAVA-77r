package assessment_tesks;

public class Covert_Upper_Lower {
	
	    public static void main(String[] args) {

	        String s = "Hello World";
	        String result = "";

	        for (int i = 0; i < s.length(); i++) {
	            char ch = s.charAt(i);

	            if (ch >= 'A' && ch <= 'Z') {  
	               
	                result += (char)(ch + 32);
	            } else if (ch >= 'a' && ch <= 'z') {
	              
	                result += (char)(ch - 32);
	            } else {
	                result += ch;  
	            }
	        }

	        System.out.println("After Convering : "+result);
	    }

}
