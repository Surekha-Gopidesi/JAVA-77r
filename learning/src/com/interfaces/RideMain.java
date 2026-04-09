package com.interfaces;

public class RideMain {
	
	    public static void main(String[] args) {

	        Ride ride;

	        ride = new BikeRide();
	        System.out.println("Bike Fare: " + ride.calculateFare(5));

	        ride = new CabRide();
	        System.out.println("Cab Fare: " + ride.calculateFare(5));

	        ride = new AutoRide();
	        System.out.println("Auto Fare: " + ride.calculateFare(5));
	    }
	}

