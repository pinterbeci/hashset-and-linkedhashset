package main;

import java.util.*;

public class TestCollections {

    public static void main(String[] args) {

        String [] array = {"Gyula", "Fera", "Bera", "Laja", "Bera"};

        System.out.println(array);

        List<String> list = Arrays.asList(array);
        System.out.println(list);

        Set<String> set = new HashSet<>(list);
        System.out.println(set);




    }
}
