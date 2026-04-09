package com.encapsulation;

public class Car extends Vehicle{
	
	public void speed() {
		System.out.println("Car is moving at 80km/h");
	}
	public static void main(String[] args) {
		Car car=new Car();
		car.run();
		car.speed();
	}
	
	
}