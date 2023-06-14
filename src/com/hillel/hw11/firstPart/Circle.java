package src.com.hillel.hw11.firstPart;

public class Circle implements Figure{
    private double radius; // радиус

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
