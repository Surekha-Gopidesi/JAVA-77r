package com.inheritance.multilevel;
class VehicleMain {
    public static void main(String[] args) {


    	Vehicle vh=new Car("Toyota", "Corolla", 2022, 4);
    	
    	Car car=(Car)vh;
    	car.displayCarInfo();
    	System.out.println("==================");
    	Vehicle truck = new Truck("Ford", "F-150", 2021, 1000);
    	Truck t=(Truck) truck;
        t.displayTruckInfo();
        System.out.println("=================");
        Vehicle bike = new Motorcycle("Harley-Davidson", "Street Glide", 2023, true);
        Motorcycle m=(Motorcycle) bike; 
        m.displayMotorcycleInfo();
    }
}
