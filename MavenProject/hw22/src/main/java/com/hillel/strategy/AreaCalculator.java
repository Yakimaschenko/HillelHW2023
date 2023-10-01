package com.hillel.strategy;

public class AreaCalculator {
    private AreaCalculationStrategy calculationStrategy;

    public void setCalculationStrategy(AreaCalculationStrategy calculationStrategy) {
        this.calculationStrategy = calculationStrategy;
    }

    public double calculateArea() {
        if (calculationStrategy == null) {
            throw new IllegalStateException("Встановіть стратегію розрахунку площі");
        }
        return calculationStrategy.calculateArea();
    }
}
