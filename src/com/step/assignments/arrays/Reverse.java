package com.step.assignments.arrays;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int numbers[] = {1,7,3,4,5};
        System.out.println(Arrays.toString(numbers));
        reverse(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    private static void  reverse(int[] numbers){
        for (int i = 0; i < numbers.length/2; i++) {
            int replaceIndex = numbers.length-(i+1);
            int temp = numbers[i];
            numbers[i] = numbers[replaceIndex];
            numbers[replaceIndex]= temp;
        }
        return;
    }
}
