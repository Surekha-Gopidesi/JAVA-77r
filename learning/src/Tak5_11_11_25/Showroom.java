package Tak5_11_11_25;

public class Showroom {
	public void displayCar(Car c) {
		System.out.println("Car Brand :"+ c.brand);
		System.out.println("Car Price :"+ c.price);
		
	}
	public static void main(String[] args) {
		Car c=new Car();
		c.brand="Tesla";
		c.price=100000.0;
		Showroom s=new Showroom();
		s.displayCar(c);
	}

}
