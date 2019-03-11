package com.step.assignments.arraylists.iteratorassignment;

//Create A class called ListIterator
//        Takes a list as constructor parameter
//
//        method hasNext() tells if there are any more elements in the list which are not yet visited
//        method next()
//        - gives the next element if available
//        - throw new NoSuchElementException() when all elements are visited already

import java.util.List;
import java.util.NoSuchElementException;

public class ListIterator {
    private List<Integer> list;
    private int index;

    public ListIterator(List<Integer> list) {
        this.list = list;
        this.index = -1;
    }

    public boolean hasNext(){
        return (index<=(list.size()-2)) ;

    }

    public int next(){
        if(this.hasNext()) {
            return list.get(++index);
        }
        throw new NoSuchElementException("nhi hai");
    }
}
