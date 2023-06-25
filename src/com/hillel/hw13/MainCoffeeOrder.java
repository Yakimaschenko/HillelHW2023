package src.com.hillel.hw13;

public class MainCoffeeOrder {
    public static void main(String[] args) {

        CoffeeOrderBoard coffeeOrderBoard = new CoffeeOrderBoard();

        coffeeOrderBoard.add("Andrey");
        coffeeOrderBoard.add("Olena");
        coffeeOrderBoard.add("Nastya");
        coffeeOrderBoard.add("Alex");
        coffeeOrderBoard.add("Nikolay");

        coffeeOrderBoard.print();

        coffeeOrderBoard.deliver(1);
        coffeeOrderBoard.print();

        coffeeOrderBoard.add("Andrey");
        coffeeOrderBoard.print();



    }
}
