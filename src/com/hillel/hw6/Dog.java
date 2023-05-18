package src.com.hillel.hw6;

public class Dog extends Animal{
    private static int maxDistanceSwimm = 10;
    private static int maxDistanceRun = 500;


    private static int dogCol = 0;

    public Dog(String name) {
        super(name);
        dogCol++;
    }
    public Dog() {
    }

    @Override
    public void swimm(String name, int distance){
        if(maxDistanceSwimm >= distance){
            System.out.println(name + " проплыл - " + maxDistanceSwimm + " м.");
        }else{
            System.out.println("к сожалению "+ name+ " не может столько проплыть..." +"("+distance +" м.)");
        }
    }

    public void ran(String name,int distance){
        if(distance > 0){
            System.out.println(name + " пробежал - " + distance + " м.");
        }else{
            System.out.println("к сожалению "+ name+ " не может столько пробежать..." +"("+distance +" м.)");
        }
    }

    public static int getDogCol() {
        return dogCol;

    }
}
