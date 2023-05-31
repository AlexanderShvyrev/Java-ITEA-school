package Homework.OOP.Factory;

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
            System.out.println("Here is you invoice: ");
            double total = 0.0;

            String[] types = {"Armchair", "Sofa", "Table"};
            for (String type: types) {
                IFurniture furniture = Production.produceFurniture(version, type);
                total += furniture.getPrice();
                System.out.println(type + " - \"" + furniture.getTitle() + "\", UAH " + furniture.getPrice() + ".");
            }
            System.out.println("Total amount: " + total);
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
