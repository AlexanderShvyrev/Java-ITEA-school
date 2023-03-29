package Tasks;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a");
        double a = sc.nextDouble();
        System.out.println("Input b");
        double b = sc.nextDouble();
        double s = a * b;
        double p = 2 * (a + b);
        System.out.println("S = " + s + " " + "P = " + p);
    }
}
