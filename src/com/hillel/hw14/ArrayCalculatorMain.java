package src.com.hillel.hw14;

public class ArrayCalculatorMain {
    public static void main(String[] args) {
        String[][] array = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        ArrayValueCalculator arrayValueCalculator = new ArrayValueCalculator();

        try {
            int result = arrayValueCalculator.doCalc(array);
            System.out.println("Результат: " + result);
        } catch (ArraySizeException e) {
            System.out.println("Размер не соответсвует: " + e.getMessage());
        } catch (ArrayDataException e) {
            System.out.println("Превращение не удачно, в массиве другой тип элемента: " + e.getMessage());
        }
    }
}
