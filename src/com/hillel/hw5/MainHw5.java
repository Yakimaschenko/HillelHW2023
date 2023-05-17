package src.com.hillel.hw5;

public class MainHw5 {
    public static void main(String[] args) {
        Employee employee1 = new Employee( "Yarosh Bohdan Igorovych","Manager","yarosh@gmail.com","+380931110011",30);
        Employee employee2 = new Employee( "Mogyla Petro Ivanovych","Head of Department","123@gmail.com","+3809300011100",30);

        System.out.println(employee1.getFio());
        System.out.println(employee1.getPhone());

        System.out.println(employee2.getFio());
        System.out.println(employee2.getPosition());

        Car car = new Car();
        car.start();


    }
}
