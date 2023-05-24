package Homework.OOP.Transportation;

public class Vehicle {
    private double price;
    private double speed;
    private int year;

    public Vehicle(double price, double speed, int year) {
        this.price = price;
        this.speed = speed;
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public Vehicle setPrice(double price) {
        this.price = price;
        return this;
    }

    public double getSpeed() {
        return speed;
    }

    public Vehicle setSpeed(double speed) {
        this.speed = speed;
        return this;
    }

    public int getYear() {
        return year;
    }

    public Vehicle setYear(int year) {
        this.year = year;
        return this;
    }

    public void displayInfo(){
        System.out.println("Price: " + this.getPrice() + " Year: " + this.getYear() + " Speed: " + this.getSpeed());
    }
}
