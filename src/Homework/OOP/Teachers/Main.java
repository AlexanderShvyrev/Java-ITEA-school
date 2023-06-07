package Homework.OOP.Teachers;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> teachers = new ArrayList<>();
        teachers.add("Galina Nikolaevna");
        teachers.add("Lubov Alekseevna");
        teachers.add("Andrei Mironovich");
        teachers.add("Vladimir Aleksandrovich");
        teachers.add("Zhanna Aleksandrovna");

        teachers.forEach(teacher -> System.out.println(teacher));

        System.out.println("Best teacher: " + teachers.indexOf("Zhanna Aleksandrovna"));
        System.out.println("Worst teacher: " + teachers.indexOf("Galina Nikolaevna"));
    }
}
