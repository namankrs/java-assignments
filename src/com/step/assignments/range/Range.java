package com.step.assignments.range;

import java.util.ArrayList;

public abstract class Range <T> {
    abstract ArrayList<T> getAll();
    abstract boolean containsElement(T element);
}
