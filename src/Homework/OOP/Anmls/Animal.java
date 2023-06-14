package Homework.OOP.Anmls;

import java.util.Objects;

public class Animal {
    private String name;
    private int age;
    private Boolean hasTail;

    public Animal(String name, int age, Boolean hasTail) {
        this.name = name;
        this.age = age;
        this.hasTail = hasTail;
    }

    @Override
    public String toString() {
        String tail = hasTail ? "yes" : "no";
        return "Name: " + name + "," + " age: " + age + "," + " tail: " + tail;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, hasTail);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Animal animal = (Animal) obj;
        return age == animal.age && hasTail == animal.hasTail && Objects.equals(name, animal.name);
    }

    public String getName() {
        return name;
    }

    public Animal setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Animal setAge(int age) {
        this.age = age;
        return this;
    }

    public Boolean getHasTail() {
        return hasTail;
    }

    public Animal setHasTail(Boolean hasTail) {
        this.hasTail = hasTail;
        return this;
    }
}
