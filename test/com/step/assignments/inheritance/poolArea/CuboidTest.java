package com.step.assignments.inheritance.poolArea;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CuboidTest {
    Cuboid cuboid = new Cuboid(1,2,3);

    @Test
    void getHeight() {
        assertEquals(3,cuboid.getHeight());

    }

    @Test
    void getVolume() {
        assertEquals(6,cuboid.getVolume());
    }
}