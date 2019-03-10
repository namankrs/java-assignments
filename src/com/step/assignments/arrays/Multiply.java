package com.step.assignments.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Multiply {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int doubleDimensionalArray[][] = {{1, 1}, {1, 1}};
        int multliplicationResult[][] = multiply(doubleDimensionalArray,doubleDimensionalArray);
        print(multliplicationResult);
    }

    private static void print(int[][] doubleDimensionalArray) {
        System.out.println(Arrays.deepToString(doubleDimensionalArray));

        Arrays.stream(doubleDimensionalArray).forEach(row->Arrays.stream(row).forEach(System.out::println));

        for (int i = 0; i < doubleDimensionalArray.length; i++) {
            for (int j = 0; j < doubleDimensionalArray[i].length; j++) {
                System.out.print(doubleDimensionalArray[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static int[][] multiply(int[][] firstArray, int[][] secondArray) {
        int[][] invalidValues = {{-1, -1}, {-1, -1}};
        int result[][] = new int[firstArray.length][secondArray[1].length];
        if (firstArray[1].length != secondArray.length) return invalidValues;
        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < secondArray[i].length; j++) {
                int element = 0;
                for (int k = 0; k < firstArray[i].length; k++) {
                    element+= firstArray[i][k]*secondArray[k][j];
                }
                result[i][j] = element;
            }
        }
        return result;
    }

}
