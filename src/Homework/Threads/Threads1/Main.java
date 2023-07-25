package Homework.Threads.Threads1;

public class Main {
    public static void main(String[] args) {
        Thread firstThread = new Thread(new Hello("Hello world"));
        Thread secondThread = new Thread(new Hello("Hello"));
        Thread thirdThread = new Thread(new Hello("H"));

        firstThread.start();
        secondThread.start();
        thirdThread.start();

        try{
            firstThread.join();
            secondThread.join();
            thirdThread.join();

            System.out.println("All threads have finished running");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
