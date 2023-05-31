package Homework.OOP.Factory.Victorian;

import Homework.OOP.Factory.IFurniture;

public class VictorianTable implements IFurniture {
    private final String title = "Place of Thinking";
    private final double price = 2342.43;

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
}
