package Homework.OOP.Devices;

public class Device {
    private String manufacturer;
    private float price;
    private String serialNumber;

    public Device(String manufacturer, float price, String serialNumber) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Device setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
        return this;
    }

    public float getPrice() {
        return price;
    }

    public Device setPrice(float price) {
        this.price = price;
        return this;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public Device setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }

    @Override
    public String toString(){
        return " manufacturer=" + manufacturer + ", price=" + price + ", serialNumber=" + serialNumber;
    }
}
