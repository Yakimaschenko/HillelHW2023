package src.com.hillel.hw11.firstPart;

public interface Figure {

    double getArea();
    public static double calculateTotalArea(Figure[] figures) {
        double sumlArea = 0.0;
        for (Figure figure : figures) {
            sumlArea += figure.getArea();
        }
        return sumlArea;
    }
}
