package Number_Logic_Programs;
public class Tech_Number {
	public void tech(int num) {
	        int temp = num;
	        int digits = 0;
	        while (temp > 0) {
	            digits++;
	            temp /= 10;
	        }
	        if (digits % 2 != 0) {
	            System.out.println(num + " is NOT a Tech Number.");
	            return;
	        }
	        int divisor = 1;
	        for (int i = 0; i < digits / 2; i++) {
	            divisor *= 10;
	        }

	        int first = num / divisor;
	        int second = num % divisor;
	        int sum = first + second;
	        System.out.println((sum * sum == num)?"Tech Number":"Not a Tech Number");
	}
	        public static void main(String[] args) {
	        	Tech_Number  t1=new Tech_Number();
	        	t1.tech(3025);
	        	t1.tech(1436);  	
	    }
	}
