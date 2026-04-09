package assessment_tesks;

public class Second_largest {
	
	    public static void main(String[] args) {

	        int[] arr = {3, 1, 4, 1, 5, 9};

	        int largest = Integer.MIN_VALUE;
	        int secondLargest = Integer.MIN_VALUE;

	        for (int num : arr) {
	            if (num > largest) {
	                secondLargest = largest;  
	                largest = num;
	            }
	            if (num > secondLargest && num < largest) {
	                secondLargest = num;
	            }
	        }

	        System.out.println("Second largest number: " + secondLargest);
	    }
	}



