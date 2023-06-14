package src.com.hillel.hw11.firstPart;

public class Triangle implements Figure{
    private double based; //основа
    private double height; // высота

    public Triangle(double based, double height) {
        this.based = based;
        this.height = height;
    }

    @Override
    public double getArea() {
        return based * height * 0.5;
    }
}
