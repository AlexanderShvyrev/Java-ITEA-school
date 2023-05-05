package Homework;

import java.util.Arrays;

public class PowerA234 {

    public static int[] power234(int a, int b, int c, int d){
        b = a * a;
        c = a * a * a;
        d = a * a * a * a;
        int[] result = {b, c, d};
        return result;
    }
    public static void main(String[] args) {
        int[] a = new int[]{2,4,6,8,7};
        for (int i = 0; i < a.length ; i++) {
            System.out.println(Arrays.toString(power234(a[i], 0, 0, 0)));
        }
    }
}
