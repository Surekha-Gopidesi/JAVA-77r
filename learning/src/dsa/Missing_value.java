package dsa;

public class Missing_value {

	public static int missing(int[] nums) {
		int n=nums.length+1;
		int ActualSum=n*(n+1)/2;
		int sum=0;
		for(int i=0;i<nums.length;i++) {
			sum+=nums[i];
		}
		
		return ActualSum-sum;
		
	}
	
	
	public static void main(String[] args) {
		int[] arr={1,2,3,4,6};
		    System.out.println("Missing Number :"+missing(arr));
	}

}
