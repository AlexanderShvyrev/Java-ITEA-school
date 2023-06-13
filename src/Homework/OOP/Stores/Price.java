package Homework.OOP.Stores;

public class Price {
    private final String productName;
    private final String store;
    private final double price;

    @Override
    public String toString(){
        return "Store name: " + store + "\n" + "Product: " + productName + "\n" + "Price: " + price;
    }

    public Price(String productName, String store, double price) {
        this.productName = productName;
        this.store = store;
        this.price = price;
    }

    public String getStore() {
        return store;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }
}
