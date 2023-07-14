package Homework.OOP.Reflection;

public class Animal {
    private String type;
    protected String name;
    public static final int AGE = 10;

    public Animal(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public static int getAge(){
        return AGE;
    }
}
