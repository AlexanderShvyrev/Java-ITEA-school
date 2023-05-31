package Homework.OOP.Factory.Production;

import Homework.OOP.Factory.Interfaces.Furniture;
import Homework.OOP.Factory.Interfaces.Producable;
import Homework.OOP.Factory.Items.Armchair;
import Homework.OOP.Factory.Items.Sofa;
import Homework.OOP.Factory.Items.Table;

public class ModernProduction implements Producable {
    @Override
    public Furniture createArmchair(){
        return new Armchair("Starship", 1340.0);
    }

    @Override
    public Furniture createSofa() {
        return new Sofa("Hyper Portal", 5340.17);
    }

    @Override
    public Furniture createTable(){
        return new Table("Control Panel", 4340.0);
    }
}
