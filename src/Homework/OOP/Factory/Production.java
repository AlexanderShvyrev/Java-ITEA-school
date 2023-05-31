package Homework.OOP.Factory;

import Homework.OOP.Factory.ArtDeco.ArtDecoArmchair;
import Homework.OOP.Factory.ArtDeco.ArtDecoSofa;
import Homework.OOP.Factory.ArtDeco.ArtDecoTable;
import Homework.OOP.Factory.Modern.ModernArmchair;
import Homework.OOP.Factory.Modern.ModernSofa;
import Homework.OOP.Factory.Modern.ModernTable;
import Homework.OOP.Factory.Victorian.VictorianArmchair;
import Homework.OOP.Factory.Victorian.VictorianSofa;
import Homework.OOP.Factory.Victorian.VictorianTable;

public class Production {

    public static IFurniture produceFurniture(String option, String type){
        switch(option){
            case "1":
                return createArtDeco(type);
            case "2":
                return createVictorian(type);
            case "3":
                return createModern(type);
            default:
                throw new Error("Invalid input");
        }
    }

    private static IFurniture createArtDeco(String type){
        return switch (type) {
            case "Armchair" -> new ArtDecoArmchair();
            case "Sofa" -> new ArtDecoSofa();
            case "Table" -> new ArtDecoTable();
            default -> throw new Error("Invalid type");
        };
    }

    private static IFurniture createVictorian(String type) {
        return switch (type) {
            case "Armchair" -> new VictorianArmchair();
            case "Sofa" -> new VictorianSofa();
            case "Table" -> new VictorianTable();
            default -> throw new Error("Invalid type");
        };
    }

    private static IFurniture createModern(String type){
        return switch (type) {
            case "Armchair" -> new ModernArmchair();
            case "Sofa" -> new ModernSofa();
            case "Table" -> new ModernTable();
            default -> throw new Error("Invalid type");
        };
    }
}
