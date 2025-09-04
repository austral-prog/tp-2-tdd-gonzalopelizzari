package com.tp2.leapyear;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LeapYearTest {

    @Test
    void testLeapYears() {
        LeapYear ly = new LeapYear();
        assertTrue(ly.isLeap(2000));
        assertFalse(ly.isLeap(1900));
        assertTrue(ly.isLeap(2004));
        assertFalse(ly.isLeap(2001));
    }
}



