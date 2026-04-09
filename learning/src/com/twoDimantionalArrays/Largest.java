package com.twoDimantionalArrays;

public class Largest {
	
		public static void main(String[] args) {
			
		
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int largest=0;
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr.length;j++) {
             if(arr[i][j]>largest) {
            	 largest=arr[i][j];
            	 
             }
						
		}

	}
		System.out.println("Largest number  :"+largest);
		
}

}
