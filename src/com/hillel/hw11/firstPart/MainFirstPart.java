package src.com.hillel.hw11.firstPart;


import static src.com.hillel.hw11.firstPart.Figure.calculateTotalArea;

public class MainFirstPart {
    public static void main(String[] args) {
        Figure[] figures = new Figure[3];

        figures[0] = new Circle(10.0);
        figures[1] = new Triangle(6.0, 10.0);
        figures[2] = new Square(8.0);

        double sumArea = calculateTotalArea(figures);
        System.out.println("Сумарна площа перелічених фігур: " + sumArea);
    }

}
