package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Moped moped = new Moped();
        moped.setColor("Red");
        moped.setFuelCapacity(5);

        Car car = new Car();
        car.setNumberOfPassengers(7);
        car.setCargoCapacity(10);

        SemiTruck semiTruck = new SemiTruck();
        semiTruck.setTopSpeed(30);
        semiTruck.accelerate();

        HoverCraft hoverCraft = new HoverCraft();
        hoverCraft.setModel("Tesla");
        hoverCraft.startEngine();
    }
}
