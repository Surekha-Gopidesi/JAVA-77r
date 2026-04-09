package blc_elc_task;

public class ShoppingCart {
	public static void main(String[] args) {
		Product p1=new Product();
		p1.productId=43;
		p1.productName="Laptop";
		p1.price=44800.0;
		p1.quantity=50;
		Product p2=new Product();
		p1.productId=52;
		p1.productName="HeadPhones";
		p1.price=2000.0;
		p1.quantity=25;
		p1.setQuantity(10);
		System.out.println("ProductId :"+ p1.productId+"\nProductName :"+p1.productName+"\nProduct price :"+p1.price+"\nQuantity :"+p1.quantity);
		System.out.println("---------------------------------------");
		System.out.println("ProductId :"+ p2.productId+"\nProductName :"+p2.productName+"\nProduct price :"+p2.price+"\nQuantity :"+p2.quantity);
		

	}

}
