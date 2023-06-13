package Homework.OOP.Animals;

public class Main {
    public static void main(String[] args) {
        Animals lion = Animals.LION;
        String lionStr = Animals.toString(lion);
        System.out.println(lionStr);

        Animals zebra = Animals.ZEBRA;
        String zebraStr = zebra.toString();
        System.out.println(zebraStr);
    }
}
