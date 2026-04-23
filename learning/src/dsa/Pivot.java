package dsa;

public class Pivot {
	public static void main(String[] args) {
		int arr[]= {4,7,3,6,1,4};
		int total=0;
		for(int i=0;i<arr.length;i++) {
			total+=arr[i];
			}
			int leftSum=0;
			for(int i=0;i<arr.length;i++) {
				int rightSum=total-leftSum-arr[i];
				if(leftSum==rightSum) {
					System.out.println("pivot Element is :"+arr[i]);
				}
				leftSum+=arr[i];
			
		}
	}

}
