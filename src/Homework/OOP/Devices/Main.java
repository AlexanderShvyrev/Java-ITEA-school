package Homework.OOP.Devices;

public class Main {
    public static void main(String[] args) {
        Device device = new Device("Samsung", 120, "AB1234567CD");
        Monitor monitor = new Monitor(device.getManufacturer(), device.getPrice(), device.getSerialNumber(), 1280, 1024);
        System.out.println("Device: " + device);
        System.out.println("Monitor: " + monitor);
    }
}
