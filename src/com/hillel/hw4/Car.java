package src.com.hillel.hw4;

public class Car {

    int tankVolume = 70;                  // об'єм бака
    int balanceTank;                      // залишок у баку
    int differenceVolumeAndBalance;
    int fuelConsumption = 10;             // витрата палива на 100 км
    int fromOdessaToKrivOz = 179;
    int fromKrivOzToZhashkiv = 235;
    int fromZhashkivToKiev = 150;
    int costFuelAzs = 51;
    int allRoute;

    public Car() {
    }

    public int getTankVolume() {
        return tankVolume;
    }

    public void setTankVolume(int tankVolume) {
        this.tankVolume = tankVolume ;
    }

    public int getBalanceTank() {
        return balanceTank;
    }

    public void setBalanceTank(int balanceTank) {
        this.balanceTank = balanceTank;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public int getCostFuelAzs() {
        return costFuelAzs;
    }

    public int getDifferenceVolumeAndBalance() {
        return differenceVolumeAndBalance;
    }

    public void setDifferenceVolumeAndBalance(int differenceVolumeAndBalance) {
        this.differenceVolumeAndBalance = differenceVolumeAndBalance;
    }

    public int getAllRoute() {
        return allRoute;
    }

    public void setAllRoute(int allRoute) {
        this.allRoute = allRoute;
    }
}

