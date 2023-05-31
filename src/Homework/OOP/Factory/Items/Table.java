package Homework.OOP.Factory.Items;

import Homework.OOP.Factory.Interfaces.Furniture;

public class Table implements Homework.OOP.Factory.Interfaces.Table {
    private String title;
    private double price;

    public Table(String title, double price) {
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
