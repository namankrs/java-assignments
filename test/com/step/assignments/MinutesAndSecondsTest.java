package com.step.assignments;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinutesAndSecondsTest {


    @Test
    @DisplayName("getDurationString")
    void shouldConvertToHoursMinutesAndSeconds() {
        String duration = MinutesAndSeconds.getDurationString(800,58);
        assertEquals("13h 20m 58s",duration);

    }

    @Test
    void shouldReturnInvalidForInvalidInput() {
        String actualOutput = MinutesAndSeconds.getDurationString(800,800);
        assertEquals("Invalid value",actualOutput);
    }
    @Test
    void shouldConvertHigherValues() {
        String actualOutput = MinutesAndSeconds.getDurationString(61);
        assertEquals("00h 01m 01s",actualOutput);
    }

    @Test
    void shouldConvertSeconds() {
        String actualOutput = MinutesAndSeconds.getDurationString(800);
        assertEquals("00h 13m 20s",actualOutput);
    }
}