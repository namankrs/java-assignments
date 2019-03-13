package com.step.assignments.sets;

import com.sun.tools.classfile.Opcode;

import java.util.HashSet;
import java.util.Set;

public class SetOperations{


    public static Set union(Set set1, Set set2) {
        Set union = new HashSet(set1);

        union.addAll(set2);
        return set1;

    }

    public static Set intersection(Set set1,Set set2){
        Set intersection = new HashSet(set1);
        intersection.retainAll(set2);
//        set1.forEach(element->{
//            if(set2.contains(element)) intersection.add(element);
//        });
        return intersection;
    }

    public static Set difference(Set set1,Set set2){
        Set difference = new HashSet(set1);
        difference.removeAll(set2);
//        set2.forEach(element->{
//            if(!set1.contains(element)) difference.add(element);
//        });
            return difference;
    }


}
