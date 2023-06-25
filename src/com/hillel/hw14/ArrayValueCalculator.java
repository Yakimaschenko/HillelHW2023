package src.com.hillel.hw14;


public class ArrayValueCalculator {

    public int doCalc(String[][] array) throws ArraySizeException, ArrayDataException {
        if (array.length != 4 || array[0].length != 4) {
            throw new ArraySizeException("Размер массива не соответсвует ожиданию 4х4");
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    int value = Integer.parseInt(array[i][j]);
                    sum += value;
                } catch (NumberFormatException e) {
                    throw new ArrayDataException("В массиве не соответствующий тип элемента [" + i + "][" + j + "]");
                }
            }
        }

        return sum;
    }

}
