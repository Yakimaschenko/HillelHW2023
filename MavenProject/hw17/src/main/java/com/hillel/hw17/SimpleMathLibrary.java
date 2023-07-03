package com.hillel.hw17;

public class SimpleMathLibrary {
    //- Додавання (add) для двох аргументів. Повертається тип double.
    //- Віднімання (minus) для двох аргументів. Повертається тип double.

    public int add(Integer a, Integer b){
        return a + b;
    }

    public int minus(Integer a, Integer b){
        return a - b;
    }


    public int[] extractElementsAfterLastFour(int[] massiv) {
        int lastIndex = -1;

        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i] == 4) {
                lastIndex = i;
            }
        }
        if (lastIndex == -1) {
            throw new RuntimeException("Массив не содержит 4-ку");
        }

        int[] result = new int[massiv.length - lastIndex - 1];
        System.arraycopy(massiv, lastIndex + 1, result, 0, result.length);
        return result;
    }

    public boolean checkArrayComposition(int[] massiv) {
        boolean containsOne = false;
        boolean containsFour = false;

        for (int num : massiv) {
            if (num == 1) {
                containsOne = true;
            } else if (num == 4) {
                containsFour = true;
            }
        }

        return containsOne && containsFour;
    }
}
