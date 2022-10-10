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
                        regSpaces = regSpaces -1;
                } else if (motorbikeSpaces >= 1){
                        this.CarPark.add(car);
                        motorbikeSpaces = motorbikeSpaces -1;
                } else {
                        System.out.println("car park is full, cant park car here.");
                }
        }
        public void addVehicle(Motorbike motorbike){
                if (motorbikeSpaces >= 1) {
                        this.CarPark.add(motorbike);
                        motorbikeSpaces = motorbikeSpaces -1;
                } else if (regSpaces >= 1){
                        this.CarPark.add(motorbike);
                        regSpaces = regSpaces -1;
                } else {
                        System.out.println("car park is full, cant park bike here.");
                }
        }

        public void addVehicle(Van van){
                if (regSpaces - 2 >= 3){
                        regSpaces = regSpaces -3;
                        this.CarPark.add(van);
                } else {
                        System.out.println("Cant add a van car park full");
                }
        }

        public int getCarParkTotalSize() {
                return STARTING_SPACES;
        }

        public int getRemainingSpaces(){
                return  regSpaces + motorbikeSpaces;
        }

        @Override
        public String toString() {
                return "CarPark currently contains " + CarPark;
        }

//        public int vanSpaces(){
//                return;
//        }
}
