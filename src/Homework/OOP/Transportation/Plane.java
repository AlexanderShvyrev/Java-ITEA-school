package Homework.OOP.Transportation;

public class Plane extends Vehicle{
    private double height;
    private int passengers;

    public Plane(double price, double speed, int year, double height, int passengers) {
        super(price, speed, year);
        this.height = height;
        this.passengers = passengers;
    }

    public double getHeight() {
        return height;
    }

    public Plane setHeight(double height) {
        this.height = height;
        return this;
    }

    public int getPassengers() {
        return passengers;
    }

    public Plane setPassengers(int passengers) {
        this.passengers = passengers;
        return this;
    }

    @Override
    public void displayInfo(){
        System.out.println("Plane stats: ");
        super.displayInfo();
        System.out.println("Height: " + this.getHeight());
        System.out.println("Number of Passengers: " + this.getPassengers());

    }
}
