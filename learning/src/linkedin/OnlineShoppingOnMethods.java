package linkedin;


	public class OnlineShoppingOnMethods {

	   
	    static void platformInfo() { //  Static Method
	        System.out.println("Welcome to Your Online Shopping Partner!");
	    }

	   
	    void showCategories() { //  Non-parameterized Instance Method
	        System.out.println("Available Categories: Electronics, Fashion, Groceries");
	    }

	   
	    double calculateTotal(double price, int quantity) { //  Parameterized instance Method
	        return price * quantity;
	    }

	    
	    String generateInvoice() { //  Return Type Method
	        return "Invoice Generated Successfully ";
	    }

	
	    void confirmOrder() {     // Instace/ Non Static method with no return type
	        System.out.println("Order Confirmed!");
	    }

	    
	    void showOffers() { 
	        System.out.println("Today's Offer: Flat 10% OFF on Electronics!");
	    }
	    void showOffers(String category) {  //  Method Overloading
	        System.out.println("Special Offer on " + category + ": Buy 2 Get 1 Free ");
	    }

	
	    void thankCustomer() { // predefined method
	        System.out.println("Thank you for shopping with ShopEase! ");
	        System.out.println("Visit again soon!");
	    }

	    public static void main(String[] args) {
	        platformInfo(); // static method

	        OnlineShoppingOnMethods order = new OnlineShoppingOnMethods();

	        order.showCategories(); // non-parameterized
	        double total = order.calculateTotal(999.0, 2); // parameterized
	        System.out.println("Total Price: ₹" + total);
	        System.out.println(order.generateInvoice()); // return type
	        order.confirmOrder(); // instance/non static
	        order.showOffers(); // overloaded
	        order.showOffers("Fashion"); // overloaded
	        order.thankCustomer(); // predefined method
	    }
	}


