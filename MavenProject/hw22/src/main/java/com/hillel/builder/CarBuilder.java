package com.hillel.builder;

public interface CarBuilder {
    void buildEngine();
    void buildTransmission();
    void buildWheels();
    Car getResult();
}

