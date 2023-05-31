package Homework.OOP.Factory.ArtDeco;

import Homework.OOP.Factory.IFurniture;

public class ArtDecoArmchair implements IFurniture {
    private final String title = "Grandeur";
    private final double price = 2340.0;

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
}
