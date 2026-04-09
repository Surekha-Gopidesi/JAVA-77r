package demo;
	import java.util.Scanner;

	public class KDistinct {
	    public static int demo(String s, int k) {
	        int[] a = new int[256];
	        int start = 0, end = 0, distinctCount = 0, maxLength = 0;

	        while (end < s.length()) {
	            a[s.charAt(end)]++;
	            if (a[s.charAt(end)] == 1) {
	                distinctCount++;
	            }

	            while (distinctCount > k) {
	                a[s.charAt(start)]--;
	                if (a[s.charAt(start)] == 0) {
	                    distinctCount--;
	                }
	                start++;
	            }

	            maxLength = Math.max(maxLength, end - start + 1);
	            end++;
	        }

	        return maxLength;
	    }


	    public static void main(String[] args) {
	    	try (Scanner sc = new Scanner(System.in)) {
				String s=sc.next();
	    		int k=sc.nextInt();
	    		System.out.println(demo(s, k));
			}
	    		
	    	
		
	    	}

	}


