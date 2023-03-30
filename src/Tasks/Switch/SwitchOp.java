package Tasks.Switch;

import java.util.Scanner;

public class SwitchOp {
    public static void main(String[] args) {
        //Ex 4
//        int month = 2;
//        switch (month){
//            case 12:
//                System.out.println(31);
//                break;
//            case 1:
//                System.out.println(31);
//                break;
//            case 2:
//                System.out.println(28);
//                break;
//            case 3:
//                System.out.println(31);
//                break;
//            case 4:
//                System.out.println(30);
//                break;
//            case 5:
//                System.out.println(31);
//                break;
//            case 6:
//                System.out.println(30);
//                break;
//            case 7:
//                System.out.println(31);
//                break;
//            case 8:
//                System.out.println(31);
//                break;
//            case 9:
//                System.out.println(30);
//                break;
//            case 10:
//                System.out.println(31);
//                break;
//            case 11:
//                System.out.println(30);
//                break;
//            default:
//                System.out.println("Wrong month number");
//                break;
//        }
//
//        //Ex 4.1
//        int n = 7;
//        switch (n){
//            case 12:
//            case 1:
//            case 3:
//            case 5:
//            case 7:
//            case 8:
//            case 10:
//                System.out.println(31);
//                break;
//            case 4:
//            case 6:
//            case 11:
//                System.out.println(30);
//                break;
//            case 2:
//                System.out.println(28);
//                break;
//            default:
//                System.out.println("Error: wrong month");
//                break;
//        }

        //Ex 5
        System.out.println("Enter numbers 1 between 4 where 1 is +, 2 is -, 3 is * and 4 is /");
        Scanner sc = new Scanner(System.in);
        int operator = sc.nextInt();
        System.out.println("Enter A and B");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        switch (operator){
            case 1:
                System.out.println("Sum is " + (a + b));
                break;
            case 2:
                System.out.println("Diff is " + (a - b));
                break;
            case 3:
                System.out.println("Multiplied is " + (a * b));
                break;
            case 4:
                System.out.println("Divided is " + (a / b));
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
}
