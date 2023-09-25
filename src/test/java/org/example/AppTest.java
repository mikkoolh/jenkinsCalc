package org.example;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void testCalcDifference() {
        assertEquals(-3, App.calcDifference(5, 2), "The difference between 5 and 2 should be -3");
        assertEquals(1, App.calcDifference(2, 3), "The difference between 2 and 3 should be 1");
        assertEquals(0, App.calcDifference(10, 10), "The difference between 10 and 10 should be 0");
    }
}