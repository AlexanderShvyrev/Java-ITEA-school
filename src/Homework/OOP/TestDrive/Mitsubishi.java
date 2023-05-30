package Homework.OOP.TestDrive;

public class Mitsubishi extends Vehicle{
    public Mitsubishi(String model, double power, int speed, double price) {
        super(model, power, speed, price);
    }

    public void check(){
        System.out.println("Inspecting Mitsubishi");
        System.out.println("Brand: " + getModel());
        System.out.println("Power: " + getPower());
        System.out.println("Speed: " + getSpeed());
        System.out.println("Price: " + getPrice());
        System.out.println("Year: " + getYearOfManufacture());
        System.out.println();
    }
}
