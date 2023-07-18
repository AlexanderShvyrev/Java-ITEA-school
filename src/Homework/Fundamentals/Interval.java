package Homework.Fundamentals;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        int [][] arr = {
                {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14},
                {15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35},
                {36,37,38,39,40,41,42,43,44,45,46,47,48,49,50},
                {51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100}
        };
        System.out.println("Please input any number from 0 to 100");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if(input < 0 || input > 100){
            System.out.println("Error: number is not in any intervals");
        }else{
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if(input == arr[i][j]){
                        System.out.println("Your number is in interval between " + arr[i][0] + "-" + arr[i][arr[i].length - 1]);
                    }
                }
            }
        }
    }
}

//==================Як альтернативу ми можемо використовувати інтервали========================

//public class Interval {

    //Ми встановлюємо дві змінні старт і фініш
//    private int start;
//    private int end;

    //Ми використовуємо конструктор класу
//    public Interval(int start, int end) {
//        this.start = start;
//        this.end = end;
//    }

    //Ми використовуємо функцію, яка приймає надане число, перевіряє, чи воно знаходиться між початком і кінцем, і повертає true або false
//    public boolean contains(int number) {
//        return number >= start && number <= end;
//    }
//
//    public String toString() {
//        return "[" + start + " - " + end + "]";
//    }

//    public static void main(String[] args) {
        //Тут ми будуємо інтервали
//        Interval[] intervals = {
//                new Interval(0, 14),
//                new Interval(15, 35),
//                new Interval(36, 50),
//                new Interval(51, 100)
//        };

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a number between 0 and 100: ");
//        int number = scanner.nextInt();
//
//        boolean isInInterval = false;
        //Ми перевіряємо, чи число знаходиться в якомусь інтервалі
//        for (Interval interval : intervals) {
//            if (interval.contains(number)) {
//                System.out.println("The number " + number + " is in the interval " + interval);
//                isInInterval = true;
//                break;
//            }
//        }

//        if (!isInInterval) {
//            System.out.println("The number " + number + " is not in any of the intervals");
//        }
//    }
//}

