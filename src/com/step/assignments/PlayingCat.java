package com.step.assignments;

public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature) {

        if (temperature > 24) {

            if (summer == true && temperature < 46) return true;

            if (temperature < 36) return true;
        }

        return false;
    }
}
