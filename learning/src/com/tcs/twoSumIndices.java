package com.tcs;

public class twoSumIndices {
		static int[] targetElement(int[] num,int target) {
			int left=0;
			int right=num.length-1;
			while(left<right) {
				int targetSum=num[left]+num[right];
				if(targetSum==target) {
					return new int[] {left,right};
				}
				else if(targetSum<target){
					left++;	
				}
				else {
					right--;
				}
			}
			return new int[] {};			
		}

	public static void main(String[] args) {
		int[] num= {1,3,4,6,7};
		int target=11;
		
		int[] result =targetElement(num, target);

        if (result.length == 2) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No solution found.");
       }
		
	}
}

	