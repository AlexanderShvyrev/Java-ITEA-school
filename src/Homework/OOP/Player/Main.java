package Homework.OOP.Player;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();

        ((Playable) player).play();
        ((Playable) player).pause();
        ((Playable) player).stop();

        ((Recordable) player).record();
        ((Recordable) player).pause();
        ((Recordable) player).stop();
    }
}
