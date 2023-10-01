package com.hillel.builder;

public class Car {
    private String engine;
    private String transmission;
    private String wheels;

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setWheels(String wheels) {
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", transmission='" + transmission + '\'' +
                ", wheels='" + wheels + '\'' +
                '}';
    }
}
