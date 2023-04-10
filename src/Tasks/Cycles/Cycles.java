package Tasks.Cycles;

public class Cycles {
    public static void main(String[] args) {

        //Ex1
//        int n = 7;
//        int k = 10;
//        for (int i = 0; i < n; i++){
//            System.out.println(k);
//        }

        //Ex2
//        int a = 7;
//        int b = 15;
//        int count = 0;
//        for (int i = a; i <= b; i++) {
//            System.out.println(i);
//            count++;
//        }
//        System.out.println(count);

        //Ex3
//        int a = 7;
//        int b = 15;
//        int count = 0;
//        for (int i = b-1; i > a; i--) {
//            System.out.println(i);
//            count++;
//        }
//        System.out.println("Count is " + count);

        //Ex4
//        double price = 177.75;
//        for (int i = 1; i < 10 ; i++) {
//            double totalPrice = i * price;
//            System.out.println(totalPrice);
//        }

        //Ex5
//        double price = 177.75;
//        for (double i = 0.1; i <= 1 ; i += 0.1) {
//            double totalPrice = i * price;
//            System.out.println(totalPrice);
//        }

        //Ex6
//        double price = 177.55;
//        for (double i = 1.2; i <= 2 ; i += 0.2) {
//            double totalPrice = i * price;
//            System.out.println(totalPrice);
//        }

        //Ex7
//        int a = 7;
//        int b = 10;
//        int sum = 0;
//        for (int i = a; i <= b; i++){
//            sum += i;
//        }
//        System.out.println(sum);

        //Ex8
        int a = 7;
        int b = 10;
        int sum = 1;
        for (int i = a; i <= b; i++){
            sum *= i;
        }
        System.out.println(sum);
    }
}
