package com.step.assignments.arrays;

import java.util.*;

public class MinimumElement {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int numbers[] = (readIntegers(5));
        System.out.println(Arrays.toString(numbers));
        System.out.println(findMin(numbers));
    }

    private static int[] readIntegers(int count) {
        int inputNumbers[] = new int[count];
        for (int i = 0; i < count; i++) {
            inputNumbers[i] = scanner.nextInt();
        }
        return inputNumbers;
    }

    private  static int findMin (int[] numbers){
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i]<min) min = numbers[i];
        }
        return min;
    }
}
