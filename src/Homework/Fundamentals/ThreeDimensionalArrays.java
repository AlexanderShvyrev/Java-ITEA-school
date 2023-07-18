package Homework.Fundamentals;

import java.util.Arrays;

public class ThreeDimensionalArrays {
    public static void main(String[] args) {
        int[][] firstArr = new int[][] {{1,2,3}, {3,4,5}, {6,7,8}};
        int[][] secondArr = new int[][] {{10,20,30}, {30,40,50}, {60,70,80}};
        int[][] sumArr = new int[3][3];
        for (int i = 0; i < 3 ; i++) {
            for (int j = 0; j < 3 ; j++) {
                sumArr[i][j] = firstArr[i][j] + secondArr[i][j];
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(sumArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
