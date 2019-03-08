package com.step.assignments.jewelrybox;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JewelryBoxTest {
    @Test
    void shouldReturnNumberOfJewelries() {
        Jewelry diamond_ring = new Jewelry("Diamond Ring");
        JewelryBox jewelleryBox = new JewelryBox(diamond_ring);
        Jewelry neckless = new Jewelry("neckless");
        JewelryBox jewelleryBox1 = new JewelryBox(jewelleryBox,neckless);

        assertEquals(2, jewelleryBox1.getJewelryCount());

    }

    @Test
    void name() {
            JewelryBox _5thLevelBox = new JewelryBox();

            JewelryBox _4thLevelBox = new JewelryBox(_5thLevelBox);

            Jewelry nacklace = new Jewelry("necklace");
            JewelryBox _3rdLevelBox = new JewelryBox(_4thLevelBox,nacklace);

            Jewelry ring = new Jewelry("ring");
            JewelryBox _2ndLevelBox = new JewelryBox( _3rdLevelBox,ring);

            JewelryBox _1stLevelBox = new JewelryBox(_2ndLevelBox);

            assertEquals(2, _1stLevelBox.getJewelryCount());
    }
}