package com.step.assignments;
import java.util.*;

public class SumOdd {
    public static void main(String[] args) {

    }

    public static boolean isOdd(int number) {
        if(number<0)  return false;
        return number % 2 != 0;
    }

    public static int sumOdd(int start,int end){
        if(start<1) return -1;
        if(end<start) return -1;
        int sum = 0;
        for(int candidate = start;candidate <= end;candidate ++){
            if(isOdd(candidate)) sum+=candidate;
        }
        return sum;
    }
}
