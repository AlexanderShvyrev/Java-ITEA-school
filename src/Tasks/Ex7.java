package Tasks;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a number");
        double r = sc.nextDouble();
        double l = 2 * Math.PI * r;
        double s = Math.PI * (Math.pow(r, 2));
        System.out.println("L is " + l + " S is " + s);
    }
}
