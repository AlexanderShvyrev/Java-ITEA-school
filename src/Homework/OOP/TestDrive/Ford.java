package Homework.OOP.TestDrive;

public class Ford extends Vehicle {
    public Ford(String model, double power, int speed, double price) {
        super(model, power, speed, price);
    }

    public void check(){
        System.out.println("Inspecting Ford");
        System.out.println("Brand: " + getModel());
        System.out.println("Power: " + (int)getPower());
        System.out.println("Speed: " + getSpeed());
        System.out.println("Price: " + (int)getPrice());
        System.out.println("Year: " + getYearOfManufacture());
        System.out.println();
    }
}
