package src.com.hillel.hw4;

public class Calculate {
    Car car = new Car();

// вывожу обьем бака
    public void printTankVolume(){
        System.out.println("Обьем бака составляет: " + car.getTankVolume() + " л.");
    }

    public void printbalanceTank(){
        System.out.println("Обьем бака составляет: " + car.getBalanceTank() + " л.");
    }

// заправка бака до полного
public void addFuelAllTank(){
    car.setBalanceTank(car.getTankVolume());
    System.out.println("Готов к поездке. Заправлено полный бак");
    System.out.println();
}

//Определяю остаток топлива после пройденого расстояния...
    public void balanceNankAfterRoute(int route){
        car.setBalanceTank(car.getBalanceTank() - (route / car.fuelConsumption));
        System.out.println("Остаток в баке после пройденого пути - " + car.getBalanceTank() + " л.");
        System.out.println();
    }

//визначити скільки треба дозаправити палива для подолання N км
    public void addFuelForRoute(int route){
        System.out.println("Маршрут который нужно пройти = " + route + " км");
        int razn;
        if(car.getBalanceTank() * car.getFuelConsumption()< route){
            razn = (route - (car.getBalanceTank() * car.getFuelConsumption())) / car.getFuelConsumption();
            System.out.println("Для преодоления указаного маршрута требуется дозаправить на: " + razn +" л.");
        }else{
            System.out.println("Для преодоления указаного маршрута достаточно бензина");

        }
    }

    // заправляю бак с учетом потраченного бензина
    public void fuelAllTankRazn(){
        car.setDifferenceVolumeAndBalance(car.getTankVolume() - car.getBalanceTank());
        car.setBalanceTank(car.getDifferenceVolumeAndBalance() + car.getBalanceTank());
        System.out.println("Бак дозаправлено до полного на - " + car.getDifferenceVolumeAndBalance() + " л.");
    }
//Всего пройдено км
    public void allRouteFromAtoB(int route){
        car.setAllRoute(car.getAllRoute() + route);
        System.out.println("Пройдено всего: " + car.getAllRoute() + " км.");
    }
//Общая стоимость поездки
    public void costAllRouteFromAtoB(){
        System.out.println("Стоимость всей поездки составила : " + ((car.getAllRoute() * car.getCostFuelAzs())/car.getFuelConsumption()) + " грн.");
    }


    public void FuelAllTank() {
    }

    }
