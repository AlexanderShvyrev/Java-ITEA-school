package Homework.OOP.StickerPrinter;

public class PriceTag {
    private String name;
    private float price;

    public PriceTag(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public PriceTag setName(String name) {
        this.name = name;
        return this;
    }

    public float getPrice() {
        return price;
    }

    public PriceTag setPrice(float price) {
        this.price = price;
        return this;
    }
}
