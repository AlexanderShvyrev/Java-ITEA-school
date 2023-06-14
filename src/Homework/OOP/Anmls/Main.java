package Homework.OOP.Anmls;

public class Main {
    public static void main(String[] args) {
        Animal cat1 = new Animal("Vaska", 10, true);
        Animal cat2 = new Animal("Vaska", 10, true);
        Animal cat3 = new Animal("Koshka", 3, false);

        System.out.println(cat1);

        System.out.println("cat1 equals to cat2: " + cat1.equals(cat2));
        System.out.println("cat2 equals to cat3: " + cat2.equals(cat3));

        System.out.println("cat1 hash: " + cat1.hashCode());
        System.out.println("cat2 hash: " + cat2.hashCode());
        System.out.println("cat3 hash: " + cat3.hashCode());
    }
}
