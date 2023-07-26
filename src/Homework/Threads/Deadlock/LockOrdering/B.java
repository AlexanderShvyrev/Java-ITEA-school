package Homework.Threads.Deadlock.LockOrdering;

import java.util.concurrent.TimeUnit;

public class B {
    public void b(A a){
        System.out.println("b is running");
        try{
            TimeUnit.SECONDS.sleep(2);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("b is calling a");
        synchronized (this) {
            synchronized (a) {
                a.methodA();
            }
        }
    }

    public synchronized void methodB(){
        System.out.println("Hello from method B");
    }
}
