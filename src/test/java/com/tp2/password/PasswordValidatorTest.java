package com.tp2.password;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    @Test
    void testPasswords() {
        PasswordValidator v = new PasswordValidator();
        assertFalse(v.isValid(null));
        assertFalse(v.isValid("Ab1!"));
        assertFalse(v.isValid("abcdefgh1!"));
        assertFalse(v.isValid("ABCDEFGH1!"));
        assertFalse(v.isValid("Abcdefgh!"));
        assertFalse(v.isValid("Abcdefg1"));
        assertTrue(v.isValid("Abcdefg1!"));
    }
}

