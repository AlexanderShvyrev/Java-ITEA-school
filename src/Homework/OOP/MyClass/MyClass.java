package Homework.OOP.MyClass;

import java.util.ArrayList;
import java.util.List;

public class MyClass<T> {
    private MyClass() {
    }

    public static <T> List<T> factoryMethod(){
        return new ArrayList<>();
    }
}
