package Homework.Threads.Deadlock;

import java.util.concurrent.TimeUnit;

public class B {
    public synchronized void b(A a){
        System.out.println("b is running");
        try{
            TimeUnit.SECONDS.sleep(2);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("b is calling a");
        a.methodA();
    }

    public synchronized void methodB(){
        System.out.println("Hello from method B");
    }
}
