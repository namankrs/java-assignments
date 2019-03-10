package com.step.assignments.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Sort {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Integer numberArray[] = getNumbers(5);
        printNumbers(numberArray);
        sort(numberArray);
        printNumbers(numberArray);
    }

    public static Integer[] getNumbers(Integer count) {
        Integer inputArray[] = new Integer[count];
        for (Integer i = 0; i < count; i++) {
            inputArray[i] = scanner.nextInt();
        }
        return inputArray;
    }

    public static Integer[] sort(Integer[] numbers){
        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = 0; j < numbers.length-1; j++) {
                if(numbers[j]<numbers[j+1]) {
                    numbers[j] = numbers[j]+numbers[j+1];
                    numbers[j+1] = numbers[j] - numbers[j+1];
                    numbers[j]= numbers[j] - numbers[j+1];
//                    int temp = numbers[j];
//                    numbers[j]= numbers[j+1];
//                    numbers[j+1] = temp;
                }
            }
        }
//        Arrays.sort(numbers, Collections.reverseOrder());
        return numbers;

    }

    public static void printNumbers(Integer[] numbers){
            System.out.println(Arrays.toString(numbers));
    }
}
