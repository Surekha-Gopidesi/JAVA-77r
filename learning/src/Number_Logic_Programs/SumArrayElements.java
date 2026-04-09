package Number_Logic_Programs;

public class SumArrayElements {
	
	    public static int sumArray(int[] arr) {
	        int sum = 0;

	        for (int i = 0; i < arr.length; i++) {
	            sum = sum + arr[i];
	        }

	        return sum;
	    }

	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4,5};
	        System.out.println("Sum = " + sumArray(arr));
	    }
	}



