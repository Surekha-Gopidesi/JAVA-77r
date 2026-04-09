package whileloop;

public class VowelCheck {
	
	    public static void main(String[] args) {
	    	
	    	 String str = "madam".toLowerCase();
	                String result = "";

	                for (int i = 0; i < str.length(); i++) {
	                    char ch = str.charAt(i);

	                   
	                    if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {

	                       
	                        if (result.indexOf(ch) == -1) {
	                            result += ch;
	                        }
	                    }
	                }

	                System.out.println(result);
	            }
	        }

	



