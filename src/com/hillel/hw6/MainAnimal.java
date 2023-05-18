package src.com.hillel.hw6;

public class MainAnimal {
    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.swimm("Barsik",10);

        cat.ran("Barsik", 10);

        Dog dog = new Dog();
        dog.ran("Jek", 100);
        dog.ran("Maxx", 200);

        dog.swimm("Jek", 10);


    }
}
