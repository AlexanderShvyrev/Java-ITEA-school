package Homework.Threads.Deadlock;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        Thread one = new Thread(new Runnable() {
            @Override
            public void run() {
                a.a(b);
            }
        });

        Thread two = new Thread(new Runnable() {
            @Override
            public void run() {
                b.b(a);
            }
        });

        one.start();
        two.start();
    }
}
