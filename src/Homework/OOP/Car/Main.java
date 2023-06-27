package Homework.OOP.Car;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car(190, 8000, "BMW", "Red");
        Car c2 = new Car(190, 2000, "Opel", "Black");
        Car c3 = new Car(185, 10000, "Mercedes", "White");
        Car c4 = new Car(185, 10000, "Mercedes", "Green");
        Car c5 = new Car(190, 8000, "Mercedes", "Green");

        System.out.println("c1 compared to c2: " + c1.compareTo(c2));
        System.out.println("c1 compared to c5: " + c1.compareTo(c5));
        System.out.println("c3 compared to c4: " + c3.compareTo(c4));
    }
}
