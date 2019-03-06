package com.step.assignments;

import java.util.Arrays;

public class TeenNumberChecker {
    public static void main(String[] args) {
        System.out.println(hasTeen(10, 11, 10));
    }

    public static boolean hasTeen(int a, int b, int c) {
        int candidates[] = {a, b, c};
        return Arrays.stream(candidates).anyMatch(TeenNumberChecker::isTeen);
    }

    public static boolean isTeen(int a) {
        return a >= 13 && a <= 19;
    }

}
