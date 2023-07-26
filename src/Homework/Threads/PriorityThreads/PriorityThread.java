package Homework.Threads.PriorityThreads;

public class PriorityThread extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 50; i++) {
            System.out.println("Thread: " + getName() + " Value: " + i);
        }
    }
}
