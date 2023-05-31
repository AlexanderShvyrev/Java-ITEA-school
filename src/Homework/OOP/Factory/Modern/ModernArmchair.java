package Homework.OOP.Factory.Modern;

import Homework.OOP.Factory.IFurniture;

public class ModernArmchair implements IFurniture {
    private final String title = "Starship";
    private final double price = 1340.0;

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
}
