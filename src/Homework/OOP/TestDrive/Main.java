package Homework.OOP.TestDrive;

public class Main {
    public static void main(String[] args) {
        Vehicle ford = new Vehicle("Ford", 180.0, 200, 38000.0);
        Vehicle mitsubishi = new Vehicle("Mitsubishi", 110.0, 135, 22000.0);
        Vehicle toyota = new Vehicle("Toyota", 120.0, 240, 20000.0);
        Vehicle kia = new Vehicle("Kia", 160.0, 260, 30000.0);

        CheckCar checkCar = new CheckCar();
        checkCar.addVehicles(ford);
        checkCar.addVehicles(mitsubishi);
        checkCar.addVehicles(toyota);
        checkCar.addVehicles(kia);

        checkCar.getFastestVehicle();
        checkCar.getMostExpensiveVehicle();
        checkCar.getMostPowerfulVehicle();


    }
}
