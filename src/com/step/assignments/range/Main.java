package com.step.assignments.range;

public class Main {
    public static void main(String[] args) {
        Range numberRange = new NumberRange(1, 10);
        System.out.println(numberRange.getAll());
        System.out.println(numberRange.containsElement(0));
        System.out.println(numberRange.containsElement(1));
        System.out.println(numberRange.containsElement(10));
        System.out.println(numberRange.containsElement(5));

        Range alphabetRange = new AlphabetRange('a', 'e');
        System.out.println(alphabetRange.getAll());
        System.out.println(alphabetRange.containsElement('a'));
        System.out.println(alphabetRange.containsElement('e'));
        System.out.println(alphabetRange.containsElement('c'));
        System.out.println(alphabetRange.containsElement('x'));
    }
}
