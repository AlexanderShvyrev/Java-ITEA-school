package Homework.Fundamentals;

import java.util.Arrays;

public class ReversedArray {

    public static int[] myReverse(int[] array){
        int[] reversed = new int[array.length];
        for (int i = 0; i < array.length ; i++) {
            reversed[i] = array[array.length - 1 - i];
        }
        return reversed;
    }

    public static int[] subArray(int[] arr, int index, int count){
        int[] subArray = new int[count];
        for (int i = 0; i < count; i++) {
            if(index + i < arr.length){
                subArray[i] = arr[index + i];
            }else{
                subArray[i] = 1;
            }
        }
        return subArray;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(myReverse(new int[] {1,2,3,4,5})));
        System.out.println(Arrays.toString(subArray(new int[] {1,2,3,4,5}, 2, 10)));
    }
}
