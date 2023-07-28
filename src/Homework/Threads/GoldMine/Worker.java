package Homework.Threads.GoldMine;

import java.util.concurrent.TimeUnit;

import static Homework.Threads.GoldMine.Main.*;

public class Worker extends Thread{
    private final String name;
    private int goldMined;

    public Worker(String name) {
        this.name = name;
    }

    public int getGoldMined() {
        return goldMined;
    }

    public Worker setGoldMined(int goldMined) {
        this.goldMined = goldMined;
        return this;
    }

    @Override
    public void run() {
        while(true){
            try{
                TimeUnit.SECONDS.sleep(1);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            mine(3);
            System.out.println("Worker " + name + " mined " + getGoldMined());

            int currentlyFinishedWorkers = num_of_finished_workers.incrementAndGet();

            if(currentlyFinishedWorkers == NUM_OF_WORKERS){
                num_of_finished_workers.set(0);
                System.out.println("REST OF THE GOLD: " + goldInMine);

            }

            if (goldInMine <= 1) {
                System.out.println("REST OF THE GOLD: 1");
                break;
            }
        }
    }

    private synchronized void mine(int amount){
        int minedGold = Math.min(amount, goldInMine);
        goldInMine -= minedGold;
        setGoldMined(goldMined += minedGold);
    }
}
