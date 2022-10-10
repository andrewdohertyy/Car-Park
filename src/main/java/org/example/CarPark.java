package org.example;

import java.util.ArrayList;

public class CarPark {

        public CarPark() {};

        public int regSpaces = 20;
        public int motorbikeSpaces = 5;

        public final int STARTING_SPACES = 25;

        private final ArrayList<Vehicle> CarPark = new ArrayList<>();

        public void addVehicle(Vehicle vehicle){};

        public void addVehicle(Car car) {
                if (regSpaces >= 1) {
                        this.CarPark.add(car);
                } else if (motorbikeSpaces >= 1){
                        this.CarPark.add(car);
                } else {
                        System.out.println("car park is full");
                }
        }
        public void addVehicle(Motorbike motorbike){
                if (motorbikeSpaces >= 1) {
                        this.CarPark.add(motorbike);
                } else if (regSpaces >= 1){
                        this.CarPark.add(motorbike);
                } else {
                        System.out.println("car park is full");
                }
        }

        public void addVehicle(Van van){
                if (regSpaces - 2 >= 3){
                        regSpaces = regSpaces -2;
                        this.CarPark.add(van);
                } else {
                        System.out.println("Cant add a van car park full");
                }
        }

        public int getCarParkTotalSize() {
                return STARTING_SPACES;
        }

        public int getRemainingSpaces(){
                if(25 - CarPark.size() > 0) {
                        return motorbikeSpaces + regSpaces - CarPark.size();
                } else {
                        return 0;
                }
        }

        @Override
        public String toString() {
                return "CarPark currently contains " + CarPark;
        }

//        public int vanSpaces(){
//                return;
//        }
}
