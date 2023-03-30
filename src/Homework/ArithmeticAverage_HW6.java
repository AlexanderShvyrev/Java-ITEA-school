package Homework;

import java.util.Scanner;

public class ArithmeticAverage_HW6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input three numbers for arithmetic average");
        double x = sc.nextInt();
        double y = sc.nextInt();
        double z = sc.nextInt();
        double arAv = (x + y + z) / 3;
        System.out.println("Arithmetic average of your numbers is " + arAv);
    }
}
