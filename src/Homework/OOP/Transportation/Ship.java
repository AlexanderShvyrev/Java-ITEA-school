package Homework.OOP.Transportation;

import java.sql.SQLOutput;

public class Ship extends Vehicle {
    private int passengers;
    private String portOfOrigin;

    public Ship(double price, double speed, int year, int passengers, String portOfOrigin) {
        super(price, speed, year);
        this.passengers = passengers;
        this.portOfOrigin = portOfOrigin;
    }

    public int getPassengers() {
        return passengers;
    }

    public Ship setPassengers(int passengers) {
        this.passengers = passengers;
        return this;
    }

    public String getPortOfOrigin() {
        return portOfOrigin;
    }

    public Ship setPortOfOrigin(String portOfOrigin) {
        this.portOfOrigin = portOfOrigin;
        return this;
    }

    @Override
    public void displayInfo(){
        System.out.println("Ship stats:");
        System.out.println("Price: " + this.getPrice());
        System.out.println("Speed: " + this.getSpeed());
        System.out.println("Year: " + this.getYear());
        System.out.println("Number of Passengers: " + this.getPassengers());
        System.out.println("Port of Origin: " + this.getPortOfOrigin());
    }
}
