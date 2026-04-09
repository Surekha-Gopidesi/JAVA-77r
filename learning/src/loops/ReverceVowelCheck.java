package loops;

public class ReverceVowelCheck {
	
	    public static void main(String[] args) {

	        String str = "Education";

	        for(int i = str.length() - 1; i >= 0; i--) {
	            char ch = str.charAt(i);

	            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
	               ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
	                
	                System.out.print(ch + " ");
	            }
	        }
	    }
	}



