package Homework.Threads.Ids;

public class Main {
    public static void main(String[] args) {
        One one = new One();
        Two two = new Two();
        Three three = new Three();

        Thread t1 = new Thread(one);
        Thread t2 = new Thread(two);
        Thread t3 = new Thread(three);

        t1.start();
        t2.start();
        t3.start();
    }
}
