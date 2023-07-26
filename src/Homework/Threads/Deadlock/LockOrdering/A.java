package Homework.Threads.Deadlock.LockOrdering;

import java.util.concurrent.TimeUnit;

public class A {

    public void a(B b){
        System.out.println("a is running");
        try{
            TimeUnit.SECONDS.sleep(2);
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("a is calling b");
        synchronized (this) {
            synchronized (b) {
                b.methodB();
            }
        }
    }

    public synchronized void methodA(){
        System.out.println("Hello from method A");
    }
}
