package com.pluralsight;

public class SemiTruck {
    private int numberOfTrailers;

    public int getNumberOfTrailers() {
        return numberOfTrailers;
    }

    public void setNumberOfTrailers(int numberOfTrailers) {
        this.numberOfTrailers = numberOfTrailers;
    }

    public void loadCargo() {
        System.out.println("Loading cargo ...");
    }

    public void unloadCargo() {
        System.out.println("Unloading cargo ...");
    }
}
