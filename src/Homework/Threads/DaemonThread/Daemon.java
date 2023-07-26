package Homework.Threads.DaemonThread;

import java.util.concurrent.TimeUnit;

public class Daemon extends Thread{
    public Daemon() {
        setDaemon(true);
    }

    @Override
    public void run(){
        System.out.println("Thread name: " + getName());
        System.out.println("Thread ID: " + getId());
        System.out.println("Thread Priority: " + getPriority());
        System.out.println("Thread is alive: " + isAlive());
        System.out.println("Thread State: " + getState());
        System.out.println("Thread is daemon: " + isDaemon());
        System.out.println("Thread is iterrupted: " + isInterrupted());
        System.out.println("Thread group: " + getThreadGroup());

        try{
            TimeUnit.SECONDS.sleep(2);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
