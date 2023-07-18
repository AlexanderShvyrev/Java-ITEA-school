package Homework.Fundamentals;

public class MinMaxMid {

    public static float arithmetic(int a, int b, int c){
        return (a + b + c)/3f;
    }
    public static float arithmetic(int a, int b, int c, int d){
        return (a + b + c + d)/4f;
    }

    public static float arithmetic(int a, int b, int c, int d, int e){
        return (a + b + c + d + e)/5f;
    }

    public static void minMaxMid(float[] nums){
        float min = nums[0];
        float max = nums[0];
        float sum = 0f;
        for (int i = 0; i < nums.length ; i++) {
            if(nums[i] < min){
                min = nums[i];
            }
            if(nums[i] > max){
                max = nums[i];
            }
            sum += nums[i];
        }
        float mid = (sum/nums.length);
        System.out.println("Min number is: " + min + ". ");
        System.out.println("Max number is: " + max + ". ");
        System.out.println("Mid number is: " + mid);
    }
    public static void main(String[] args) {
        float[] nums = new float[]{arithmetic(1,2,3), arithmetic(1,2,3,4), arithmetic(1,2,3,4,5)};
        minMaxMid(nums);
    }
}
