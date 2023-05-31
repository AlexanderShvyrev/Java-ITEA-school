package Homework.OOP.Player;

public class Player implements Playable, Recordable{
    @Override
    public void play() {
        System.out.println("Started playing");
    }

    @Override
    public void stop() {
        System.out.println("Stopping...");
    }

    @Override
    public void pause() {
        System.out.println("Paused");
    }

    @Override
    public void record() {
        System.out.println("Now recording");
    }
}
