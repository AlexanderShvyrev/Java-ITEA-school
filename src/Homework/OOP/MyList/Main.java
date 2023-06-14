package Homework.OOP.MyList;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();

        myList.add(10);
        myList.add(20);
        myList.add(30);

        System.out.println("Size: " + myList.size());

        System.out.println("Index 2 element is: " + myList.get(2));

    }
}
