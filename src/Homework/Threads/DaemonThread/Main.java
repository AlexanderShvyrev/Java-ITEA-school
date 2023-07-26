package Homework.Threads.DaemonThread;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Daemon daemon = new Daemon();
        daemon.start();

        try{
            TimeUnit.SECONDS.sleep(2);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
