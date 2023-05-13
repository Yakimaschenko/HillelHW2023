package src.com.hillel.hw4;

public class Main {
    public static void main(String[] args) {
        Calculate calculate = new Calculate();
        Car car = new Car();
// вывожу объем бака на старте
        calculate.PrintTankVolume();
        calculate.AddFuelAllTank();

// вывожу остаток в баке после первого отрезка Одесса - Кривое озеро
        System.out.println("Выехал из Одессы к Кривому озеру...");
        calculate.AddFuelForRoute(car.fromOdessaToKrivOz);
        calculate.BalanceNankAfterRoute(car.fromOdessaToKrivOz);

        calculate.FuelAllTankRazn();
        calculate.PrintbalanceTank();
        System.out.println("-----------------------------");
        calculate.AllRouteFromAtoB(car.fromOdessaToKrivOz);
        System.out.println();

// вывожу остаток в баке после второго отрезка Кривое озеро - Жашкив
        System.out.println("Выехал из Кривого озера в Жашков...");
        calculate.AddFuelForRoute(car.fromKrivOzToZhashkiv);
        calculate.BalanceNankAfterRoute(car.fromKrivOzToZhashkiv);

        calculate.FuelAllTankRazn();
        calculate.PrintbalanceTank();
        System.out.println("-----------------------------");
        calculate.AllRouteFromAtoB(car.fromKrivOzToZhashkiv);

        System.out.println();

// вывожу остаток в баке после третьего отрезка Жашкив - Киев
        System.out.println("Выехал из Жашкова в Киев...");
        calculate.AddFuelForRoute(car.fromZhashkivToKiev);
        calculate.BalanceNankAfterRoute(car.fromZhashkivToKiev);

        calculate.AllRouteFromAtoB(car.fromKrivOzToZhashkiv);
        calculate.CostAllRouteFromAtoB();



    }

}
