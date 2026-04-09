package com.inheritance.multilevel;

class Vehicle {
    String make;
    String model;
    int year;

    Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    void displayInfo() {
        System.out.println("Make :"+make);
        System.out.println("Vehicle Model :"+model);
        System.out.println("year :"+year);
    }
}
class Car extends Vehicle {
    int numberOfDoors;

    Car(String make, String model, int year, int numberOfDoors) {
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    void displayCarInfo() {
        displayInfo();
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}
class Truck extends Vehicle {
    int cargoCapacity;

    Truck(String make, String model, int year, int cargoCapacity) {
        super(make, model, year);
        this.cargoCapacity = cargoCapacity;
    }

    void displayTruckInfo() {
        displayInfo();
        System.out.println("Cargo Capacity: " + cargoCapacity + " kg");
    }
}
class Motorcycle extends Vehicle {
    boolean hasSidecar;

    Motorcycle(String make, String model, int year, boolean hasSidecar) {
        super(make, model, year);
        this.hasSidecar = hasSidecar;
    }

    void displayMotorcycleInfo() {
        displayInfo();
        System.out.println("Has Sidecar: " + hasSidecar);
    }
}
