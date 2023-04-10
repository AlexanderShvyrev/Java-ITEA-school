package Homework;

import java.util.Scanner;

public class Translator {
    public static void main(String[] args) {
        String [] english_words = {"rain", "sunny", "cloudy", "snow", "wind", "warm", "cold", "humid", "thunderstorm", "overcast"};
        String [] russian_words = {"дождь", "солнечно", "облачно", "снег", "ветер", "тепло", "холодно", "влажно", "гроза", "пасмурно"};
        System.out.println("Enter your english word and if I know it, I'll give you it's russian translation");
        Scanner sc = new Scanner(System.in);
        String englishWord = sc.nextLine();
        String translated = "Нет такого слова";
        for (int i = 0; i < english_words.length; i++) {
            if(english_words[i].equals(englishWord)) { //Тут я використовую метод equals(), щоб порівняти 2 рядки. == порівняння не працює з рядками
                translated = russian_words[i];
                break;
            }
        }
        System.out.println(translated);
    }
}
