package com.Exception_handlig;
class InvalidAgeOfBattery extends Exception {
    public InvalidAgeOfBattery(String message) {
        super(message);
    }
}
class InvalidTyre extends Exception {
    public InvalidTyre(String message) {
        super(message);
    }
}
class InvalidAgeEngine extends Exception {
    public InvalidAgeEngine(String message) {
        super(message);
    }
}
class Vehicle {
    public void data(int age) throws InvalidAgeOfBattery, InvalidTyre, InvalidAgeEngine {

        if(age < 2) {
            throw new InvalidAgeOfBattery("Invalid Battery");
        }
        else if(age < 5) {
            throw new InvalidTyre("Invalid Tyre");
        }
        else if(age > 10) {
            throw new InvalidAgeEngine("Invalid Engine");
        }
        else {
            System.out.println("Vehicle is valid");
        }
    }
    public static void main(String[] args) {
        try {
            new Vehicle().data(4);   
        }
        catch(InvalidAgeOfBattery e) {
        	e.printStackTrace();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }}
