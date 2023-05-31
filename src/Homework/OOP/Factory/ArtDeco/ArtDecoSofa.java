package Homework.OOP.Factory.ArtDeco;

import Homework.OOP.Factory.IFurniture;

public class ArtDecoSofa implements IFurniture {
    private final String title = "Elegance";
    private final double price = 7340.57;

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
}
