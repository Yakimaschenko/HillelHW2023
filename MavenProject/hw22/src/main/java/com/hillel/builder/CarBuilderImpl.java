package com.hillel.builder;

public class CarBuilderImpl implements CarBuilder {
    private Car car = new Car();

    @Override
    public void buildEngine() {
        car.setEngine("V8");
    }

    @Override
    public void buildTransmission() {
        car.setTransmission("Automatic");
    }

    @Override
    public void buildWheels() {
        car.setWheels("18-inch alloy wheels");
    }

    @Override
    public Car getResult() {
        return car;
    }
}
