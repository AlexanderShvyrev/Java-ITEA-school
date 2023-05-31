package Homework.OOP.Factory;

import Homework.OOP.Factory.Interfaces.Producable;
import Homework.OOP.Factory.Production.ArtDecoProduction;
import Homework.OOP.Factory.Production.ModernProduction;
import Homework.OOP.Factory.Production.VictorianProduction;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("What furniture set would you like to purchase?");
            System.out.println("Enter 1 for Art Deco");
            System.out.println("Enter 2 for Victorian");
            System.out.println("Enter 3 for Modern");
            String version = sc.nextLine();
            System.out.println("You chose: " + version);

            Producable factory = null;
            switch (version) {
                case "1":
                    factory = new ArtDecoProduction();
                    break;
                case "2":
                    factory = new VictorianProduction();
                    break;
                case "3":
                    factory = new ModernProduction();
                    break;
                default:
                    throw new Error("Invalid choice. Exiting.");
            }

            Warehouse warehouse = new Warehouse();
            warehouse.addFurniture(factory.createArmchair());
            warehouse.addFurniture(factory.createSofa());
            warehouse.addFurniture(factory.createTable());
            warehouse.printInvoice();

            System.out.println("Continue shopping? (Y/N)");
            String choice = sc.nextLine().toUpperCase();
            if (!choice.equals("Y")) {
                break;
            }
            System.out.println();
        }
        System.out.println("Thank you for using the Factory Program!");
    }
}
