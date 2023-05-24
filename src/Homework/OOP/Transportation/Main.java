package Homework.OOP.Transportation;

public class Main {
    public static void main(String[] args) {
        Vehicle plane = new Plane(2000000.00, 300.5, 1995, 10000.0, 500);
        Vehicle ship = new Ship(2345253.243, 324.0, 2020, 800, "Miami");
        Vehicle car = new Car(23000.0, 250.0, 2023);
        plane.displayInfo();
        System.out.println("===================");
        ship.displayInfo();
        System.out.println("===================");
        car.displayInfo();

    }
}
