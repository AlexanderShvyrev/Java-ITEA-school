package Homework.Fundamentals;

import java.util.Arrays;
import java.util.Scanner;

public class PowerA3 {
    public static int powerA3(int a, int b) {
        b = a * a * a;
        return b;
    }

    public static void main(String[] args) {
        int[] result = new int[]{powerA3(2, 0), powerA3(10, 0), powerA3(20, 0), powerA3(3, 0), powerA3(4, 0)};
        System.out.println(Arrays.toString(result));
    }
}
