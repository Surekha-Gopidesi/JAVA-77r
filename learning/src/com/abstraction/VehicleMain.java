package com.abstraction;

class VehicleMain{
	public static void main(String[] args) {
		Vehicle v;
		v=new Car("Toyota Camry", "ABC123", "Toyota", 4, true);
		v.startEngine();
		v.fuelType();
		System.out.println("-------------------------");
		v=new Bike("Yamaha R1", "XYZ789", "Yamaha", false);
		v.startEngine();
		v.fuelType();
		System.out.println("-------------------------");
		v=new Truck("Volvo FH", "DEF456", "Volvo", 20000);
		v.startEngine();
		v.fuelType();

		
	}
}
