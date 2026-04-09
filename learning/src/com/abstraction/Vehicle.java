package com.abstraction;

public abstract class Vehicle {
	String modelName , vehicleNumber , company;
	

	public Vehicle(String modelName, String vehicleNumber, String company) {
		super();
		this.modelName = modelName;
		this.vehicleNumber = vehicleNumber;
		this.company = company;
	}

	abstract void startEngine();
	public void fuelType() {
		System.out.println("Petrol");
	}

}
class Car extends Vehicle{
	Integer numberOfDoors;
	boolean hassunRoof;
	public Car(String modelName, String vehicleNumber, String company, Integer numberOfDoors, boolean hassunRoof) {
		super(modelName, vehicleNumber, company);
		this.numberOfDoors = numberOfDoors;
		this.hassunRoof = hassunRoof;
	}
	@Override
	public void startEngine() {
		System.out.println("Starting engine with key ignition.");
	}
	
}
class  Bike extends Vehicle{
	boolean hasSideCar;

	public Bike(String modelName, String vehicleNumber, String company, boolean hasSideCar) {
		super(modelName, vehicleNumber, company);
		this.hasSideCar = hasSideCar;
	}
	@Override
	public void startEngine() {
		System.out.println("Starting engine with key ignition.");
	}
}
class Truck extends Vehicle{
	Integer cargoCapacity;

	public Truck(String modelName, String vehicleNumber, String company, Integer cargoCapacity) {
		super(modelName, vehicleNumber, company);
		this.cargoCapacity = cargoCapacity;
	}
	@Override
	public void startEngine() {
		System.out.println("Starting engine with key ignition.");
	}
	public void fuelType() {
		System.out.println("diesel");
	}
}

