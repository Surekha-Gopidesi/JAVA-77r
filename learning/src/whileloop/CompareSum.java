package whileloop;

public class CompareSum {

	public static void main(String[] args) {
		
		int num = 3587;
		int last = num % 10;
		num =num/ 10;
		int middleSum = 0;
		
		while(num >= 10) {
		    middleSum += num % 10;
		    num /= 10;
		}
		int first = num;

		if((first + last) == middleSum) {

		    System.out.println("Equal");
		}

		else {
		    System.out.println("Not Equal");
		}

	}

}
