package com.step.assignments.inheritance.poolArea;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
        Rectangle rectangle = new Rectangle(2, 3);

    @Test
    void getWidth() {
        assertEquals(2,rectangle.getWidth());
    }

    @Test
    void getLength() {
        assertEquals(3,rectangle.getLength());
    }

    @Test
    void getArea() {
        assertEquals(6,rectangle.getArea());
    }
}