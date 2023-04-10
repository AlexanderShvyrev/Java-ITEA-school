package Tasks.Arrays;

public class Arrays {
    public static void main(String[] args) {
//        int [] arr = {1,2,3,7,9,4,5};
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//        }
//        System.out.println(sum);

        int [] arr = {-7,7,9,33,77,-58,43,-108};
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] % 2 == 0){
//                sum += arr[i];
//            }
//        }
//        System.out.println(sum);

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
