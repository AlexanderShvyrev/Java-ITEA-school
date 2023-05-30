package Homework.OOP.TestDrive;

public class Toyota extends Vehicle{
    public Toyota(String model, double power, int speed, double price) {
        super(model, power, speed, price);
    }

    public void check(){
        System.out.println("Inspecting Toyota");
        System.out.println("Brand: " + getModel());
        System.out.println("Power: " + getPower());
        System.out.println("Speed: " + getSpeed());
        System.out.println("Price: " + getPrice());
        System.out.println("Year: " + getYearOfManufacture());
        System.out.println();
    }
}
