package src.com.hillel.hw6;

public class MainAnimal {
    public static void main(String[] args) {

        Cat cat1 = new Cat();
        cat1.swimm("Barsik",10);
        cat1.ran("Barsik", 10);
        System.out.println("");

        Cat cat2 = new Cat();
        cat2.swimm("Murka",15);
        cat2.ran("Murka", 150);
        System.out.println("");
        System.out.println("");


        Dog dog1 = new Dog();
        dog1.ran("Jek", 100);
        dog1.swimm("Jek", 10);
        System.out.println("");

        Dog dog2 = new Dog();
        dog2.ran("Maxx", 200);
        dog2.swimm("Maxx", 200);
        System.out.println("");

        Dog.getDogCol();






    }
}
