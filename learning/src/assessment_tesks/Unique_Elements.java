package assessment_tesks;

public class Unique_Elements {
	
	    public static void findUnique(int[] arr) {

	        System.out.print("Unique elements: ");

	        for (int i = 0; i < arr.length; i++) {
	            int count = 0;

	            for (int j = 0; j < arr.length; j++) {
	                if (arr[i] == arr[j]) {
	                    count++;
	                }
	            }

	            if (count == 1) {
	                System.out.print(arr[i] + " ");
	            }
	        }
	    }
	    public static void main(String[] args) {
	        int[] arr = {1, 2, 2,7,3, 4, 4,3, 5};
	        findUnique(arr);  
	    }
	}



