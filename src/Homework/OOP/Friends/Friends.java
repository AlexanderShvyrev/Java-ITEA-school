package Homework.OOP.Friends;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Friends {
    public static void main(String[] args) {
        List<String> friends = new ArrayList<>();
        friends.add("Paul");
        friends.add("Tammy");
        friends.add("George");
        friends.add("Margaret");
        friends.add("Peter");
        friends.add("Zoey");
        friends.add("Adam");

        Collections.sort(friends);
        friends.forEach(friend -> System.out.println(friend));
    }
}
