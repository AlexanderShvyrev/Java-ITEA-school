package Homework.Fundamentals;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        int maxFactor = 10;
        Scanner sc = new Scanner(System.in);
        int num = 0;
        boolean checkForString = false;
        do{
            System.out.println("Please enter a positive number from 1 to 10 ( Enter 0 to exit the program): ");
            if (sc.hasNextInt()) {
                num = sc.nextInt();
                if (num < 0 || num > 10) {
                    System.out.println("Incorrect input! Number must be positive and less than 10");
                }else if(num == 0){
                    System.out.println("Exiting...");
                    break;
                }else {
                    for (int i = 1; i <= maxFactor; i++) {
                        int result = num * i;
                        System.out.printf("%d * %d = %d;%n", num, i, result);
                    }
                }
            }else{
                System.out.println("Please enter an integer");
                checkForString = true;
                sc.next();
            }
        }while(num != 0 || checkForString);
        sc.close();
    }
}
