package Homework.OOP.MyClass;

public class MyClass {
    private MyClass() {
    }

    public static <T> Object factoryMethod(){
        Object obj = new Object();
        return obj;
    }
}
