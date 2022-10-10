package org.example;

public class Van extends Vehicle{

    public Van(String make, String model) {
        super(make, model);
    }

    public VehicleType getType(){
        return VehicleType.van;
    }


}
