package com.hillel.strategy;

public class MainStrategy {
    public static void main(String[] args) {
        // Розрахунок площі прямокутника
        AreaCalculationStrategy rectangleStrategy = new RectangleAreaCalculationStrategy(5.0, 4.0);
        AreaCalculator rectangleCalculator = new AreaCalculator();
        rectangleCalculator.setCalculationStrategy(rectangleStrategy);
        double rectangleArea = rectangleCalculator.calculateArea();
        System.out.println("Площа прямокутника: " + rectangleArea);

        // Розрахунок площі трикутника
        AreaCalculationStrategy triangleStrategy = new TriangleAreaCalculationStrategy(6.0, 8.0);
        AreaCalculator triangleCalculator = new AreaCalculator();
        triangleCalculator.setCalculationStrategy(triangleStrategy);
        double triangleArea = triangleCalculator.calculateArea();
        System.out.println("Площа трикутника: " + triangleArea);
    }
}
