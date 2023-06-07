package Homework.OOP.Zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        animals.add(0, "monkey");
        animals.add(1, "lion");
        animals.add(2, "bear");
        animals.add(3, "elephant");
        animals.add(4, "zebra");
        animals.add(5, "kangaroo");
        animals.add(6, "giraffe");
        animals.add(7, "penguin");

        animals.forEach(animal -> System.out.println(animal));
    }
}
