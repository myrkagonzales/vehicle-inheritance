package com.pluralsight;

public class Vehicle {


    private String color;
    private int numberOfPassengers;
    private int cargoCategory;
    private int fuelCapacity;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getCargoCategory() {
        return cargoCategory;
    }

    public void setCargoCategory(int cargoCategory) {
        this.cargoCategory = cargoCategory;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }
}
