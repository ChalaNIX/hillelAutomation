package ua.hillel.automation.java.lesson12CollectionsMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortEx {
    public static void main(String[] args) {
        Set<User> users = new TreeSet<>();

        User john = new User();
        john.setName("John");

        User aria = new User();
        aria.setName("Aria");

        users.add(john);
        users.add(aria);  //елементи сортуються згідно методу compareTo в класі User
        System.out.println(users);

        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(5);
        nums.add(2);
        nums.add(8);
        nums.add(7);

        nums.sort(new MyComparator());
        System.out.println(nums);
    }
}
