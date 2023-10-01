package com.hillel.strategy;

public class RectangleAreaCalculationStrategy implements AreaCalculationStrategy {
    private double width;
    private double height;

    public RectangleAreaCalculationStrategy(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}


