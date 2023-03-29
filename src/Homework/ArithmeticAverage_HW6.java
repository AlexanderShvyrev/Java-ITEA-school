package Homework;

import java.util.Scanner;

public class ArithmeticAverage_HW6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input three numbers for arithmetic average");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        double ArAv = (x + y + z) / 3;
        System.out.println("Arithmetic average of your numbers is " + ArAv);
    }
}
