package Homework.OOP.TestDrive;

import java.util.ArrayList;
import java.util.List;

public class CheckCar {
    private List<Vehicle> vehicles;

    public CheckCar() {
        vehicles = new ArrayList<>();
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public CheckCar setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
        return this;
    }

    public void addVehicles(Vehicle vehicle){
        vehicles.add(vehicle);
    }

    public Vehicle getFastestVehicle(){
        Vehicle fastest = null;
        int maxSpeed = 0;
        for (Vehicle vehicle : vehicles) {
            if(vehicle.getSpeed() > maxSpeed){
                maxSpeed = vehicle.getSpeed();
                fastest = vehicle;
            }
        }
        return fastest;
    }

    public Vehicle getMostExpensiveVehicle(){
        Vehicle mostExpensive = null;
        double maxPrice = 0.0;
        for (Vehicle vehicle : vehicles) {
            if(vehicle.getPrice() > maxPrice){
                maxPrice = vehicle.getPrice();
                mostExpensive = vehicle;
            }
        }
        return mostExpensive;
    }

    public Vehicle getMostPowerfulVehicle(){
        Vehicle mostPowerful = null;
        double maxPower = 0.0;
        for (Vehicle vehicle : vehicles) {
            if(vehicle.getPower() > maxPower){
                maxPower = vehicle.getPower();
                mostPowerful = vehicle;
            }
        }
        return mostPowerful;
    }
}
