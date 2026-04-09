package task3;

public class Product {


			String productname="cream";
			int productId=23;
			double price=110;
			public void addProductdetails( String pName,int pId, int Price) {
				productname= pName;
				productId=pId;
				price=Price;
				System.out.println(productname);
				System.out.println(productId);
				System.out.println(price);
					
			}
			public String displayDetails() {
				return "title : "+productname+"  Authorname : " +productId+"  price: "+price;
				
			}
			

			public static void main(String[] args) {
				Product obj=new Product();
				obj.addProductdetails("pillows", 2, 340);
				String res=obj.displayDetails();
				System.out.println(res);
				

			}

		}





