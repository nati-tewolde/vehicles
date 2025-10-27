package com.pluralsight;

public class Car extends Vehicle {
    private int numberOfDoors;

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public void openTrunk() {
        System.out.println("Opening trunk ...");
    }

    public void closeTrunk() {
        System.out.println("Closing trunk ...");
    }
}
