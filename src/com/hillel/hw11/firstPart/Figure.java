package src.com.hillel.hw11.firstPart;

public interface Figure {

    double getArea();
    public static double calculateTotalArea(Figure[] figures) {
        double totalArea = 0.0;
        for (Figure figure : figures) {
            totalArea += figure.getArea();
        }
        return totalArea;
    }
}
