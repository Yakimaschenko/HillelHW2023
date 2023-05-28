package src.com.hillel.hw9;

public interface Collection {

    boolean add(String o);

    boolean add(int index, String o);

    boolean delete (String value);

    String get(int index);

    boolean contain(String value);

    boolean equals (Collection str);

    boolean clear();

    int size(); // - количество элементов которые добавили

    public void resizeArray();

    public void coppyMassiv(String[] basic, String[] next);

}
