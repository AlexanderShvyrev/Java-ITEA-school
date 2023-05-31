package Homework.OOP.Factory.Victorian;

import Homework.OOP.Factory.IFurniture;

public class VictorianArmchair implements IFurniture {
    private final String title = "Quiet Harbor";
    private final double price = 4235.90;

    public String getTitle() {
        return title;
    }
    public double getPrice() {
        return price;
    }
}
