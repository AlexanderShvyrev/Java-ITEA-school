package Homework.OOP.TestDrive;

public class Main {
    public static void main(String[] args) {
        Ford ford = new Ford("Ford", 180.0, 200, 38000.0);
        Mitsubishi mitsubishi = new Mitsubishi("Mitsubishi", 110.0, 135, 22000.0);
        Toyota toyota = new Toyota("Toyota", 120.0, 240, 20000.0);
        Kia kia = new Kia("Kia", 160.0, 260, 30000.0);

        CheckCar checkCar = new CheckCar();
        checkCar.addVehicles(ford);
        checkCar.addVehicles(mitsubishi);
        checkCar.addVehicles(toyota);
        checkCar.addVehicles(kia);

        Vehicle fastest = checkCar.getFastestVehicle();
        if(fastest != null){
            fastest.check();
        }else{
            throw new Error("No matches found");
        }

        Vehicle mostExpensive = checkCar.getMostExpensiveVehicle();
        if(mostExpensive != null){
            mostExpensive.check();
        }else{
            throw new Error("No matches found");
        }

        Vehicle mostPower = checkCar.getMostPowerfulVehicle();
        if(mostPower != null){
            mostPower.check();
        }else{
            throw new Error("No matches found");
        }
    }
}
