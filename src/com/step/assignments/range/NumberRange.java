package com.step.assignments.range;

import java.util.ArrayList;

public class NumberRange extends Range<Integer>{
    private int start;
    private int end;
    private ArrayList<Integer> numbers;

    public NumberRange(int start, int end) {
        this.start = start;
        this.end = end;
        this.numbers = new ArrayList<>();
        initialise();

    }

    private void initialise() {
        for (int i = start; i <= end; i++) {
            numbers.add(i);
        }
    }

    public ArrayList<Integer> getAll() {
        return this.numbers;
    }


    @Override
    public boolean containsElement(Integer element) {
        return this.numbers.contains(element);

    }
}
