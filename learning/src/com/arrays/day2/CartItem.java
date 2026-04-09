package com.arrays.day2;

 class CartItem {
	int itemId;
	String itemName;
	double pricesFromSellers;
	
	

}
 class ShoppingCart extends CartItem {
	int []arr=new int[5];
	public void displayCart(double pricesFromSellers) {
		for(int ele:arr) {
			System.out.println(ele+pricesFromSellers);
		}
		
	}
	public void calculateTotalCost() {
		
	}
}
