package com.interfaces;

interface Ride {
    double calculateFare(double distance);
}
class BikeRide implements Ride {

    public double calculateFare(double distance) {
        return distance * 10;
    }
}

class CabRide implements Ride {

    public double calculateFare(double distance) {
        return distance * 20;
    }
}

class AutoRide implements Ride {

    public double calculateFare(double distance) {
        return distance * 15;
    }
}
