package src.com.hillel.hw9;

public class CollectionImpl implements Collection{


    private String[] array;
    private int size;

    public CollectionImpl(String[] array, int size) {
        this.array = array;
        this.size = size;
    }

    @Override
    public void resizeArray() {
        String[] newArray = new String[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }

    @Override
    public boolean add(String value) {
        return add(size, value);
    }

    @Override
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

    @Override
    public boolean delete(String value) {
        for (int i = 0; i < size; i++) {
            if (array[i] != null && array[i].equals(value)) {
                return delete(String.valueOf(i));
            }
        }
        return false;
    }
    @Override
    public String get(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        return array[index];
    }

    @Override
    public boolean contain(String value) {
        return false;
    }

    @Override
    public boolean equals(Collection str) {
        return false;
    }

    @Override
    public boolean clear() {
        for (int i = 0; i < size; i++){
            array[i] = null;
        }
        size = 0;
        return true;
    }

    @Override
    public int size() {
        return size;
    }
}
