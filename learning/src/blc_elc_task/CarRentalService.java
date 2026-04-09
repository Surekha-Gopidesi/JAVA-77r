package blc_elc_task;

public class CarRentalService {
	public static void main(String[] args) {
		Car c=new Car();
		c.setCarId(12);
		c.setBrand("suzuki");
		c.setModel("Automobile");
		c.setRentalPricePerday(1000);
		System.out.println("Car Id :"+c.getCarId()+"\nCar Brand :"+c.getBrand()+"\nCar Model :"+c.getModel()+"\nCar Rental Price :"+c.getRentalPricePerday());
	}

}
