package Homework.Threads.Threads1;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

public class Hello implements Runnable {
    private String name;

    public Hello(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Thread " + name + " started - " + LocalDateTime.now());
        try{
            TimeUnit.SECONDS.sleep(2);
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Thread " + name + " finished - " + LocalDateTime.now());
    }
}
