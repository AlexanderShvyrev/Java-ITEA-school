package Homework.Threads.GoldMine;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static volatile int goldInMine = 1000;
    public static volatile int NUM_OF_WORKERS = 3;
    public static volatile AtomicInteger num_of_finished_workers = new AtomicInteger(0);
    public static void main(String[] args) {
        List<Worker> workers = new ArrayList<>();
        WorkerFactory barak = new WorkerFactory(workers);

        workers.add(new Worker("Bob"));
        workers.add(new Worker("Bill"));
        workers.add(new Worker("Karl"));

        barak.start();

        for (Worker worker: workers) {
            worker.start();
        }
    }
}
