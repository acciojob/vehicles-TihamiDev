package com.driver;

public class Boat implements WaterVehicle {

    private String vehicleName;
    private int vehicleCapacity;

    public Boat(String vehicleName, int vehicleCapacity) {
        this.vehicleName = vehicleName;
        this.vehicleCapacity = vehicleCapacity;
    }

    @Override
    public String getVehicleName() {
        return vehicleName;
    }

    @Override
    public int getVehicleCapacity() {
        return vehicleCapacity;
    }
}