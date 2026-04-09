package assessment_tesks;

public class RemoveDuplicates {
	
	    public static void main(String[] args) {

	        String s = "madam";
	        String result = "";

	        for (int i = 0; i < s.length(); i++) {
	            char ch = s.charAt(i);
	            int count = 0;
	            for (int j = 0; j < s.length(); j++) {
	                if (s.charAt(j) == ch) {
	                    count++;
	                }
	            }
	            if (count == 1) {
	                result += ch;
	            }
	        }

	        System.out.println("After removing Duplicates :"+result);
	    }
	}


