package Homework.OOP.Reflection;

public class Animal {
    private String type;
    protected String name;
    public static final Integer AGE = 10;

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

    public static Integer getAge(){
        return AGE;
    }
}
