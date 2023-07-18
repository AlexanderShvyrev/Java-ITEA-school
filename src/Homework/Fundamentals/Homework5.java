package Homework.Fundamentals;

public class Homework5 {
    public static void main(String[] args) {
        int x = 10;
        int y = 12;
        int z = 3;
        //x += y - x++ * z -> same as x + y - x + 1 * z -> (10 + 12) - (10 * z) = -8 -> x is not changed because of postfix increment. It increments in the next stepΩ
        //z = --x - y * 5 -> same as z = -9 - y * 5 -> z= -9 - 60 = -69 -> instead of -8 x is now -9 from the first step
        //y /= x + 5%z; -> same as y = y / (x + 5 % z) -> 12 / (-9 + 5 % (-69)) -> 12/-4 = -3
        //z = x++ + y * 5 same as z = -9 + (-3 * 5) -> -9 -15 = -24 -> x is still -9 at this step but will be -8 in the next
        //x = y - x++ * z same as x = -3 - (-8 * -24) -> x = -3 - (-8 * (-24)) -> -3 - 192 = -195

        //Let's verify the above calculations
        x += y - x++ * z; //-8
        z = --x - y * 5; //-69
        y /= x + 5 % z; //-3
        z = x++ + y * 5;//-24
        x = y - x++ * z;
        System.out.println("Value of x is now " + x + ", value of y is now " + y + " and value of z is now " + z);

    }
}
