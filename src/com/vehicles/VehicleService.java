package com.vehicles;

public class VehicleService {

    public static void main(String[] args) {
        Bike bike = new Bike("H2R","YH2029","Sportsbike");
        Car car = new Car("BMW","BMW2022","Sedan");

        System.out.println("The Bike type is : " + bike.getVehicleType() +" and its max speed is " + bike.maxSpeed(bike.getVehicleType()));
        System.out.println("ManufactureInformation : " + bike.getManufactureInformation());
        System.out.println("Car type is : " + car.getVehicleType() +" and its max speed is " + car.maxSpeed(car.getVehicleType()));
        System.out.println("ManufactureInformation : " + car.getManufactureInformation());
    }
}
