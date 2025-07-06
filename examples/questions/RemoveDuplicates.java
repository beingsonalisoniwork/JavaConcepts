package examples.questions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

// Given an ArrayList<String>, remove duplicates using a Set.

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("apple");
        list.add("orange");
        list.add("kiwi");
        list.add("banana");

        // filters out duplicates
        Set<String> set = new HashSet<>(list);
        System.out.println(set);
        ArrayList<String> uniqueList = new ArrayList<>(set);
        System.out.println(uniqueList);
    }
}
