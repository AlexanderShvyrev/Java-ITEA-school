package Homework.OOP.Factory.Items;

import Homework.OOP.Factory.Interfaces.Furniture;

public class Sofa implements Furniture {
    private String title;
    private double price;

    public Sofa(String title, double price) {
        this.title = title;
        this.price = price;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
