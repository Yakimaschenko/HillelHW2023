package src.com.hillel.hw8;


public class ArrayListMain {
    public static void main(String[] args) {
        ArrayListInf collection = new ArrayListInf();

        collection.add("Testing massiv");
        collection.add("for hw8");
        collection.add(1, "Hillel");

        System.out.println(collection.get(0));
        System.out.println(collection.get(1));
        System.out.println(collection.get(2));

        collection.delete(1);

        System.out.println(collection.get(0));
        System.out.println(collection.get(1));
        System.out.println(collection.get(2));

        collection.add(1, "Hillel");

        System.out.println(collection.get(0));
        System.out.println(collection.get(1));
        System.out.println(collection.get(2));

    }
}
