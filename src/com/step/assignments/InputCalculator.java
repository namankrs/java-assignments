package com.step.assignments;
import java.util.*;
public class InputCalculator {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage(){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while (sc.hasNextInt()){
            sum = sum + sc.nextInt();
            count++;
        }
        if(count == 0) count = 1;
        double average = (double) sum/ count;
        long roundedAverage = Math.round(average);
        System.out.println("SUM = "+sum+" AVG = "+roundedAverage);
    }
}
