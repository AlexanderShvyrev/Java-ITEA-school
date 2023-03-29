package Tasks;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number");
        double a = sc.nextDouble();
        double s = Math.pow(a, 2);
        System.out.println("Square is: " + s);
    }
}
