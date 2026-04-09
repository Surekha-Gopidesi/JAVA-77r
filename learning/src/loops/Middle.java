package loops;

public class Middle {

	public static void main(String[] args) {
	
		        String str = "TEST";  
		        int len = str.length();
		        int mid = len / 2;
		        int i = 0;

		        while(i < len) {
		        	
		            if(len % 2 == 1 && i == mid) {  
		               
		                System.out.println("Middle letters : "+ str.charAt(i));
		            }
		            else if(len % 2 == 0 && (i == mid - 1 || i == mid)) {
		                System.out.print(str.charAt(i));
		            }
		            i++;
		        }
		    }
		


	}

