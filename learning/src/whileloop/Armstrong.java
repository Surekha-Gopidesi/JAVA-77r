package whileloop;
public class Armstrong {
	    public int getPower(int base, int exp) {
	        int power = 1;
	        for (int i = 1; i <= exp; i++) {
	            power = power * base;
	        }
	        return power;
	    }
	    public int getPowerofNumber(int num) {
	        int count = 0;
	        while (num != 0) {
	            count++;
	            num /= 10;
	        }
	        return count;
	    }
	    public void isAmstrong(int num) {

	        int count = getPowerofNumber(num);
	        int temp = num;
	        int sum = 0;
	        while (num != 0) {
	            int rem = num % 10;
	            sum = sum + getPower(rem, count);
	            num /= 10;
	        }

	        if (temp == sum) {       
	            System.out.println(temp + " is Armstrong");
	        }
	        else {
	        	System.out.println(temp + " is not Armstrong");
	        }
	    }
	    public static void main(String[] args) {
	    	 Armstrong obj = new  Armstrong();
	            obj.isAmstrong(153);  
	        
	    }
	}
