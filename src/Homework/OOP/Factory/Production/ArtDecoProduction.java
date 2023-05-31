package Homework.OOP.Factory.Production;

import Homework.OOP.Factory.Interfaces.Furniture;
import Homework.OOP.Factory.Interfaces.Producable;
import Homework.OOP.Factory.Items.Armchair;
import Homework.OOP.Factory.Items.Sofa;
import Homework.OOP.Factory.Items.Table;

public class ArtDecoProduction implements Producable {
    @Override
    public Furniture createArmchair(){
        return new Armchair("Grandeur", 2340.0);
    }

    @Override
    public Furniture createSofa() {
        return new Sofa("Elegance", 7340.57);
    }

    @Override
    public Furniture createTable(){
        return new Table("Vintage Charm", 4340.0);
    }
}
