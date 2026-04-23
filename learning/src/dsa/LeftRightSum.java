package dsa;

import java.util.Arrays;

public class LeftRightSum {

	    public static void leftRightDifference(int[] nums) {
	    	int res[]=new int[nums.length];
	        int sum=0;
	        int leftSum=0;
	        int rightSum=0;
	        for(int i=0;i<nums.length;i++){
	            sum=sum+nums[i];
	        }
	        for(int i=0;i<nums.length;i++){
	        
	            rightSum=sum-leftSum-nums[i];
	            res[i]=Math.abs(leftSum-rightSum);
	            leftSum=leftSum+nums[i];
	            		
	        }   

	        
	        System.out.println(Arrays.toString(res));
	        
	    }
	

	


	





	public static void main(String[] args) {
		int arr[]= {10,4,8,3};
		leftRightDifference(arr);

	}

}
