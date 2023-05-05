package Homework;

import java.util.Arrays;
import java.util.Scanner;

public class PowerA3 {
    public static int powerA3(int a) {
        return a * a * a;
    }

    public static void main(String[] args) {
        int[] b = new int[]{powerA3(2), powerA3(10), powerA3(20), powerA3(3), powerA3(4)};
        System.out.println(Arrays.toString(b));
    }
}
