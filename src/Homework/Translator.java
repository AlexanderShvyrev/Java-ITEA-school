package Homework;

import java.util.Scanner;

public class Translator {
    public static void main(String[] args) {
        String [] english_words = {"rain", "sunny", "cloudy", "snow", "wind", "warm", "cold", "humid", "thunderstorm", "overcast"};
        String [] russian_words = {"дождь", "солнечно", "облачно", "снег", "ветер", "тепло", "холодно", "влажно", "гроза", "пасмурно"};
        System.out.println("Enter your russian word and if I know it, I'll give you it's english translation");
        Scanner sc = new Scanner(System.in);
        String russianWord = sc.nextLine();
        String translated = "Нет такого слова";
        for (int i = 0; i < russian_words.length; i++) {
            if(russian_words[i].equals(russianWord)) { //Тут я використовую метод equals(), щоб порівняти 2 рядки. == порівняння не працює з рядками
                translated = english_words[i];
                break;
            }
        }
        System.out.println(translated);
    }
}
