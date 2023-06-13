package Homework.OOP.Animals;

public enum Animals {

    LION(3),
    ZEBRA(5),
    KANGAROO(10);
    private final int age;

    Animals(int age) {
        this.age = age;
    }

    @Override
    public String toString(){
        return name() + " - " + age;
    }

    public static String toString(Animals animal){
        return animal.name() + ": " + animal.age;
    }
}
