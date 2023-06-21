package Homework.OOP.MyClass;

import java.util.List;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        List<Integer> nums = MyClass.factoryMethod();
        List<String> strings = MyClass.factoryMethod();
        nums.add(1);
        strings.add("Hello world");
    }
}
