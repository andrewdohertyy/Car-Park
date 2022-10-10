package org.example;

public class Motorbike extends Vehicle{


    public Motorbike(String make, String model){
        super(make, model);
    }

    public VehicleType getType(){
        return VehicleType.motorbike;
    }
}
