package whileloop;

public class CheckDigits {
	public static void main(String[] args) {
	
		        int num = 35674;
		        int last = num % 10;  
		        num = num / 10;       

		        boolean flag = true; 
		        int first = 0;
		        while (num >= 10) {

		            int mid = num % 10;    

		            if (mid >= last) {    
		                flag = false;
		                break;
		            }

		            num = num / 10;
		            first = num;            
		        }
		        System.out.println(flag);
		    }
		}


		    


		


