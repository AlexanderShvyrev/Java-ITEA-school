package Homework.Data.Serialization;

import java.io.Serializable;

public class Car implements Serializable {
    private String brand;
    private double price;

    public Car() {}

    public Car(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Car: " + brand + ", " + price;
    }
}
