package Homework.OOP.Factory.Production;

import Homework.OOP.Factory.Interfaces.Furniture;
import Homework.OOP.Factory.Interfaces.Producable;
import Homework.OOP.Factory.Items.Armchair;
import Homework.OOP.Factory.Items.Sofa;
import Homework.OOP.Factory.Items.Table;

public class VictorianProduction implements Producable {
    @Override
    public Furniture createArmchair(){
        return new Armchair("Quiet Harbor", 4235.90);
    }

    @Override
    public Furniture createSofa() {
        return new Sofa("Wisdom of Ages", 8955.33);
    }

    @Override
    public Furniture createTable(){
        return new Table("Place of Thinking", 2342.43);
    }
}
