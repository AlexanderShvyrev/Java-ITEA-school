package Homework.Threads.PriorityThreads;

public class PriorityRunner {
    public static void main(String[] args) {
        PriorityThread min = new PriorityThread();
        PriorityThread max = new PriorityThread();
        PriorityThread norm = new PriorityThread();

        min.setName("Min");
        max.setName("Max");
        norm.setName("Norm");

        min.setPriority(Thread.MIN_PRIORITY);
        max.setPriority(Thread.MAX_PRIORITY);

        min.start();
        max.start();
        norm.start();
    }
}
