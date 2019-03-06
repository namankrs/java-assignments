package com.step.assignments;

public class MinutesAndSeconds {

    public static String getDurationString(int minutes,int seconds){
        if(minutes<0 || seconds<0 || seconds>59) return "Invalid value";
        Integer totalSeconds = minutes*60+seconds;
        Integer resultHours = totalSeconds/3600;
//        Integer remainingSeconds = totalSeconds - resultHours * 3600;
        Integer remainingSeconds = totalSeconds%3600;
        Integer resultMinutes = remainingSeconds/60;
        Integer resultSeconds = remainingSeconds - resultMinutes*60;
        String hourSuffix = "";
        String minutesSuffix = "";
        String secondsSuffix = "";
        if(resultHours<10) hourSuffix = "0";
        if(resultMinutes<10) minutesSuffix = "0";
        if(resultSeconds<10) secondsSuffix = "0";
        return ""+hourSuffix+ resultHours+"h "+minutesSuffix +resultMinutes+"m "+secondsSuffix  +resultSeconds+"s";
    }

    public static String getDurationString(int seconds){
        if(seconds<0) return "Invalid value";
        Integer resultMinutes = seconds/60;
        Integer remainingSeconds = seconds-resultMinutes*60;
        return getDurationString(resultMinutes,remainingSeconds);
    }

}
