package Homework.OOP.Factory.Modern;

import Homework.OOP.Factory.IFurniture;

public class ModernTable implements IFurniture {
    private final String title = "Control Panel";
    private final double price = 4340.0;

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
}
