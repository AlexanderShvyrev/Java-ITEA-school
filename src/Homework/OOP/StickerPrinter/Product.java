package Homework.OOP.StickerPrinter;

public class Product{

    private PriceTag tag;

    public Product(PriceTag tag) {
        this.tag = tag;
    }

    public PriceTag getTag() {
        return tag;
    }

    public Product setTag(PriceTag tag) {
        this.tag = tag;
        return this;
    }
}
