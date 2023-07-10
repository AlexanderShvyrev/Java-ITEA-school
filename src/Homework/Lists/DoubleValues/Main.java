package Homework.Lists.DoubleValues;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter 5 words: ");

        for (int i = 0; i < 5; i++) {
            String word = sc.nextLine();
            words.add(word);
        }

        doubleWords(words);

        System.out.println("Output: ");

        for (String word:words) {
            System.out.println(word);
        }
        sc.close();
    }

    public static void doubleWords(List<String> words){
        for (int i = 0; i < words.size(); i++) {
            String letter = words.get(i);
            words.add(i + 1, letter);
            i++;
        }
    }
}
