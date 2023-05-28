package src.com.hillel.hw9;


public class MainCollection {
    public static void main(String[] args) {
        CollectionImpl collection = new CollectionImpl();

        collection.add("Testing massiv");
        collection.add("for hw8");
        collection.add(1, "Hillel");

        System.out.println(collection.get(0));
        System.out.println(collection.get(1));
        System.out.println(collection.get(2));
        System.out.println("------");

//
        System.out.println(collection.delete("Hillel"));
        System.out.println(collection.add(1, "Hillel"));
        System.out.println("------");

        System.out.println(collection.contain("Hillel"));
        System.out.println(collection.get(0));
        System.out.println(collection.get(1));
        System.out.println(collection.get(2));
        System.out.println("------");

        System.out.println(collection.clear());
        System.out.println(collection.get(0));
        System.out.println("------");

        System.out.println(collection.add("Testing massiv"));
        System.out.println(collection.get(0));
        System.out.println(collection.get(1));
        System.out.println(collection.get(2));
        System.out.println("------");
//
        System.out.println(collection.equals("Hillel"));


    }
}
