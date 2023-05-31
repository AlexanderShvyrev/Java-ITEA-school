package Homework.OOP.TestDrive;

public abstract class Vehicle {
    private String model;
    private double power;
    private int speed;
    private double price;
    private final int yearOfManufacture = 1967;

    public Vehicle(String model, double power, int speed, double price) {
        this.model = model;
        setPower(power);
        setSpeed(speed);
        setPrice(price);
    }

    public abstract void check();

    public String getModel() {
        return model;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        if (power <= 0 || power >= 200) {
            throw new Error("Power must be between 0 and 200");
        }
        this.power = power;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed <= 0 || speed >= 320) {
            throw new Error("Speed must be greater than 0 and less than 320");
        }
        this.speed = speed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0.0 || price > 50000.0) {
            throw new Error("Price cannot be less than 0 or greater than 50000");
        }
        this.price = price;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }
}
