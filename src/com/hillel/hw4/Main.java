package src.com.hillel.hw4;

public class Main {
    public static void main(String[] args) {
        Calculate calculate = new Calculate();
        Car car = new Car();
// вывожу объем бака на старте
        calculate.printTankVolume();
        calculate.addFuelAllTank();

// вывожу остаток в баке после первого отрезка Одесса - Кривое озеро
        System.out.println("Выехал из Одессы к Кривому озеру...");
        calculate.addFuelForRoute(car.fromOdessaToKrivOz);
        calculate.balanceNankAfterRoute(car.fromOdessaToKrivOz);

        calculate.fuelAllTankRazn();
        calculate.printbalanceTank();
        System.out.println("-----------------------------");
        calculate.allRouteFromAtoB(car.fromOdessaToKrivOz);
        System.out.println();

// вывожу остаток в баке после второго отрезка Кривое озеро - Жашкив
        System.out.println("Выехал из Кривого озера в Жашков...");
        calculate.addFuelForRoute(car.fromKrivOzToZhashkiv);
        calculate.balanceNankAfterRoute(car.fromKrivOzToZhashkiv);

        calculate.fuelAllTankRazn();
        calculate.printbalanceTank();
        System.out.println("-----------------------------");
        calculate.allRouteFromAtoB(car.fromKrivOzToZhashkiv);

        System.out.println();

// вывожу остаток в баке после третьего отрезка Жашкив - Киев
        System.out.println("Выехал из Жашкова в Киев...");
        calculate.addFuelForRoute(car.fromZhashkivToKiev);
        calculate.balanceNankAfterRoute(car.fromZhashkivToKiev);

        calculate.allRouteFromAtoB(car.fromKrivOzToZhashkiv);
        calculate.costAllRouteFromAtoB();



    }

}
