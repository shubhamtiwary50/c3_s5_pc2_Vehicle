package com.vehicles;

public class Car extends VehiclesManufacturer implements Vehicle {
    public Car(String vehicleName, String vehicleModelName, String vehicleType) {
        super(vehicleName, vehicleModelName, vehicleType);
    }

    @Override
    public int maxSpeed(String vehicleType) {
        if(getVehicleType().equalsIgnoreCase("SportsCar")){
            return 250;
        } else if (getVehicleType().equalsIgnoreCase("Sedan")) {
            return 170;
        }
        return 0;
    }

    @Override
    public String getManufactureInformation() {
        return "Car{Manufacturer name: '" +getVehicleName() + "', " + "Model Name: '" + getVehicleModelName() +
                "' ,Type: '" + getVehicleType() + "'}.";
    }
}
