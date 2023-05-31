package Homework.OOP.Factory;

import Homework.OOP.Factory.Interfaces.Furniture;
import Homework.OOP.Factory.Interfaces.Producable;
import Homework.OOP.Factory.Production.ArtDecoProduction;
import Homework.OOP.Factory.Production.ModernProduction;
import Homework.OOP.Factory.Production.VictorianProduction;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("What furniture set would you like to purchase?");
            System.out.println("Enter 1 for Art Deco");
            System.out.println("Enter 2 for Victorian");
            System.out.println("Enter 3 for Modern");
            String version = sc.nextLine();
            System.out.println("You chose: " + version);

            Producable factory;
                switch (version) {
                    case "1" -> factory = new ArtDecoProduction();
                    case "2" -> factory = new VictorianProduction();
                    case "3" -> factory = new ModernProduction();
                    default -> {
                        System.out.println("Invalid choice.");
                        continue;
                    }
            };
            try{
                List<Furniture> furniture = new ArrayList<>();
                furniture.add(factory.createArmchair());
                furniture.add(factory.createSofa());
                furniture.add(factory.createTable());

                System.out.println("Detailed description:");
                double totalAmount = 0;

                for (Furniture item : furniture) {
                    System.out.println(item.getTitle() + " - UAH " + item.getPrice());
                    totalAmount += item.getPrice();
                }
                System.out.println("Total amount: UAH " + totalAmount);
            }catch(Exception e){
                throw new Exception("Invalid input");
            }

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
