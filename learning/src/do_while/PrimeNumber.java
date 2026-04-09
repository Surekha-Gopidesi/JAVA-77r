package do_while;

public class PrimeNumber {

	public static void main(String[] args) {
		
		
		        int num = 19;
		        int count = 0;      
		        int i = 1;         

		        do {
		            if(num % i == 0) {  
		                count++;        
		            }
		            i++;
		        } while(i <= num);      

		        if(count == 2) {       
		            System.out.println(num + " is Prime");
		        } else {
		            System.out.println(num + " is Not Prime");
		        }
		    }
}

		

		

  