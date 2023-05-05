package Homework;

import java.util.Arrays;

public class UserArray {
    public static int[] increaseArr(int[] arr, int value){
        int[] result = new int[arr.length + 1];
        result[0] = value;
        for (int i = 1; i <arr.length + 1 ; i++) {
            result[i] = arr[i-1];
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(increaseArr(new int[] {1, 2, 45, 6678, 32, 234, 435, 36364}, 1000)));
    }
}
