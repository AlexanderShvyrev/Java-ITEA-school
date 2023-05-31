package Homework.OOP.Factory.Victorian;

import Homework.OOP.Factory.IFurniture;

public class VictorianSofa implements IFurniture {
    private final String title = "Wisdom of Ages";
    private final double price = 8955.33;

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
}
