package Homework.OOP.Factory;

import Homework.OOP.Factory.Interfaces.Furniture;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    protected List<Furniture> inventory;

    public Warehouse() {
        this.inventory = new ArrayList<>();
    }

    public void addFurniture(Furniture furniture){
        inventory.add(furniture);
    }

    public void printInvoice(){
        System.out.println("Detailed description:");
        double totalAmount = 0;

        for (Furniture item : inventory) {
            System.out.println(item.getTitle() + " - UAH " + item.getPrice());
            totalAmount += item.getPrice();
        }
        System.out.println("Total amount: UAH " + totalAmount);
    }
}
