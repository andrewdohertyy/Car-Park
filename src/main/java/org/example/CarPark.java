package org.example;

import java.util.ArrayList;

public class CarPark {

        public CarPark() {};

        public int spaces = 20;

        private ArrayList<Vehicle> CarPark = new ArrayList<>();

        public void addVehicle(Vehicle vehicle){};

        public void addVehicle(Car car){
                this.CarPark.add(car);
                spaces = spaces -1;
        }
        public void addVehicle(Motorbike motorbike){
                this.CarPark.add(motorbike);
                spaces = spaces -1;
        }

        public void addVehicle(Van van){
                this.CarPark.add(van);
                spaces = spaces -3;
        }


        public int getCarParkSize() {
                return CarPark.size();
        }

        public int getRemainingSpaces(){
                if(20 - CarPark.size() > 0) {
                        return 20 - CarPark.size();
                } else {
                        return 0;
                }
        }

        public void setCarPark(ArrayList<Vehicle> carPark) {
                CarPark = carPark;
        }

        @Override
        public String toString() {
                return "CarPark{" +
                        "CarPark=" + CarPark +
                        ", spaces=" + spaces +
                        '}';
        }
}
