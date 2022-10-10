package org.example;

public class Main {

    public static void main(String[] args) {

        CarPark carPark = new CarPark();
        System.out.println(carPark);

        Car car = new Car(1);
        Van van = new Van(Merc, Big);

        carPark.addVehicle(car);
        carPark.addVehicle(car);
        carPark.addVehicle(car);
        carPark.addVehicle(car);
        carPark.addVehicle(van);

        System.out.println(carPark);

        System.out.println(carPark.getCarParkSize());

        System.out.println(carPark.getRemainingSpaces());


    }


}
    
    
