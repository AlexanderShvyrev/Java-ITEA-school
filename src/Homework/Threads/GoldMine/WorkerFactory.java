package Homework.Threads.GoldMine;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static Homework.Threads.GoldMine.Main.NUM_OF_WORKERS;
import static Homework.Threads.GoldMine.Main.goldInMine;

public class WorkerFactory extends Thread{
    private final List<Worker> workers;

    public WorkerFactory(List<Worker> workers) {
        this.workers = workers;
    }

    @Override
    public void run() {
        while(true){
            try{
                TimeUnit.SECONDS.sleep(10);
            }catch(InterruptedException e){
                e.printStackTrace();
            }

            if (goldInMine <= 1) {
                break;
            }

            Worker worker = new Worker("Worker " + (workers.size() + 1));
            workers.add(worker);
            NUM_OF_WORKERS += 1;
            worker.start();
        }
    }
}
