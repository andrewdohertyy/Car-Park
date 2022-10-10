package org.example;

import java.util.ArrayList;

public class CarPark {

        public CarPark() {};

        public int regSpaces = 20;
        public int motorbikeSpaces = 5;

        private final ArrayList<Vehicle> CarPark = new ArrayList<>();

        public void addVehicle(Vehicle vehicle){};

        public String addVehicle(Car car){
                if(regSpaces - 1 < 0 ){
                        if (motorbikeSpaces -1 < 0) {
                                return "car park full";
                        } else {
                                motorbikeSpaces = motorbikeSpaces -1;
                        }
                }
                this.CarPark.add(car);
                return "Car added to car park ";
        }
        public String addVehicle(Motorbike motorbike){

                if(motorbikeSpaces - 1 < 0 ){
                        if (regSpaces -1 < 0) {
                                return "car park full";
                        } else {
                                regSpaces = regSpaces -1;
                        }
                }
                this.CarPark.add(motorbike);
                return "Motorbike added to car park ";
        }

        public String addVehicle(Van van){

                if (regSpaces -2 < 0){
                        return "car park full";
                } else {
                        regSpaces = regSpaces -2;
                }
                this.CarPark.add(van);
                return "Van added to car park ";
        }

        public int getCarParkTotalSize() {
                return regSpaces + motorbikeSpaces;
        }

        public int getRemainingSpaces(){
                if(20 - CarPark.size() > 0) {
                        return motorbikeSpaces + regSpaces - CarPark.size();
                } else {
                        return 0;
                }
        }

        @Override
        public String toString() {
                return "CarPark currently contains " + CarPark;
        }
}
