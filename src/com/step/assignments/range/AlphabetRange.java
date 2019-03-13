package com.step.assignments.range;

import java.util.ArrayList;

public class AlphabetRange extends Range<Character> {
    private Character start;
    private Character end;
    private ArrayList<Character> characters;

    public AlphabetRange(Character start, Character end) {
        this.start = start;
        this.end = end;
        this.characters = new ArrayList<>();
        initialise();
    }

    private void initialise() {
        for(int i = start;i<=end;i++){
            this.characters.add((char)i);
        }
    }

    @Override
    ArrayList<Character> getAll() {
        return this.characters;
    }

    @Override
    boolean containsElement(Character element) {
        return this.characters.contains(element);
    }
}
