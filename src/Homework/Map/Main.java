package Homework.Map;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int randomNum = random.nextInt(10);
            myList.add(randomNum);
            System.out.println("Hello " + randomNum);
        }
        int res = myList.stream()
                .map(item -> item*item)
                .reduce(0, Integer::sum);

        System.out.println("Res: " + res);
    }
}
