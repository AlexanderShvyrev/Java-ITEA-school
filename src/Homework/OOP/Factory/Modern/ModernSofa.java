package Homework.OOP.Factory.Modern;

import Homework.OOP.Factory.IFurniture;

public class ModernSofa implements IFurniture {
    private final String title = "Hyper Portal";
    private final double price = 5340.17;

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
}
