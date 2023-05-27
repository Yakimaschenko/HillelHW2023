package src.com.hillel.hw8;

import java.util.Arrays;

public class ArrayListInf {
    //Реалізувати просту динамічну колекцію для String на основі масиву.
    //Реалізувати такі методи для роботи з колекцією:

    //1. boolean add(int index, String value);
    //2. boolean add(String value);
    //3. boolean delete(int index);
    //4. boolean delete(String value);
    //5. String get(int index);


    private String[] array;
    private int size;

    public ArrayListInf() {
        array = new String[10];
        size = 0;
    }

    private void resizeArray() {
        String[] newArray = new String[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }


    //1. boolean add(int index, String value);
    public boolean add(int index, String value) {
        if (index < 0 || index > size) {
            return false;
        }
        if (size == array.length) {
            resizeArray();
        }

        // Сдвигаю вправо
        for (int i = size - 1; i >= index; i--) {
            array[i + 1] = array[i];
        }

        array[index] = value;
        size++;
        return true;
    }

    //2. boolean add(String value);
    public boolean add(String value) {
        return add(size, value);
    }

    //3. boolean delete(int index);
    public boolean delete(int index) {
        if (index < 0 || index >= size) {
            return false;
        }

        // Сдвигаю влево
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }

        array[size - 1] = null;
        size--;
        return true;
    }

    //4. boolean delete(String value);
    public boolean delete(String value) {
        for (int i = 0; i < size; i++) {
            if (array[i] != null && array[i].equals(value)) {
                return delete(i);
            }
        }
        return false;
    }

    //5. String get(int index);
    public String get(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        return array[index];
    }
}


