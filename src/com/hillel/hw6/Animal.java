package src.com.hillel.hw6;

public class Animal {

    private String name;
//    private int  maxDistance;
    private int  animalCol = 0;

    public Animal() {
        animalCol++;
    }
    public Animal(String name) {
        this.name = name;
        animalCol++;
    }

    public void swimm(String name,int distance){
        if(distance > 0){
            System.out.println(name + " проплыл - " + distance + " м.");
        }else{
            System.out.println("к сожалению "+ name+ " не может столько проплыть...");
        }
    }

    public void ran(int distance){
        if(distance > 0){
            System.out.println(name + " пробежал - " + distance + " м.");
        }else{
            System.out.println("к сожалению "+ name+ " не может столько пробежать...");
        }
    }

//    public static int getAnimalCol() {
//        return animalCol;
//
//    }


}
