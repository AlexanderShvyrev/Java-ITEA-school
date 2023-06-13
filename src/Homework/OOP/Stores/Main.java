package Homework.OOP.Stores;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Price[] prices = new Price[2];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < prices.length; i++) {
            System.out.println("Please enter details for product " + (i + 1));

            System.out.println("Enter product name: ");
            String productName = sc.nextLine();

            System.out.println("Enter the store name where this product is sold: ");
            String store = sc.nextLine();

            System.out.println("Please enter the price: ");
            Double price = sc.nextDouble();
            sc.nextLine();

            prices[i] = new Price(productName, store, price);
        }
        Arrays.sort(prices, (x1, x2) -> x1.getStore().compareToIgnoreCase(x2.getStore()));
        System.out.println("Sorted by store name: ");
        for (Price price: prices) {
            System.out.println(price.toString());
            System.out.println("----------------------");
        }

        System.out.println("Enter the store name to search for: ");
        String storeNameToSearch = sc.nextLine();
        System.out.println("Searching for products sold in " + storeNameToSearch);
        boolean isFound = false;
        for (Price price : prices) {
            if (price.getStore().equalsIgnoreCase(storeNameToSearch)) {
                System.out.println("Product: " + price.getProductName());
                System.out.println("Price: " + price.getPrice());
                isFound = true;
            }
        }

        if (!isFound) {
            throw new IllegalArgumentException("Store " + storeNameToSearch + " was not found in the system");
        }

        sc.close();
    }
}
