package Homework.Fundamentals;

import java.util.Arrays;

public class CalculatorV3 {
    public static float[] divByFive(int a, int b, int c){
        int[] in = new int[]{a, b, c};
        float[] out = new float[3];
        for (int i = 0; i < in.length ; i++) {
            out[i] = in[i]/5f;
        }
        return out;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(divByFive(10, 20,30)));
        System.out.println(Arrays.toString(divByFive(33, 56,88)));
    }
}
