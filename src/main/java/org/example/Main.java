package org.example;

public class Main {

    public static void main(String[] args) {

        CarPark carPark = new CarPark();

        System.out.println(carPark.getCarParkTotalSize());

        Car car = new Car("mini", "cooper");
        Van van = new Van("Merc", "Sprinter");

        System.out.println(car.toString());
        System.out.println(van.toString());

        carPark.addVehicle(car);
        carPark.addVehicle(van);
        carPark.addVehicle(new Motorbike("bmw", "fast"));

        System.out.println(carPark);



        System.out.println(carPark.getRemainingSpaces());


    }


}
    
    
