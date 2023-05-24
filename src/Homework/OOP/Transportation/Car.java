package Homework.OOP.Transportation;

public class Car extends Vehicle {
    public Car(double price, double speed, int year) {
        super(price, speed, year);
    }

    @Override
    public void displayInfo() {
        System.out.println("Car stats:");
        super.displayInfo();
    }
}
