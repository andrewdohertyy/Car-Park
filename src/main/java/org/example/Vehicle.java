package org.example;

public class Vehicle {
    String make;
    String model;
    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    @Override
    public String toString() {
        return
                "make='" + make + '\'' +
                ", model='" + model + '\'';
    }
}
