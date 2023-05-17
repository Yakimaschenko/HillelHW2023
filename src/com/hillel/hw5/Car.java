package src.com.hillel.hw5;

public class Car {

    //- startElectricity()
    //- startCommand()
    //- startFuelSystem()

    public void start(){
        startElectricity();
        startCommand();
        startFuelSystem();
    }

    private void startElectricity(){
        System.out.println("Запускаю зажигание...");
    }
    private void startCommand(){
        System.out.println("Начинаю выполнение команды...");
    }
    private void startFuelSystem(){
        System.out.println("Запускаю топливную систему...");
    }

}
