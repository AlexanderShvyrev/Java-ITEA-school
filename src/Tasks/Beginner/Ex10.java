package Tasks.Beginner;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input two numbers");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double sqSum = (Math.pow(a, 2) + (2* a * b) + Math.pow(b,2));
        System.out.println("Result is " + sqSum);
    }
}
