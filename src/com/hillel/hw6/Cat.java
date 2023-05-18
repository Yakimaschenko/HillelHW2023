package src.com.hillel.hw6;

import java.util.SortedMap;

public class Cat extends Animal{

   private static int catCol = 0;
    private static int maxDistanceSwimm = 0;
    private static int maxDistanceRun = 200;


    public Cat(String name) {
        super(name);
        catCol++;
    }
    public Cat() {
        catCol++;
    }

    @Override
    public void swimm(String name, int maxDistanceSwimm){
            System.out.println(name+ ": "+" к сожалению я не умею плавать...");
    }

    public void ran(String name,int distance){
        if(distance > 0){
            System.out.println(name + " пробежал - " + distance + " м.");
        }else{
            System.out.println("к сожалению "+ name+ " не может столько пробежать..." +"("+distance +" м.)");
        }
    }

        public static int getCatCol() {
        return catCol;

    }
}
