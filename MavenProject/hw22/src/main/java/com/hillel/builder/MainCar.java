package com.hillel.builder;

public class MainCar {
    public static void main(String[] args) {
        CarBuilder carBuilder = new CarBuilderImpl();

        carBuilder.buildEngine();
        carBuilder.buildTransmission();
        carBuilder.buildWheels();

        Car car = carBuilder.getResult();

        System.out.println("Створений автомобіль:");
        System.out.println(car);
    }
}
