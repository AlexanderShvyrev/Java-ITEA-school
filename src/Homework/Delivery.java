package Homework;

import java.util.Scanner;

public class Delivery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of customers: ");
        int num = sc.nextInt();
        sc.close();
        int routes = 1;
        int i = 1;
        do {
            routes *= i;
            i++;
        }while(i<=num);
        System.out.println("You can have " + routes + " of possible routes");
    }
}
