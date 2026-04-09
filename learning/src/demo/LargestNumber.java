package demo;

public class LargestNumber {

	public static void main(String[] args) {
		
		
				int []arr= {2,4,6,8,9};
				int largest=arr[0];
				for( int num:arr) {
					if(num>largest) {
						largest=num;
					}
					
				}
				System.out.println(largest);
				
				
			}


		


	}


