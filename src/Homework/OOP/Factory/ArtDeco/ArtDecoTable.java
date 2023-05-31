package Homework.OOP.Factory.ArtDeco;

import Homework.OOP.Factory.IFurniture;

public class ArtDecoTable implements IFurniture {
    private final String title = "Vintage Charm";
    private  final double price = 4340.0;

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
}
