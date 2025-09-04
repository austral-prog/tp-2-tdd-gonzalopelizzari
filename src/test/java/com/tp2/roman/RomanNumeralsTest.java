package com.tp2.roman;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralsTest {

    @Test
    void testRomanConversion() {
        RomanNumerals rn = new RomanNumerals();
        assertEquals("I", rn.convert(1));
        assertEquals("V", rn.convert(5));
        assertEquals("X", rn.convert(10));
        assertEquals("IV", rn.convert(4));
        assertEquals("IX", rn.convert(9));
        assertEquals("CM", rn.convert(900));
        assertEquals("MCMXCIV", rn.convert(1994));
    }
}
