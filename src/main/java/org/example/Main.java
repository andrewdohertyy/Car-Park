package org.example;

public class Main {

    public static void main(String[] args) {

        CarPark carPark = new CarPark();

        Car car = new Car("mini", "cooper");
        Van van = new Van("Merc", "Sprinter");
        Motorbike motorbike = new Motorbike("bike", "bike");

        System.out.println(car);
        System.out.println(van);

        for (int i = 0; i < carPark.getCarParkTotalSize(); i++){
            carPark.addVehicle(van);
            carPark.addVehicle(motorbike);
        }

        System.out.println(carPark);
        System.out.println(carPark.getRemainingSpaces());
        System.out.println(carPark.getCarParkTotalSize());
    }
}
    
    
