package Homework.OOP.StickerPrinter;

public class StickerPrinter {

    public String createSticker(String name, float price, double tax){
        if(name.length() < 3){
            name = "INVALID_PRODUCT_NAME";
        }
        if(price <= 0){
            return name + "INVALID_PRICE";
        }
        return name + " " + String.format("%.2f", price + (price * tax));
    }
}
