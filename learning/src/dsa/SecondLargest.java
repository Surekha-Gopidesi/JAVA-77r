package dsa;

public class SecondLargest {
	public static void main(String[] args) {
		int arr[]= {5,7,2,1,3,9};
		int max=arr[0];
		int secMax=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				secMax=max;
				max=arr[i];
				
			}
			else if(arr[i]>secMax&&arr[i]!=max) {
				secMax=arr[i];
			}
		}
		System.out.println("Largest Element : "+max);
		System.out.println("Second Largest Element : "+secMax);
		
	}

}
