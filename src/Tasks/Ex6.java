package Tasks;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input 3 numbers");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double v = a * b * c;
        double s = 2 * ((a * b) + (b * c) + (a * c));

        System.out.println("V = " + v + " S = " + s);
    }
}
