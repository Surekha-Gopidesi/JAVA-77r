package assessment_tesks;

public class SortinrArray {
	
	    public boolean isSorted(int[] arr) {


	    	for (int i = 0; i < arr.length - 1; i++) {
	            if (arr[i] > arr[i + 1]) { 
	                return false;     
	            }
	        }
	        return true;  
	    }

	    public static void main(String[] args) {
	        SortinrArray s = new SortinrArray();

	        int[] arr1 = {1, 2, 3, 4, 5};
	        System.out.println(s.isSorted(arr1)?"sorted":"not sorted"); 

	        int[] arr2 = {5, 3, 8, 9};
	        System.out.println(s.isSorted(arr2)?"sorted":"not sorted");  
	    }
	}

