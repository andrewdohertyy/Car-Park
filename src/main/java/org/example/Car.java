package org.example;

public class Car extends Vehicle{

    public Car(String make, String model){
        super(make, model);
    }

        public VehicleType getType() {
            return VehicleType.car;
        }
}
