package com.tp2.stringcalculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    @Test
    void testAdd() {
        StringCalculator calc = new StringCalculator();
        assertEquals(0, calc.add(""));
        assertEquals(1, calc.add("1"));
        assertEquals(3, calc.add("1,2"));
        assertEquals(6, calc.add("1,2,3"));
        assertEquals(6, calc.add("1\n2,3"));
        assertThrows(IllegalArgumentException.class, () -> calc.add("1,-2,3"));
    }
}
