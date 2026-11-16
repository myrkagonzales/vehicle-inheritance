package com.pluralsight;

public class VehicleApp {

    public static void main(String[] args) {
        Moped slowRide = new Moped("Red",1,0,5);
        slowRide.setColor("Red");
        slowRide.setFuelCapacity(15);
        slowRide.setNumberOfPassengers(1);

        Car familyCar = new Car("Blue", 5,500,50);
        familyCar.setColor("Blue");
        familyCar.setFuelCapacity(15);
        familyCar.setNumberOfPassengers(5);

        SemiTruck truck = new SemiTruck("Silver", 2, 50000,200);
        truck.setColor("Silver");
        truck.setFuelCapacity(100);
        truck.setCargoCategory(50000);

        Hovercraft hovercraft = new Hovercraft();
        hovercraft.setColor("Purple");
        hovercraft.setFuelCapacity(20);
        hovercraft.setNumberOfPassengers(4);

    }
}
