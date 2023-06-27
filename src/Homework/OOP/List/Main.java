package Homework.OOP.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();

        for (int i = 1; i <= 10 ; i++) {
            nums.add(i);
        }

        Iterator<Integer> iter = nums.iterator();
        while(iter.hasNext()){
            int num = iter.next();
            System.out.println(num);
        }
    }
}
