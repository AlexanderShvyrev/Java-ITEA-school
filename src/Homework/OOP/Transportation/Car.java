package Homework.OOP.Transportation;

public class Car extends Vehicle {
    public Car(double price, double speed, int year) {
        super(price, speed, year);
    }

    @Override
    public void displayInfo() {
        System.out.println("Car stats:");
        System.out.println("Price: " + this.getPrice());
        System.out.println("Speed: " + this.getSpeed());
        System.out.println("Year: " + this.getYear());
    }
}
