package Homework.OOP.StickerPrinter;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final double TAX = 0.650;
    public static void main(String[] args) {
        StickerPrinter stickerPrinter = new StickerPrinter();
        List<Product> products = new ArrayList<>();
        products.add(new Product(new PriceTag("Kattle", 39)));
        products.add(new Product(new PriceTag("Vaccum Cleaner", 149)));
        products.add(new Product(new PriceTag("Hairdryer", 59)));
        products.add(new Product(new PriceTag("r", 234)));

        for (Product product:products) {
            System.out.println(stickerPrinter.createSticker(product.getTag().getName(), product.getTag().getPrice(), TAX));
        }
    }
}
