package com.step.assignments.sets;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        SetOperations setOperations = new SetOperations();
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        Set<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(5);

        Set union = SetOperations.union(set1, set2);
        Set difference = SetOperations.difference(set1, set2);
        Set intersection = SetOperations.intersection(set1, set2);

        //implemented static methods in setOperations,so commented this part.
        
//        Set<Integer> union = setOperations.union(set1, set2);
//        Set<Integer> intersection = setOperations.intersection(set1, set2);
//        Set<Integer> difference = setOperations.difference(set1, set2);
        System.out.println(union);
        System.out.println(intersection);
        System.out.println(difference);
    }
}
