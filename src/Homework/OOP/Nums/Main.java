package Homework.OOP.Nums;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(8);
        numbers.add(6);
        numbers.add(10);

        ListIterator<Integer> itr = numbers.listIterator();
        while (itr.hasNext()){
            int curr = itr.next();
            itr.set(curr + 1);
        }
        numbers.forEach(num -> System.out.println(num));
    }
}
