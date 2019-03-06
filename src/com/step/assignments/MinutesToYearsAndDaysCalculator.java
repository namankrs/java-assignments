package com.step.assignments;

public class MinutesToYearsAndDaysCalculator {
    public static void printYearsAndDays(long minutes){
        if(minutes<0) {
            System.out.println("Invalid Value");
            return;
        }
        long minutesInYear = 60 * 24 * 365;
        long minutesInDay = 24*60;
        long years = minutes / minutesInYear;
        long days = (minutes%minutesInYear)/minutesInDay;
        System.out.println(minutes+" min = "+years+" y and "+days+" d");
    }

}
