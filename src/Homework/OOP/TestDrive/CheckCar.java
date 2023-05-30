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

    public void getFastestVehicle(){
        Vehicle fastest = null;
        int maxSpeed = 0;
        for (Vehicle vehicle : vehicles) {
            if(vehicle.getSpeed() > maxSpeed){
                maxSpeed = vehicle.getSpeed();
                fastest = vehicle;
            }
        }
        if(fastest != null){
            System.out.println("FASTEST VEHICLE");
            System.out.println("Brand: " + fastest.getModel());
            System.out.println("Power: " + (int)fastest.getPower());
            System.out.println("Speed: " + fastest.getSpeed());
            System.out.println("Price: " + fastest.getPrice());
            System.out.println("Year: " + fastest.getYearOfManufacture());
            System.out.println();
        }
    }

    public void getMostExpensiveVehicle(){
        Vehicle mostExpensive = null;
        double maxPrice = 0.0;
        for (Vehicle vehicle : vehicles) {
            if(vehicle.getPrice() > maxPrice){
                maxPrice = vehicle.getPrice();
                mostExpensive = vehicle;
            }
        }
        if(mostExpensive != null){
            System.out.println("MOST EXPENSIVE VEHICLE");
            System.out.println("Brand: " + mostExpensive.getModel());
            System.out.println("Power: " + (int)mostExpensive.getPower());
            System.out.println("Speed: " + mostExpensive.getSpeed());
            System.out.println("Price: " + mostExpensive.getPrice());
            System.out.println("Year: " + mostExpensive.getYearOfManufacture());
            System.out.println();
        }
    }

    public void getMostPowerfulVehicle(){
        Vehicle mostPowerful = null;
        double maxPower = 0.0;
        for (Vehicle vehicle : vehicles) {
            if(vehicle.getPower() > maxPower){
                maxPower = vehicle.getPower();
                mostPowerful = vehicle;
            }
        }
        if(mostPowerful != null){
            System.out.println("MOST POWERFUL VEHICLE");
            System.out.println("Brand: " + mostPowerful.getModel());
            System.out.println("Power: " + (int)mostPowerful.getPower());
            System.out.println("Speed: " + mostPowerful.getSpeed());
            System.out.println("Price: " + mostPowerful.getPrice());
            System.out.println("Year: " + mostPowerful.getYearOfManufacture());
            System.out.println();
        }
    }
}
