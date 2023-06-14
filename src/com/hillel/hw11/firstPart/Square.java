package src.com.hillel.hw11.firstPart;

public class Square implements Figure{
    private double line;
    public Square(double line) {
        this.line = line;
    }

    @Override
    public double getArea() {
        return line * line;
    }
}
