package Tasks.Beginner;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a");
        double a = sc.nextDouble();
        double v = Math.pow(a, 3);
        double s = 6 * (Math.pow(a, 2));
        System.out.println("V is equal to " + v + " S is equal to " + s);
    }
}
