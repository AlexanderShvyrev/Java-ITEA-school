package Tasks.Beginner;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number");
        double a = sc.nextDouble();
        double p = 4 * a;
        System.out.println("Perimeter: " + p);
    }
}
