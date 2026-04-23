package dsa;

public class ThirdLargest {
	public static void main(String[] args) {
		int arr[]= {6,2,8,1,9,4,5};
		int max=arr[0];
		int secondMax=arr[0];
		int thirdMax=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				thirdMax=secondMax;
				secondMax=max;
				max=arr[i];
			}
			else if(arr[i]>secondMax &&arr[i]!=max) {
				thirdMax=secondMax;
				secondMax=arr[i];
			}
			else if(arr[i]>thirdMax&&arr[i]!=max&&arr[i]!=secondMax) {
				thirdMax=arr[i];
			}
		}
		System.out.println("Third largest Element :"+thirdMax);
	}

}
