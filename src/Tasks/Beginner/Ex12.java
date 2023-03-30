package Tasks.Beginner;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input two numbers");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double tmp = Math.pow(a, 2) + Math.pow(b, 2);
        double c = Math.sqrt(tmp);
        double p = a + b + c;
        System.out.println("C is " + c + " P is " + p);
    }
}
