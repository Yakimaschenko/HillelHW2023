package src.com.hillel.hw9;

public interface Collection {

    boolean add(String o);

    boolean add(int index, String o);

    boolean delete (String value);

    String get(int index);

    boolean contain(String o);

    boolean equals (Collection str);

    boolean clear();

    int size(); // - количество элементов которые добавили

    public void resizeArray();
}
