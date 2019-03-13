package com.step.assignments.range;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Range<T> {
    private T start;
    private T end;
    private List<T> list;

    public Range(T start, T end) {
        this.start = start;
        this.end = end;

    }

    private void initialise(){
        this.list = new ArrayList<>((Integer)end-(Integer)start+1);

    }

    public List<T> getAll(){
        Iterator<T> iterator =  this.list.iterator();
        iterator.forEachRemaining(System.out::println);
        return this.list;

    }

    public boolean containsElement(T element){
        return this.list.contains(element);

    }
}
